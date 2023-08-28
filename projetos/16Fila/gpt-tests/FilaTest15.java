package ds;import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FilaTest15{

  
  private Fila fila;
  
  @Before
  public void setUp() {
    fila = new Fila();
  }
  
  @Test
  public void testEnfileira() {
    fila.enfileira(1);
    fila.enfileira(2);
    fila.enfileira(3);
    
    assertFalse(fila.vazia());
    assertEquals(1, fila.desenfileira());
    assertEquals(2, fila.desenfileira());
    assertEquals(3, fila.desenfileira());
    assertTrue(fila.vazia());
  }
  
  @Test
  public void testDesenfileiraWhenEmpty() {
    try {
      fila.desenfileira();
      fail("Exception not thrown");
    } catch (Exception e) {
      assertEquals("Erro: A fila esta vazia", e.getMessage());
    }
  }
  
  @Test
  public void testVazia() {
    assertTrue(fila.vazia());
    fila.enfileira(1);
    assertFalse(fila.vazia());
    fila.desenfileira();
    assertTrue(fila.vazia());
  }
  
  @Test
  public void testImprime() {
    fila.enfileira(1);
    fila.enfileira(2);
    fila.enfileira(3);
    
    // Redirect System.out to a ByteArrayOutputStream
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    
    fila.imprime();
    
    assertEquals(" 1 2 3\n", outContent.toString());
  }
}