package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest13{

    
    @Test
    public void testInsere() {
        Lista lista = new Lista();
        
        // Test inserting one element
        lista.insere("Element 1");
        assertFalse(lista.vazia());
        lista.imprime(); // Output: Element 1
        
        // Test inserting multiple elements
        lista.insere("Element 2");
        lista.insere("Element 3");
        lista.insere("Element 4");
        assertFalse(lista.vazia());
        lista.imprime(); // Output: Element 1, Element 2, Element 3, Element 4
    }
    
    @Test
    public void testVazia() {
        Lista lista = new Lista();
        
        // Test when the list is empty
        assertTrue(lista.vazia());
        
        // Test when the list is not empty
        lista.insere("Element 1");
        assertFalse(lista.vazia());
    }
    
    @Test
    public void testImprime() {
        Lista lista = new Lista();
        
        // Test printing an empty list
        lista.imprime(); // Output: (no output)
        
        // Test printing a list with elements
        lista.insere("Element 1");
        lista.insere("Element 2");
        lista.insere("Element 3");
        lista.imprime(); // Output: Element 1, Element 2, Element 3
    }
}