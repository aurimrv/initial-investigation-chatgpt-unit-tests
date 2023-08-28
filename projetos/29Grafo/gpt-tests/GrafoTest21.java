package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest21{


    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(1, 3, 7);
        grafo.insereAresta(2, 4, 3);

        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(0, 2));
        assertTrue(grafo.existeAresta(1, 3));
        assertTrue(grafo.existeAresta(2, 4));
        assertFalse(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(3, 4));
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(1, 3, 7);
        grafo.insereAresta(2, 4, 3);

        assertNotNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(0, 1));
        assertNotNull(grafo.retiraAresta(1, 3));
        assertNull(grafo.retiraAresta(1, 3));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(5);
        assertTrue(grafo.listaAdjVazia(0));

        grafo.insereAresta(0, 1, 10);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(1, 3, 7);
        grafo.insereAresta(2, 4, 3);

        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());

        aresta = grafo.primeiroListaAdj(1);
        assertEquals(1, aresta.v1());
        assertEquals(3, aresta.v2());
        assertEquals(7, aresta.peso());

        aresta = grafo.primeiroListaAdj(2);
        assertEquals(2, aresta.v1());
        assertEquals(4, aresta.v2());
        assertEquals(3, aresta.peso());
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(1, 3, 7);
        grafo.insereAresta(2, 4, 3);

        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());

        aresta = grafo.proxAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(5, aresta.peso());

        aresta = grafo.proxAdj(0);
        assertNull(aresta);

        aresta = grafo.proxAdj(1);
        assertEquals(1, aresta.v1());
        assertEquals(3, aresta.v2());
        assertEquals(7, aresta.peso());

        aresta = grafo.proxAdj(1);
        assertNull(aresta);
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(1, 3, 7);
        grafo.insereAresta(2, 4, 3);

        Grafo grafoT = grafo.grafoTransposto();

        assertTrue(grafoT.ex