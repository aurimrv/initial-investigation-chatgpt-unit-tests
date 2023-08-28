
package ds;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ListaTest8 {
    private Lista lista;

    @Before
    public void setUp() {
        lista = new Lista();
    }

    @Test
    public void testInsere() {
        lista.insere(5);
        lista.insere(10);
        lista.insere(15);
        assertFalse(lista.vazia());
    }

    @Test
    public void testVazia() {
        assertTrue(lista.vazia());
        lista.insere(20);
        assertFalse(lista.vazia());
    }

    @Test
    public void testImprime() {
        lista.insere("Hello");
        lista.insere("World");
        lista.insere("!");
        // Redirect output stream to capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        lista.imprime();
        assertEquals("Hello\nWorld\n!\n", outContent.toString());
    }
}