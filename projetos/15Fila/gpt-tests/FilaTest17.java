package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest17{


    @Test
    public void testEnfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Item 1");
        fila.enfileira("Item 2");
        fila.enfileira("Item 3");
        assertEquals(3, fila.tras - fila.frente);
    }

    @Test(expected = Exception.class)
    public void testEnfileiraFilaCheia() throws Exception {
        Fila fila = new Fila();
        for (int i = 0; i < 1000; i++) {
            fila.enfileira("Item " + (i + 1));
        }
        fila.enfileira("Item 1001");
    }

    @Test
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Item 1");
        fila.enfileira("Item 2");
        fila.enfileira("Item 3");
        Object item = fila.desenfileira();
        assertEquals("Item 1", item);
        assertEquals(2, fila.tras - fila.frente);
    }

    @Test(expected = Exception.class)
    public void testDesenfileiraFilaVazia() throws Exception {
        Fila fila = new Fila();
        fila.desenfileira();
    }

    @Test
    public void testVaziaFilaVazia() {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
    }

    @Test
    public void testVaziaFilaNaoVazia() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Item 1");
        assertFalse(fila.vazia());
    }

    @Test
    public void testImprimeFilaVazia() {
        Fila fila = new Fila();
        fila.imprime();
    }

    @Test
    public void testImprimeFilaNaoVazia() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Item 1");
        fila.enfileira("Item 2");
        fila.enfileira("Item 3");
        fila.imprime();
    }
}