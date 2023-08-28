
package ds;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FilaTest6 {
    private Fila fila;

    @Before
    public void setup() {
        fila = new Fila();
    }

    @Test
    public void testEnfileira() {
        try {
            fila.enfileira("A");
            fila.enfileira("B");
            fila.enfileira("C");

            Assert.assertEquals("A", fila.item[fila.frente]);
            Assert.assertEquals("B", fila.item[(fila.frente + 1) % fila.item.length]);
            Assert.assertEquals("C", fila.item[(fila.frente + 2) % fila.item.length]);
            Assert.assertEquals(3, fila.tras);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Unexpected exception");
        }
    }

    @Test
    public void testEnfileiraWhenFull() {
        try {
            for (int i = 0; i < fila.item.length; i++) {
                fila.enfileira("item" + i);
            }

            fila.enfileira("Overflow");

            Assert.fail("Expected exception not thrown");
        } catch (Exception e) {
            Assert.assertEquals("Erro: A fila esta cheia", e.getMessage());
        }
    }

    @Test
    public void testDesenfileira() {
        try {
            fila.enfileira("A");
            fila.enfileira("B");
            fila.enfileira("C");

            Object resultA = fila.desenfileira();
            Object resultB = fila.desenfileira();

            Assert.assertEquals("A", resultA);
            Assert.assertEquals("B", resultB);
            Assert.assertEquals("C", fila.item[fila.frente]);
            Assert.assertEquals(2, fila.frente);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Unexpected exception");
        }
    }

    @Test
    public void testDesenfileiraWhenEmpty() {
        try {
            Object result = fila.desenfileira();

            Assert.fail("Expected exception not thrown");
        } catch (Exception e) {
            Assert.assertEquals("Erro: A fila esta vazia", e.getMessage());
        }
    }

    @Test
    public void testVazia() {
        Assert.assertTrue(fila.vazia());

        fila.enfileira("A");

        Assert.assertFalse(fila.vazia());

        fila.desenfileira();

        Assert.assertTrue(fila.vazia());
    }

    @Test
    public void testImprime() {
        try {
            fila.enfileira("A");
            fila.enfileira("B");
            fila.enfileira("C");

            fila.imprime();
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Unexpected exception");
        }
    }
}
