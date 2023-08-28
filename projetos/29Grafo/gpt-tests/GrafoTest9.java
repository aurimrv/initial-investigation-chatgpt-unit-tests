
package ds;

import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest9 {

    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 2);
        assertTrue(grafo.existeAresta(0, 1));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(3);
        assertTrue(grafo.listaAdjVazia(0));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 2);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        aresta = grafo.proxAdj(0);
        assertNotNull(aresta);
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 2);
        Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
        assertNotNull(aresta);
        assertFalse(grafo.existeAresta(0, 1));
    }

    @Test
    public void testNumVertices() {
        Grafo grafo = new Grafo(3);
        assertEquals(3, grafo.numVertices());
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(1, 2, 3);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
    }

}

