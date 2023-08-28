package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest16{

  
  @Test
  public void testEmpilha() {
    Pilha pilha = new Pilha();
    pilha.empilha("Item 1");
    assertEquals(1, pilha.tamanho());
    assertFalse(pilha.vazia());
  }
  
  @Test
  public void testDesempilha() throws Exception {
    Pilha pilha = new Pilha();
    pilha.empilha("Item 1");
    pilha.empilha("Item 2");
    Object item = pilha.desempilha();
    assertEquals("Item 2", item);
    assertEquals(1, pilha.tamanho());
  }
  
  @Test(expected = Exception.class)
  public void testDesempilhaEmptyStack() throws Exception {
    Pilha pilha = new Pilha();
    pilha.desempilha();
  }
  
  @Test
  public void testVazia() {
    Pilha pilha = new Pilha();
    assertTrue(pilha.vazia());
    pilha.empilha("Item 1");
    assertFalse(pilha.vazia());
  }
  
  @Test
  public void testTamanho() {
    Pilha pilha = new Pilha();
    assertEquals(0, pilha.tamanho());
    pilha.empilha("Item 1");
    assertEquals(1, pilha.tamanho());
    pilha.empilha("Item 2");
    assertEquals(2, pilha.tamanho());
    pilha.desempilha();
    assertEquals(1, pilha.tamanho());
  }
}