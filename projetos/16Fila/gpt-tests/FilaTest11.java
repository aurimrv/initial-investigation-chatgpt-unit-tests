
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest11 {
  
  @Test
  public void testEnfileira() {
    Fila fila = new Fila();
    
    fila.enfileira("A");
    assertEquals(false, fila.vazia());
    
    fila.enfileira("B");
    fila.enfileira("C");
    fila.enfileira("D");
    assertEquals(false, fila.vazia());
  }
  
  @Test(expected=Exception.class)
  public void testDesenfileiraWhenEmpty() throws Exception {
    Fila fila = new Fila();
    
    fila.desenfileira();
  }
  
  @Test
  public void testDesenfileira() throws Exception {
    Fila fila = new Fila();
    
    fila.enfileira("A");
    fila.enfileira("B");
    fila.enfileira("C");
    
    assertEquals("A", fila.desenfileira());
    assertEquals("B", fila.desenfileira());
    assertEquals("C", fila.desenfileira());
    assertEquals(true, fila.vazia());
  }
  
  @Test
  public void testVazia() {
    Fila fila = new Fila();
    
    assertEquals(true, fila.vazia());
    
    fila.enfileira("A");
    assertEquals(false, fila.vazia());
    
    fila.desenfileira();
    assertEquals(true, fila.vazia());
  }
}