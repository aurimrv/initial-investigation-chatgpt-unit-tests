
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest10 {
    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
        
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 3));
        assertTrue(grafo.existeAresta(3, 4));
        assertFalse(grafo.existeAresta(0, 2));
        assertFalse(grafo.existeAresta(1, 3));
        assertFalse(grafo.existeAresta(2, 4));
    }
    
    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
        
        Grafo.Aresta aresta1 = grafo.retiraAresta(0, 1);
        Grafo.Aresta aresta2 = grafo.retiraAresta(2, 3);
        
        assertNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(2, 3));
        
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(10, aresta1.peso());
        
        assertEquals(2, aresta2.v1());
        assertEquals(3, aresta2.v2());
        assertEquals(30, aresta2.peso());
    }
    
    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
        
        Grafo grafoTransposto = grafo.grafoTransposto();
        
        assertTrue(grafoTransposto.existeAresta(1, 0));
        assertTrue(grafoTransposto.existeAresta(2, 1));
        assertTrue(grafoTransposto.existeAresta(3, 2));
        assertTrue(grafoTransposto.existeAresta(4, 3));
        assertFalse(grafoTransposto.existeAresta(0, 2));
        assertFalse(grafoTransposto.existeAresta(1, 3));
        assertFalse(grafoTransposto.existeAresta(2, 4));
    }
}