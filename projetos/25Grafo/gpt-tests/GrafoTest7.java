
package ds;
import ds.Grafo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrafoTest7 {

    private Grafo grafo;

    @Before
    public void setUp() {
        grafo = new Grafo();
    }

    @Test
    public void testInsereAresta() {
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 15);
        grafo.insereAresta(2, 3, 20);

        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 3));
        assertFalse(grafo.existeAresta(0, 3));
    }

    @Test
    public void testListaAdjVazia() {
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 10);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test
    public void testPrimeiroListaAdj() {
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 15);

        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());
    }

    @Test
    public void testProxAdj() {
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 15);

        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        Grafo.Aresta aresta2 = grafo.proxAdj(0);

        assertNotNull(aresta1);
        assertNotNull(aresta2);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(10, aresta1.peso());
        assertEquals(0, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(15, aresta2.peso());
    }

    @Test
    public void testRetiraAresta() throws Exception {
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 15);

        Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());

        assertFalse(grafo.existeAresta(0, 1));
    }

    @Test
    public void testNumVertices() {
        assertEquals(100, grafo.numVertices());
    }

    @Test
    public void testGrafoTransposto() {
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 15);
        grafo.insereAresta(2, 3, 20);

        Grafo grafoT = grafo.grafoTransposto();

        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(3, 2));
    }
}