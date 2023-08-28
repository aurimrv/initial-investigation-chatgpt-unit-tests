
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest2 {

    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);
        grafo.insereAresta(2, 3, 30);

        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(1, 3));
        assertTrue(grafo.existeAresta(2, 3));
        assertFalse(grafo.existeAresta(2, 1));
    }

    @Test
    public void testExisteAresta() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);

        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(2, 1));
        assertFalse(grafo.existeAresta(1, 3));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);

        assertFalse(grafo.listaAdjVazia(1));
        assertTrue(grafo.listaAdjVazia(2));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);

        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(1);
        assertEquals(1, aresta1.v1());
        assertEquals(2, aresta1.v2());
        assertEquals(10, aresta1.peso());

        Grafo.Aresta aresta2 = grafo.primeiroListaAdj(2);
        assertNull(aresta2);
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);

        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(1);
        Grafo.Aresta aresta2 = grafo.proxAdj(1);

        assertEquals(1, aresta1.v1());
        assertEquals(2, aresta1.v2());
        assertEquals(10, aresta1.peso());

        assertEquals(1, aresta2.v1());
        assertEquals(3, aresta2.v2());
        assertEquals(20, aresta2.peso());

        assertNull(grafo.proxAdj(3));
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);

        Grafo.Aresta aresta = grafo.retiraAresta(1, 2);
        assertEquals(1, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(10, aresta.peso());

        assertFalse(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(1, 3));
    }

    @Test
    public void testNumVertices() {
        Grafo grafo = new Grafo();
        assertEquals(100, grafo.numVertices());
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);
        grafo.insereAresta(2, 3, 30);

        Grafo grafoT = grafo.grafoTransposto();
        assertFalse(grafoT.existeAresta(1, 2));
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(3, 1));
        assertTrue(grafoT.existeAresta(3, 2));
    }
}