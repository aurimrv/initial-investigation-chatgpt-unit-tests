
package ds;
import ds.Grafo;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest8 {
    @Test
    public void testNumVertices() {
        Grafo grafo = new Grafo(5);
        int expected = 5;
        int actual = grafo.numVertices();
        assertEquals(expected, actual);
    }
}