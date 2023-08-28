package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest20{

    
    @Test
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        
        assertEquals(1, lista.item[0]);
        assertEquals(2, lista.item[1]);
        assertEquals(3, lista.item[2]);
    }
    
    @Test
    public void testVazia() throws Exception {
        Lista lista = new Lista();
        
        assertTrue(lista.vazia());
        
        lista.insere(1);
        
        assertFalse(lista.vazia());
    }
    
    @Test
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        
        lista.imprime();
        // Assuming System.out is redirected, check the output manually
    }
}