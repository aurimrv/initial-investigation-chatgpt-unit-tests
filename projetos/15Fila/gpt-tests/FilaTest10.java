
package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest10 {

    @Test
    public void testEnfileira() {
        Fila fila = new Fila();
        try {
            fila.enfileira(1);
            fila.enfileira(2);
            fila.enfileira(3);
            assertFalse(fila.vazia());
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test
    public void testDesenfileira() {
        Fila fila = new Fila();
        try {
            fila.enfileira(1);
            fila.enfileira(2);
            fila.enfileira(3);
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
    }
}