#!/bin/bash
SEED=$1

TCNAME='GeneratedTest'
NEWNAME='Palus'

PRJ=$PWD

cd tests/tests

for file in $(ls); do
	echo "Renaming file $file"
	sed -i "s/tests/ds\.seed$SEED/" "$file"
done

sed -i "s/class\ GeneratedTest/class\ Palus/" "$TCNAME.java"
sed -i "s/public\ GeneratedTest/public\ Palus/" "$TCNAME.java"


cd $PRJ

mkdir -p src/test/java/ds/seed$SEED

cp tests/tests/*.java src/test/java/ds/seed$SEED

cd src/test/java/ds/seed$SEED

mv $TCNAME.java $NEWNAME.java

cd $PRJ
rm -rf tests