package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest24{


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
        assertEquals("Item 1", fila.item[fila.frente]);
        assertEquals("Item 2", fila.item[(fila.frente + 1) % fila.item.length]);
        assertEquals("Item 3", fila.item[(fila.frente + 2) % fila.item.length]);
    }

    @Test
    public void testEnfileiraFull() {
        Fila fila = new Fila();
        try {
            for (int i = 0; i < fila.item.length; i++) {
                fila.enfileira("Item " + (i + 1));
            }
        } catch (Exception e) {
            fail("Exception thrown");
        }
        try {
            fila.enfileira("Overflow");
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
        } catch (Exception e) {
            fail("Exception thrown");
        }
        try {
            Object item = fila.desenfileira();
            assertEquals("Item 1", item);
            item = fila.desenfileira();
            assertEquals("Item 2", item);
            item = fila.desenfileira();
            assertEquals("Item 3", item);
        } catch (Exception e) {
            fail("Exception thrown");
        }
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
        try {
            fila.enfileira("Item 1");
            fila.enfileira("Item 2");
            fila.enfileira("Item 3");
        } catch (Exception e) {
            fail("Exception thrown");
        }
        fila.imprime();
    }
}