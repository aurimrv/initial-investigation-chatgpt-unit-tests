
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest9 {

    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 1, 8);

        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(0, 2));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 1));
        
        assertFalse(grafo.existeAresta(1, 0));
        assertFalse(grafo.existeAresta(2, 0));
        assertFalse(grafo.existeAresta(2, 2));
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(1, 2, 3);

        assertNotNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(0, 1));
        
        assertTrue(grafo.existeAresta(0, 2));
        assertTrue(grafo.existeAresta(1, 2));

        assertNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(1, 0));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);

        assertFalse(grafo.listaAdjVazia(0));
        assertFalse(grafo.listaAdjVazia(1));
        assertTrue(grafo.listaAdjVazia(2));
        assertTrue(grafo.listaAdjVazia(3));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);

        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());

        aresta = grafo.primeiroListaAdj(1);
        assertNull(aresta);
        
        aresta = grafo.primeiroListaAdj(2);
        assertNull(aresta);

        aresta = grafo.primeiroListaAdj(3);
        assertNull(aresta);
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(0, 3, 3);

        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());

        aresta = grafo.proxAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(5, aresta.peso());

        aresta = grafo.proxAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(3, aresta.v2());
        assertEquals(3, aresta.peso());

        aresta = grafo.proxAdj(0);
        assertNull(aresta);
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(1, 2, 3);

        Grafo grafoT = grafo.grafoTransposto();

        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        
        assertFalse(grafoT.existeAresta(0, 1));
        assertFalse(grafoT.existeAresta(0, 2));
        assertFalse(grafoT.existeAresta(1, 2));
    }

}
