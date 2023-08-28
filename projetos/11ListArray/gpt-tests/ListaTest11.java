
package ds;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ListaTest11 {
    private Lista lista;

    @Before
    public void setUp() {
        lista = new Lista();
    }

    @Test
    public void testInsere() throws Exception {
        lista.insere("Item 1");
        lista.insere("Item 2");
        lista.insere("Item 3");

        assertEquals("Item 1", lista.item[0]);
        assertEquals("Item 2", lista.item[1]);
        assertEquals("Item 3", lista.item[2]);
    }

    @Test(expected = Exception.class)
    public void testInsereFullList() throws Exception {
        for (int i = 0; i < 1000; i++) {
            lista.insere("Item " + (i + 1));
        }

        lista.insere("Item 1001"); // Expect an exception
    }

    @Test
    public void testVazia() {
        assertTrue(lista.vazia());

        lista.insere("Item 1");
        assertFalse(lista.vazia());
    }

    @Test
    public void testImprime() {
        lista.insere("Item 1");
        lista.insere("Item 2");
        lista.insere("Item 3");

        // Use a custom PrintStream to capture output and verify it
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalSystemOut = System.out;
        System.setOut(new PrintStream(outputStream));

        lista.imprime();

        System.setOut(originalSystemOut);

        assertEquals("Item 1\nItem 2\nItem 3\n", outputStream.toString());
    }
}