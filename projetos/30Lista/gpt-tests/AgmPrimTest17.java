package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class AgmPrimTest17{


    @Test
    public void testRefaz() {
        // Test case 1
        double[] p1 = {0, 1, 2, 3, 4, 5};
        int[] v1 = {0, 1, 2, 3, 4, 5};
        FPHeapMinIndireto heap1 = new FPHeapMinIndireto(p1, v1);
        heap1.refaz(1, 5);
        assertEquals(1, heap1.retiraMin());

        // Test case 2
        double[] p2 = {0, 5, 4, 3, 2, 1};
        int[] v2 = {0, 1, 2, 3, 4, 5};
        FPHeapMinIndireto heap2 = new FPHeapMinIndireto(p2, v2);
        heap2.refaz(1, 5);
        assertEquals(5, heap2.retiraMin());
    }

    @Test
    public void testConstroi() {
        // Test case 1
        double[] p1 = {0, 5, 4, 3, 2, 1};
        int[] v1 = {0, 1, 2, 3, 4, 5};
        FPHeapMinIndireto heap1 = new FPHeapMinIndireto(p1, v1);
        heap1.constroi();
        assertEquals(1, heap1.retiraMin());

        // Test case 2
        double[] p2 = {0, 1, 2, 3, 4, 5};
        int[] v2 = {0, 1, 2, 3, 4, 5};
        FPHeapMinIndireto heap2 = new FPHeapMinIndireto(p2, v2);
        heap2.constroi();
        assertEquals(1, heap2.retiraMin());
    }

    @Test
    public void testRetiraMin() throws Exception {
        double[] p = {0, 1, 2, 3, 4, 5};
        int[] v = {0, 1, 2, 3, 4, 5};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        assertEquals(1, heap.retiraMin());
    }

    @Test(expected = Exception.class)
    public void testRetiraMinException() throws Exception {
        double[] p = {0};
        int[] v = {0};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.retiraMin();
    }

    @Test
    public void testDiminuiChave() throws Exception {
        double[] p = {0, 1, 2, 3, 4, 5};
        int[] v = {0, 1, 2, 3, 4, 5};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.diminuiChave(2, 0.5);
        assertEquals(2, heap.retiraMin());
    }

    @Test(expected = Exception.class)
    public void testDiminuiChaveException() throws Exception {
        double[] p = {0, 1, 2, 3, 4, 5};
        int[] v = {0, 1, 2, 3, 4, 5};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.diminuiChave(2, -1);
    }

    @Test
    public void testVazio() {
        double[] p = {0};
        int[] v = {0};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        assertTrue(heap.vazio());
    }

    @Test
    public void testImprime() {
        double[] p = {0, 1, 2, 3, 4, 5};
        int[] v = {0, 1, 2, 3, 4, 5};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.imprime();
    }
}