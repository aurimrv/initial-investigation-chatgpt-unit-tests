package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest25{


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

    @Test(expected = Exception.class)
    public void testInsereWhenListIsFull() throws Exception {
        Lista lista = new Lista();
        for (int i = 0; i < 1000; i++) {
            lista.insere(i);
        }
        lista.insere(1001);
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
        lista.imprime(); // Assuming that the output is printed to the console
        // Add assertion for the console output
    }
}