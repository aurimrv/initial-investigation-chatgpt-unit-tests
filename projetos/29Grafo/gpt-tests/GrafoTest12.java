package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest12{


    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 3, 3);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 3));
        assertFalse(grafo.existeAresta(0, 3));
    }

    @Test
    public void testRetiraAresta() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 3, 3);
        assertEquals(1, grafo.retiraAresta(0, 1).peso());
        assertNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(1, 3));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(4);
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 1);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(0, 3, 3);
        Grafo.Aresta a = grafo.primeiroListaAdj(0);
        assertEquals(0, a.v1());
        assertEquals(1, a.v2());
        assertEquals(1, a.peso());
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(0, 3, 3);
        Grafo.Aresta a = grafo.primeiroListaAdj(0);
        assertEquals(0, a.v1());
        assertEquals(1, a.v2());
        assertEquals(1, a.peso());
        a = grafo.proxAdj(0);
        assertEquals(0, a.v1());
        assertEquals(2, a.v2());
        assertEquals(2, a.peso());
        a = grafo.proxAdj(0);
        assertEquals(0, a.v1());
        assertEquals(3, a.v2());
        assertEquals(3, a.peso());
        assertNull(grafo.proxAdj(0));
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 3, 3);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(3, 2));
        assertFalse(grafoT.existeAresta(0, 1));
        assertFalse(grafoT.existeAresta(1, 2));
        assertFalse(grafoT.existeAresta(2, 3));
    }

    @Test
    public void testNumVertices() {
        Grafo grafo = new Grafo(4);
        assertEquals(4, grafo.numVertices());
    }
}