import sys
import os

if len(sys.argv) < 1:
	print("error: gera-evo.py")
	print("Example: gera-evo.py")
	sys.exit(1)

dados = open('files.txt', 'r')

for x in dados:
	x = x.strip()
	info = x.split(':')
	prj = info[0]
	clazz = info[1]

	seeds = open('seeds.txt', 'r')
	
	for seed in seeds:
		seed = seed.strip()

		className = clazz.split('.')

		cmd = "cd " + "../projetos/" + prj + ";mvn compile; java -classpath target/classes:../../tools/randoop/randoop-all-4.2.4.jar randoop.main.Main gentests --regression-test-basename=Randoop --usethreads --testclass="+clazz+" --time-limit=30 --randomseed="+seed+" --junit-output-dir=src/test/java/ --junit-package-name=ds.seed"+seed+";../../scripts/rename-randoop-tc.sh "+seed

		os.system(cmd)
	seeds.close()
dados.close()