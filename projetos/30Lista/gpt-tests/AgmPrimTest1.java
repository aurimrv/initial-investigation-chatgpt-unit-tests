
package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.FPHeapMinIndireto;
import ds.AgmPrim;
import ds.Grafo;
import ds.Grafo.Aresta;
import ds.Lista;

public class AgmPrimTest1 {

    @Test
    public void testRefaz() {
        double[] p = {0.0, 2.0, 3.0, 1.0};
        int[] v = {0, 1, 2, 3};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.refaz(1, 3);
        
        assertEquals(1, heap.retiraMin());
        assertEquals(2, heap.retiraMin());
        assertEquals(3, heap.retiraMin());
    }

    @Test
    public void testConstroi() {
        double[] p = {0.0, 4.0, 1.0, 3.0, 2.0};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.constroi();
        
        assertEquals(2, heap.retiraMin());
        assertEquals(3, heap.retiraMin());
        assertEquals(4, heap.retiraMin());
        assertEquals(1, heap.retiraMin());
    }

    @Test
    public void testRetiraMin() throws Exception {
        double[] p = {0.0, 1.0, 2.0, 3.0};
        int[] v = {0, 1, 2, 3};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        
        assertEquals(1, heap.retiraMin());
        assertEquals(2, heap.retiraMin());
        assertEquals(3, heap.retiraMin());
    }

    @Test
    public void testDiminuiChave() throws Exception {
        double[] p = {0.0, 1.0, 2.0, 3.0};
        int[] v = {0, 1, 2, 3};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.diminuiChave(3, 0.5);
        
        assertEquals(3, heap.retiraMin());
        assertEquals(1, heap.retiraMin());
        assertEquals(2, heap.retiraMin());
    }

    @Test
    public void testVazio() {
        double[] p = {0.0};
        int[] v = {0};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        
        assertTrue(heap.vazio());
    }

    @Test
    public void testObterAgm() throws Exception {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(1, 3, 4);
        grafo.insereAresta(2, 3, 5);
        
        AgmPrim agm = new AgmPrim(grafo);
        agm.obterAgm(0);
        
        assertEquals(0, agm.antecessor(0));
        assertEquals(1, agm.antecessor(1));
        assertEquals(0, agm.antecessor(2));
        assertEquals(1, agm.antecessor(3));
        assertEquals(0.0, agm.peso(0), 0.001);
        assertEquals(1.0, agm.peso(1), 0.001);
        assertEquals(2.0, agm.peso(2), 0.001);
        assertEquals(4.0, agm.peso(3), 0.001);
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(1, 3, 4);
        grafo.insereAresta(2, 3, 5);
        
        Grafo grafoT = grafo.grafoTransposto();
        
        assertTrue(grafoT.existeAresta(0, 0));
    }
}