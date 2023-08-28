
package ds;

@Test
public void testInsere() throws Exception {
    Lista lista = new Lista();
    Object obj = new Object();
    lista.insere(obj);
    assertFalse(lista.vazia());
}


@Test
public void testVaziaEmptyList() {
    Lista lista = new Lista();
    assertTrue(lista.vazia());
}

@Test
public void testVaziaNonEmptyList() throws Exception {
    Lista lista = new Lista();
    lista.insere(new Object());
    assertFalse(lista.vazia());
}


@Test
public void testImprime() throws Exception {
    Lista lista = new Lista();
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outContent));
    Object obj1 = new Object();
    Object obj2 = new Object();
    lista.insere(obj1);
    lista.insere(obj2);
    lista.imprime();
    assertEquals(obj1.toString() + "\n" + obj2.toString() + "\n", outContent.toString());
    System.setOut(originalOut);
}
