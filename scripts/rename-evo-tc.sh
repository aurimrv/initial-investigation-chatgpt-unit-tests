#!/bin/bash
CLAZZ=$1
SEED=$2

TCNAME=$(echo $CLAZZ\_ESTest)
SCAFFOLDING=$(echo $CLAZZ\_ESTest\_scaffolding)
EVONAME=$(echo Evo)

PRJ=$PWD

echo $TCNAME

echo $EVONAME

echo $PWD

mkdir -p src/test/java/ds/seed$SEED

cp evosuite-tests/ds/*.java src/test/java/ds/seed$SEED

cd src/test/java/ds/seed$SEED

echo mv $TCNAME.java $EVONAME.java
mv $TCNAME.java $EVONAME.java

sed -i "s/$TCNAME/$EVONAME/" "$EVONAME.java"
sed -i "s/ds\;/ds\.seed$SEED\;/" "$EVONAME.java"
sed -i "s/ds\;/ds\.seed$SEED\;/" "$SCAFFOLDING.java"

cd $PRJ
rm -rf evosuite-tests evosuite-report