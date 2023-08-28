
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class AgmPrimTest9 {

    @Test
    public void testAgmPrim() {
        // Create a graph
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 3, 4);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(1, 3, 7);
        grafo.insereAresta(1, 4, 5);
        grafo.insereAresta(2, 4, 1);
        grafo.insereAresta(3, 4, 6);

        // Create the AgmPrim object
        AgmPrim agmPrim = new AgmPrim(grafo);

        try {
            // Find the minimum spanning tree
            agmPrim.obterAgm(0);

            // Check the predecessors
            assertEquals(-1, agmPrim.antecessor(0));
            assertEquals(0, agmPrim.antecessor(1));
            assertEquals(1, agmPrim.antecessor(2));
            assertEquals(0, agmPrim.antecessor(3));
            assertEquals(2, agmPrim.antecessor(4));

            // Check the weights
            assertEquals(0.0, agmPrim.peso(0), 0.0001);
            assertEquals(2.0, agmPrim.peso(1), 0.0001);
            assertEquals(3.0, agmPrim.peso(2), 0.0001);
            assertEquals(4.0, agmPrim.peso(3), 0.0001);
            assertEquals(1.0, agmPrim.peso(4), 0.0001);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    // Add more test cases here

}