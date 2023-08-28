package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest9 {

    @Test
    public void testConstructor() {
        Grafo graph = new Grafo(5);
        
        assertEquals(5, graph.numVertices());
        assertEquals(5 + 2 * 4500, graph.cab.length);
        assertEquals(5 + 2 * 4500, graph.prox.length);
        assertEquals(5 + 2 * 4500, graph.peso.length);
    }

    @Test
    public void testInsereAresta() {
        Grafo graph = new Grafo(5);
        
        graph.insereAresta(0, 1, 5);
        
        // Check if the edge was inserted correctly
        assertTrue(graph.existeAresta(0, 1));
        assertFalse(graph.existeAresta(1, 0));
        assertEquals(5, graph.peso[1]);
        
        // Check if non-existent edges return false
        assertFalse(graph.existeAresta(0, 2));
        assertFalse(graph.existeAresta(2, 1));
    }


    @Test
    public void testRetiraAresta() {
        Grafo graph = new Grafo(5);
        graph.insereAresta(0, 1, 5);
        
        Grafo.Aresta removedEdge = graph.retiraAresta(0, 1);
        
        // Check if the edge was removed correctly
        assertNull(graph.retiraAresta(0, 1));
        assertFalse(graph.existeAresta(0, 1));
        assertEquals(0, graph.peso[removedEdge.v1()]);
    }

    @Test
    public void testGrafoTransposto() {
        Grafo graph = new Grafo(5);
        graph.insereAresta(0, 1, 5);
        graph.insereAresta(1, 2, 10);
        graph.insereAresta(2, 3, 15);
        
        Grafo transposedGraph = graph.grafoTransposto();
        
        // Check if the transpose graph has the same edges as the original graph, but in the opposite direction
        assertTrue(transposedGraph.existeAresta(1, 0));
        assertTrue(transposedGraph.existeAresta(2, 1));
        assertTrue(transposedGraph.existeAresta(3, 2));
    }
}