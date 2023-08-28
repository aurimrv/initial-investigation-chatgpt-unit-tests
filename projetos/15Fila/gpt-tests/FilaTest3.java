
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest3 {

    @Test
    public void testEnfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(10);
        fila.enfileira(20);
        fila.enfileira(30);
        assertEquals(10, fila.item[0]);
        assertEquals(20, fila.item[1]);
        assertEquals(30, fila.item[2]);
    }

    @Test(expected = Exception.class)
    public void testEnfileiraWhenFull() throws Exception {
        Fila fila = new Fila();
        for (int i = 0; i < 1000; i++) {
            fila.enfileira(i);
        }
        fila.enfileira(1000); // Should throw an exception
    }

    @Test
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(10);
        fila.enfileira(20);
        fila.enfileira(30);
        Object item = fila.desenfileira();
        assertEquals(10, item);
        assertEquals(20, fila.item[1]);
        assertEquals(30, fila.item[2]);
    }

    @Test(expected = Exception.class)
    public void testDesenfileiraWhenEmpty() throws Exception {
        Fila fila = new Fila();
        fila.desenfileira(); // Should throw an exception
    }

    @Test
    public void testVazia() throws Exception {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
        fila.enfileira(10);
        assertFalse(fila.vazia());
    }

    @Test
    public void testImprime() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(10);
        fila.enfileira(20);
        fila.enfileira(30);
        fila.imprime(); // Should print "10 20 30" to the console
    }
}
