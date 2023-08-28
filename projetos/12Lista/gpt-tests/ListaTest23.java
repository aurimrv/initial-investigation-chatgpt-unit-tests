package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest23{


    @Test
    public void testInsere() {
        Lista lista = new Lista();
        lista.insere("A");
        lista.insere("B");
        lista.insere("C");

        assertEquals("A", lista.primeiro.prox.item);
        assertEquals("B", lista.primeiro.prox.prox.item);
        assertEquals("C", lista.primeiro.prox.prox.prox.item);
    }

    @Test
    public void testVazia() {
        Lista lista = new Lista();
        assertTrue(lista.vazia());

        lista.insere("A");
        assertFalse(lista.vazia());
    }

    @Test
    public void testImprime() {
        Lista lista = new Lista();
        lista.insere("A");
        lista.insere("B");
        lista.insere("C");

        // Redirect System.out to capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        lista.imprime();

        String expectedOutput = "A\nB\nC\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
}