package ds;import ds.BuscaEmProfundidade;
import ds.Grafo;
import ds.Lista;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest15{


    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 3, 3);
        grafo.insereAresta(3, 4, 4);

        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 3));
        assertTrue(grafo.existeAresta(3, 4));
    }

    @Test
    public void testExisteAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 3, 3);
        grafo.insereAresta(3, 4, 4);

        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 3));
        assertTrue(grafo.existeAresta(3, 4));
        assertFalse(grafo.existeAresta(0, 2));
        assertFalse(grafo.existeAresta(1, 3));
        assertFalse(grafo.existeAresta(2, 4));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 3, 3);
        grafo.insereAresta(3, 4, 4);

        assertFalse(grafo.listaAdjVazia(0));
        assertFalse(grafo.listaAdjVazia(1));
        assertFalse(grafo.listaAdjVazia(2));
        assertFalse(grafo.listaAdjVazia(3));
        assertTrue(grafo.listaAdjVazia(4));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 3, 3);
        grafo.insereAresta(3, 4, 4);

        assertEquals(0, grafo.primeiroListaAdj(0).v1());
        assertEquals(1, grafo.primeiroListaAdj(0).v2());
        assertEquals(1, grafo.primeiroListaAdj(0).peso());
        assertEquals(1, grafo.primeiroListaAdj(1).v1());
        assertEquals(2, grafo.primeiroListaAdj(1).v2());
        assertEquals(2, grafo.primeiroListaAdj(1).peso());
        assertEquals(2, grafo.primeiroListaAdj(2).v1());
        assertEquals(3, grafo.primeiroListaAdj(2).v2());
        assertEquals(3, grafo.primeiroListaAdj(2).peso());
        assertEquals(3, grafo.primeiroListaAdj(3).v1());
        assertEquals(4, grafo.primeiroListaAdj(3).v2());
        assertEquals(4, grafo.primeiroListaAdj(3).peso());
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 3, 3);
        grafo.insereAresta(3, 4, 4);

        assertEquals(0, grafo.proxAdj(0).v1());
        assertEquals(1, grafo.proxAdj(0).v2());
        assertEquals(1, grafo.proxAdj(0).peso());
        assertEquals(1, grafo.proxAdj(1).v1());
        assertEquals(2, grafo.proxAdj(1).v2());
        assertEquals(2, grafo.proxAdj(1).peso());
        assertEquals(2, grafo.proxAdj(2).v1());
        assertEquals(3, grafo.proxAdj(2).v2());
        assertEquals(3, grafo.proxAdj(2).peso());
        assertEquals(3, grafo.proxAdj(3).v1());
        assertEquals(4, grafo.proxAdj(3).v2());
        assertEquals(4, grafo.proxAdj(3).peso());
        assertNull(grafo.proxAdj(4));
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 3, 3);
        grafo.insereAresta(3, 4, 4);

        assertNotNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(0, 1));
        assertNotNull(grafo.retiraAresta(1, 2));
        assertNull(grafo.retiraAresta(1, 2));
        assertNotNull(grafo.retiraAresta(2, 3));
        assertNull(grafo.retiraAresta(2, 3));
        assertNotNull(grafo.retiraAresta(3, 4));
        assertNull(grafo.retiraAresta(3, 4));
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 3, 3);
        grafo.insereAresta(3, 4, 4);

        Grafo grafoT = grafo.grafoTransposto();

        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(3, 2));
        assertTrue(grafoT.existeAresta(4, 3));
        assertFalse(grafoT.existeAresta(0, 1));
        assertFalse(grafoT.existeAresta(1, 2));
        assertFalse(grafoT.existeAresta(2, 3));
        assertFalse(grafoT.existeAresta(3