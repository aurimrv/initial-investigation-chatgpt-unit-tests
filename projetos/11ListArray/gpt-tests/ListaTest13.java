package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest13{


    @Test
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        
        lista.insere("Element 1");
        lista.insere("Element 2");
        lista.insere("Element 3");
        
        assertEquals("Element 1", lista.item[0]);
        assertEquals("Element 2", lista.item[1]);
        assertEquals("Element 3", lista.item[2]);
    }
    
    @Test
    public void testVazia() throws Exception {
        Lista lista = new Lista();
        
        assertTrue(lista.vazia());
        
        lista.insere("Element 1");
        
        assertFalse(lista.vazia());
    }
    
    @Test
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        
        lista.insere("Element 1");
        lista.insere("Element 2");
        lista.insere("Element 3");
        
        lista.imprime();
        // Verify the output in the console manually
    }
}