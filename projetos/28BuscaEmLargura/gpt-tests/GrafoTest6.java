
package ds;import ds.Grafo;
import ds.BuscaEmLargura;
import ds.Fila;
import ds.Lista;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GrafoTest6 {

    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        assertTrue(grafo.existeAresta(0, 1));
    }

    @Test
    public void testExisteAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        assertTrue(grafo.existeAresta(0, 1));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(5);
        assertTrue(grafo.listaAdjVazia(0));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 1);
        assertEquals(1, grafo.primeiroListaAdj(0).v2());
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 1);
        assertEquals(2, grafo.proxAdj(0).v2());
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 1);
        grafo.retiraAresta(0, 1);
        assertTrue(!grafo.existeAresta(0, 1));
    }

    @Test
    public void testNumVertices() {
        Grafo grafo = new Grafo(5);
        assertEquals(5, grafo.numVertices());
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 1);
        Grafo transposto = grafo.grafoTransposto();
        assertTrue(transposto.existeAresta(1, 0));
    }

    @Test
    public void testVisitaBfs() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 1);
        BuscaEmLargura bfs = new BuscaEmLargura(grafo);
        int cor[] = new int[5];
        bfs.visitaBfs(0, cor);
        assertEquals(0, bfs.antecessor(0));
    }

    @Test
    public void testBuscaEmLargura() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 1);
        BuscaEmLargura bfs = new BuscaEmLargura(grafo);
        bfs.buscaEmLargura();
        assertEquals(0, bfs.antecessor(0));
    }

    @Test
    public void testD() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 1);
        BuscaEmLargura bfs = new BuscaEmLargura(grafo);
        bfs.buscaEmLargura();
        assertEquals(0, bfs.d(0));
    }

    @Test
    public void testImprimeCaminho() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 1);
        BuscaEmLargura bfs = new BuscaEmLargura(grafo);
        bfs.buscaEmLargura();
        bfs.imprimeCaminho(0, 2);
        assertEquals("0\n2", outContent.toString().trim());
    }
}