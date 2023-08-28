package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest12{


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
    public void testEnfileiraWhenFull() {
        Fila fila = new Fila();
        try {
            for (int i = 0; i < 1000; i++) {
                fila.enfileira("Item " + (i + 1));
            }
            fila.enfileira("Extra Item");
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
            assertEquals("Item 1", fila.desenfileira());
            assertEquals("Item 2", fila.desenfileira());
            assertEquals("Item 3", fila.desenfileira());
        } catch (Exception e) {
            fail("Exception thrown");
        }
        assertTrue(fila.vazia());
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
    public void testVaziaWhenEmpty() {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
    }

    @Test
    public void testVaziaWhenNotEmpty() {
        Fila fila = new Fila();
        try {
            fila.enfileira("Item 1");
        } catch (Exception e) {
            fail("Exception thrown");
        }
        assertFalse(fila.vazia());
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