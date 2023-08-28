
package ds;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest10 {
  
  private Pilha pilha;
  
  @Before
  public void setUp() {
    pilha = new Pilha();
  }
  
  @Test
  public void testEmpilha() throws Exception {
    pilha.empilha(5);
    pilha.empilha(10);
    assertEquals(10, pilha.item[pilha.topo - 1]);
  }
  
  @Test
  public void testDesempilha() throws Exception {
    pilha.empilha(5);
    pilha.empilha(10);
    Object result = pilha.desempilha();
    assertEquals(10, result);
    assertEquals(1, pilha.topo);
  }
  
  @Test(expected = Exception.class)
  public void testDesempilhaEmpty() throws Exception {
    pilha.desempilha();
  }
  
  @Test
  public void testVazia() {
    assertTrue(pilha.vazia());
    pilha.empilha(5);
    assertFalse(pilha.vazia());
  }
  
  @Test
  public void testTamanho() {
    assertEquals(0, pilha.tamanho());
    pilha.empilha(5);
    pilha.empilha(10);
    assertEquals(2, pilha.tamanho());
  }
}
