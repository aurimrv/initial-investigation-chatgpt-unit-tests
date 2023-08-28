package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest16{

  
  @Test
  public void testInsere() {
    Lista lista = new Lista();
    lista.insere(1);
    lista.insere(2);
    lista.insere(3);
    
    // Verify that the elements were inserted correctly
    assertEquals(1, lista.primeiro.prox.item);
    assertEquals(2, lista.primeiro.prox.prox.item);
    assertEquals(3, lista.primeiro.prox.prox.prox.item);
  }
  
  @Test
  public void testVazia() {
    Lista lista = new Lista();
    
    // Verify that the list is initially empty
    assertTrue(lista.vazia());
    
    // Add an element to the list
    lista.insere(1);
    
    // Verify that the list is not empty anymore
    assertFalse(lista.vazia());
  }
  
  @Test
  public void testImprime() {
    Lista lista = new Lista();
    lista.insere(1);
    lista.insere(2);
    lista.insere(3);
    
    // Capture the output of the imprime method
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    
    // Call the imprime method
    lista.imprime();
    
    // Verify that the output matches the expected result
    assertEquals("1\n2\n3\n", outContent.toString());
  }
}