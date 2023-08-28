package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest15{


    @Test
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        assertEquals(1, lista.item[0]);
        assertEquals(2, lista.item[1]);
        assertEquals(3, lista.item[2]);
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
        lista.imprime(); // This will print "1\n2\n3\n" to the console
    }
}