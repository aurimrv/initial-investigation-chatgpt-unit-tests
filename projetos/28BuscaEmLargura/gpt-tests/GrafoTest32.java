package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.BuscaEmLargura;
import ds.Grafo;

public class GrafoTest32{


    @Test
    public void testBuscaEmLargura() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 1);
        grafo.insereAresta(1, 3, 1);
        grafo.insereAresta(2, 3, 1);
        grafo.insereAresta(3, 4, 1);

        BuscaEmLargura bfs = new BuscaEmLargura(grafo);
        bfs.buscaEmLargura();

        assertEquals(0, bfs.d(0));
        assertEquals(1, bfs.d(1));
        assertEquals(1, bfs.d(2));
        assertEquals(2, bfs.d(3));
        assertEquals(3, bfs.d(4));

        assertEquals(-1, bfs.antecessor(0));
        assertEquals(0, bfs.antecessor(1));
        assertEquals(0, bfs.antecessor(2));
        assertEquals(1, bfs.antecessor(3));
        assertEquals(3, bfs.antecessor(4));
    }

    @Test
    public void testImprimeCaminho() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 1);
        grafo.insereAresta(1, 3, 1);
        grafo.insereAresta(2, 3, 1);
        grafo.insereAresta(3, 4, 1);

        BuscaEmLargura bfs = new BuscaEmLargura(grafo);
        bfs.buscaEmLargura();

        assertEquals("0\n1\n3\n4\n", bfs.imprimeCaminho(0, 4));
        assertEquals("0\n2\n3\n4\n", bfs.imprimeCaminho(0, 3));
        assertEquals("0\n1\n3\n", bfs.imprimeCaminho(0, 1));
        assertEquals("0\n2\n", bfs.imprimeCaminho(0, 2));
        assertEquals("Nao existe caminho de 0 ate 5\n", bfs.imprimeCaminho(0, 5));
    }
}