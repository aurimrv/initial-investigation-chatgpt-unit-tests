
package ds;Here are some test cases for the Lista Java class:

1. Test case for creating an empty list:
   
   Lista lista = new Lista();
   assertEquals(true, lista.vazia());
   

2. Test case for inserting an element into the list:
   
   Lista lista = new Lista();
   lista.insere("element");
   assertEquals(false, lista.vazia());
   

3. Test case for inserting multiple elements into the list:
   
   Lista lista = new Lista();
   lista.insere("element1");
   lista.insere("element2");
   lista.insere("element3");
   assertEquals(false, lista.vazia());
   

4. Test case for trying to insert an element into a full list:
   
   Lista lista = new Lista();
   // Fill the list with elements until it's full
   for (int i = 0; i < 1000; i++) {
       lista.insere("element");
   }
   // Try to insert an additional element
   try {
       lista.insere("extra element");
       fail("Expected an Exception to be thrown");
   } catch (Exception e) {
       assertEquals("Erro: A lista esta cheia", e.getMessage());
   }
   

5. Test case for printing the elements of an empty list:
   
   Lista lista = new Lista();
   ByteArrayOutputStream outContent = new ByteArrayOutputStream();
   System.setOut(new PrintStream(outContent));
   lista.imprime();
   assertEquals("", outContent.toString());
   

6. Test case for printing the elements of a non-empty list:
   
   Lista lista = new Lista();
   lista.insere("element1");
   lista.insere("element2");
   ByteArrayOutputStream outContent = new ByteArrayOutputStream();
   System.setOut(new PrintStream(outContent));
   lista.imprime();
   assertEquals("element1\nelement2\n", outContent.toString());
   