import sys
import os
import re
import traceback
from bs4 import BeautifulSoup as bs
from datetime import datetime

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
    if(i < 3): return 0.7
    if(i < 6): return 0.8
    if(i < 9): return 0.9
    if(i < 12): return 1.0
    if(i < 15): return 0.6
    if(i < 18): return 0.5
    if(i < 21): return 0.4
    if(i < 24): return 0.3
    if(i < 27): return 0.2
    if(i < 30): return 0.1
    return 0.0

error = open('log-error.txt', 'a+')
outputAll = open('./reports/all' + '.csv', 'w')
outputAll.write("PRJ;Temperature;Cobertos;Gerados;Cobertura;Mortos;Total;Escore\n")


dados = open('files.txt', 'r')
for x in dados: 
    x = x.strip()
    info = x.split(':')
    prj = info[0]
    clazz = info[1]
    
    output = open('./reports/'+ prj + '.csv', 'w') 
    output.write("PRJ;Temperature;Cobertos;Gerados;Cobertura;Mortos;Total;Escore\n")
    
    for x in range(34):
        try:
            with open("../projetos/" + prj+ "/reports/"+clazz+"Test"+str(x)+"/index.html",'r') as html:
                soup = bs(html, 'html.parser')
                divs = soup.findAll(attrs={'class':'coverage_percentage'})
                covs = soup.findAll(attrs={'class':'coverage_legend'})
                
                temperature = set_temperature(x)

                output.write(prj + ";")
                output.write(str(temperature) + ";")
                output.write(covs[2].text.split("/")[0].strip() + ";")
                output.write(covs[2].text.split("/")[1].strip() + ";")
                output.write(divs[0].text.strip() + ";")
                output.write(covs[3].text.split("/")[0].strip() + ";")
                output.write(covs[3].text.split("/")[1].strip() + ";")
                output.write(divs[1].text.strip())	
                output.write("\n")
                output.flush()
                
                outputAll.write(prj + ";")
                outputAll.write(str(temperature) + ";")
                outputAll.write(covs[2].text.split("/")[0].strip() + ";")
                outputAll.write(covs[2].text.split("/")[1].strip() + ";")
                outputAll.write(divs[0].text.strip() + ";")
                outputAll.write(covs[3].text.split("/")[0].strip() + ";")
                outputAll.write(covs[3].text.split("/")[1].strip() + ";")
                outputAll.write(divs[1].text.strip())	
                outputAll.write("\n")
                outputAll.flush()
        except:
            var = traceback.format_exc()
            now = datetime.now()
            current_time = now.strftime("%H:%M:%S")
            error.write(current_time)
            error.write(" - "+prj+" - ERROR: /reports/"+clazz+"Test"+str(x)+"/index.html\n")
            error.write(var)
            error.write("\n")
    
    output.close()
    
dados.close()
output.close()
outputAll.close
error.close()
    
        