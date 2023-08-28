
package ds;import ds.BuscaEmLargura;
import ds.Grafo;
import ds.Fila;
import ds.Lista;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest3 {

    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 0));
    }

    @Test
    public void testExisteAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 0));
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
        assertEquals(grafo.primeiroListaAdj(0).v2(), 1);
        assertEquals(grafo.primeiroListaAdj(0).peso(), 10);
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        assertEquals(grafo.proxAdj(0).v2(), 2);
        assertEquals(grafo.proxAdj(0).peso(), 20);
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        assertNotNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(0, 3));
    }

    @Test
    public void testNumVertices() {
        Grafo grafo = new Grafo(5);
        assertEquals(grafo.numVertices(), 5);
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
    }

    @Test
    public void testBuscaEmLargura() throws Exception {
        Grafo grafo = new Grafo(6);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        grafo.insereAresta(2, 3, 40);
        grafo.insereAresta(2, 4, 50);
        grafo.insereAresta(3, 4, 60);
        grafo.insereAresta(3, 5, 70);
        grafo.insereAresta(4, 5, 80);
        BuscaEmLargura bfs = new BuscaEmLargura(grafo);
        bfs.buscaEmLargura();
        assertEquals(bfs.d(0), 0);
        assertEquals(bfs.d(1), 1);
        assertEquals(bfs.d(2), 1);
        assertEquals(bfs.d(3), 2);
        assertEquals(bfs.d(4), 2);
        assertEquals(bfs.d(5), 3);
    }

    @Test
    public void testD() throws Exception {
        Grafo grafo = new Grafo(6);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        grafo.insereAresta(2, 3, 40);
        grafo.insereAresta(2, 4, 50);
        grafo.insereAresta(3, 4, 60);
        grafo.insereAresta(3, 5, 70);
        grafo.insereAresta(4, 5, 80);
        BuscaEmLargura bfs = new BuscaEmLargura(grafo);
        bfs.buscaEmLargura();
    }
}