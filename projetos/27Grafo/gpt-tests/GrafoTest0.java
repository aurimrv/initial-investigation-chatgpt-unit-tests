
package ds;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class GrafoTest0 {
    private Grafo grafo;

    @Before
    public void setUp() {
        grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(1, 3, 4);
        grafo.insereAresta(2, 3, 5);
        grafo.insereAresta(3, 4, 6);
    }

    @Test
    public void testExisteAresta() {
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(0, 2));
        assertTrue(grafo.existeAresta(1, 3));
        assertTrue(grafo.existeAresta(2, 3));
        assertTrue(grafo.existeAresta(3, 4));
        assertFalse(grafo.existeAresta(0, 3));
        assertFalse(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(2, 4));
    }

    @Test
    public void testListaAdjVazia() {
        assertFalse(grafo.listaAdjVazia(0));
        assertFalse(grafo.listaAdjVazia(1));
        assertFalse(grafo.listaAdjVazia(2));
        assertFalse(grafo.listaAdjVazia(3));
        assertFalse(grafo.listaAdjVazia(4));
        assertTrue(grafo.listaAdjVazia(5));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(2, aresta1.peso());

        Grafo.Aresta aresta2 = grafo.primeiroListaAdj(1);
        assertEquals(1, aresta2.v1());
        assertEquals(3, aresta2.v2());
        assertEquals(4, aresta2.peso());

        Grafo.Aresta aresta3 = grafo.primeiroListaAdj(2);
        assertEquals(2, aresta3.v1());
        assertEquals(3, aresta3.v2());
        assertEquals(5, aresta3.peso());

        Grafo.Aresta aresta4 = grafo.primeiroListaAdj(3);
        assertEquals(3, aresta4.v1());
        assertEquals(4, aresta4.v2());
        assertEquals(6, aresta4.peso());

        assertNull(grafo.primeiroListaAdj(4));
    }

    @Test
    public void testProxAdj() {
        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        Grafo.Aresta aresta2 = grafo.proxAdj(0);
        assertEquals(0, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(3, aresta2.peso());

        Grafo.Aresta aresta3 = grafo.proxAdj(2);
        assertEquals(2, aresta3.v1());
        assertEquals(3, aresta3.v2());
        assertEquals(5, aresta3.peso());

        Grafo.Aresta aresta4 = grafo.proxAdj(3);
        assertEquals(3, aresta4.v1());
        assertEquals(4, aresta4.v2());
        assertEquals(6, aresta4.peso());

        assertNull(grafo.proxAdj(4));
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo.Aresta aresta1 = grafo.retiraAresta(0, 1);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(2, aresta1.peso());

        assertFalse(grafo.existeAresta(0, 1));

        Grafo.Aresta aresta2 = grafo.retiraAresta(2, 3);
        assertEquals(2, aresta2.v1());
        assertEquals(3, aresta2.v2());
        assertEquals(5, aresta2.peso());

        assertFalse(grafo.existeAresta(2, 3));

        assertNull(grafo.retiraAresta(1, 4));
    }
}
