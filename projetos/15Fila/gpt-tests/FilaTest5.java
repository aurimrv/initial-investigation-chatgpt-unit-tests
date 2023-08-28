
package ds;import ds.Fila;
import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest5 {

    @Test
    public void testEnfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Item 1");
        fila.enfileira("Item 2");
        fila.enfileira("Item 3");
        assertEquals("Item 1", fila.item[fila.frente]);
        assertEquals("Item 2", fila.item[(fila.frente + 1) % fila.item.length]);
        assertEquals("Item 3", fila.item[(fila.frente + 2) % fila.item.length]);
    }

    @Test
    public void testEnfileiraFull() {
        try {
            Fila fila = new Fila();
            for (int i = 0; i < 1000; i++) {
                fila.enfileira("Item " + (i + 1));
            }
            fila.enfileira("Extra Item");
            fail("Expected an Exception to be thrown");
        } catch (Exception e) {
            assertEquals("Erro: A fila esta cheia", e.getMessage());
        }
    }

    @Test
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Item 1");
        fila.enfileira("Item 2");
        fila.enfileira("Item 3");
        assertEquals("Item 1", fila.desenfileira());
        assertEquals("Item 2", fila.desenfileira());
        assertEquals("Item 3", fila.desenfileira());
    }

    @Test
    public void testDesenfileiraEmpty() {
        try {
            Fila fila = new Fila();
            fila.desenfileira();
            fail("Expected an Exception to be thrown");
        } catch (Exception e) {
            assertEquals("Erro: A fila esta vazia", e.getMessage());
        }
    }

    @Test
    public void testVazia() {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
        fila.enfileira("Item 1");
        assertFalse(fila.vazia());
    }

    @Test
    public void testImprime() {
        Fila fila = new Fila();
        fila.enfileira("Item 1");
        fila.enfileira("Item 2");
        fila.enfileira("Item 3");
        fila.imprime();
        // Verify output in console manually
    }
}