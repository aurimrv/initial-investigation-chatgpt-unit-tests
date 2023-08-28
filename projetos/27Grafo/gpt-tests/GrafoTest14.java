package ds;import ds.BuscaEmProfundidade;
import ds.Grafo;
import ds.Lista;
import org.junit.Assert;
import org.junit.Test;

public class GrafoTest14{


    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 3, 3);
        grafo.insereAresta(3, 4, 4);
        Assert.assertTrue(grafo.existeAresta(0, 1));
        Assert.assertTrue(grafo.existeAresta(1, 2));
        Assert.assertTrue(grafo.existeAresta(2, 3));
        Assert.assertTrue(grafo.existeAresta(3, 4));
    }

    @Test
    public void testExisteAresta() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        Assert.assertTrue(grafo.existeAresta(0, 1));
        Assert.assertTrue(grafo.existeAresta(1, 2));
        Assert.assertFalse(grafo.existeAresta(0, 2));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(3);
        Assert.assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 1);
        Assert.assertFalse(grafo.listaAdjVazia(0));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        Assert.assertEquals(0, aresta.v1());
        Assert.assertEquals(1, aresta.v2());
        Assert.assertEquals(1, aresta.peso());
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        Assert.assertEquals(0, aresta.v1());
        Assert.assertEquals(1, aresta.v2());
        Assert.assertEquals(1, aresta.peso());
        aresta = grafo.proxAdj(0);
        Assert.assertEquals(0, aresta.v1());
        Assert.assertEquals(2, aresta.v2());
        Assert.assertEquals(2, aresta.peso());
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
        Assert.assertEquals(0, aresta.v1());
        Assert.assertEquals(1, aresta.v2());
        Assert.assertEquals(1, aresta.peso());
        Assert.assertFalse(grafo.existeAresta(0, 1));
    }

    @Test
    public void testNumVertices() {
        Grafo grafo = new Grafo(5);
        Assert.assertEquals(5, grafo.numVertices());
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 3, 3);
        grafo.insereAresta(3, 4, 4);
        Grafo grafoT = grafo.grafoTransposto();
        Assert.assertTrue(grafoT.existeAresta(1, 0));
        Assert.assertTrue(grafoT.existeAresta(2, 1));
        Assert.assertTrue(grafoT.existeAresta(3, 2));
        Assert.assertTrue(grafoT.existeAresta(4, 3));
    }

    @Test
    public void testBuscaEmProfundidade() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 3, 3);
        grafo.insereAresta(3, 4, 4);
        BuscaEmProfundidade busca = new BuscaEmProfundidade(grafo);
        busca.buscaEmProfundidade();
        Assert.assertEquals(1, busca.d(0));
        Assert.assertEquals(2, busca.d(1));
        Assert.assertEquals(3, busca.d(2));
        Assert.assertEquals(4, busca.d(3));
        Assert.assertEquals(5, busca.d(4));
        Assert.assertEquals(5, busca.t(0));
        Assert.assertEquals(4, busca.t(1));
        Assert.assertEquals(3, busca.t(2));
        Assert.assertEquals(2, busca.t(3));
        Assert.assertEquals(1, busca.t(4));
        Assert.assertEquals(-1, busca.antecessor(0));
        Assert.assertEquals(0, busca.antecessor(1));
        Assert.assertEquals(1, busca.antecessor(2));
        Assert.assertEquals(2, busca.antecessor(3));
        Assert.assertEquals(3, busca.antecessor(4));
    }

}