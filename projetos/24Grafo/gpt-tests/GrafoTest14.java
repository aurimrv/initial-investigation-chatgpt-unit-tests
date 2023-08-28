package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest14{


    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 7);
        
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 3));
        
        assertFalse(grafo.existeAresta(0, 2));
        assertFalse(grafo.existeAresta(1, 3));
    }
    
    @Test
    public void testExisteAresta() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 3);
        
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        
        assertFalse(grafo.existeAresta(0, 2));
        assertFalse(grafo.existeAresta(2, 3));
    }
    
    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 3);
        
        assertFalse(grafo.listaAdjVazia(0));
        assertFalse(grafo.listaAdjVazia(1));
        assertTrue(grafo.listaAdjVazia(2));
    }
    
    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 3);
        
        Aresta adj = grafo.primeiroListaAdj(0);
        assertEquals(0, adj.v1());
        assertEquals(1, adj.v2());
        assertEquals(5, adj.peso());
        
        adj = grafo.primeiroListaAdj(1);
        assertEquals(1, adj.v1());
        assertEquals(2, adj.v2());
        assertEquals(3, adj.peso());
    }
    
    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 7);
        grafo.insereAresta(1, 3, 2);
        
        Aresta adj = grafo.primeiroListaAdj(0);
        assertEquals(0, adj.v1());
        assertEquals(1, adj.v2());
        assertEquals(5, adj.peso());
        
        adj = grafo.proxAdj(0);
        assertEquals(0, adj.v1());
        assertEquals(2, adj.v2());
        assertEquals(7, adj.peso());
        
        adj = grafo.proxAdj(0);
        assertNull(adj);
    }
    
    @Test
    public void testRetiraAresta() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        
        Aresta aresta = grafo.retiraAresta(0, 1);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(5, aresta.peso());
        
        assertFalse(grafo.existeAresta(0, 1));
    }
    
    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 7);
        
        Grafo grafoT = grafo.grafoTransposto();
        
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(3, 2));
        
        assertFalse(grafoT.existeAresta(0, 1));
        assertFalse(grafoT.existeAresta(1, 2));
        assertFalse(grafoT.existeAresta(2, 3));
    }
    
}