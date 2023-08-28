package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest16{


    @Test
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere("Item 1");
        lista.insere("Item 2");
        lista.insere("Item 3");

        assertEquals("Item 1", lista.item[0]);
        assertEquals("Item 2", lista.item[1]);
        assertEquals("Item 3", lista.item[2]);
    }

    @Test(expected = Exception.class)
    public void testInsereWhenListIsFull() throws Exception {
        Lista lista = new Lista();
        for (int i = 0; i < 1000; i++) {
            lista.insere("Item " + (i+1));
        }

        lista.insere("Item 1001");
    }

    @Test
    public void testVazia() {
        Lista lista = new Lista();
        assertTrue(lista.vazia());

        lista.insere("Item 1");
        assertFalse(lista.vazia());
    }

    @Test
    public void testImprime() {
        Lista lista = new Lista();
        lista.insere("Item 1");
        lista.insere("Item 2");
        lista.insere("Item 3");

        // Redirect standard output to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        lista.imprime();

        // Restore standard output
        System.setOut(System.out);

        assertEquals("Item 1\nItem 2\nItem 3\n", outContent.toString());
    }
}