
package ds;

@Test
public void testVazia() {
  Lista lista = new Lista();
  assertTrue(lista.vazia());
}


@Test
public void testInsere() {
  Lista lista = new Lista();
  lista.insere(5);
  assertFalse(lista.vazia());
}


@Test
public void testImprime() {
  ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  System.setOut(new PrintStream(outContent));
  
  Lista lista = new Lista();
  lista.insere(10);
  lista.imprime();
  assertEquals("10\n", outContent.toString());
  
  System.setOut(System.out);
}


@Test
public void testRemove() {
  Lista lista = new Lista();
  lista.insere(15);
  lista.remove();
  assertTrue(lista.vazia());
}


@Test
public void testLista() {
  Lista lista = new Lista();
  lista.insere(20);
  lista.insere(30);
  lista.insere(40);
  
  ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  System.setOut(new PrintStream(outContent));
  lista.imprime();
  assertEquals("20\n30\n40\n", outContent.toString());
  
  System.setOut(System.out);
}
