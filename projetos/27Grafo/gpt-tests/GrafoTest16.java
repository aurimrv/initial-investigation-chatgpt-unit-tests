package ds;import org.junit.Assert;
import org.junit.Test;

import ds.BuscaEmProfundidade;
import ds.Grafo;

public class GrafoTest16{


    @Test
    public void testBuscaEmProfundidade() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 3, 1);
        grafo.insereAresta(1, 2, 1);
        grafo.insereAresta(2, 4, 1);
        grafo.insereAresta(3, 4, 1);

        BuscaEmProfundidade busca = new BuscaEmProfundidade(grafo);
        busca.buscaEmProfundidade();

        Assert.assertEquals(1, busca.d(0));
        Assert.assertEquals(2, busca.d(1));
        Assert.assertEquals(3, busca.d(2));
        Assert.assertEquals(4, busca.d(3));
        Assert.assertEquals(5, busca.d(4));
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 3, 1);
        grafo.insereAresta(1, 2, 1);
        grafo.insereAresta(2, 4, 1);
        grafo.insereAresta(3, 4, 1);

        Grafo grafoT = grafo.grafoTransposto();

        Assert.assertTrue(grafoT.existeAresta(1, 0));
        Assert.assertTrue(grafoT.existeAresta(3, 0));
        Assert.assertTrue(grafoT.existeAresta(2, 1));
        Assert.assertTrue(grafoT.existeAresta(4, 2));
        Assert.assertTrue(grafoT.existeAresta(4, 3));
    }

    @Test
    public void testListaVazia() {
        Grafo grafo = new Grafo(5);

        Assert.assertTrue(grafo.listaAdjVazia(0));
        Assert.assertTrue(grafo.listaAdjVazia(1));
        Assert.assertTrue(grafo.listaAdjVazia(2));
        Assert.assertTrue(grafo.listaAdjVazia(3));
        Assert.assertTrue(grafo.listaAdjVazia(4));
    }

    @Test
    public void testExisteAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 3, 1);
        grafo.insereAresta(1, 2, 1);
        grafo.insereAresta(2, 4, 1);
        grafo.insereAresta(3, 4, 1);

        Assert.assertTrue(grafo.existeAresta(0, 1));
        Assert.assertTrue(grafo.existeAresta(0, 3));
        Assert.assertTrue(grafo.existeAresta(1, 2));
        Assert.assertTrue(grafo.existeAresta(2, 4));
        Assert.assertTrue(grafo.existeAresta(3, 4));

        Assert.assertFalse(grafo.existeAresta(1, 0));
        Assert.assertFalse(grafo.existeAresta(3, 0));
        Assert.assertFalse(grafo.existeAresta(2, 1));
        Assert.assertFalse(grafo.existeAresta(4, 2));
        Assert.assertFalse(grafo.existeAresta(4, 3));
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 3, 1);
        grafo.insereAresta(1, 2, 1);
        grafo.insereAresta(2, 4, 1);
        grafo.insereAresta(3, 4, 1);

        Assert.assertNotNull(grafo.retiraAresta(0, 1));
        Assert.assertNotNull(grafo.retiraAresta(0, 3));
        Assert.assertNotNull(grafo.retiraAresta(1, 2));
        Assert.assertNotNull(grafo.retiraAresta(2, 4));
        Assert.assertNotNull(grafo.retiraAresta(3, 4));

        Assert.assertFalse(grafo.existeAresta(0, 1));
        Assert.assertFalse(grafo.existeAresta(0, 3));
        Assert.assertFalse(grafo.existeAresta(1, 2));
        Assert.assertFalse(grafo.existeAresta(2, 4));
        Assert.assertFalse(grafo.existeAresta(3, 4));
    }
}