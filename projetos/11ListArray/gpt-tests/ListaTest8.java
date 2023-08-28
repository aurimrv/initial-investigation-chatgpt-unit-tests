
package ds;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ListaTest8 {
  
  private Lista lista;
  
  @Before
  public void setUp() {
    lista = new Lista();
  }
  
  @Test
  public void testInsere() throws Exception {
    lista.insere("Item 1");
    lista.insere("Item 2");
    lista.insere("Item 3");
    
    assertEquals("Item 1", lista.item[0]);
    assertEquals("Item 2", lista.item[1]);
    assertEquals("Item 3", lista.item[2]);
  }
  
  @Test(expected = Exception.class)
  public void testInsereListaCheia() throws Exception {
    for (int i = 0; i < 1000; i++) {
      lista.insere("Item "+i);
    }
    
    lista.insere("Item 1001"); // this should throw an exception
  }
  
  @Test
  public void testVaziaTrue() {
    assertTrue(lista.vazia());
  }
  
  @Test
  public void testVaziaFalse() throws Exception {
    lista.insere("Item");
    
    assertFalse(lista.vazia());
  }
  
  @Test
  public void testImprime() {
    lista.insere("Item 1");
    lista.insere("Item 2");
    lista.insere("Item 3");
    
    lista.imprime(); // this should print "Item 1", "Item 2", "Item 3"
  }
  
}
