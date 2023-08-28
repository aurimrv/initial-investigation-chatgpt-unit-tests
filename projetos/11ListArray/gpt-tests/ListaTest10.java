
package ds;import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ListaTest10 {

  private Lista lista;

  @Before
  public void setUp() {
    lista = new Lista();
  }

  @Test
  public void testInsere() {
    try {
      lista.insere("Item 1");
      lista.insere("Item 2");
      lista.insere("Item 3");
    } catch (Exception e) {
      fail("Exception thrown when it shouldn't be");
    }
  }

  @Test
  public void testInsereFull() {
    try {
      for (int i = 0; i < 1001; i++) {
        lista.insere("Item " + i);
      }
      fail("Exception not thrown when it should be");
    } catch (Exception e) {
      assertEquals("Erro: A lista esta cheia", e.getMessage());
    }
  }

  @Test
  public void testVazia() {
    assertTrue(lista.vazia());
  }

  @Test
  public void testImprime() {
    lista.insere("Item 1");
    lista.insere("Item 2");
    lista.insere("Item 3");
    lista.imprime();
    // Manually check the console output for correctness
  }

}