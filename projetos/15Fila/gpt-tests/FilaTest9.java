
package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest9 {

   @Test
   public void testEnfileira() {
      Fila fila = new Fila();
      
      try {
         fila.enfileira("item1");
         fila.enfileira("item2");
         fila.enfileira("item3");
      } catch (Exception e) {
         fail("Unexpected Exception: " + e.getMessage());
      }
      
      assertEquals(3, fila.tras - fila.frente);
   }
   
   @Test
   public void testEnfileiraFull() {
      Fila fila = new Fila();
      
      try {
         for (int i = 0; i < 1000; i++) {
            fila.enfileira("item" + i);
         }
      } catch (Exception e) {
         fail("Unexpected Exception: " + e.getMessage());
      }
      
      try {
         fila.enfileira("overflowItem");
         fail("Expected Exception not thrown");
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
         fila.enfileira("item3");
      } catch (Exception e) {
         fail("Unexpected Exception: " + e.getMessage());
      }
      
      try {
         Object item = fila.desenfileira();
         assertEquals("item1", item);
      } catch (Exception e) {
         fail("Unexpected Exception: " + e.getMessage());
      }
      
      assertEquals(2, fila.tras - fila.frente);
   }
   
   @Test
   public void testDesenfileiraEmpty() {
      Fila fila = new Fila();
      
      try {
         fila.desenfileira();
         fail("Expected Exception not thrown");
      } catch (Exception e) {
         assertEquals("Erro: A fila esta vazia", e.getMessage());
      }
   }
   
   @Test
   public void testVazia() {
      Fila fila = new Fila();
      
      assertTrue(fila.vazia());
      
      try {
         fila.enfileira("item1");
      } catch (Exception e) {
         fail("Unexpected Exception: " + e.getMessage());
      }
      
      assertFalse(fila.vazia());
   }
   
   @Test
   public void testImprime() {
      Fila fila = new Fila();
      
      try {
         fila.enfileira("item1");
         fila.enfileira("item2");
         fila.enfileira("item3");
      } catch (Exception e) {
         fail("Unexpected Exception: " + e.getMessage());
      }
      
      fila.imprime(); // Output should be: item1, item2, item3
   }
}