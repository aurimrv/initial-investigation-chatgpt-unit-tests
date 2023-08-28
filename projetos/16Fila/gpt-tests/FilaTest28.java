package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest28{


    @Test
    public void testEnfileira() {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.enfileira(4);
        fila.enfileira(5);
        fila.enfileira(6);
        fila.enfileira(7);
        fila.enfileira(8);
        fila.enfileira(9);
        fila.enfileira(10);
        assertEquals("1 2 3 4 5 6 7 8 9 10", fila.imprime());
    }

    @Test
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
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
        fila.enfileira(1);
        assertFalse(fila.vazia());
        fila.desenfileira();
        assertTrue(fila.vazia());
    }
}