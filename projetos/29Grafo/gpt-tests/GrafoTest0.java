
package ds;import ds.BuscaEmProfundidade;
import ds.Grafo;
import ds.Cfc;
import ds.Lista;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest0 {
    
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
    }
    
    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(3);
        assertTrue(grafo.listaAdjVazia(0));
        
        grafo.insereAresta(0, 1, 1);
        assertFalse(grafo.listaAdjVazia(0));
    }
    
    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 3, 3);
        
        Grafo.Aresta a = grafo.primeiroListaAdj(0);
        assertEquals(0, a.v1());
        assertEquals(1, a.v2());
        assertEquals(1, a.peso());
    }
    
    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 3, 3);
        
        Grafo.Aresta a1 = grafo.primeiroListaAdj(0);
        Grafo.Aresta a2 = grafo.proxAdj(0);
        
        assertEquals(0, a1.v1());
        assertEquals(1, a1.v2());
        assertEquals(1, a1.peso());
        
        assertEquals(0, a2.v1());
        assertEquals(2, a2.v2());
        assertEquals(2, a2.peso());
    }
    
    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        
        Grafo.Aresta a = grafo.retiraAresta(0, 1);
        
        assertNull(grafo.retiraAresta(0, 1));
        assertNotNull(grafo.retiraAresta(0, 2));
        
        assertEquals(0, a.v1());
        assertEquals(1, a.v2());
        assertEquals(1, a.peso());
    }
    
    @Test
    public void testNumVertices() {
        Grafo grafo = new Grafo(5);
        assertEquals(5, grafo.numVertices());
    }
    
    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 3, 3);
        
        Grafo grafoT = grafo.grafoTransposto();
        
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
        assertTrue(grafoT.existeAresta(3, 1));
    }
    
    @Test
    public void testD() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 3, 3);
        
        BuscaEmProfundidade dfs = new BuscaEmProfundidade(grafo);
        dfs.buscaEmProfundidade();
        
        assertEquals(1, dfs.d(0));
        assertEquals(2, dfs.d(1));
        assertEquals(3, dfs.d(2));
        assertEquals(4, dfs.d(3));
    }
    
}