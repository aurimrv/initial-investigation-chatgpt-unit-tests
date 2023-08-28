
package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.*;

public class GrafoTest7 {
    
    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(2, 4, 4);
        
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(0, 2));
        assertTrue(grafo.existeAresta(1, 3));
        assertTrue(grafo.existeAresta(2, 4));
        assertFalse(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(3, 4));
    }
    
    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(5);
        assertTrue(grafo.listaAdjVazia(0));
        
        grafo.insereAresta(0, 1, 1);
        assertFalse(grafo.listaAdjVazia(0));
    }
    
    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(2, 4, 4);
        
        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(1, aresta1.peso());
        
        Grafo.Aresta aresta2 = grafo.primeiroListaAdj(1);
        assertEquals(0, aresta2.v1());
        assertEquals(1, aresta2.v2());
        assertEquals(1, aresta2.peso());
    }
    
    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(2, 4, 4);
        
        grafo.primeiroListaAdj(0);
        
        Grafo.Aresta aresta1 = grafo.proxAdj(0);
        assertEquals(0, aresta1.v1());
        assertEquals(2, aresta1.v2());
        assertEquals(2, aresta1.peso());
        
        Grafo.Aresta aresta2 = grafo.proxAdj(0);
        assertNull(aresta2);
    }
    
    @Test
    public void testRetiraAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(2, 4, 4);
        
        Grafo.Aresta aresta1 = grafo.retiraAresta(0, 1);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(1, aresta1.peso());
        
        assertFalse(grafo.existeAresta(0, 1));
    }
    
    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(2, 4, 4);
        
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
        assertTrue(grafoT.existeAresta(3, 1));
        assertTrue(grafoT.existeAresta(4, 2));
        assertFalse(grafoT.existeAresta(0, 1));
        assertFalse(grafoT.existeAresta(0, 2));
    }
    
}