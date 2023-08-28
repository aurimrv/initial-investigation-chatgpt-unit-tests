
package ds;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FilaTest3 {
  
  private Fila fila;
  
  @Before
  public void setUp() {
    fila = new Fila();
  }
  
  @Test
  public void testEnfileira() {
    fila.enfileira(1);
    fila.enfileira(2);
    fila.enfileira(3);
    fila.enfileira(4);
    
    assertEquals("1 2 3 4", fila.imprime());
  }
  
  @Test
  public void testDesenfileira() throws Exception {
    fila.enfileira(1);
    fila.enfileira(2);
    
    assertEquals(1, fila.desenfileira());
    assertEquals(2, fila.desenfileira());
    assertTrue(fila.vazia());
  }
  
  @Test(expected = Exception.class)
  public void testDesenfileiraFromEmptyQueue() throws Exception {
    fila.desenfileira();
  }
  
  @Test
  public void testVazia() {
    assertTrue(fila.vazia());
    
    fila.enfileira(1);
    
    assertFalse(fila.vazia());
  }
}