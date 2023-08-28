
package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest4 {

    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo();

        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 0));

        grafo.insereAresta(1, 2, 7);
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(2, 1));

        grafo.insereAresta(2, 0, 3);
        assertTrue(grafo.existeAresta(2, 0));
        assertFalse(grafo.existeAresta(0, 2));
    }

    @Test
    public void testExisteAresta() {
        Grafo grafo = new Grafo();

        assertFalse(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 0));

        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 0));

        grafo.insereAresta(1, 2, 7);
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(2, 1));

        grafo.insereAresta(2, 0, 3);
        assertTrue(grafo.existeAresta(2, 0));
        assertFalse(grafo.existeAresta(0, 2));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo();

        assertTrue(grafo.listaAdjVazia(0));
        assertTrue(grafo.listaAdjVazia(1));
        assertTrue(grafo.listaAdjVazia(2));

        grafo.insereAresta(0, 1, 5);
        assertFalse(grafo.listaAdjVazia(0));
        assertTrue(grafo.listaAdjVazia(1));
        assertTrue(grafo.listaAdjVazia(2));

        grafo.insereAresta(1, 2, 7);
        assertFalse(grafo.listaAdjVazia(0));
        assertFalse(grafo.listaAdjVazia(1));
        assertTrue(grafo.listaAdjVazia(2));

        grafo.insereAresta(2, 0, 3);
        assertFalse(grafo.listaAdjVazia(0));
        assertFalse(grafo.listaAdjVazia(1));
        assertFalse(grafo.listaAdjVazia(2));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo();

        assertNull(grafo.primeiroListaAdj(0));
        assertNull(grafo.primeiroListaAdj(1));
        assertNull(grafo.primeiroListaAdj(2));

        grafo.insereAresta(0, 1, 5);
        Aresta adj1 = grafo.primeiroListaAdj(0);
        assertNotNull(adj1);
        assertEquals(0, adj1.v1());
        assertEquals(1, adj1.v2());
        assertEquals(5, adj1.peso());

        grafo.insereAresta(1, 2, 7);
        Aresta adj2 = grafo.primeiroListaAdj(1);
        assertNotNull(adj2);
        assertEquals(1, adj2.v1());
        assertEquals(2, adj2.v2());
        assertEquals(7, adj2.peso());

        grafo.insereAresta(2, 0, 3);
        Aresta adj3 = grafo.primeiroListaAdj(2);
        assertNotNull(adj3);
        assertEquals(2, adj3.v1());
        assertEquals(0, adj3.v2());
        assertEquals(3, adj3.peso());
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo();

        assertNull(grafo.proxAdj(0));
        assertNull(grafo.proxAdj(1));
        assertNull(grafo.proxAdj(2));

        grafo.insereAresta(0, 1, 5);
        Aresta adj1 = grafo.primeiroListaAdj(0);
        assertNotNull(adj1);
        assertEquals(0, adj1.v1());
        assertEquals(1, adj1.v2());
        assertEquals(5, adj1.peso());

        Aresta adj2 = grafo.proxAdj(0);
        assertNull(adj2);

        grafo.insereAresta(1, 2, 7);
        Aresta adj3 = grafo.primeiroListaAdj(1);
        assertNotNull(adj3);
        assertEquals(1, adj3.v1());
        assertEquals(2, adj3.v2());
        assertEquals(7, adj3.peso());

        Aresta adj4 = grafo.proxAdj(1);
        assertNull(adj4);

        grafo.insereAresta(2, 0, 3);
        Aresta adj5 = grafo.primeiroListaAdj(2);
        assertNotNull(adj5);
        assertEquals(2, adj5.v1());
        assertEquals(0, adj5.v2());
        assertEquals(3, adj5.peso());

        Aresta adj6 = grafo.proxAdj(2);
        assertNull(adj6);
    }

    @Test
    public void testRetiraAresta() {
        Grafo grafo = new Grafo();

        assertNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(1, 0));
        assertNull(grafo.retiraAresta(2, 0));

        grafo.insereAresta(0, 1, 5);
        Aresta adj1 = grafo.retiraAresta(0, 1);
        assertNotNull(adj1);
        assertEquals(0, adj1.v1());
        assertEquals(1, adj1.v2());
        assertEquals(5, adj1.peso());

        assertNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(1, 0));
        assertNull(grafo.retiraAresta(2, 0));

        grafo.insereAresta(1, 2, 7);
        Aresta adj2 = grafo.retiraAresta(1, 2);
        assertNotNull(adj2);
        assertEquals(1, adj2.v1());
        assertEquals(2, adj2.v2());
        assertEquals(7, adj2.peso());

        assertNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(1, 2));
        assertNull(grafo.retiraAresta(2, 0));

        grafo.insereAresta(2, 0, 3);
        Aresta adj3 = grafo.retiraAresta(2, 0);
        assertNotNull(adj3);
        assertEquals(2, adj3.v1());
        assertEquals(0, adj3.v2());
        assertEquals(3, adj3.peso());

        assertNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(1, 2));
        assertNull(grafo.retiraAresta(2, 0));
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 7);
        grafo.insereAresta(2, 0, 3);

        Grafo grafoT = grafo.grafoTransposto();

        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(0, 2));

        assertFalse(grafoT.existeAresta(0, 1));
        assertFalse(grafoT.existeAresta(1, 2));
        assertFalse(grafoT.existeAresta(2, 0));
    }

}