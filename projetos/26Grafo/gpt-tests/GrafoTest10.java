
package ds;import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GrafoTest10 {

    private Grafo grafo;

    @Before
    public void setUp() {
        grafo = new Grafo(5);
    }

    @Test
    public void testInsereAresta() {
        grafo.insereAresta(0, 1, 3);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(0, 2));
    }

    @Test
    public void testExisteAresta() {
        grafo.insereAresta(0, 1, 3);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(0, 2));
    }

    @Test
    public void testListaAdjVazia() {
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 3);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test
    public void testPrimeiroListaAdj() {
        grafo.insereAresta(0, 1, 3);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(0, 3, 2);

        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(3, aresta.peso());
    }

    @Test
    public void testProxAdj() {
        grafo.insereAresta(0, 1, 3);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(0, 3, 2);

        grafo.primeiroListaAdj(0);
        Grafo.Aresta aresta = grafo.proxAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(5, aresta.peso());

        aresta = grafo.proxAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(3, aresta.v2());
        assertEquals(2, aresta.peso());
    }

    @Test
    public void testRetiraAresta() {
        grafo.insereAresta(0, 1, 3);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(0, 3, 2);

        Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(3, aresta.peso());

        assertFalse(grafo.existeAresta(0, 1));
    }
}