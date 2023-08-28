
package ds;
import ds.Lista;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ListaTest4 {
    private Lista lista;

    @Before
    public void setUp() {
        lista = new Lista();
    }

    @Test
    public void testIsEmpty() {
        Assert.assertTrue(lista.vazia());
    }

    @Test
    public void testInsert() {
        lista.insere(5);
        lista.insere(10);

        Assert.assertFalse(lista.vazia());
    }

    @Test
    public void testPrint() {
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);

        // Redirect System.out to capture printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        lista.imprime();

        System.setOut(System.out); // Restore original System.out

        String expectedOutput = "1\n2\n3\n";
        Assert.assertEquals(expectedOutput, outputStream.toString());
    }
}
