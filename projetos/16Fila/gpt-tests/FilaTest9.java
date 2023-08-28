
package ds;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FilaTest9 {

    @Test
    public void testEnfileira() {
        Fila fila = new Fila();
        fila.enfileira("A");
        fila.enfileira("B");
        fila.enfileira("C");
        
        assertEquals("A", fila.desenfileira()); // first item enfileira should be the first item desenfileira
    }
    
    @Test
    public void testDesenfileira() {
        Fila fila = new Fila();
        fila.enfileira("A");
        fila.enfileira("B");
        fila.enfileira("C");
        
        assertEquals("A", fila.desenfileira()); // desenfileira the first item
        assertEquals("B", fila.desenfileira()); // desenfileira the second item
        assertEquals("C", fila.desenfileira()); // desenfileira the third item
        
        try {
            fila.desenfileira(); // try to desenfileira from empty fila - should throw an exception
            fail("Expected Exception");
        } catch (Exception e) {
            assertEquals("Erro: A fila esta vazia", e.getMessage());
        }
    }
    
    @Test
    public void testVazia() {
        Fila fila = new Fila();
        assertTrue(fila.vazia()); // fila should be empty
        
        fila.enfileira("A");
        assertFalse(fila.vazia()); // fila should not be empty after enfileira
        
        fila.desenfileira();
        assertTrue(fila.vazia()); // fila should be empty after desenfileira all items
    }
    
    @Test
    public void testImprime() {
        Fila fila = new Fila();
        fila.enfileira("A");
        fila.enfileira("B");
        fila.enfileira("C");
        
        // testing output. You can redirect output instead of using System.out
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        fila.imprime();
        assertEquals(" A B C\n", outContent.toString());
    }
}