import sys
import os
import requests
import re

def read_java_files(folder_path):
    print(f"Lendo códigos fonte {clazz} \n")
    java_files = []
    for file_name in os.listdir(folder_path):
        if file_name.endswith(".java"):
            file_path = os.path.join(folder_path, file_name)
            with open(file_path, "r") as file:
                text = file.read()
                java_files.append(f"```{text}```")
    return java_files
    

def request_test_generation(code, clazz, temperature):
    try: 
        url = "https://api.openai.com/v1/chat/completions"
        headers = {
            "Content-Type": "application/json",
            "Authorization": "<<INPUT YOUR OPEN AI API KEY HERE>>"
        }
        data = {
            "model": "gpt-3.5-turbo",
            "messages": [
                {
                    "role": "user",
                    "content": f"Generate test cases just for the {clazz} Java class in one java class file with imports using Junit 4 and Java 8:\n\n{code}"
                    }
                ],
            "temperature": temperature,
        }
        response = requests.post(url, headers=headers, json=data)
        response_json = response.json()
        content = response_json["choices"][0]["message"]["content"]
        print(f"Request enviada com sucesso para o projeto: {clazz} \n")
        return content
    except:
        print(f"FAILED TO REQUEST CHATGPT, RETRYING...")
        return request_test_generation(code, clazz, temperature)
        

def extract_code(code, clazz, n, only_code):
    code_blocks = []
    is_code = only_code
    class_count = 0

    lines = code.split("\n")
    for line in lines:
        if "```" in line:
            is_code = not is_code
        elif is_code:
            if line.strip().startswith("import") and class_count >= 1:
                code_blocks.insert(0, line)
            elif "public class" in line:
                class_count = class_count + 1
                if class_count == 1:
                    code_blocks.append(f"public class {clazz}Test{n}" + "{\n")
            else: 
                code_blocks.append(line)
    
    extracted_code = "\n".join(code_blocks)
    return extracted_code

def remove_other_test_classes(code, clazz, n):
    if "```" in code:
        return extract_code(code, clazz, n, False)
    else:
        return extract_code(code, clazz, n, True)
        
    # lines = code.split("\n")
    # n_class = 0
    # code_with_one_test_class = ""
    # for line in lines:
    #     if line.startswith("import") and n_class != 0:
    #         return code_with_one_test_class
        
    #     if line.startswith("public class"):
    #         n_class = n_class + 1
            
    #     if n_class > 1:
    #         return code_with_one_test_class
        
    #     code_with_one_test_class = code_with_one_test_class + "\n" + line
    # return code_with_one_test_class
            
    
def generate_tests(code, clazz, temperature, n):
    generated_tests = request_test_generation(code, clazz, temperature)
    generated_tests = remove_other_test_classes(generated_tests, clazz, n)
    generated_tests.replace("package ds;", "")
    generated_tests = "package ds;" + generated_tests
    return generated_tests

def get_test_path(prj, clazz, number):
    return os.path.join("..", "projetos", prj, "src", "test", "java", "ds", f"{clazz}Test{number}.java")

# temperature:
#     tests 0 - 2: 0.7
#     tests 3 - 5: 0.8
#     tests 6 - 8: 0.9
#     tests 9 - 11: 1.0

#     tests: 12 - 14: 0.6
#     tests: 15 - 17: 0.5
#     tests: 18 - 20: 0.4
#     tests: 21 - 23: 0.3
#     tests: 24 - 26: 0.2
#     tests: 27 - 29: 0.1
#     tests: 30 - 33: 0.0

def set_temperature(i):
    if(i < 15): return 0.6
    if(i < 18): return 0.5
    if(i < 21): return 0.4
    if(i < 24): return 0.3
    if(i < 27): return 0.2
    if(i < 30): return 0.1
    return 0.0


if len(sys.argv) < 1:
    print("error: gera-chatgpt.py")
    print("Example: gera-chatgpt.py")
    sys.exit(1)


dados = open('files.txt', 'r')
for x in dados: 
    x = x.strip()
    info = x.split(':')
    prj = info[0]
    clazz = info[1].replace("ds.", "")

    source_path = os.path.join("..", "projetos", prj, "src", "main", "java", "ds")
    os.makedirs(os.path.dirname(get_test_path(prj, clazz, 0)), exist_ok=True)

    code = read_java_files(source_path)
    
    for i in range(12, 33):
        temperature = set_temperature(i)
        generated_tests = generate_tests(code, clazz, temperature, i)
        
        with open(get_test_path(prj, clazz, i), "w") as file:
            file.write(generated_tests)
            
        print(f"Arquivo de testes numero {i} gerado. Projeto: {prj} \n")     

dados.close()


