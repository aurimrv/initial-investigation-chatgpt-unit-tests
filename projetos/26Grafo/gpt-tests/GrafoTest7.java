
package ds;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest7 {

    private Grafo grafo;

    @Before
    public void setUp() {
        grafo = new Grafo(5);
    }

    @Test
    public void testInsereAresta() {
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
    }

    @Test
    public void testExisteAresta() {
        assertFalse(grafo.existeAresta(0, 1));
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
    }

    @Test
    public void testRetiraAresta() {
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        grafo.retiraAresta(0, 1);
        assertFalse(grafo.existeAresta(0, 1));
    }

    @Test
    public void testListaAdjVazia() {
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 5);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test
    public void testPrimeiroListaAdj() {
        assertNull(grafo.primeiroListaAdj(0));
        grafo.insereAresta(0, 1, 5);
        assertNotNull(grafo.primeiroListaAdj(0));
    }

    @Test
    public void testProxAdj() {
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(0, 3, 15);
        
        assertEquals(1, grafo.proxAdj(0).v2());
        assertEquals(2, grafo.proxAdj(0).v2());
        assertEquals(3, grafo.proxAdj(0).v2());
        assertNull(grafo.proxAdj(0));
    }

    @Test
    public void testGrafoTransposto() {
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 0, 15);
        
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(0, 2));
    }

    @Test
    public void testImprime() {
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(0, 3, 15);
        
        grafo.imprime();
        // Verify printed output manually
    }

    @Test
    public void testNumVertices() {
        assertEquals(5, grafo.numVertices());
    }
}
