
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FilaTest1 {

    @Test
    public void testEnfileira() {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        assertFalse(fila.vazia());
    }

    @Test
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        assertEquals(1, fila.desenfileira());
        assertEquals(2, fila.desenfileira());
        assertEquals(3, fila.desenfileira());
        assertTrue(fila.vazia());
    }

    @Test(expected = Exception.class)
    public void testDesenfileiraFromEmptyFila() throws Exception {
        Fila fila = new Fila();
        fila.desenfileira();
    }

    @Test
    public void testVazia() {
        Fila fila = new Fila();
        assertTrue(fila.vazia());

        fila.enfileira(1);
        assertFalse(fila.vazia());

        fila.desenfileira();
        assertTrue(fila.vazia());
    }

    @Test
    public void testImprime() {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        // Redirect System.out to a String
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        fila.imprime();

        assertEquals(" 1 2 3\n", outputStream.toString());
    }
}