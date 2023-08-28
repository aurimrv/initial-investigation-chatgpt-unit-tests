package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest22{


    @Test
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere("item1");
        lista.insere("item2");
        lista.insere("item3");
        assertEquals(3, lista.ultimo - lista.primeiro);
    }

    @Test
    public void testVazia() {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
        lista.insere("item1");
        assertFalse(lista.vazia());
    }

    @Test
    public void testImprime() {
        Lista lista = new Lista();
        lista.insere("item1");
        lista.insere("item2");
        lista.insere("item3");
        lista.imprime();
        // Add assertions to verify the output of the imprime() method
    }
}