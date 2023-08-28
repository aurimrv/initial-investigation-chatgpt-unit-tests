package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest21{


    @Test
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere(5);
        lista.insere(10);
        lista.insere(15);
        assertEquals(5, lista.item[0]);
        assertEquals(10, lista.item[1]);
        assertEquals(15, lista.item[2]);
    }

    @Test
    public void testVazia() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
        lista.insere(5);
        assertFalse(lista.vazia());
    }

    @Test
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        lista.insere(5);
        lista.insere(10);
        lista.insere(15);
        lista.imprime(); // This will print "5\n10\n15\n" to the console
    }
}