
package ds;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ListaTest4 {

    private Lista lista;

    @Before
    public void setUp() {
        lista = new Lista();
    }

    @Test
    public void testInsere() {
        try {
            lista.insere("item1");
            lista.insere("item2");
            lista.insere("item3");
            assertEquals("item1", lista.item[0]);
            assertEquals("item2", lista.item[1]);
            assertEquals("item3", lista.item[2]);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testInsereWhenListIsFull() {
        try {
            for (int i = 0; i < 1000; i++) {
                lista.insere("item" + i);
            }
            lista.insere("item1000");
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A lista esta cheia", e.getMessage());
        }
    }

    @Test
    public void testVazia() {
        assertTrue(lista.vazia());
        lista.insere("item1");
        assertFalse(lista.vazia());
    }

    @Test
    public void testImprime() {
        lista.insere("item1");
        lista.insere("item2");
        lista.insere("item3");
        lista.imprime();
        // Verify the output of the imprime() method
        // by comparing it with the expected output
    }
}