
package ds;
import ds.Lista;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest5 {
    private Lista lista;

    @Before
    public void setUp() {
        lista = new Lista();
    }

    @Test
    public void testInsere() {
        lista.insere(5);
        lista.insere(10);
        lista.insere(15);
        assertFalse(lista.vazia());
    }

    @Test
    public void testVazia() {
        assertTrue(lista.vazia());
        lista.insere(20);
        assertFalse(lista.vazia());
    }

    @Test
    public void testImprime() {
        lista.insere("Hello");
        lista.insere("World");
        lista.insere("Java");
        lista.imprime();
    }
}
