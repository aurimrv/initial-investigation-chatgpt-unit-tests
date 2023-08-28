
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest1 {

    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 5);
        grafo.insereAresta(2, 3, 8);
        grafo.insereAresta(3, 4, 3);

        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 3));
        assertTrue(grafo.existeAresta(3, 4));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 5);
        grafo.insereAresta(2, 3, 8);

        assertFalse(grafo.listaAdjVazia(0));
        assertFalse(grafo.listaAdjVazia(1));
        assertFalse(grafo.listaAdjVazia(2));
        assertTrue(grafo.listaAdjVazia(3));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 5);
        grafo.insereAresta(2, 3, 8);
        grafo.insereAresta(3, 4, 3);

        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        Grafo.Aresta aresta2 = grafo.primeiroListaAdj(1);
        Grafo.Aresta aresta3 = grafo.primeiroListaAdj(2);
        Grafo.Aresta aresta4 = grafo.primeiroListaAdj(3);

        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(10, aresta1.peso());

        assertEquals(1, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(5, aresta2.peso());

        assertEquals(2, aresta3.v1());
        assertEquals(3, aresta3.v2());
        assertEquals(8, aresta3.peso());

        assertEquals(3, aresta4.v1());
        assertEquals(4, aresta4.v2());
        assertEquals(3, aresta4.peso());
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 5);
        grafo.insereAresta(2, 3, 8);
        grafo.insereAresta(3, 4, 3);

        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        Grafo.Aresta aresta2 = grafo.proxAdj(0);
        Grafo.Aresta aresta3 = grafo.proxAdj(1);
        Grafo.Aresta aresta4 = grafo.proxAdj(2);

        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(10, aresta1.peso());

        assertEquals(0, aresta2.v1());
        assertEquals(1, aresta2.v2());
        assertEquals(10, aresta2.peso());

        assertEquals(1, aresta3.v1());
        assertEquals(2, aresta3.v2());
        assertEquals(5, aresta3.peso());

        assertEquals(2, aresta4.v1());
        assertEquals(3, aresta4.v2());
        assertEquals(8, aresta4.peso());
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 5);
        grafo.insereAresta(2, 3, 8);
        grafo.insereAresta(3, 4, 3);

        Grafo.Aresta aresta1 = grafo.retiraAresta(0, 1);
        Grafo.Aresta aresta2 = grafo.retiraAresta(1, 2);
        Grafo.Aresta aresta3 = grafo.retiraAresta(2, 3);
        Grafo.Aresta aresta4 = grafo.retiraAresta(3, 4);

        assertNotNull(aresta1);
        assertNotNull(aresta2);
        assertNotNull(aresta3);
        assertNotNull(aresta4);

     }
}