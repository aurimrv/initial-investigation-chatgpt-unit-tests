package ds;import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrafoTest12{


    private Grafo grafo;

    @Before
    public void setUp() {
        grafo = new Grafo();
    }

    @Test
    public void testInsereAresta() {
        grafo.insereAresta(1, 2, 10);
        assertTrue(grafo.existeAresta(1, 2));
    }

    @Test
    public void testExisteAresta() {
        assertFalse(grafo.existeAresta(1, 2));
        grafo.insereAresta(1, 2, 10);
        assertTrue(grafo.existeAresta(1, 2));
    }

    @Test
    public void testListaAdjVazia() {
        assertTrue(grafo.listaAdjVazia(1));
        grafo.insereAresta(1, 2, 10);
        assertFalse(grafo.listaAdjVazia(1));
    }

    @Test
    public void testPrimeiroListaAdj() {
        assertNull(grafo.primeiroListaAdj(1));
        grafo.insereAresta(1, 2, 10);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(1);
        assertNotNull(aresta);
        assertEquals(1, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(10, aresta.peso());
    }

    @Test
    public void testProxAdj() {
        assertNull(grafo.proxAdj(1));
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(1);
        assertNotNull(aresta);
        assertEquals(1, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(10, aresta.peso());
        aresta = grafo.proxAdj(1);
        assertNotNull(aresta);
        assertEquals(1, aresta.v1());
        assertEquals(3, aresta.v2());
        assertEquals(20, aresta.peso());
        assertNull(grafo.proxAdj(1));
    }

    @Test
    public void testRetiraAresta() throws Exception {
        assertNull(grafo.retiraAresta(1, 2));
        grafo.insereAresta(1, 2, 10);
        Grafo.Aresta aresta = grafo.retiraAresta(1, 2);
        assertNotNull(aresta);
        assertEquals(1, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(10, aresta.peso());
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