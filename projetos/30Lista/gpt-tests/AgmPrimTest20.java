package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.FPHeapMinIndireto;
import ds.Grafo;
import ds.AgmPrim;
import ds.Lista;

public class AgmPrimTest20{


    @Test
    public void testRefaz() {
        double[] p = {0, 5, 3, 2, 4};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.refaz(1, 4);
        int[] expected = {0, 3, 1, 2, 4};
        assertArrayEquals(expected, heap.fp);
    }

    @Test
    public void testConstroi() {
        double[] p = {0, 5, 3, 2, 4};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.constroi();
        int[] expected = {0, 2, 3, 1, 4};
        assertArrayEquals(expected, heap.fp);
    }

    @Test
    public void testRetiraMin() throws Exception {
        double[] p = {0, 5, 3, 2, 4};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        int min = heap.retiraMin();
        assertEquals(3, min);
    }

    @Test
    public void testDiminuiChave() throws Exception {
        double[] p = {0, 5, 3, 2, 4};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.diminuiChave(3, 1);
        int[] expected = {0, 3, 1, 2, 4};
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
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(0, 3, 2);
        grafo.insereAresta(0, 4, 4);
        AgmPrim agm = new AgmPrim(grafo);
        agm.obterAgm(0);
        int[] expectedAntecessor = {-1, 0, 0, 0, 0};
        double[] expectedPeso = {0, 5, 3, 2, 4};
        assertArrayEquals(expectedAntecessor, agm.antecessor);
        assertArrayEquals(expectedPeso, agm.p, 0.0001);
    }

    @Test
    public void testAntecessor() {
        AgmPrim agm = new AgmPrim(null);
        agm.antecessor = new int[] {-1, 0, 1, 2, 3};
        assertEquals(0, agm.antecessor(1));
        assertEquals(1, agm.antecessor(2));
        assertEquals(2, agm.antecessor(3));
        assertEquals(3, agm.antecessor(4));
    }

    @Test
    public void testPeso() {
        AgmPrim agm = new AgmPrim(null);
        agm.p = new double[] {0, 5, 3, 2, 4};
        assertEquals(5, agm.peso(1), 0.0001);
        assertEquals(3, agm.peso(2), 0.0001);
        assertEquals(2, agm.peso(3), 0.0001);
        assertEquals(4, agm.peso(4), 0.0001);
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0,