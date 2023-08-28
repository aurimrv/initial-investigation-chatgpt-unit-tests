
package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest1 {

    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 4);
        grafo.insereAresta(3, 4, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 3));
        assertTrue(grafo.existeAresta(3, 4));
        assertFalse(grafo.existeAresta(0, 2));
        assertFalse(grafo.existeAresta(1, 3));
        assertFalse(grafo.existeAresta(2, 4));
    }

    @Test
    public void testRetiraAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 4);
        grafo.insereAresta(3, 4, 5);
        Aresta aresta = grafo.retiraAresta(0, 1);
        assertEquals(2, aresta.peso());
        assertFalse(grafo.existeAresta(0, 1));
        aresta = grafo.retiraAresta(2, 3);
        assertEquals(4, aresta.peso());
        assertFalse(grafo.existeAresta(2, 3));
        aresta = grafo.retiraAresta(3, 4);
        assertEquals(5, aresta.peso());
        assertFalse(grafo.existeAresta(3, 4));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(5);
        assertTrue(grafo.listaAdjVazia(0));
        assertTrue(grafo.listaAdjVazia(1));
        assertTrue(grafo.listaAdjVazia(2));
        assertTrue(grafo.listaAdjVazia(3));
        assertTrue(grafo.listaAdjVazia(4));
        grafo.insereAresta(0, 1, 2);
        assertFalse(grafo.listaAdjVazia(0));
        assertTrue(grafo.listaAdjVazia(1));
        grafo.insereAresta(1, 2, 3);
        assertFalse(grafo.listaAdjVazia(1));
        assertTrue(grafo.listaAdjVazia(2));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(0, 3, 4);
        grafo.insereAresta(0, 4, 5);
        Aresta aresta = grafo.primeiroListaAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(2, aresta.peso());
        aresta = grafo.primeiroListaAdj(1);
        assertNull(aresta);
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(0, 3, 4);
        grafo.insereAresta(0, 4, 5);
        Aresta aresta = grafo.primeiroListaAdj(0);
        aresta = grafo.proxAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(3, aresta.peso());
        aresta = grafo.proxAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(3, aresta.v2());
        assertEquals(4, aresta.peso());
        aresta = grafo.proxAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(4, aresta.v2());
        assertEquals(5, aresta.peso());
        aresta = grafo.proxAdj(0);
        assertNull(aresta);
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 4);
        grafo.insereAresta(3, 4, 5);
        Grafo transposto = grafo.grafoTransposto();
        assertTrue(transposto.existeAresta(1, 0));
        assertTrue(transposto.existeAresta(2, 1));
        assertTrue(transposto.existeAresta(3, 2));
        assertTrue(transposto.existeAresta(4, 3));
        assertFalse(transposto.existeAresta(0, 1));
        assertFalse(transposto.existeAresta(1, 2));
        assertFalse(transposto.existeAresta(2, 3));
        assertFalse(transposto.existeAresta(3, 4));
    }

}