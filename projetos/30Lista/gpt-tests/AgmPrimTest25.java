package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.AgmPrim;
import ds.FPHeapMinIndireto;
import ds.Grafo;
import ds.Lista;

public class AgmPrimTest25{


    @Test
    public void testRefaz() {
        double[] p = {0, 2, 4, 6, 8};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.refaz(1, 4);
        int[] expected = {0, 1, 2, 3, 4};
        assertArrayEquals(expected, heap.fp);
    }

    @Test
    public void testConstroi() {
        double[] p = {0, 2, 4, 6, 8};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.constroi();
        int[] expected = {0, 1, 2, 3, 4};
        assertArrayEquals(expected, heap.fp);
    }

    @Test
    public void testRetiraMin() throws Exception {
        double[] p = {0, 2, 4, 6, 8};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        int min = heap.retiraMin();
        assertEquals(1, min);
    }

    @Test
    public void testDiminuiChave() throws Exception {
        double[] p = {0, 2, 4, 6, 8};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.diminuiChave(4, 1);
        int[] expected = {0, 4, 2, 3, 1};
        assertArrayEquals(expected, heap.fp);
    }

    @Test
    public void testVazio() {
        double[] p = {0};
        int[] v = {0};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        assertTrue(heap.vazio());
    }

    @Test
    public void testObterAgm() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 4);
        grafo.insereAresta(1, 2, 1);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(2, 3, 2);
        grafo.insereAresta(2, 4, 5);
        grafo.insereAresta(3, 4, 1);
        AgmPrim agmPrim = new AgmPrim(grafo);
        agmPrim.obterAgm(0);
        int[] expectedAntecessor = {-1, 0, 1, 2, 3};
        double[] expectedPeso = {0, 2, 1, 2, 1};
        assertArrayEquals(expectedAntecessor, agmPrim.antecessor);
        assertArrayEquals(expectedPeso, agmPrim.p, 0.001);
    }
}