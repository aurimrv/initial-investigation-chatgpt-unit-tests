
package ds;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest0 {

    private Fila fila;

    @Before
    public void setUp() {
        fila = new Fila();
    }

    @Test
    public void testEnfileira() {
        fila.enfileira(10);
        fila.enfileira(20);
        fila.enfileira(30);
        assertEquals(10, fila.desenfileira());
        assertEquals(20, fila.desenfileira());
        assertEquals(30, fila.desenfileira());
    }

    @Test
    public void testDesenfileira() {
        try {
            fila.desenfileira();
            fail("Expected Exception to be thrown");
        } catch (Exception e) {
            assertEquals("Erro: A fila esta vazia", e.getMessage());
        }

        fila.enfileira(10);
        fila.enfileira(20);
        fila.enfileira(30);
        assertEquals(10, fila.desenfileira());
        assertEquals(20, fila.desenfileira());
        assertEquals(30, fila.desenfileira());
    }

    @Test
    public void testVazia() {
        assertTrue(fila.vazia());
        fila.enfileira(10);
        assertFalse(fila.vazia());
        fila.desenfileira();
        assertTrue(fila.vazia());
    }

    @Test
    public void testImprime() {
        fila.enfileira(10);
        fila.enfileira(20);
        fila.enfileira(30);
        fila.enfileira(40);
        fila.enfileira(50);
        fila.imprime(); // This will print "10 20 30 40 50"
    }
}