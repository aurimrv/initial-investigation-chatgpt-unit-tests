
package ds;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import ds.Grafo;

public class GrafoTest0 {
    
    private Grafo grafo;
    
    @Before
    public void setUp() {
        grafo = new Grafo();
    }
    
    @Test
    public void testInsereAresta() {
        grafo.insereAresta(1, 2, 5);
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(2, 1));
    }
    
    @Test
    public void testExisteAresta() {
        assertFalse(grafo.existeAresta(1, 2));
        grafo.insereAresta(1, 2, 5);
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(2, 1));
    }
    
    @Test
    public void testListaAdjVazia() {
        assertTrue(grafo.listaAdjVazia(1));
        grafo.insereAresta(1, 2, 5);
        assertFalse(grafo.listaAdjVazia(1));
    }
    
    @Test
    public void testPrimeiroListaAdj() {
        assertNull(grafo.primeiroListaAdj(1));
        grafo.insereAresta(1, 2, 5);
        assertNotNull(grafo.primeiroListaAdj(1));
        assertEquals(1, grafo.primeiroListaAdj(1).v1());
        assertEquals(2, grafo.primeiroListaAdj(1).v2());
        assertEquals(5, grafo.primeiroListaAdj(1).peso());
    }
    
    @Test
    public void testProxAdj() {
        assertNull(grafo.proxAdj(1));
        grafo.insereAresta(1, 2, 5);
        assertNull(grafo.proxAdj(1));
    }
    
    @Test
    public void testRetiraAresta() throws Exception {
        assertNull(grafo.retiraAresta(1, 2));
        grafo.insereAresta(1, 2, 5);
        assertNotNull(grafo.retiraAresta(1, 2));
        assertFalse(grafo.existeAresta(1, 2));
    }
    
    @Test
    public void testNumVertices() {
        assertEquals(100, grafo.numVertices());
    }
    
    @Test
    public void testGrafoTransposto() {
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
        assertEquals(grafo.numVertices(), grafoT.numVertices());
    }
}