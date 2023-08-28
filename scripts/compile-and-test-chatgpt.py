import sys
import os

if len(sys.argv) < 1:
    print("error: gera-chatgpt.py")
    print("Example: gera-chatgpt.py")
    sys.exit(1)

dados = open('files.txt', 'r')
for x in dados: 
    print(x)
    x = x.strip()
    info = x.split(':')
    prj = info[0]
    clazz = info[1].replace("ds.", "")
    # cmd = "mkdir ../projetos/" + prj + "/gpt-tests";
    # os.system(cmd)
    cmd = "mv ../projetos/" + prj + "/src/test/java/ds/* ../projetos/" + prj + "/gpt-tests/"
    os.system(cmd)

    for i in range(34):
        cmd = "cp ../projetos/" + prj + f"/gpt-tests/{clazz}Test{i}.java" + " ../projetos/" + prj + "/src/test/java/ds/"
        os.system(cmd)
        
        print(f"Executando testes do projeto {prj}. Teste numero: {i}")
        cmd = "cd " + "../projetos/" + prj + "; mvn -DclassName=\"" +"ds."+ clazz + "\" -DtestName=\""+ f"ds.{clazz}Test{i}\""
        cmd = cmd + " clean install org.pitest:pitest-maven:mutationCoverage"
        os.system(cmd)
        
        cmd = "rm ../projetos/" + prj + "/src/test/java/ds/*"
        os.system(cmd)
    
     

dados.close()

