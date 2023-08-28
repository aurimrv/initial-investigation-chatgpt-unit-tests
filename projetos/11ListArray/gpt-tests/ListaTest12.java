package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest12{

    
    @Test
    public void testInsere() {
        Lista lista = new Lista();
        
        try {
            lista.insere("Item 1");
            lista.insere("Item 2");
            lista.insere("Item 3");
        } catch (Exception e) {
            fail("Unexpected exception");
        }
        
        assertEquals(3, lista.ultimo);
    }
    
    @Test
    public void testInsereWhenListIsFull() {
        Lista lista = new Lista();
        
        try {
            for (int i = 0; i < 1000; i++) {
                lista.insere("Item " + (i+1));
            }
            
            lista.insere("Extra item");
            fail("Expected exception was not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A lista esta cheia", e.getMessage());
        }
    }
    
    @Test
    public void testVazia() {
        Lista lista = new Lista();
        
        assertTrue(lista.vazia());
        
        try {
            lista.insere("Item");
        } catch (Exception e) {
            fail("Unexpected exception");
        }
        
        assertFalse(lista.vazia());
    }
    
    @Test
    public void testImprime() {
        Lista lista = new Lista();
        
        try {
            lista.insere("Item 1");
            lista.insere("Item 2");
            lista.insere("Item 3");
        } catch (Exception e) {
            fail("Unexpected exception");
        }
        
        // Redirect the console output to capture it
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        lista.imprime();
        
        // Reset the console output
        System.setOut(System.out);
        
        String expectedOutput = "Item 1\nItem 2\nItem 3\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
}