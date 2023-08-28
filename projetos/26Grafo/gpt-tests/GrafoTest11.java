
package ds;import ds.Grafo;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest11 {
    
    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 3, 3);
        grafo.insereAresta(3, 4, 4);
        assertEquals(true, grafo.existeAresta(0, 1));
        assertEquals(true, grafo.existeAresta(1, 2));
        assertEquals(true, grafo.existeAresta(2, 3));
        assertEquals(true, grafo.existeAresta(3, 4));
        assertEquals(false, grafo.existeAresta(0, 2));
        assertEquals(false, grafo.existeAresta(1, 3));
        assertEquals(false, grafo.existeAresta(2, 4));
        assertEquals(false, grafo.existeAresta(0, 3));
    }
    
    @Test
    public void testRetiraAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 3, 3);
        grafo.insereAresta(3, 4, 4);
        assertEquals(true, grafo.existeAresta(0, 1));
        assertEquals(new Grafo.Aresta(0, 1, 1), grafo.retiraAresta(0, 1));
        assertEquals(false, grafo.existeAresta(0, 1));
        assertEquals(false, grafo.existeAresta(1, 2));
        assertEquals(new Grafo.Aresta(1, 2, 2), grafo.retiraAresta(1, 2));
        assertEquals(false, grafo.existeAresta(1, 2));
        assertEquals(false, grafo.existeAresta(2, 3));
        assertEquals(new Grafo.Aresta(2, 3, 3), grafo.retiraAresta(2, 3));
        assertEquals(false, grafo.existeAresta(2, 3));
        assertEquals(false, grafo.existeAresta(3, 4));
        assertEquals(new Grafo.Aresta(3, 4, 4), grafo.retiraAresta(3, 4));
        assertEquals(false, grafo.existeAresta(3, 4));
    }
    
    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(5);
        assertEquals(true, grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 1);
        assertEquals(false, grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 2, 2);
        assertEquals(false, grafo.listaAdjVazia(0));
        grafo.retiraAresta(0, 1);
        assertEquals(false, grafo.listaAdjVazia(0));
    }
    
    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(5);
        assertNull(grafo.primeiroListaAdj(0));
        grafo.insereAresta(0, 1, 1);
        assertEquals(new Grafo.Aresta(0, 1, 1), grafo.primeiroListaAdj(0));
        assertNull(grafo.primeiroListaAdj(1));
        grafo.insereAresta(1, 2, 2);
        assertEquals(new Grafo.Aresta(1, 2, 2), grafo.primeiroListaAdj(1));
        assertNull(grafo.primeiroListaAdj(2));
    }
    
    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(5);
        assertNull(grafo.proxAdj(0));
        grafo.insereAresta(0, 1, 1);
        assertEquals(new Grafo.Aresta(0, 1, 1), grafo.proxAdj(0));
        assertNull(grafo.proxAdj(1));
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(0, 3, 3);
        grafo.insereAresta(0, 4, 4);
        assertEquals(new Grafo.Aresta(0, 2, 2), grafo.proxAdj(0));
        assertEquals(new Grafo.Aresta(0, 3, 3), grafo.proxAdj(0));
        assertEquals(new Grafo.Aresta(0, 4, 4), grafo.proxAdj(0));
        assertNull(grafo.proxAdj(0));
    }
    
    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 3, 3);
        grafo.insereAresta(3, 4, 4);
        
        Grafo grafoT = grafo.grafoTransposto();
        assertEquals(true, grafoT.existeAresta(1, 0));
        assertEquals(true, grafoT.existeAresta(2, 1));
        assertEquals(true, grafoT.existeAresta(3, 2));
        assertEquals(true, grafoT.existeAresta(4, 3));
        assertEquals(false, grafoT.existeAresta(0, 1));
        assertEquals(false, grafoT.existeAresta(1, 2));
        assertEquals(false, grafoT.existeAresta(2, 3));
        assertEquals(false, grafoT.existeAresta(3, 4));
    }
}