
package ds;
import ds.Lista;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest10 {
    private Lista lista;

    @Before
    public void setUp() {
        lista = new Lista();
    }

    @Test
    public void testInsere() {
        lista.insere("A");
        lista.insere("B");
        lista.insere("C");

        assertFalse(lista.vazia());
        lista.imprime(); // Manually verify output
    }

    @Test
    public void testVazia() {
        assertTrue(lista.vazia());
    }

    @Test
    public void testImprime() {
        // Test printing an empty list
        lista.imprime(); // Manually verify output

        lista.insere("A");
        lista.insere("B");
        lista.insere("C");

        lista.imprime(); // Manually verify output
    }
}