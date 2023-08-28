
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest7 {

    @Test
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere("Item 1");
        lista.insere("Item 2");
        lista.insere("Item 3");
        assertEquals("Item 1", lista.item[0]);
        assertEquals("Item 2", lista.item[1]);
        assertEquals("Item 3", lista.item[2]);
    }

    @Test(expected = Exception.class)
    public void testInsereMaxItems() throws Exception {
        Lista lista = new Lista();
        for (int i = 0; i < 1000; i++) {
            lista.insere("Item " + (i+1));
        }
        lista.insere("Item 1001"); // Should throw an exception
    }

    @Test
    public void testVazia() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
        lista.insere("Item");
        assertFalse(lista.vazia());
    }
    
    @Test
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        lista.insere("Item 1");
        lista.insere("Item 2");
        lista.insere("Item 3");
        lista.imprime(); // Should print "Item 1\nItem 2\nItem 3"
        // You can redirect the output and assert it if needed
    }
}