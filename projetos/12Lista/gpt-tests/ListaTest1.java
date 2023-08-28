
package ds;
import ds.Lista;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest1 {

    @Test
    public void testInsere() {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
        
        lista.insere("A");
        assertFalse(lista.vazia());
        
        lista.insere("B");
        lista.insere("C");
        lista.insere("D");
        assertFalse(lista.vazia());
    }

    @Test
    public void testVazia() {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
        
        lista.insere("A");
        assertFalse(lista.vazia());
        
        lista.insere("B");
        lista.insere("C");
        lista.insere("D");
        assertFalse(lista.vazia());
    }

    @Test
    public void testImprime() {
        Lista lista = new Lista();
        lista.insere("A");
        lista.insere("B");
        lista.insere("C");
        lista.insere("D");
        
        lista.imprime(); // Manually verify the output
    }
}