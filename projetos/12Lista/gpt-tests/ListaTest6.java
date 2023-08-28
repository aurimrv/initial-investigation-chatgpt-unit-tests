
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest6 {
    @Test
    public void testVazia() {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
    }
}
