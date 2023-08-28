
package ds;import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FilaTest7 {
  
  private Fila fila;
  
  @Before
  public void setUp() {
    fila = new Fila();
  }
  
  @Test
  public void testEnfileira() throws Exception {
    fila.enfileira("elemento1");
    assertEquals(1, fila.tras);
  }
  
  @Test
  public void testEnfileiraFull() throws Exception {
    for (int i = 0; i < 1000; i++) {
      fila.enfileira("elemento" + i);
    }
    try {
      fila.enfileira("elemento1000");
    } catch (Exception e) {
      assertEquals("Erro: A fila esta cheia", e.getMessage());
    }
  }
  
  @Test
  public void testDesenfileira() throws Exception {
    fila.enfileira("elemento1");
    fila.enfileira("elemento2");
    Object item = fila.desenfileira();
    assertEquals("elemento1", item);
    assertEquals(1, fila.frente);
  }
  
  @Test
  public void testDesenfileiraEmpty() {
    try {
      fila.desenfileira();
    } catch (Exception e) {
      assertEquals("Erro: A fila esta vazia", e.getMessage());
    }
  }
  
  @Test
  public void testVazia() {
    assertTrue(fila.vazia());
    fila.enfileira("elemento");
    assertFalse(fila.vazia());
  }
  
  @Test
  public void testImprime() throws Exception {
    fila.enfileira("elemento1");
    fila.enfileira("elemento2");
    fila.enfileira("elemento3");
    fila.enfileira("elemento4");
    fila.imprime();
  }
}