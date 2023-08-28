
package ds;import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FilaTest4 {

  private Fila fila;
  
  @Before
  public void setUp() {
    fila = new Fila();
  }
  
  @Test
  public void testEnfileira() throws Exception {
    fila.enfileira("item1");
    fila.enfileira("item2");
    fila.enfileira("item3");
    
    assertEquals("item1", fila.item[fila.frente]);
    assertEquals("item2", fila.item[(fila.frente + 1) % fila.item.length]);
    assertEquals("item3", fila.item[(fila.frente + 2) % fila.item.length]);
  }
  
  @Test(expected = Exception.class)
  public void testEnfileiraFull() throws Exception {
    for (int i = 0; i < 1000; i++) {
      fila.enfileira("item" + i);
    }
    
    fila.enfileira("item1000");
  }
  
  @Test
  public void testDesenfileira() throws Exception {
    fila.enfileira("item1");
    fila.enfileira("item2");
    fila.enfileira("item3");
    
    Object item1 = fila.desenfileira();
    Object item2 = fila.desenfileira();
    Object item3 = fila.desenfileira();
    
    assertEquals("item1", item1);
    assertEquals("item2", item2);
    assertEquals("item3", item3);
  }
  
  @Test(expected = Exception.class)
  public void testDesenfileiraEmpty() throws Exception {
    fila.desenfileira();
  }
  
  @Test
  public void testVaziaEmpty() {
    assertTrue(fila.vazia());
  }
  
  @Test
  public void testVaziaNotEmpty() throws Exception {
    fila.enfileira("item1");
    
    assertFalse(fila.vazia());
  }
  
  @Test
  public void testImprime() throws Exception {
    fila.enfileira("item1");
    fila.enfileira("item2");
    fila.enfileira("item3");
    
    fila.imprime();
  }
}