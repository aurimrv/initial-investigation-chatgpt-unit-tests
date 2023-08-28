package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest16{

    
    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo();
        
        // Test inserting an edge
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        
        // Test inserting multiple edges
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 2);
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 3));
    }
    
    @Test
    public void testExisteAresta() {
        Grafo grafo = new Grafo();
        
        // Test when there is no edge
        assertFalse(grafo.existeAresta(0, 1));
        
        // Test when there is an edge
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
    }
    
    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo();
        
        // Test when the adjacency list is empty
        assertTrue(grafo.listaAdjVazia(0));
        
        // Test when the adjacency list is not empty
        grafo.insereAresta(0, 1, 5);
        assertFalse(grafo.listaAdjVazia(0));
    }
    
    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo();
        
        // Test when the adjacency list is empty
        assertNull(grafo.primeiroListaAdj(0));
        
        // Test when the adjacency list is not empty
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 3);
        Grafo.Aresta primeiraAresta = grafo.primeiroListaAdj(0);
        assertNotNull(primeiraAresta);
        assertEquals(0, primeiraAresta.v1());
        assertEquals(1, primeiraAresta.v2());
        assertEquals(5, primeiraAresta.peso());
    }
    
    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo();
        
        // Test when there is no next adjacency
        assertNull(grafo.proxAdj(0));
        
        // Test when there is a next adjacency
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 3);
        Grafo.Aresta primeiraAresta = grafo.primeiroListaAdj(0);
        Grafo.Aresta proximaAresta = grafo.proxAdj(0);
        assertNotNull(proximaAresta);
        assertEquals(0, proximaAresta.v1());
        assertEquals(2, proximaAresta.v2());
        assertEquals(3, proximaAresta.peso());
    }
    
    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo();
        
        // Test when the edge does not exist
        assertNull(grafo.retiraAresta(0, 1));
        
        // Test when the edge exists
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 3);
        Grafo.Aresta arestaRemovida = grafo.retiraAresta(0, 1);
        assertNotNull(arestaRemovida);
        assertEquals(0, arestaRemovida.v1());
        assertEquals(1, arestaRemovida.v2());
        assertEquals(5, arestaRemovida.peso());
        assertFalse(grafo.existeAresta(0, 1));
    }
    
    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo();
        
        // Test when the graph is empty
        Grafo grafoTransposto = grafo.grafoTransposto();
        assertNotNull(grafoTransposto);
        assertEquals(grafo.numVertices(), grafoTransposto.numVertices());
        
        // Test when the graph is not empty
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(1, 3, 2);
        grafo.insereAresta(2, 3, 4);
        Grafo grafoTransposto2 = grafo.grafoTransposto();
        assertNotNull(grafoTransposto2);
        assertEquals(grafo.numVertices(), grafoTransposto2.numVertices());
        assertTrue(grafoTransposto2.existeAresta(1, 0));
        assertTrue(grafoTransposto2.existeAresta(2, 0));
        assertTrue(grafoTransposto2.existeAresta(3, 1));
        assertTrue(grafoTransposto2.existeAresta(3, 2));
    }
    
}