
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest7 {
    
    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(3, 4, 4);
        
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(0, 2));
        assertTrue(grafo.existeAresta(1, 3));
        assertTrue(grafo.existeAresta(3, 4));
        assertFalse(grafo.existeAresta(2, 4));
    }
    
    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(3, 4, 4);
        
        assertNotNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(1, 2));
        assertNull(grafo.retiraAresta(2, 3));
        assertNull(grafo.retiraAresta(4, 3));
    }
    
    @Test
    public void testBuscaEmLargura() throws Exception {
        Grafo grafo = new Grafo(6);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(3, 4, 4);
        grafo.insereAresta(4, 5, 5);
        
        BuscaEmLargura busca = new BuscaEmLargura(grafo);
        busca.buscaEmLargura();
        
        assertEquals(0, busca.d(0));
        assertEquals(1, busca.d(1));
        assertEquals(1, busca.d(2));
        assertEquals(2, busca.d(3));
        assertEquals(3, busca.d(4));
        assertEquals(4, busca.d(5));
    }
    
    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(6);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(3, 4, 4);
        grafo.insereAresta(4, 5, 5);
        
        Grafo grafoT = grafo.grafoTransposto();
        
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
        assertTrue(grafoT.existeAresta(3, 1));
        assertTrue(grafoT.existeAresta(4, 3));
        assertTrue(grafoT.existeAresta(5, 4));
        assertFalse(grafoT.existeAresta(1, 2));
    }
}