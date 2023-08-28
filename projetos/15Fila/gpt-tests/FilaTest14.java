package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest14{

  
  @Test
  public void testEnfileira() {
    Fila fila = new Fila();
    
    try {
      fila.enfileira("item1");
      fila.enfileira("item2");
      
      assertEquals("item1", fila.item[fila.frente]);
      assertEquals("item2", fila.item[(fila.frente + 1) % fila.item.length]);
    } catch (Exception e) {
      fail("Exception thrown");
    }
  }
  
  @Test
  public void testEnfileiraFull() {
    Fila fila = new Fila();
    
    try {
      for (int i = 0; i < fila.item.length; i++) {
        fila.enfileira("item" + (i+1));
      }
      
      fila.enfileira("extraItem");
      
      fail("Exception not thrown");
    } catch (Exception e) {
      assertEquals("Erro: A fila esta cheia", e.getMessage());
    }
  }
  
  @Test
  public void testDesenfileira() {
    Fila fila = new Fila();
    
    try {
      fila.enfileira("item1");
      fila.enfileira("item2");
      
      Object item = fila.desenfileira();
      
      assertEquals("item1", item);
      assertEquals("item2", fila.item[fila.frente]);
    } catch (Exception e) {
      fail("Exception thrown");
    }
  }
  
  @Test
  public void testDesenfileiraEmpty() {
    Fila fila = new Fila();
    
    try {
      fila.desenfileira();
      
      fail("Exception not thrown");
    } catch (Exception e) {
      assertEquals("Erro: A fila esta vazia", e.getMessage());
    }
  }
  
  @Test
  public void testVaziaTrue() {
    Fila fila = new Fila();
    
    assertTrue(fila.vazia());
  }
  
  @Test
  public void testVaziaFalse() {
    Fila fila = new Fila();
    
    try {
      fila.enfileira("item1");
      
      assertFalse(fila.vazia());
    } catch (Exception e) {
      fail("Exception thrown");
    }
  }
  
  @Test
  public void testImprime() {
    Fila fila = new Fila();
    
    try {
      fila.enfileira("item1");
      fila.enfileira("item2");
      fila.enfileira("item3");
      
      fila.imprime();
    } catch (Exception e) {
      fail("Exception thrown");
    }
  }
}