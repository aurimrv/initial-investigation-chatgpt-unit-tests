package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest25{


    @Test
    public void testEnfileira() {
        Fila fila = new Fila();
        try {
            fila.enfileira(1);
            fila.enfileira(2);
            fila.enfileira(3);
            fila.enfileira(4);
            fila.enfileira(5);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test
    public void testEnfileiraFull() {
        Fila fila = new Fila();
        try {
            for (int i = 0; i < 1000; i++) {
                fila.enfileira(i);
            }
            fila.enfileira(1001);
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A fila esta cheia", e.getMessage());
        }
    }

    @Test
    public void testDesenfileira() {
        Fila fila = new Fila();
        try {
            fila.enfileira(1);
            fila.enfileira(2);
            fila.enfileira(3);
            fila.enfileira(4);
            fila.enfileira(5);
            assertEquals(1, fila.desenfileira());
            assertEquals(2, fila.desenfileira());
            assertEquals(3, fila.desenfileira());
            assertEquals(4, fila.desenfileira());
            assertEquals(5, fila.desenfileira());
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test
    public void testDesenfileiraEmpty() {
        Fila fila = new Fila();
        try {
            fila.desenfileira();
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A fila esta vazia", e.getMessage());
        }
    }

    @Test
    public void testVazia() {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
        try {
            fila.enfileira(1);
            assertFalse(fila.vazia());
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
        fila.enfileira(4);
        fila.enfileira(5);
        fila.imprime();
    }
}