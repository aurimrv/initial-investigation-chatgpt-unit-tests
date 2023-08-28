package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.AgmPrim;
import ds.FPHeapMinIndireto;
import ds.Grafo;
import ds.Lista;

public class AgmPrimTest27{


    @Test
    public void testRefaz() {
        double[] p = {0, 1, 2, 3, 4};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.refaz(1, 4);
        int[] expected = {0, 1, 2, 3, 4};
        assertArrayEquals(expected, heap.fp);
    }

    @Test
    public void testConstroi() {
        double[] p = {0, 4, 3, 2, 1};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.constroi();
        int[] expected = {0, 1, 3, 2, 4};
        assertArrayEquals(expected, heap.fp);
    }

    @Test
    public void testRetiraMin() throws Exception {
        double[] p = {0, 4, 3, 2, 1};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        int min = heap.retiraMin();
        assertEquals(1, min);
    }

    @Test
    public void testDiminuiChave() throws Exception {
        double[] p = {0, 4, 3, 2, 1};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.diminuiChave(4, 0.5);
        double[] expected = {0, 0.5, 3, 2, 1};
        assertArrayEquals(expected, heap.p, 0.001);
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
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(0, 3, 3);
        grafo.insereAresta(0, 4, 4);
        AgmPrim agm = new AgmPrim(grafo);
        agm.obterAgm(0);
        int[] expectedAntecessor = {-1, 0, 0, 0, 0};
        double[] expectedPeso = {0, 1, 2, 3, 4};
        assertArrayEquals(expectedAntecessor, agm.antecessor);
        assertArrayEquals(expectedPeso, agm.p, 0.001);
    }

    @Test
    public void testAntecessor() {
        AgmPrim agm = new AgmPrim(null);
        agm.antecessor = new int[]{0, 1, 2, 3, 4};
        assertEquals(1, agm.antecessor(1));
    }

    @Test
    public void testPeso() {
        AgmPrim agm = new AgmPrim(null);
        agm.p = new double[]{0, 1, 2, 3, 4};
        assertEquals(2, agm.peso(2), 0.001);
    }

}