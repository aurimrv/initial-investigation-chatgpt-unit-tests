
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest1 {
    
    @Test
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        
        lista.insere("Item 1");
        lista.insere("Item 2");
        lista.insere("Item 3");
        
        assertEquals(3, lista.ultimo - lista.primeiro);
    }
    
    @Test
    public void testVazia() {
        Lista lista = new Lista();
        
        assertTrue(lista.vazia());
        
        lista.insere("Item 1");
        
        assertFalse(lista.vazia());
    }
    
    @Test
    public void testImprime() {
        Lista lista = new Lista();
        
        lista.insere("Item 1");
        lista.insere("Item 2");
        lista.insere("Item 3");
        
        lista.imprime();
        
        // Add assertions to check the output of the `imprime` method
    }
    
}