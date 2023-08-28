
package ds;import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class GrafoTest9 {

    private Grafo grafo;

    @Before
    public void setUp() {
        grafo = new Grafo();
    }

    @Test
    public void testInsereAresta() {
        grafo.insereAresta(0, 1, 10);
        assertTrue(grafo.existeAresta(0, 1));
        assertEquals(10, grafo.mat[0][1]);
    }

    @Test
    public void testExisteAresta() {
        assertFalse(grafo.existeAresta(0, 1));
    }

    @Test
    public void testListaAdjVazia() {
        assertTrue(grafo.listaAdjVazia(0));
    }

    @Test
    public void testPrimeiroListaAdj() {
        grafo.insereAresta(0, 1, 10);
        Aresta aresta = grafo.primeiroListaAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());
    }

    @Test
    public void testProxAdj() {
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        Aresta aresta1 = grafo.primeiroListaAdj(0);
        Aresta aresta2 = grafo.proxAdj(0);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(10, aresta1.peso());
        assertEquals(0, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(20, aresta2.peso());
    }

    @Test
    public void testProxAdjWithNoAdjacents() {
        Aresta aresta = grafo.primeiroListaAdj(0);
        assertNull(aresta);
    }

    @Test
    public void testRetiraAresta() {
        grafo.insereAresta(0, 1, 10);
        Aresta aresta = grafo.retiraAresta(0, 1);
        assertFalse(grafo.existeAresta(0, 1));
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());
    }

    @Test
    public void testRetiraArestaWithNonExistingAresta() {
        Aresta aresta = grafo.retiraAresta(0, 1);
        assertNull(aresta);
    }

    @Test
    public void testGrafoTransposto() {
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        assertEquals(10, grafoT.mat[1][0]);
        assertEquals(20, grafoT.mat[2][1]);
    }
}