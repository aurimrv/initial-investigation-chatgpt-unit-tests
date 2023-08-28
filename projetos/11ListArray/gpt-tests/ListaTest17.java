package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest17{


    @Test
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere(1);
        assertFalse(lista.vazia());
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
    public void testVazia() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
        lista.insere(1);
        assertFalse(lista.vazia());
    }

    @Test
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        lista.insere(4);
        lista.insere(5);
        lista.imprime();
    }
}