import sys
import os
import re
import traceback
from bs4 import BeautifulSoup as bs
from datetime import datetime

if len(sys.argv) < 5:
	print("error: run.py <Evo|Randoop|JTExpert> <prj> <source class name> <seed>")
	print("Example: run.py Evo")
	sys.exit(1)

tool = sys.argv[1]
prj = sys.argv[2]
clazz = sys.argv[3]
seed = sys.argv[4]

test = 'ds.seed'+seed+'.'+tool

print(test)

output = open('report-'+ test + '.csv', 'w') 
output.write("PRJ;CLASSE;Cobertos;Gerados;Cobertura;Mortos;Total;Escore\n")

cmd = "cd " + prj + "; mvn -DclassName=\"" + clazz + "\" -DtestName=\""+ test
cmd = cmd + "\" clean install org.pitest:pitest-maven:mutationCoverage"
os.system(cmd)

try:
	with open(prj+"/reports/"+test+"/index.html",'r') as html:
		soup = bs(html, 'html.parser')
		divs = soup.findAll(attrs={'class':'coverage_percentage'})
		covs = soup.findAll(attrs={'class':'coverage_legend'})

		output.write(prj + ";")
		output.write(clazz + ";")
		output.write(covs[2].text.split("/")[0].strip() + ";")
		output.write(covs[2].text.split("/")[1].strip() + ";")
		output.write(divs[0].text.strip() + ";")
		output.write(covs[3].text.split("/")[0].strip() + ";")
		output.write(covs[3].text.split("/")[1].strip() + ";")
		output.write(divs[1].text.strip())	
except:
	var = traceback.format_exc()
	now = datetime.now()
	current_time = now.strftime("%H:%M:%S")
	print(current_time)
	print(" - "+prj+" - ERROR: /reports/"+test+"/index.html\n")
	print(var)
	print("\n")

output.write("\n")
output.flush()
			
output.close()