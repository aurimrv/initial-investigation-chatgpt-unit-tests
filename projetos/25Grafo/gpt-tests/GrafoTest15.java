package ds;import ds.Grafo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrafoTest15{

    
    private Grafo grafo;
    
    @Before
    public void setUp() {
        grafo = new Grafo();
    }
    
    @Test
    public void testInsereAresta() {
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 0));
    }
    
    @Test
    public void testExisteAresta() {
        assertFalse(grafo.existeAresta(0, 1));
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
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
        assertNull(grafo.proxAdj(0));
        grafo.insereAresta(0, 1, 5);
        assertNull(grafo.proxAdj(0));
    }
    
    @Test
    public void testRetiraAresta() throws Exception {
        assertNull(grafo.retiraAresta(0, 1));
        grafo.insereAresta(0, 1, 5);
        assertNotNull(grafo.retiraAresta(0, 1));
        assertFalse(grafo.existeAresta(0, 1));
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