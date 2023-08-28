
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class AgmPrimTest11 {
    @Test
    public void testRefaz() {
        double[] p = {0, 4, 3, 2, 1};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.refaz(1, 3);
        double[] expectedP = {0, 2, 3, 4, 1};
        int[] expectedFp = {0, 3, 2, 1, 4};
        assertEquals(expectedP, heap.p);
        assertEquals(expectedFp, heap.fp);
    }

    @Test
    public void testConstroi() {
        double[] p = {0, 4, 3, 2, 1};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.constroi();
        double[] expectedP = {0, 1, 3, 2, 4};
        int[] expectedFp = {0, 4, 2, 3, 1};
        assertEquals(expectedP, heap.p);
        assertEquals(expectedFp, heap.fp);
    }


    @Test(expected = Exception.class)
    public void testRetiraMinEmptyHeap() throws Exception {
        double[] p = {0};
        int[] v = {0};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.retiraMin();
    }



    @Test
    public void testRetiraMin() throws Exception {
        double[] p = {0, 4, 3, 2, 1};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        int min = heap.retiraMin();
        assertEquals(4, min);
        double[] expectedP = {0, 1, 3, 2};
        int[] expectedFp = {0, 2, 3, 1};
        assertEquals(expectedP, heap.p);
        assertEquals(expectedFp, heap.fp);
    }


    @Test(expected = Exception.class)
    public void testDiminuiChaveNegativeChaveNova() throws Exception {
        double[] p = {0, 4, 3, 2, 1};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.diminuiChave(2, -1);
    }


    @Test
    public void testDiminuiChave() throws Exception {
        double[] p = {0, 4, 3, 2, 1};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.diminuiChave(2, 1);
        double[] expectedP = {0, 1, 1, 2, 4};
        int[] expectedFp = {0, 2, 1, 3, 4};
        assertEquals(expectedP, heap.p);
        assertEquals(expectedFp, heap.fp);
    }


    @Test
    public void testVazio() {
        double[] p = {0};
        int[] v = {0};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        assertTrue(heap.vazio());
    }

    @Test
    public void testNaoVazio() {
        double[] p = {0, 4, 3, 2, 1};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        assertFalse(heap.vazio());
    }

}