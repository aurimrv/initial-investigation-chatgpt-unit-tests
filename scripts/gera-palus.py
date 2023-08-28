import sys
import os

if len(sys.argv) < 1:
	print("error: gera-palus.py")
	print("Example: gera-palus.py")
	sys.exit(1)

dados = open('files.txt', 'r')

for x in dados:
	x = x.strip()
	info = x.split(':')
	prj = info[0]
	clazz = info[1]

	cut = open("../projetos/" + prj + '/cut.txt', 'w')
	cut.write(clazz)
	cut.close()
dados.close()

dados = open('files.txt', 'r')

for x in dados:
	x = x.strip()
	info = x.split(':')
	prj = info[0]
	clazz = info[1]

	seeds = open('seeds.txt', 'r')
	
	for seed in seeds:
		className = clazz.split('.')
		seed = seed.strip()
		#Gerando trace model
		cmd = "cd " + "../projetos/" + prj + ";java -javaagent:../../tools/palus/palus-0.2-nodept.jar="+className[1]+" -cp ../../tools/palus/palus-0.2-nodept.jar:./target/classes/:./target/test-classes/:../../tools/junit/junit-4.13.jar:../../tools/junit/hamcrest-core-1.3.jar org.junit.runner.JUnitCore ds.seed"+seed+".JTExpert"
		os.system(cmd)

		#Gerando casos de teste
		cmd = "cd " + "../projetos/" + prj + ";java -Xss1G -Xmx5G -cp ../../tools/palus/palus-0.2-nodept.jar:target/classes/:./target/test-classes palus.main.OfflineMain --time_limit 1 --class_file ./cut.txt --random-seed="+seed+" --trace_file "+className[1]+"_trace.model;../../scripts/rename-palus.sh "+seed
		os.system(cmd)


	seeds.close()

dados.close()
