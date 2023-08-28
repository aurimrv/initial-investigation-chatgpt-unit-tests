
package ds;
import ds.Pilha;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PilhaTest3 {
  
  private Pilha pilha;
  
  @Before
  public void setUp() {
    pilha = new Pilha();
  }
  
  @Test
  public void testNewPilhaIsEmpty() {
    Assert.assertTrue(pilha.vazia());
    Assert.assertEquals(0, pilha.tamanho());
  }
  
  @Test
  public void testEmpilhaItem() throws Exception {
    pilha.empilha("Item 1");
    Assert.assertFalse(pilha.vazia());
    Assert.assertEquals(1, pilha.tamanho());
  }
  
  @Test
  public void testDesempilhaItem() throws Exception {
    pilha.empilha("Item 1");
    Object item = pilha.desempilha();
    Assert.assertEquals("Item 1", item);
    Assert.assertTrue(pilha.vazia());
    Assert.assertEquals(0, pilha.tamanho());
  }
  
  @Test(expected = Exception.class)
  public void testDesempilhaFromEmptyPilha() throws Exception {
    pilha.desempilha();
  }
  
  @Test(expected = Exception.class)
  public void testEmpilhaWhenPilhaIsFull() throws Exception {
    for (int i = 0; i < 1000; i++) {
      pilha.empilha("Item " + (i + 1));
    }
    pilha.empilha("Item 1001");
  }
  
}