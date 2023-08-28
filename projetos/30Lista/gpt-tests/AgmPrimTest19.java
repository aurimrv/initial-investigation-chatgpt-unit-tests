package ds;import org.junit.Assert;
import org.junit.Test;

import ds.AgmPrim;
import ds.Grafo;

public class AgmPrimTest19{


    @Test
    public void testObterAgm() throws Exception {
        // Create a graph
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(1, 2, 1);
        grafo.insereAresta(1, 3, 4);
        grafo.insereAresta(2, 3, 2);
        grafo.insereAresta(2, 4, 3);
        grafo.insereAresta(3, 4, 1);

        // Create the AgmPrim object
        AgmPrim agmPrim = new AgmPrim(grafo);

        // Calculate the minimum spanning tree
        agmPrim.obterAgm(0);

        // Test the results
        Assert.assertEquals(0, agmPrim.antecessor(0));
        Assert.assertEquals(-1, agmPrim.antecessor(1));
        Assert.assertEquals(0, agmPrim.antecessor(2));
        Assert.assertEquals(2, agmPrim.antecessor(3));
        Assert.assertEquals(3, agmPrim.antecessor(4));

        Assert.assertEquals(0.0, agmPrim.peso(0), 0.001);
        Assert.assertEquals(Double.MAX_VALUE, agmPrim.peso(1), 0.001);
        Assert.assertEquals(2.0, agmPrim.peso(2), 0.001);
        Assert.assertEquals(4.0, agmPrim.peso(3), 0.001);
        Assert.assertEquals(5.0, agmPrim.peso(4), 0.001);
    }
}