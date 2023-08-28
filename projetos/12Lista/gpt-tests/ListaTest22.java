package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest22{


    @Test
    public void testInsere() {
        Lista lista = new Lista();
        
        // Test inserting a single element
        lista.insere(1);
        assertFalse(lista.vazia());
        
        // Test inserting multiple elements
        lista.insere(2);
        lista.insere(3);
        assertFalse(lista.vazia());
    }
    
    @Test
    public void testVazia() {
        Lista lista = new Lista();
        
        // Test an empty list
        assertTrue(lista.vazia());
        
        // Test a non-empty list
        lista.insere(1);
        assertFalse(lista.vazia());
    }
    
    @Test
    public void testImprime() {
        Lista lista = new Lista();
        
        // Test printing an empty list
        lista.imprime(); // Should not throw any exception
        
        // Test printing a non-empty list
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        lista.imprime(); // Should print "1 2 3"
    }
}