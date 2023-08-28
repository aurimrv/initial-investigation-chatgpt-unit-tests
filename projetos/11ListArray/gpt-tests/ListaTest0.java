
package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ListaTest0 {

    @Test
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere("item1");
        assertEquals(1, lista.ultimo);
        assertEquals("item1", lista.item[0]);
    }

    @Test(expected = Exception.class)
    public void testInsereThrowsException() throws Exception {
        Lista lista = new Lista();
        for (int i = 0; i < 1000; i++) {
            lista.insere("item" + i);
        }
        lista.insere("item1000");
    }

    @Test
    public void testVazia() {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
        lista.insere("item");
        assertFalse(lista.vazia());
    }

    @Test
    public void testImprime() {
        Lista lista = new Lista();
        lista.insere("item1");
        lista.insere("item2");
        lista.insere("item3");
        lista.insere("item4");
        lista.insere("item5");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        lista.imprime();

        String expectedOutput = "item1\nitem2\nitem3\nitem4\nitem5\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}