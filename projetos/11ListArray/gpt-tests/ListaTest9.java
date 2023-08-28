
package ds;
import static org.junit.Assert.*;
import org.junit.*;

public class ListaTest9 {

    @Test
    public void testInsere() {
        Lista lista = new Lista();
        Object obj = new Object();

        try {
            lista.insere(obj);
            assertFalse(lista.vazia());
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test
    public void testInsereWhenFull() {
        Lista lista = new Lista();
        Object[] array = new Object[1000];

        for (int i = 0; i < 1000; i++) {
            array[i] = new Object();
            try {
                lista.insere(array[i]);
            } catch (Exception e) {
                fail("Exception thrown");
            }
        }

        try {
            lista.insere(new Object());
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A lista esta cheia", e.getMessage());
        }
    }

    @Test
    public void testVazia() {
        Lista lista = new Lista();
        assertTrue(lista.vazia());

        try {
            lista.insere(new Object());
            assertFalse(lista.vazia());
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    // Assuming there is a way to capture system output in the test framework
    @Test
    public void testImprime() {
        Lista lista = new Lista();
        Object[] array = new Object[3];
        array[0] = "Test";
        array[1] = 123;
        array[2] = new Object();

        for (int i = 0; i < array.length; i++) {
            try {
                lista.insere(array[i]);
            } catch (Exception e) {
                fail("Exception thrown");
            }
        }

        lista.imprime();
        // Assert that the expected output matches the captured system output
        // ...
    }
}
