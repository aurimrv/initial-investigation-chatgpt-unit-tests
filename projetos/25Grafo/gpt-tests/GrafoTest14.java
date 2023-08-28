package ds;import ds.Grafo;
import ds.Lista;
import org.junit.Assert;
import org.junit.Test;

public class GrafoTest14{


    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        Assert.assertTrue(grafo.existeAresta(1, 2));
    }

    @Test
    public void testExisteAresta() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        Assert.assertTrue(grafo.existeAresta(1, 2));
        Assert.assertFalse(grafo.existeAresta(2, 3));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        Assert.assertFalse(grafo.listaAdjVazia(1));
        Assert.assertTrue(grafo.listaAdjVazia(2));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(1);
        Assert.assertEquals(1, aresta.v1());
        Assert.assertEquals(2, aresta.v2());
        Assert.assertEquals(10, aresta.peso());
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);
        grafo.insereAresta(1, 4, 30);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(1);
        Assert.assertEquals(1, aresta.v1());
        Assert.assertEquals(2, aresta.v2());
        Assert.assertEquals(10, aresta.peso());
        aresta = grafo.proxAdj(1);
        Assert.assertEquals(1, aresta.v1());
        Assert.assertEquals(3, aresta.v2());
        Assert.assertEquals(20, aresta.peso());
        aresta = grafo.proxAdj(1);
        Assert.assertEquals(1, aresta.v1());
        Assert.assertEquals(4, aresta.v2());
        Assert.assertEquals(30, aresta.peso());
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);
        Grafo.Aresta aresta = grafo.retiraAresta(1, 2);
        Assert.assertEquals(1, aresta.v1());
        Assert.assertEquals(2, aresta.v2());
        Assert.assertEquals(10, aresta.peso());
        Assert.assertFalse(grafo.existeAresta(1, 2));
    }

    @Test
    public void testNumVertices() {
        Grafo grafo = new Grafo();
        Assert.assertEquals(100, grafo.numVertices());
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 3, 20);
        grafo.insereAresta(3, 4, 30);
        Grafo grafoT = grafo.grafoTransposto();
        Assert.assertTrue(grafoT.existeAresta(2, 1));
        Assert.assertTrue(grafoT.existeAresta(3, 2));
        Assert.assertTrue(grafoT.existeAresta(4, 3));
    }

    @Test
    public void testListaPesquisa() {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        Assert.assertEquals(2, lista.pesquisa(2));
        Assert.assertNull(lista.pesquisa(4));
    }

    @Test
    public void testListaVazia() {
        Lista lista = new Lista();
        Assert.assertTrue(lista.vazia());
        lista.insere(1);
        Assert.assertFalse(lista.vazia());
    }

    @Test
    public void testListaRetira() throws Exception {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        Assert.assertEquals(2, lista.retira(2));
        Assert.assertFalse(lista.estaNaLista(2));
    }
}