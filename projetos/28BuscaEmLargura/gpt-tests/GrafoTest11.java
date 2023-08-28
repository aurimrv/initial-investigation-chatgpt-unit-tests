
package ds;import ds.BuscaEmLargura;
import ds.Fila;
import ds.Grafo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrafoTest11 {

    Grafo grafo;

    @Before
    public void setUp() {
        grafo = new Grafo(6);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(1, 3, 2);
        grafo.insereAresta(2, 4, 4);
        grafo.insereAresta(3, 5, 1);
        grafo.insereAresta(4, 5, 6);
    }

    @Test
    public void testExisteAresta() {
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(4, 3));
    }

    @Test
    public void testListaAdjVazia() {
        assertFalse(grafo.listaAdjVazia(0));
        assertTrue(grafo.listaAdjVazia(5));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(5, aresta.peso());
    }

    @Test
    public void testProxAdj() {
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        aresta = grafo.proxAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(3, aresta.peso());
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
        assertFalse(grafo.existeAresta(0, 1));
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(5, aresta.peso());
    }

    @Test
    public void testNumVertices() {
        assertEquals(6, grafo.numVertices());
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
        assertTrue(grafoT.existeAresta(3, 1));
        assertTrue(grafoT.existeAresta(4, 2));
        assertTrue(grafoT.existeAresta(5, 3));
        assertTrue(grafoT.existeAresta(5, 4));
    }
}

