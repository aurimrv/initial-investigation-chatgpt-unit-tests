
package ds;import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FilaTest11 {
  
  private Fila fila;
  
  @Before
  public void setup() {
    fila = new Fila();
  }
  
  @Test
  public void testEnfileira() throws Exception {
    fila.enfileira(1);
    fila.enfileira(2);
    fila.enfileira(3);
    assertEquals(3, fila.item[(fila.tras-1)%fila.item.length]);
  }
  
  @Test
  public void testDesenfileira() throws Exception {
    fila.enfileira(1);
    fila.enfileira(2);
    fila.enfileira(3);
    assertEquals(1, fila.desenfileira());
    assertEquals(2, fila.desenfileira());
  }
  
  @Test
  public void testVazia() throws Exception {
    assertTrue(fila.vazia());
    fila.enfileira(1);
    assertFalse(fila.vazia());
    fila.desenfileira();
    assertTrue(fila.vazia());
  }
  
  @Test(expected=Exception.class)
  public void testEnfileiraFilaCheia() throws Exception {
    for (int i = 0; i < 1000; i++) {
      fila.enfileira(i);
    }
    fila.enfileira(1001);
  }
  
  @Test(expected=Exception.class)
  public void testDesenfileiraFilaVazia() throws Exception {
    fila.desenfileira();
  }
}