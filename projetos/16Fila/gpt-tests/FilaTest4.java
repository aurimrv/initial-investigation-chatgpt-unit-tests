
package ds;
import ds.Fila;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FilaTest4 {
    private Fila fila;

    @Before
    public void setUp() {
        fila = new Fila();
    }

    @Test
    public void testEnfileira() {
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        assertFalse(fila.vazia());
    }

    @Test
    public void testDesenfileira() throws Exception {
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        assertEquals(1, fila.desenfileira());
        assertEquals(2, fila.desenfileira());
        assertEquals(3, fila.desenfileira());
        assertTrue(fila.vazia());
    }

    @Test(expected = Exception.class)
    public void testDesenfileiraFromEmptyFila() throws Exception {
        fila.desenfileira();
    }

    @Test
    public void testVazia() {
        assertTrue(fila.vazia());
        fila.enfileira(1);
        assertFalse(fila.vazia());
        fila.desenfileira();
        assertTrue(fila.vazia());
    }

    @Test
    public void testImprime() {
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.imprime();
    }
}