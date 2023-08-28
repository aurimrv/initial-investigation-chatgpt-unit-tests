package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest14{


    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 2);

        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 3));
        assertFalse(grafo.existeAresta(0, 2));
        assertFalse(grafo.existeAresta(1, 3));
    }

    @Test
    public void testRetiraAresta() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 2);

        assertNotNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(0, 2));
        assertNotNull(grafo.retiraAresta(1, 2));
        assertNull(grafo.retiraAresta(1, 3));

        assertFalse(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 3));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 2);

        assertFalse(grafo.listaAdjVazia(0));
        assertFalse(grafo.listaAdjVazia(1));
        assertFalse(grafo.listaAdjVazia(2));
        assertTrue(grafo.listaAdjVazia(3));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 2);

        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(1, aresta.v2());
        assertEquals(5, aresta.peso());

        aresta = grafo.primeiroListaAdj(1);
        assertNotNull(aresta);
        assertEquals(2, aresta.v2());
        assertEquals(3, aresta.peso());

        aresta = grafo.primeiroListaAdj(2);
        assertNotNull(aresta);
        assertEquals(3, aresta.v2());
        assertEquals(2, aresta.peso());

        assertNull(grafo.primeiroListaAdj(3));
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 2);

        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(1, aresta.v2());
        assertEquals(5, aresta.peso());

        aresta = grafo.proxAdj(0);
        assertNull(aresta);

        aresta = grafo.primeiroListaAdj(1);
        assertNotNull(aresta);
        assertEquals(2, aresta.v2());
        assertEquals(3, aresta.peso());

        aresta = grafo.proxAdj(1);
        assertNull(aresta);

        aresta = grafo.primeiroListaAdj(2);
        assertNotNull(aresta);
        assertEquals(3, aresta.v2());
        assertEquals(2, aresta.peso());

        aresta = grafo.proxAdj(2);
        assertNull(aresta);

        assertNull(grafo.primeiroListaAdj(3));
        assertNull(grafo.proxAdj(3));
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 2);

        Grafo grafoT = grafo.grafoTransposto();

        assertFalse(grafoT.existeAresta(0, 1));
        assertTrue(grafoT.existeAresta(1, 0));
        assertFalse(grafoT.existeAresta(1, 2));
        assertTrue(grafoT.existeAresta(2, 1));
        assertFalse(grafoT.existeAresta(2, 3));
        assertTrue(grafoT.existeAresta(3, 2));
    }
}