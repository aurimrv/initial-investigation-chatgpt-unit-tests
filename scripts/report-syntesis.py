from bs4 import BeautifulSoup as bs
import re


if len(sys.argv) < 2:
	print("error: report.py <seed>")
	print("Example: report.py 9002")
	sys.exit(1)

seed = sys.argv[1]

error = open('log-report-error.txt', 'a+')

output = open('report-'+ test + '.csv', 'w') 
output.write("PRJ;CLASSE;Cobertos;Gerados;Cobertura;Mortos;Total;Escore\n")

dados = open('files.txt', 'r')
for x in dados:
	x = x.strip()
	info = x.split(':')
	prj = info[0]
	clazz = info[1]

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
		error.write(current_time)
		error.write(" - "+prj+" - ERROR: /reports/"+test+"/index.html\n")
		error.write(var)
		error.write("\n")
			
	output.write("\n")
	output.flush()

dados.close()
output.close()
error.close()