
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ListaTest2 {

    @Test
    public void testInsere() {
        Lista lista = new Lista();
        
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        
        assertFalse(lista.vazia());
    }
    
    @Test
    public void testVazia() {
        Lista lista = new Lista();
        
        assertTrue(lista.vazia());
        
        lista.insere(1);
        
        assertFalse(lista.vazia());
    }
    
    @Test
    public void testImprime() {
        Lista lista = new Lista();
        
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        
        // Redirect System.out.println() to a ByteArrayOutputStream
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        lista.imprime();
        
        assertEquals("1\n2\n3\n", outContent.toString());
    }
}