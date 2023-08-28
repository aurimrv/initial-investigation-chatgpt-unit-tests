
package ds;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PilhaTest1 {

  private Pilha pilha;

  @Before
  public void setUp() {
    pilha = new Pilha();
  }

  @Test
  public void testEmpilha() {
    pilha.empilha(10);
    pilha.empilha(20);
    pilha.empilha(30);
    assertEquals(3, pilha.tamanho());
  }

  @Test
  public void testDesempilha() throws Exception {
    pilha.empilha(10);
    pilha.empilha(20);
    pilha.empilha(30);
    assertEquals(30, pilha.desempilha());
    assertEquals(2, pilha.tamanho());
  }

  @Test(expected = Exception.class)
  public void testDesempilhaEmptyStack() throws Exception {
    pilha.desempilha();
  }

  @Test
  public void testVazia() {
    assertTrue(pilha.vazia());
    pilha.empilha(10);
    assertFalse(pilha.vazia());
  }

  @Test
  public void testTamanho() {
    assertEquals(0, pilha.tamanho());
    pilha.empilha(10);
    assertEquals(1, pilha.tamanho());
  }
}
