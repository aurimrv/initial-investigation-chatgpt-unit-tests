
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest7 {
    @Test
    public void testEnfileira() {
        Fila fila = new Fila();
        fila.enfileira(10);
        fila.enfileira(20);
        fila.enfileira(30);
        fila.imprime();
        assertFalse(fila.vazia());
    }
    
    @Test
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(10);
        fila.enfileira(20);
        fila.enfileira(30);
        fila.imprime();
        assertEquals(10, fila.desenfileira());
        assertEquals(20, fila.desenfileira());
        assertEquals(30, fila.desenfileira());
        assertTrue(fila.vazia());
    }
    
    @Test(expected = Exception.class)
    public void testDesenfileiraException() throws Exception {
        Fila fila = new Fila();
        fila.desenfileira();
    }
    
    @Test
    public void testVazia() {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
        fila.enfileira(10);
        assertFalse(fila.vazia());
        fila.desenfileira();
        assertTrue(fila.vazia());
    }
}