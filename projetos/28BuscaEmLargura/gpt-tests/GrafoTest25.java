package ds;import ds.BuscaEmLargura;
import ds.Grafo;
import ds.Fila;
import ds.Lista;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest25{


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
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 4);
        grafo.insereAresta(3, 4, 5);
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
        assertNotNull(grafo.primeiroListaAdj(0));
        assertNull(grafo.primeiroListaAdj(1));
        assertNull(grafo.primeiroListaAdj(2));
        assertNull(grafo.primeiroListaAdj(3));
        assertNull(grafo.primeiroListaAdj(4));
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(0, 3, 4);
        grafo.insereAresta(0, 4, 5);
        assertNotNull(grafo.proxAdj(0));
        assertNull(grafo.proxAdj(1));
        assertNull(grafo.proxAdj(2));
        assertNull(grafo.proxAdj(3));
        assertNull(grafo.proxAdj(4));
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 4);
        grafo.insereAresta(3, 4, 5);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(3, 2));
        assertTrue(grafoT.existeAresta(4, 3));
        assertFalse(grafoT.existeAresta(