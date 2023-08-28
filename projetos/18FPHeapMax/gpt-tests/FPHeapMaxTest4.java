
package ds;Here are some test cases for the FPHeapMax Java class using Junit 4 and Java 8:

1. Test case to check if the heap is constructed correctly:
java
@Test
public void testConstroi() {
    FPHeapMax A = new FPHeapMax(7);
    MeuItem[] V = {null, new MeuItem(20), new MeuItem(15), new MeuItem(18), new MeuItem(10), new MeuItem(12), new MeuItem(9), new MeuItem(13)};
    A.copia(V);
    A.constroi();
    assertEquals(20, ((MeuItem)A.max()).recuperaChave());
    assertEquals(20, ((MeuItem)A.retiraMax()).recuperaChave());
}


2. Test case to check if an item is correctly inserted into the heap:
java
@Test
public void testInsere() throws Exception {
    FPHeapMax A = new FPHeapMax(7);
    MeuItem[] V = {null, new MeuItem(20), new MeuItem(15), new MeuItem(18), new MeuItem(10), new MeuItem(12), new MeuItem(9)};
    A.copia(V);
    MeuItem x = new MeuItem(13);
    A.insere(x);
    assertEquals(20, ((Meu