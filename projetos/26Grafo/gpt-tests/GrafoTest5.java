
package ds;
import ds.Grafo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrafoTest5 {

    private Grafo grafo;

    @Before
    public void setUp() {
        grafo = new Grafo(5);
    }

    @Test
    public void testInsereAresta() {
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(1, 2, 2);

        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(0, 2));
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(1, 0));
        assertFalse(grafo.existeAresta(2, 0));
    }

    @Test
    public void testExisteAresta() {
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);

        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(0, 2));
        assertFalse(grafo.existeAresta(1, 0));
        assertFalse(grafo.existeAresta(2, 0));
        assertFalse(grafo.existeAresta(1, 2));
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
        grafo.insereAresta(0, 2, 5);

        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);

        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());
    }

    @Test
    public void testProxAdj() {
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);

        grafo.primeiroListaAdj(0);
        Grafo.Aresta aresta = grafo.proxAdj(0);

        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(5, aresta.peso());

        aresta = grafo.proxAdj(0);

        assertNull(aresta);
    }

    @Test
    public void testRetiraAresta() {
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);

        Grafo.Aresta aresta = grafo.retiraAresta(0, 1);

        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());

        assertFalse(grafo.existeAresta(0, 1));
    }

    @Test
    public void testGrafoTransposto() {
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(1, 2, 2);

        Grafo grafoT = grafo.grafoTransposto();

        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        assertFalse(grafoT.existeAresta(0, 1));
        assertFalse(grafoT.existeAresta(0, 2));
        assertFalse(grafoT.existeAresta(1, 2));
    }
}