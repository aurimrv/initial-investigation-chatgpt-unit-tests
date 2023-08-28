
package ds;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest2 {
    
    private Fila fila;
    
    @Before
    public void setUp() {
        fila = new Fila();
    }
    
    @Test
    public void testEnfileira() throws Exception {
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
    public void testEnfileiraFull() throws Exception {
        for (int i = 0; i < 1000; i++) {
            fila.enfileira(i);
        }
        fila.enfileira(1000); // Should throw an exception
    }
    
    @Test(expected = Exception.class)
    public void testDesenfileiraEmpty() throws Exception {
        fila.desenfileira(); // Should throw an exception
    }
    
    @Test
    public void testVazia() throws Exception {
        assertTrue(fila.vazia());
        fila.enfileira(1);
        assertFalse(fila.vazia());
        fila.desenfileira();
        assertTrue(fila.vazia());
    }
}
