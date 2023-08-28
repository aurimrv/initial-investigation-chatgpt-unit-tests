
package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest7 {

  @Test
  public void testEmpilha() {
    Pilha pilha = new Pilha();
    pilha.empilha(1);
    pilha.empilha(2);

    assertEquals(2, pilha.tamanho());
  }

  @Test
  public void testDesempilha() throws Exception {
    Pilha pilha = new Pilha();
    pilha.empilha(1);
    pilha.empilha(2);

    assertEquals(2, pilha.desempilha());
    assertEquals(1, pilha.tamanho());
  }

  @Test
  public void testVazia() {
    Pilha pilha = new Pilha();

    assertTrue(pilha.vazia());

    pilha.empilha(1);

    assertFalse(pilha.vazia());
  }

  @Test
  public void testTamanho() {
    Pilha pilha = new Pilha();

    assertEquals(0, pilha.tamanho());

    pilha.empilha(1);
    pilha.empilha(2);

    assertEquals(2, pilha.tamanho());
  }
}