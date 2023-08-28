package ds;import ds.BuscaEmLargura;
import ds.Grafo;
import ds.Lista;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GrafoTest14{

    private Grafo grafo;

    @Before
    public void setup() {
        grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 1);
        grafo.insereAresta(1, 3, 1);
        grafo.insereAresta(2, 4, 1);
    }

    @Test
    public void testExisteAresta() {
        Assert.assertTrue(grafo.existeAresta(0, 1));
        Assert.assertTrue(grafo.existeAresta(0, 2));
        Assert.assertTrue(grafo.existeAresta(1, 3));
        Assert.assertTrue(grafo.existeAresta(2, 4));
        Assert.assertFalse(grafo.existeAresta(1, 2));
    }

    @Test
    public void testListaAdjVazia() {
        Assert.assertFalse(grafo.listaAdjVazia(0));
        Assert.assertFalse(grafo.listaAdjVazia(1));
        Assert.assertFalse(grafo.listaAdjVazia(2));
        Assert.assertTrue(grafo.listaAdjVazia(3));
        Assert.assertTrue(grafo.listaAdjVazia(4));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        Assert.assertEquals(0, aresta1.v1());
        Assert.assertEquals(1, aresta1.v2());

        Grafo.Aresta aresta2 = grafo.primeiroListaAdj(1);
        Assert.assertEquals(1, aresta2.v1());
        Assert.assertEquals(3, aresta2.v2());

        Grafo.Aresta aresta3 = grafo.primeiroListaAdj(2);
        Assert.assertEquals(2, aresta3.v1());
        Assert.assertEquals(4, aresta3.v2());

        Grafo.Aresta aresta4 = grafo.primeiroListaAdj(3);
        Assert.assertNull(aresta4);
    }

    @Test
    public void testProxAdj() {
        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        Grafo.Aresta aresta2 = grafo.proxAdj(0);
        Assert.assertEquals(0, aresta2.v1());
        Assert.assertEquals(2, aresta2.v2());

        Grafo.Aresta aresta3 = grafo.proxAdj(2);
        Assert.assertNull(aresta3);
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo.Aresta aresta1 = grafo.retiraAresta(0, 1);
        Assert.assertEquals(0, aresta1.v1());
        Assert.assertEquals(1, aresta1.v2());

        Grafo.Aresta aresta2 = grafo.retiraAresta(1, 3);
        Assert.assertNull(aresta2);
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafoT = grafo.grafoTransposto();
        Assert.assertTrue(grafoT.existeAresta(1, 0));
        Assert.assertTrue(grafoT.existeAresta(2, 0));
        Assert.assertTrue(grafoT.existeAresta(3, 1));
        Assert.assertTrue(grafoT.existeAresta(4, 2));
    }
}
