package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest19{


    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 3));
        assertTrue(grafo.existeAresta(3, 4));
    }

    @Test
    public void testExisteAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
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
        Grafo grafo = new Grafo(5);
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 10);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(0, 3, 30);
        grafo.insereAresta(0, 4, 40);
        Grafo.Aresta adj = grafo.primeiroListaAdj(0);
        assertNotNull(adj);
        assertEquals(0, adj.v1());
        assertEquals(1, adj.v2());
        assertEquals(10, adj.peso());
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(0, 3, 30);
        grafo.insereAresta(0, 4, 40);
        Grafo.Aresta adj = grafo.primeiroListaAdj(0);
        assertNotNull(adj);
        assertEquals(0, adj.v1());
        assertEquals(1, adj.v2());
        assertEquals(10, adj.peso());
        adj = grafo.proxAdj(0);
        assertNotNull(adj);
        assertEquals(0, adj.v1());
        assertEquals(2, adj.v2());
        assertEquals(20, adj.peso());
        adj = grafo.proxAdj(0);
        assertNotNull(adj);
        assertEquals(0, adj.v1());
        assertEquals(3, adj.v2());
        assertEquals(30, adj.peso());
        adj = grafo.proxAdj(0);
        assertNotNull(adj);
        assertEquals(0, adj.v1());
        assertEquals(4, adj.v2());
        assertEquals(40, adj.peso());
        adj = grafo.proxAdj(0);
        assertNull(adj);
    }

    @Test
    public void testRetiraAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(0, 3, 30);
        grafo.insereAresta(0, 4, 40);
        Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());
        assertFalse(grafo.existeAresta(0, 1));
        aresta = grafo.retiraAresta(0, 2);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(20, aresta.peso());
        assertFalse(grafo.existeAresta(0, 2));
        aresta = grafo.retiraAresta(0, 3);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(3, aresta.v2());
        assertEquals(30, aresta.peso());
        assertFalse(grafo.existeAresta(0, 3));
        aresta = grafo.retiraAresta(0, 4);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(4, aresta.v2());
        assertEquals(40, aresta.peso());
        assertFalse(grafo.existeAresta(0, 4));
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(3, 2));
        assertTrue(grafoT.existeAresta(4, 3));
    }

    @Test
    public void testImprime() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(0, 3, 30);
        grafo.insereAresta(0, 4, 40);
        grafo.imprime();
    }

    @Test
    public void testNumVertices() {
        Grafo grafo = new Grafo(5);
        assertEquals(5, grafo.numVertices());
    }
}