
package ds;
import ds.Grafo;
import ds.BuscaEmProfundidade;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest4 {
    
    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        assertTrue(grafo.existeAresta(0, 1));
    }
    
    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.retiraAresta(0, 1);
        assertFalse(grafo.existeAresta(0, 1));
    }
    
    @Test
    public void testNumVertices() {
        Grafo grafo = new Grafo(5);
        assertEquals(5, grafo.numVertices());
    }
    
    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 4);
        
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(3, 2));
    }
    
    @Test
    public void testBuscaEmProfundidade() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 4);
        
        BuscaEmProfundidade busca = new BuscaEmProfundidade(grafo);
        busca.buscaEmProfundidade();
        
        assertEquals(1, busca.d(0));
        assertEquals(2, busca.d(1));
        assertEquals(3, busca.d(2));
        assertEquals(4, busca.d(3));
    }
}