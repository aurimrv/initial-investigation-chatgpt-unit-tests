
package ds;

import ds.Grafo;
import ds.Grafo.Aresta;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GrafoTest10 {

    private Grafo grafo;

    @Before
    public void setUp() {
        // Create a graph with 4 vertices
        grafo = new Grafo(4);
        // Add edges to the graph
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 3, 3);
        grafo.insereAresta(3, 0, 4);
    }

    @Test
    public void testExisteAresta() {
        // Check if the edges exist in the graph
        Assert.assertTrue(grafo.existeAresta(0, 1));
        Assert.assertTrue(grafo.existeAresta(1, 2));
        Assert.assertTrue(grafo.existeAresta(2, 3));
        Assert.assertTrue(grafo.existeAresta(3, 0));
        Assert.assertFalse(grafo.existeAresta(0, 2));
        Assert.assertFalse(grafo.existeAresta(1, 3));
    }

    @Test
    public void testRetiraAresta() throws Exception {
        // Remove edges from the graph
        Aresta aresta1 = grafo.retiraAresta(0, 1);
        Aresta aresta2 = grafo.retiraAresta(1, 2);
        Aresta aresta3 = grafo.retiraAresta(2, 3);
        Aresta aresta4 = grafo.retiraAresta(3, 0);

        // Check if the removed edges are correct
        Assert.assertEquals(1, aresta1.peso());
        Assert.assertEquals(2, aresta2.peso());
        Assert.assertEquals(3, aresta3.peso());
        Assert.assertEquals(4, aresta4.peso());

        // Check if the removed edges no longer exist in the graph
        Assert.assertFalse(grafo.existeAresta(0, 1));
        Assert.assertFalse(grafo.existeAresta(1, 2));
        Assert.assertFalse(grafo.existeAresta(2, 3));
        Assert.assertFalse(grafo.existeAresta(3, 0));
    }

    @Test
    public void testGrafoTransposto() {
        // Get the transposed graph
        Grafo grafoT = grafo.grafoTransposto();

        // Check if the edges in the transposed graph are correct
        Assert.assertTrue(grafoT.existeAresta(1, 0));
        Assert.assertTrue(grafoT.existeAresta(2, 1));
        Assert.assertTrue(grafoT.existeAresta(3, 2));
        Assert.assertTrue(grafoT.existeAresta(0, 3));
        Assert.assertFalse(grafoT.existeAresta(1, 2));
        Assert.assertFalse(grafoT.existeAresta(2, 3));
    }
}