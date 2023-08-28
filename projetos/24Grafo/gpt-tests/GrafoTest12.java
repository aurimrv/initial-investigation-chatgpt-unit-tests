package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest12{


    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 0));
    }

    @Test
    public void testExisteAresta() {
        Grafo grafo = new Grafo();
        assertFalse(grafo.existeAresta(0, 1));
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo();
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 5);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        Aresta primeiraAresta = grafo.primeiroListaAdj(0);
        assertNotNull(primeiraAresta);
        assertEquals(0, primeiraAresta.v1());
        assertEquals(1, primeiraAresta.v2());
        assertEquals(5, primeiraAresta.peso());
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(0, 3, 15);
        Aresta proximaAresta = grafo.proxAdj(0);
        assertNotNull(proximaAresta);
        assertEquals(0, proximaAresta.v1());
        assertEquals(1, proximaAresta.v2());
        assertEquals(5, proximaAresta.peso());
        proximaAresta = grafo.proxAdj(0);
        assertNotNull(proximaAresta);
        assertEquals(0, proximaAresta.v1());
        assertEquals(2, proximaAresta.v2());
        assertEquals(10, proximaAresta.peso());
        proximaAresta = grafo.proxAdj(0);
        assertNotNull(proximaAresta);
        assertEquals(0, proximaAresta.v1());
        assertEquals(3, proximaAresta.v2());
        assertEquals(15, proximaAresta.peso());
        proximaAresta = grafo.proxAdj(0);
        assertNull(proximaAresta);
    }

    @Test
    public void testRetiraAresta() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        Aresta arestaRetirada = grafo.retiraAresta(0, 1);
        assertNotNull(arestaRetirada);
        assertEquals(0, arestaRetirada.v1());
        assertEquals(1, arestaRetirada.v2());
        assertEquals(5, arestaRetirada.peso());
        assertFalse(grafo.existeAresta(0, 1));
        assertNull(grafo.retiraAresta(0, 1));
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(1, 2, 15);
        Grafo grafoTransposto = grafo.grafoTransposto();
        assertTrue(grafoTransposto.existeAresta(1, 0));
        assertTrue(grafoTransposto.existeAresta(2, 0));
        assertTrue(grafoTransposto.existeAresta(2, 1));
    }
}