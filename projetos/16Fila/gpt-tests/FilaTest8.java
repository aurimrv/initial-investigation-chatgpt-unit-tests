
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest8 {

    @Test
    public void testEnfileira() {
        Fila fila = new Fila();
        fila.enfileira("element");
        assertFalse(fila.vazia());
    }
    
    @Test
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("element");
        Object item = fila.desenfileira();
        assertTrue(fila.vazia());
        assertEquals("element", item);
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
        fila.enfileira("element");
        assertFalse(fila.vazia());
    }
    
    @Test
    public void testImprime() {
        Fila fila = new Fila();
        fila.enfileira("element1");
        fila.enfileira("element2");
        fila.enfileira("element3");
        fila.imprime();
    }
}