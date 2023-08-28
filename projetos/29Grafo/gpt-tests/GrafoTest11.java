
package ds;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest11 {
    private Grafo grafo;

    @Before
    public void setUp() {
        grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 4);
        grafo.insereAresta(3, 4, 5);
    }

    @Test
    public void testExisteAresta() {
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 3));
        assertTrue(grafo.existeAresta(3, 4));
        assertFalse(grafo.existeAresta(0, 2));
        assertFalse(grafo.existeAresta(1, 3));
        assertFalse(grafo.existeAresta(2, 4));
    }

    @Test
    public void testListaAdjVazia() {
        assertFalse(grafo.listaAdjVazia(0));
        assertFalse(grafo.listaAdjVazia(1));
        assertFalse(grafo.listaAdjVazia(2));
        assertFalse(grafo.listaAdjVazia(3));
        assertTrue(grafo.listaAdjVazia(4));
    }

    @Test
    public void testPrimeiroListaAdj() {
        assertNotNull(grafo.primeiroListaAdj(0));
        assertNotNull(grafo.primeiroListaAdj(1));
        assertNotNull(grafo.primeiroListaAdj(2));
        assertNotNull(grafo.primeiroListaAdj(3));
        assertNull(grafo.primeiroListaAdj(4));
    }

    @Test
    public void testProxAdj() {
        assertNotNull(grafo.proxAdj(0));
        assertNotNull(grafo.proxAdj(1));
        assertNotNull(grafo.proxAdj(2));
        assertNotNull(grafo.proxAdj(3));
        assertNull(grafo.proxAdj(4));
    }

    @Test
    public void testRetiraAresta() throws Exception {
        assertNotNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(0, 1));
        assertNotNull(grafo.retiraAresta(1, 2));
        assertNull(grafo.retiraAresta(1, 2));
        assertNotNull(grafo.retiraAresta(2, 3));
        assertNull(grafo.retiraAresta(2, 3));
        assertNotNull(grafo.retiraAresta(3, 4));
        assertNull(grafo.retiraAresta(3, 4));
    }
}