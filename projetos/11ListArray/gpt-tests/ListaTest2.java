
package ds;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ListaTest2 {
    
    private Lista lista;

    @Before
    public void setUp() {
        lista = new Lista();
    }

    @Test
    public void testInsere() throws Exception {
        Object item1 = new Object();
        lista.insere(item1);
        Assert.assertEquals(1, lista.ultimo);
        Assert.assertEquals(item1, lista.item[0]);

        Object item2 = new Object();
        lista.insere(item2);
        Assert.assertEquals(2, lista.ultimo);
        Assert.assertEquals(item2, lista.item[1]);
    }

    @Test(expected = Exception.class)
    public void testInsereListaCheia() throws Exception {
        for (int i = 0; i < 1000; i++) {
            lista.insere(new Object());
        }

        lista.insere(new Object()); // should throw exception
    }

    @Test
    public void testVazia() throws Exception {
        Assert.assertTrue(lista.vazia());

        lista.insere(new Object());
        Assert.assertFalse(lista.vazia());
    }

    @Test
    public void testImprime() throws Exception {
        Object item1 = new Object();
        lista.insere(item1);

        Object item2 = new Object();
        lista.insere(item2);

        lista.imprime(); // should print item1 and item2
    }
}