
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class AgmPrimTest8 {
    
    @Test
    public void testObterAgm() throws Exception {
        // Create a graph
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 6);
        grafo.insereAresta(0, 3, 5);
        grafo.insereAresta(0, 4, 15);
        grafo.insereAresta(1, 2, 8);
        grafo.insereAresta(1, 3, 12);
        grafo.insereAresta(1, 4, 7);
        grafo.insereAresta(2, 3, 14);
        grafo.insereAresta(2, 4, 20);
        grafo.insereAresta(3, 4, 8);
        
        // Create AgmPrim object
        AgmPrim agmPrim = new AgmPrim(grafo);
        
        // Obtain the minimum spanning tree
        agmPrim.obterAgm(0);
        
        // Test the output
        assertEquals(-1, agmPrim.antecessor(0));
        assertEquals(0, agmPrim.antecessor(1));
        assertEquals(0, agmPrim.antecessor(2));
        assertEquals(0, agmPrim.antecessor(3));
        assertEquals(1, agmPrim.antecessor(4));
        assertEquals(0.0, agmPrim.peso(0), 0.001);
        assertEquals(10.0, agmPrim.peso(1), 0.001);
        assertEquals(6.0, agmPrim.peso(2), 0.001);
        assertEquals(5.0, agmPrim.peso(3), 0.001);
        assertEquals(7.0, agmPrim.peso(4), 0.001);
    }
    
    @Test(expected = Exception.class)
    public void testObterAgmWithEmptyGraph() throws Exception {
        // Create an empty graph
        Grafo grafo = new Grafo(0);
        
        // Create AgmPrim object
        AgmPrim agmPrim = new AgmPrim(grafo);
        
        // Obtain the minimum spanning tree (should throw an exception)
        agmPrim.obterAgm(0);
    }
    
    @Test(expected = Exception.class)
    public void testObterAgmWithInvalidRoot() throws Exception {
        // Create a graph
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 6);
        grafo.insereAresta(0, 3, 5);
        grafo.insereAresta(0, 4, 15);
        grafo.insereAresta(1, 2, 8);
        grafo.insereAresta(1, 3, 12);
        grafo.insereAresta(1, 4, 7);
        grafo.insereAresta(2, 3, 14);
        grafo.insereAresta(2, 4, 20);
        grafo.insereAresta(3, 4, 8);
        
        // Create AgmPrim object
        AgmPrim agmPrim = new AgmPrim(grafo);
        
        // Obtain the minimum spanning tree with an invalid root (should throw an exception)
        agmPrim.obterAgm(5);
    }
    
    @Test
    public void testAntecessor() throws Exception {
        // Create a graph
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 3, 3);
        
        // Create AgmPrim object
        AgmPrim agmPrim = new AgmPrim(grafo);
        
        // Set antecessors manually
        agmPrim.obterAgm(0);
        agmPrim.setAntecessor(1, 0);
        agmPrim.setAntecessor(2, 0);
        agmPrim.setAntecessor(3, 0);
    }
}