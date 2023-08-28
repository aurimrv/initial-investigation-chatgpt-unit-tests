package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest12{


  @Test
  public void testEnfileira() {
    Fila fila = new Fila();
    fila.enfileira(1);
    fila.enfileira(2);
    fila.enfileira(3);
    assertFalse(fila.vazia());
  }

  @Test
  public void testDesenfileira() {
    Fila fila = new Fila();
    fila.enfileira(1);
    fila.enfileira(2);
    fila.enfileira(3);
    try {
      assertEquals(1, fila.desenfileira());
      assertEquals(2, fila.desenfileira());
      assertEquals(3, fila.desenfileira());
      assertTrue(fila.vazia());
    } catch (Exception e) {
      fail("Exception thrown");
    }
  }

  @Test
  public void testVazia() {
    Fila fila = new Fila();
    assertTrue(fila.vazia());
    fila.enfileira(1);
    assertFalse(fila.vazia());
    try {
      fila.desenfileira();
      assertTrue(fila.vazia());
    } catch (Exception e) {
      fail("Exception thrown");
    }
  }

  @Test
  public void testImprime() {
    Fila fila = new Fila();
    fila.enfileira(1);
    fila.enfileira(2);
    fila.enfileira(3);
    // Redirect System.out to capture output
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    fila.imprime();
    assertEquals(" 1 2 3\n", outContent.toString());
    System.setOut(System.out); // Reset System.out
  }

}