
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FilaTest0 {
    @Test
    public void testEnfileira() throws Exception {
        Fila fila = new Fila();
        
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        
        assertEquals(1, fila.item[0]);
        assertEquals(2, fila.item[1]);
        assertEquals(3, fila.item[2]);
    }
    
    @Test
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        
        assertEquals(1, fila.desenfileira());
        assertEquals(2, fila.desenfileira());
        assertEquals(3, fila.desenfileira());
    }
    
    @Test(expected = Exception.class)
    public void testDesenfileiraFromEmptyFila() throws Exception {
        Fila fila = new Fila();
        
        fila.desenfileira();
    }
    
    @Test
    public void testVazia() throws Exception {
        Fila fila = new Fila();
        
        assertTrue(fila.vazia());
        
        fila.enfileira(1);
        
        assertFalse(fila.vazia());
    }
    
    @Test
    public void testImprime() throws Exception {
        Fila fila = new Fila();
        
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        
        // Redirect System.out to capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        fila.imprime();
        
        assertEquals("1\n2\n3\n", outContent.toString());
    }
}
