package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest24{


    @Test
    public void testInsere() {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        assertFalse(lista.vazia());
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
        lista.imprime();
        // Add assertions to check the output of the imprime() method
    }
}