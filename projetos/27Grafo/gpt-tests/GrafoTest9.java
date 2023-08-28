
package ds;import ds.BuscaEmProfundidade;
import ds.Grafo;
import ds.Lista;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GrafoTest9 {

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
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(3);
        assertTrue(grafo.listaAdjVazia(0));
        assertTrue(grafo.listaAdjVazia(1));
        assertTrue(grafo.listaAdjVazia(2));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(1, 3, 4);
        grafo.insereAresta(2, 3, 5);

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
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(1, 3, 4);
        grafo.insereAresta(2, 3, 5);

        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        Grafo.Aresta aresta2 = grafo.proxAdj(0);
        assertEquals(0, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(3, aresta2.peso());

        Grafo.Aresta aresta3 = grafo.proxAdj(2);
        assertEquals(2, aresta3.v1());
        assertEquals(3, aresta3.v2());
        assertEquals(5, aresta3.peso());
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(1, 3, 4);
        grafo.insereAresta(2, 3, 5);

        Grafo.Aresta aresta1 = grafo.retiraAresta(0, 1);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(2, aresta1.peso());

        Grafo.Aresta aresta2 = grafo.retiraAresta(1, 3);
        assertEquals(1, aresta2.v1());
        assertEquals(3, aresta2.v2());
        assertEquals(4, aresta2.peso());

        Grafo.Aresta aresta3 = grafo.retiraAresta(2, 3);
        assertEquals(2, aresta3.v1());
        assertEquals(3, aresta3.v2());
        assertEquals(5, aresta3.peso());
    }
}
