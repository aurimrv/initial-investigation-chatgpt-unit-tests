
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest10 {

    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(1, 2, 3);
        
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(0, 2));
    }
    
    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        
        assertFalse(grafo.listaAdjVazia(0));
        assertTrue(grafo.listaAdjVazia(1));
        assertTrue(grafo.listaAdjVazia(2));
    }
    
    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(0, 3, 4);
        
        Aresta first = grafo.primeiroListaAdj(0);
        assertEquals(0, first.v1());
        assertEquals(1, first.v2());
        assertEquals(2, first.peso());
    }
    
    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(0, 3, 4);
        
        Aresta first = grafo.primeiroListaAdj(0);
        Aresta next1 = grafo.proxAdj(0);
        Aresta next2 = grafo.proxAdj(0);
        
        assertEquals(0, next1.v1());
        assertEquals(2, next1.v2());
        assertEquals(3, next1.peso());
        
        assertEquals(0, next2.v1());
        assertEquals(3, next2.v2());
        assertEquals(4, next2.peso());
    }
    
    @Test
    public void testRetiraAresta() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 2);
        
        Aresta aresta = grafo.retiraAresta(0, 1);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(2, aresta.peso());
        
        assertFalse(grafo.existeAresta(0, 1));
    }
    
    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(1, 2, 3);
        
        Grafo transposto = grafo.grafoTransposto();
        
        assertTrue(transposto.existeAresta(1, 0));
        assertTrue(transposto.existeAresta(2, 1));
        assertFalse(transposto.existeAresta(0, 1));
    }
}