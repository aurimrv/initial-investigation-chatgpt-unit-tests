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
		cmd = "cd " + "../projetos/" + prj + ";mvn compile; java -jar ../../tools/evosuite/evosuite-1.0.6.jar -generateSuite -seed " + seed + " -Dsearch_budget=60 -Dcriterion=branch -Dstopping_condition=MaxTime -target target/classes -class "+ clazz + " -Duse_separate_classloader=false; ../../scripts/rename-evo-tc.sh " + className[1] + " " + seed
		os.system(cmd)
	seeds.close()

dados.close()