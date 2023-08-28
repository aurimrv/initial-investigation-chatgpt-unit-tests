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
		className = clazz.split('.')
		seed = seed.strip()
		cmd = "cd " + "../projetos/" + prj + ";mvn compile; java -cp $CLASSPATH -Xms1G -Xmx1G -jar ../../tools/JTExpert-1.4/JTExpert-1.4.jar -cp target/classes/ -jf src/main/java/ds/"+className[1]+".java -o -s -p -maxTime 60 -seed "+seed+";../../scripts/rename-jtexpert-tc.sh "+seed

		os.system(cmd)
	seeds.close()

dados.close()