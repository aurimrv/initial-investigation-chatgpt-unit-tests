package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.Grafo;

public class GrafoTest13{


    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 3);
        assertTrue(grafo.existeAresta(1, 2));
    }

    @Test
    public void testExisteAresta() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 3);
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(2, 3));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 3);
        assertFalse(grafo.listaAdjVazia(1));
        assertTrue(grafo.listaAdjVazia(2));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(1, 3, 4);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(1);
        assertEquals(1, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(3, aresta.peso());
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(1, 3, 4);
        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(1);
        Grafo.Aresta aresta2 = grafo.proxAdj(1);
        assertEquals(1, aresta1.v1());
        assertEquals(2, aresta1.v2());
        assertEquals(3, aresta1.peso());
        assertEquals(1, aresta2.v1());
        assertEquals(3, aresta2.v2());
        assertEquals(4, aresta2.peso());
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(1, 3, 4);
        Grafo.Aresta aresta = grafo.retiraAresta(1, 2);
        assertEquals(1, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(3, aresta.peso());
        assertFalse(grafo.existeAresta(1, 2));
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(1, 3, 4);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(3, 1));
    }
}