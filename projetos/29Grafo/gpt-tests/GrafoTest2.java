
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

import ds.Grafo;

public class GrafoTest2 {

    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 4);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 3));
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 4);
        assertNotNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(0, 1));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(4);
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 2);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(4);
        assertNull(grafo.primeiroListaAdj(0));
        grafo.insereAresta(0, 1, 2);
        assertNotNull(grafo.primeiroListaAdj(0));
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(4);
        assertNull(grafo.proxAdj(0));
        grafo.insereAresta(0, 1, 2);
        assertNotNull(grafo.proxAdj(0));
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 4);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(3, 2));
    }

    @Test
    public void testNumVertices() {
        Grafo grafo = new Grafo(4);
        assertEquals(4, grafo.numVertices());
    }
}
