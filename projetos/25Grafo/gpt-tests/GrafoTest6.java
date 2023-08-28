
package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest6 {
    
    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 2);
        assertTrue(grafo.existeAresta(0, 1));
    }
    
    @Test
    public void testExisteAresta() {
        Grafo grafo = new Grafo();
        assertFalse(grafo.existeAresta(0, 1));
    }
    
    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo();
        assertTrue(grafo.listaAdjVazia(0));
    }
    
    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 2);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(2, aresta.peso());
    }
    
    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        
        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(2, aresta1.peso());
        
        Grafo.Aresta aresta2 = grafo.proxAdj(0);
        assertEquals(0, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(3, aresta2.peso());
        
        Grafo.Aresta aresta3 = grafo.proxAdj(0);
        assertNull(aresta3);
    }
    
    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        
        Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(2, aresta.peso());
        
        assertFalse(grafo.existeAresta(0, 1));
    }
    
    @Test
    public void testNumVertices() {
        Grafo grafo = new Grafo();
        assertEquals(100, grafo.numVertices());
    }
    
    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(1, 2, 4);
        
        Grafo grafoTransposto = grafo.grafoTransposto();
        
        assertTrue(grafoTransposto.existeAresta(1, 0));
        assertTrue(grafoTransposto.existeAresta(2, 0));
        assertTrue(grafoTransposto.existeAresta(2, 1));
    }
}