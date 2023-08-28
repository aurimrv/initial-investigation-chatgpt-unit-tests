
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest0 {
    
    @Test
    public void testInsere() {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        assertFalse(lista.vazia());
        lista.imprime();
    }
    
    @Test
    public void testVazia() {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
        lista.insere(1);
        assertFalse(lista.vazia());
    }
}
