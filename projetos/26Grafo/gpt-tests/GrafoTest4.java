
package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest4 {
    
    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(4);
        
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        
        grafo.insereAresta(1, 2, 3);
        assertTrue(grafo.existeAresta(1, 2));
        
        grafo.insereAresta(2, 3, 2);
        assertTrue(grafo.existeAresta(2, 3));
    }
    
    @Test
    public void testExisteAresta() {
        Grafo grafo = new Grafo(4);
        
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        
        grafo.insereAresta(1, 2, 3);
        assertTrue(grafo.existeAresta(1, 2));
        
        grafo.insereAresta(2, 3, 2);
        assertTrue(grafo.existeAresta(2, 3));
        
        assertFalse(grafo.existeAresta(0, 2));
        assertFalse(grafo.existeAresta(1, 3));
    }
    
    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(4);
        
        assertTrue(grafo.listaAdjVazia(0));
        
        grafo.insereAresta(0, 1, 5);
        assertFalse(grafo.listaAdjVazia(0));
        
        grafo.insereAresta(0, 2, 3);
        assertFalse(grafo.listaAdjVazia(0));
    }
    
    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(4);
        
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 3);
        
        Grafo.Aresta primeiraAresta = grafo.primeiroListaAdj(0);
        
        assertEquals(0, primeiraAresta.v1());
        assertEquals(1, primeiraAresta.v2());
        assertEquals(5, primeiraAresta.peso());
    }
    
    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(4);
        
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 3);
        
        grafo.primeiroListaAdj(0);
        Grafo.Aresta proximaAresta = grafo.proxAdj(0);
        
        assertEquals(0, proximaAresta.v1());
        assertEquals(2, proximaAresta.v2());
        assertEquals(3, proximaAresta.peso());
    }
    
    @Test
    public void testRetiraAresta() {
        Grafo grafo = new Grafo(4);
        
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 3);
        
        Grafo.Aresta arestaRetirada = grafo.retiraAresta(0, 1);
        
        assertEquals(0, arestaRetirada.v1());
        assertEquals(1, arestaRetirada.v2());
        assertEquals(5, arestaRetirada.peso());
        
        assertFalse(grafo.existeAresta(0, 1));
    }
    
    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(4);
        
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(1, 3, 2);
        
        Grafo grafoTransposto = grafo.grafoTransposto();
        
        assertTrue(grafoTransposto.existeAresta(1, 0));
        assertTrue(grafoTransposto.existeAresta(2, 0));
        assertTrue(grafoTransposto.existeAresta(3, 1));
    }
}