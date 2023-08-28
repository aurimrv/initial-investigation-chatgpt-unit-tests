
package ds;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ListaTest5 {
  
  private Lista lista;
  
  @Before
  public void setup() {
    lista = new Lista();
  }
  
  @Test
  public void testInsere() throws Exception {
    lista.insere("Item 1");
    lista.insere("Item 2");
    lista.insere("Item 3");
    
    Assert.assertEquals(3, lista.ultimo - lista.primeiro);
  }
  
  @Test
  public void testVazia() {
    Assert.assertTrue(lista.vazia());
    
    lista.insere("Item");
    
    Assert.assertFalse(lista.vazia());
  }
  
  @Test
  public void testImprime() {
    lista.insere("Item 1");
    lista.insere("Item 2");
    lista.insere("Item 3");
    
    lista.imprime();
    // Assert the output of System.out.println here if needed
  }
  
}