package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest24{


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
    public void testInsereFullList() throws Exception {
        Lista lista = new Lista();
        for (int i = 0; i < 1000; i++) {
            lista.insere("Item " + (i + 1));
        }

        lista.insere("Item 1001");
    }

    @Test
    public void testVazia() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());

        lista.insere("Item 1");
        assertFalse(lista.vazia());
    }

    @Test
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        lista.insere("Item 1");
        lista.insere("Item 2");
        lista.insere("Item 3");

        lista.imprime(); // This will print the items to the console
    }
}