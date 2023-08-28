package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest31{


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

    @Test(expected = Exception.class)
    public void testEnfileiraFull() throws Exception {
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
        assertEquals("Item 1", fila.desenfileira());
        assertEquals("Item 2", fila.desenfileira());
        assertEquals("Item 3", fila.desenfileira());
    }

    @Test(expected = Exception.class)
    public void testDesenfileiraEmpty() throws Exception {
        Fila fila = new Fila();
        fila.desenfileira();
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
    }
}