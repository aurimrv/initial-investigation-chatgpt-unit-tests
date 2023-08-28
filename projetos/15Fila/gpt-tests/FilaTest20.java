package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest20{


    @Test
    public void testEnfileira() {
        Fila fila = new Fila();
        try {
            fila.enfileira("Item 1");
            fila.enfileira("Item 2");
            fila.enfileira("Item 3");
        } catch (Exception e) {
            fail("Exception thrown");
        }
        assertEquals("Item 1", fila.item[0]);
        assertEquals("Item 2", fila.item[1]);
        assertEquals("Item 3", fila.item[2]);
    }

    @Test
    public void testEnfileiraFull() {
        Fila fila = new Fila();
        try {
            for (int i = 0; i < 1000; i++) {
                fila.enfileira("Item " + (i + 1));
            }
            fila.enfileira("Item 1001");
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A fila esta cheia", e.getMessage());
        }
    }

    @Test
    public void testDesenfileira() {
        Fila fila = new Fila();
        try {
            fila.enfileira("Item 1");
            fila.enfileira("Item 2");
            fila.enfileira("Item 3");
            Object item = fila.desenfileira();
            assertEquals("Item 1", item);
            item = fila.desenfileira();
            assertEquals("Item 2", item);
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
            fila.enfileira("Item 1");
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
        fila.enfileira("Item 1");
        fila.enfileira("Item 2");
        fila.enfileira("Item 3");
        fila.imprime();
    }
}