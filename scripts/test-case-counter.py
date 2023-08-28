import sys
import os
import re
import traceback
from bs4 import BeautifulSoup as bs
from datetime import datetime

if len(sys.argv) < 2:
	print("error: test-case-counter.py <Evo|Randoop|JTExpert|Palus|AllSmart|All>")
	print("Example: test-case-counter.py Evo")
	sys.exit(1)

tool = sys.argv[1]

seeds = open('seeds.txt', 'r')

for seed in seeds:
	
	seed = seed.strip()

	test = 'ds.seed'+seed+'.'+tool

	print("PRJ;TestSet;Success;Ignored;Failed;Total;Time(ms)")

	dados = open('files.txt', 'r')
	for x in dados:
		x = x.strip()
		info = x.split(':')
		prj = info[0]
		prj = prj.strip()

		clazz = info[1]


		cmd = "java -cp /local/tools/junit/hamcrest-core-1.3.jar:/local/tools/junit/junit-4.13.jar:/home/auri/workspace/JUnitTestCounter/JUnitTestCounter.jar JUnitTestCounter -cp ./"+prj+"/target/classes/:./"+prj+"/target/test-classes/:/local/tools/junit/hamcrest-core-1.3.jar:/local/tools/junit/junit-4.13.jar:/local/tools/evosuite/evosuite-1.0.6.jar -tc ds.seed"+seed+"."+tool

		print(prj+";", end='', flush=True)
		os.system(cmd)

	dados.close()
seeds.close()
