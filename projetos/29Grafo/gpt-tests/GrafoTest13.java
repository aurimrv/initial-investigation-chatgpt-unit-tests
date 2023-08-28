package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest13{


    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 3, 3);
        
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 3));
        assertFalse(grafo.existeAresta(0, 2));
    }
    
    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 3, 3);
        
        Grafo.Aresta aresta = grafo.retiraAresta(1, 2);
        assertEquals(1, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(2, aresta.peso());
        
        assertFalse(grafo.existeAresta(1, 2));
    }
    
    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 3, 3);
        
        Grafo grafoT = grafo.grafoTransposto();
        
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(3, 2));
        assertFalse(grafoT.existeAresta(2, 3));
    }
    
    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        
        assertFalse(grafo.listaAdjVazia(0));
        assertTrue(grafo.listaAdjVazia(1));
        assertTrue(grafo.listaAdjVazia(3));
    }
}