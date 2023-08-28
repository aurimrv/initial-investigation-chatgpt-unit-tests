#!/bin/bash
SEED=$1

NEWNAME='JTExpert'

PRJ=$PWD

cd jteOutput/testcases/ds/

TCNAME=$(ls *.java | awk 'BEGIN{FS="."}{print $1}')

cd $PRJ

mkdir -p src/test/java/ds/seed$SEED

cp jteOutput/testcases/ds/*.java src/test/java/ds/seed$SEED

cd src/test/java/ds/seed$SEED

mv $TCNAME.java $NEWNAME.java

sed -i "s/$TCNAME/$NEWNAME/" "$NEWNAME.java"
sed -i "s/ds\;/ds\.seed$SEED\;/" "$NEWNAME.java"

cd $PRJ
rm -rf jteOutput