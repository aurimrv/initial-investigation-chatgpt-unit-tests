
package ds;import ds.Grafo;
import ds.BuscaEmLargura;
import ds.Fila;
import ds.Lista;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest4 {

    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 4);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(2, 4, 1);
        grafo.insereAresta(3, 4, 5);

        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(0, 2));
        assertTrue(grafo.existeAresta(1, 3));
        assertTrue(grafo.existeAresta(2, 4));
        assertTrue(grafo.existeAresta(3, 4));
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 4);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(2, 4, 1);
        grafo.insereAresta(3, 4, 5);

        grafo.retiraAresta(0, 1);
        grafo.retiraAresta(1, 3);
        grafo.retiraAresta(3, 4);

        assertFalse(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 3));
        assertFalse(grafo.existeAresta(3, 4));
        assertTrue(grafo.existeAresta(0, 2));
        assertTrue(grafo.existeAresta(2, 4));
    }

    @Test
    public void testBuscaEmLargura() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 4);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(2, 4, 1);
        grafo.insereAresta(3, 4, 5);

        BuscaEmLargura bfs = new BuscaEmLargura(grafo);
        bfs.buscaEmLargura();

        assertEquals(0, bfs.d(0));
        assertEquals(1, bfs.d(1));
        assertEquals(1, bfs.d(2));
        assertEquals(2, bfs.d(3));
        assertEquals(2, bfs.d(4));
    }

    @Test
    public void testImprimeCaminho() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 4);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(2, 4, 1);
        grafo.insereAresta(3, 4, 5);

        BuscaEmLargura bfs = new BuscaEmLargura(grafo);
        bfs.buscaEmLargura();

        assertEquals("0\n1\n3\n4", bfs.imprimeCaminho(0, 4));
        assertEquals("Nao existe caminho de 1 ate 0", bfs.imprimeCaminho(1, 0));
    }
}