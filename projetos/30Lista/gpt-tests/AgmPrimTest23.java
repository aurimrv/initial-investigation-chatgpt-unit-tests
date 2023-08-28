package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.FPHeapMinIndireto;
import ds.AgmPrim;
import ds.Grafo;
import ds.Lista;

public class AgmPrimTest23{


    @Test
    public void testRefaz() {
        double[] p = {0, 1, 2, 3, 4, 5};
        int[] v = {0, 1, 2, 3, 4, 5};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.refaz(1, 5);
        assertEquals(1, heap.retiraMin());
    }

    @Test
    public void testConstroi() {
        double[] p = {0, 1, 2, 3, 4, 5};
        int[] v = {0, 1, 2, 3, 4, 5};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.constroi();
        assertEquals(1, heap.retiraMin());
    }

    @Test
    public void testRetiraMin() throws Exception {
        double[] p = {0, 1, 2, 3, 4, 5};
        int[] v = {0, 1, 2, 3, 4, 5};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        assertEquals(1, heap.retiraMin());
    }

    @Test
    public void testDiminuiChave() throws Exception {
        double[] p = {0, 1, 2, 3, 4, 5};
        int[] v = {0, 1, 2, 3, 4, 5};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.diminuiChave(2, 0.5);
        assertEquals(2, heap.retiraMin());
    }

    @Test
    public void testVazio() {
        double[] p = {0, 1, 2, 3, 4, 5};
        int[] v = {0, 1, 2, 3, 4, 5};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        assertFalse(heap.vazio());
    }

    @Test
    public void testImprime() {
        double[] p = {0, 1, 2, 3, 4, 5};
        int[] v = {0, 1, 2, 3, 4, 5};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.imprime();
    }

    @Test
    public void testObterAgm() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(1, 3, 4);
        grafo.insereAresta(2, 3, 5);
        grafo.insereAresta(2, 4, 6);
        grafo.insereAresta(3, 4, 7);
        AgmPrim agm = new AgmPrim(grafo);
        agm.obterAgm(0);
        assertEquals(0, agm.antecessor(1));
    }

    @Test
    public void testPeso() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(1, 3, 4);
        grafo.insereAresta(2, 3, 5);
        grafo.insereAresta(2, 4, 6);
        grafo.insereAresta(3, 4, 7);
        AgmPrim agm = new AgmPrim(grafo);
        agm.obterAgm(0);
        assertEquals(1, agm.peso(1), 0.001);
    }

    @Test
    public void testImprimeAgm()