

package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class AgmPrimTest10 {
    @Test
    public void testFPHeapMinIndiretoConstructor() {
        double p[] = {3, 2, 5, 4};
        int v[] = {0, 1, 2, 3};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        
        assertEquals(p, heap.p);
        assertEquals(v, heap.fp);
        assertEquals(3, heap.n);
        assertEquals(1, heap.pos[0]);
        assertEquals(2, heap.pos[1]);
        assertEquals(3, heap.pos[2]);
    }

    @Test
    public void testFPHeapMinIndiretoRefaz() {
        double p[] = {3, 2, 5, 4};
        int v[] = {0, 1, 2, 3};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        
        heap.refaz(1, 3);
        
        assertEquals(2, heap.fp[1]);
        assertEquals(1, heap.pos[2]);
        assertEquals(3, heap.fp[2]);
        assertEquals(2, heap.pos[3]);
        assertEquals(5, heap.fp[3]);
        assertEquals(3, heap.pos[4]);
    }

    @Test
    public void testFPHeapMinIndiretoConstroi() {
        double p[] = {3, 2, 5, 4};
        int v[] = {0, 1, 2, 3};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        
        heap.constroi();
        
        assertEquals(2, heap.fp[1]);
        assertEquals(1, heap.pos[2]);
        assertEquals(4, heap.fp[2]);
        assertEquals(2, heap.pos[3]);
        assertEquals(5, heap.fp[3]);
        assertEquals(3, heap.pos[4]);
    }


    @Test
    public void testFPHeapMinIndiretoRetiraMin() {
        double p[] = {3, 2, 5, 4};
        int v[] = {0, 1, 2, 3};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        
        int min = heap.retiraMin();
        
        assertEquals(2, min);
        assertEquals(4, heap.n);
        assertEquals(2, heap.fp[1]);
        assertEquals(1, heap.pos[2]);
        assertEquals(5, heap.fp[2]);
        assertEquals(2, heap.pos[3]);
    }

    @Test(expected = Exception.class)
    public void testFPHeapMinIndiretoRetiraMinWithEmptyHeap() throws Exception {
        double p[] = {};
        int v[] = {};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        
        heap.retiraMin();
    }

    @Test
    public void testFPHeapMinIndiretoDiminuiChave() {
        double p[] = {3, 2, 5, 4};
        int v[] = {0, 1, 2, 3};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        
        heap.diminuiChave(3, 1);
        
        assertEquals(1, heap.p[3]);
        assertEquals(1, heap.fp[1]);
        assertEquals(1, heap.pos[3]);
        assertEquals(3, heap.fp[2]);
        assertEquals(2, heap.pos[4]);
    }

    @Test(expected = Exception.class)
    public void testFPHeapMinIndiretoDiminuiChaveWithIncorrectValue() throws Exception {
        double p[] = {3, 2, 5, 4};
        int v[] = {0, 1, 2, 3};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        
        heap.diminuiChave(3, -1);
    }

}
   