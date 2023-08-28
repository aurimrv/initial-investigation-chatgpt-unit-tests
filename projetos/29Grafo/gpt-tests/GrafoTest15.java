package ds;import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import ds.Grafo;

public class GrafoTest15{

    
    private Grafo grafo;
    
    @Before
    public void setUp() {
        grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 4);
        grafo.insereAresta(3, 4, 5);
    }
    
    @Test
    public void testExisteAresta() {
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(0, 2));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 3));
        assertTrue(grafo.existeAresta(3, 4));
        
        assertFalse(grafo.existeAresta(1, 0));
        assertFalse(grafo.existeAresta(2, 0));
        assertFalse(grafo.existeAresta(2, 1));
        assertFalse(grafo.existeAresta(3, 2));
        assertFalse(grafo.existeAresta(4, 3));
    }
    
    @Test
    public void testListaAdjVazia() {
        assertFalse(grafo.listaAdjVazia(0));
        assertFalse(grafo.listaAdjVazia(1));
        assertFalse(grafo.listaAdjVazia(2));
        assertFalse(grafo.listaAdjVazia(3));
        assertFalse(grafo.listaAdjVazia(4));
        
        assertTrue(grafo.listaAdjVazia(5));
        assertTrue(grafo.listaAdjVazia(6));
        assertTrue(grafo.listaAdjVazia(7));
        assertTrue(grafo.listaAdjVazia(8));
        assertTrue(grafo.listaAdjVazia(9));
    }
    
    @Test
    public void testPrimeiroListaAdj() {
        Grafo.Aresta a1 = grafo.primeiroListaAdj(0);
        assertEquals(0, a1.v1());
        assertEquals(1, a1.v2());
        assertEquals(1, a1.peso());
        
        Grafo.Aresta a2 = grafo.primeiroListaAdj(1);
        assertEquals(1, a2.v1());
        assertEquals(2, a2.v2());
        assertEquals(3, a2.peso());
        
        Grafo.Aresta a3 = grafo.primeiroListaAdj(2);
        assertEquals(2, a3.v1());
        assertEquals(3, a3.v2());
        assertEquals(4, a3.peso());
        
        Grafo.Aresta a4 = grafo.primeiroListaAdj(3);
        assertEquals(3, a4.v1());
        assertEquals(4, a4.v2());
        assertEquals(5, a4.peso());
        
        Grafo.Aresta a5 = grafo.primeiroListaAdj(4);
        assertNull(a5);
    }
    
    @Test
    public void testProxAdj() {
        Grafo.Aresta a1 = grafo.primeiroListaAdj(0);
        Grafo.Aresta a2 = grafo.proxAdj(0);
        assertEquals(0, a2.v1());
        assertEquals(2, a2.v2());
        assertEquals(2, a2.peso());
        
        Grafo.Aresta a3 = grafo.proxAdj(2);
        assertEquals(2, a3.v1());
        assertEquals(3, a3.v2());
        assertEquals(4, a3.peso());
        
        Grafo.Aresta a4 = grafo.proxAdj(3);
        assertEquals(3, a4.v1());
        assertEquals(4, a4.v2());
        assertEquals(5, a4.peso());
        
        Grafo.Aresta a5 = grafo.proxAdj(4);
        assertNull(a5);
    }
    
    @Test
    public void testRetiraAresta() throws Exception {
        Grafo.Aresta a1 = grafo.retiraAresta(0, 1);
        assertEquals(0, a1.v1());
        assertEquals(1, a1.v2());
        assertEquals(1, a1.peso());
        
        Grafo.Aresta a2 = grafo.retiraAresta(0, 2);
        assertEquals(0, a2.v1());
        assertEquals(2, a2.v2());
        assertEquals(2, a2.peso());
        
        Grafo.Aresta a3 = grafo.retiraAresta(1, 2);
        assertEquals(1, a3.v1());
