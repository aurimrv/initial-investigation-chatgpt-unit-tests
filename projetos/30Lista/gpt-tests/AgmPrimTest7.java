
package ds;
import ds.AgmPrim;
import ds.Grafo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AgmPrimTest7 {

    private AgmPrim agmPrim;
    private Grafo grafo;

    @Before
    public void setUp() {
        grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 1);
        grafo.insereAresta(2, 1, 3);
        grafo.insereAresta(1, 3, 4);
        grafo.insereAresta(2, 3, 2);
        grafo.insereAresta(2, 4, 3);
        grafo.insereAresta(3, 4, 5);

        agmPrim = new AgmPrim(grafo);
    }

    @Test
    public void obterAgm() throws Exception {
        agmPrim.obterAgm(0);
        int[] expectedAntecessor = {-1, 0, 0, 1, 2};
        double[] expectedPeso = {0, 2, 1, 4, 3};

        assertArrayEquals(expectedAntecessor, agmPrim.getAntecessor());
        assertArrayEquals(expectedPeso, agmPrim.getPeso(), 0.01);
    }

    @Test
    public void antecessor() throws Exception {
        agmPrim.obterAgm(0);
        assertEquals(-1, agmPrim.antecessor(0));
        assertEquals(0, agmPrim.antecessor(1));
        assertEquals(0, agmPrim.antecessor(2));
        assertEquals(1, agmPrim.antecessor(3));
        assertEquals(2, agmPrim.antecessor(4));
    }

    @Test
    public void peso() throws Exception {
        agmPrim.obterAgm(0);
        assertEquals(0, agmPrim.peso(0), 0.01);
        assertEquals(2, agmPrim.peso(1), 0.01);
        assertEquals(1, agmPrim.peso(2), 0.01);
        assertEquals(4, agmPrim.peso(3), 0.01);
        assertEquals(3, agmPrim.peso(4), 0.01);
    }

    @Test
    public void imprime() throws Exception {
        agmPrim.obterAgm(0);
        agmPrim.imprime();
    }
}