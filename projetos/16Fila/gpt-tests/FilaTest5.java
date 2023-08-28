
package ds;import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ds.Fila;

public class FilaTest5 {

    private Fila fila;

    @Before
    public void setUp() {
        fila = new Fila();
    }

    @Test
    public void testEnfileira() {
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.enfileira(4);

        Assert.assertFalse(fila.vazia());
    }

    @Test
    public void testDesenfileira() throws Exception {
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        Assert.assertEquals(1, fila.desenfileira());
        Assert.assertEquals(2, fila.desenfileira());
        Assert.assertEquals(3, fila.desenfileira());

        Assert.assertTrue(fila.vazia());
    }

    @Test(expected = Exception.class)
    public void testDesenfileiraFromEmptyFila() throws Exception {
        fila.desenfileira();
    }

    @Test
    public void testVazia() {
        Assert.assertTrue(fila.vazia());

        fila.enfileira(1);
        Assert.assertFalse(fila.vazia());
    }

    @Test
    public void testImprime() {
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        // This test case will print the output to the console, no assertions are made
        fila.imprime();
    }
}