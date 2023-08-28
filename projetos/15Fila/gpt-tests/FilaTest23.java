package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest23{


    @Test
    public void testEnfileira() {
        Fila fila = new Fila();
        try {
            fila.enfileira("Item 1");
            fila.enfileira("Item 2");
            fila.enfileira("Item 3");
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertEquals("Item 1", fila.item[fila.frente]);
        assertEquals("Item 2", fila.item[(fila.frente + 1) % fila.item.length]);
        assertEquals("Item 3", fila.item[(fila.frente + 2) % fila.item.length]);
    }

    @Test
    public void testEnfileiraWhenFull() {
        Fila fila = new Fila();
        try {
            for (int i = 0; i < fila.item.length; i++) {
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
            assertEquals("Item 2", fila.item[fila.frente]);
            assertEquals("Item 3", fila.item[(fila.frente + 1) % fila.item.length]);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testDesenfileiraWhenEmpty() {
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
            fail("Exception thrown: " + e.getMessage());
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