package ds;import ds.FPHeapMax;
import ds.MeuItem;
import org.junit.Test;
import static org.junit.Assert.*;

public class FPHeapMaxTest17{


    @Test
    public void testConstrutor() {
        FPHeapMax heap = new FPHeapMax(10);
        assertNotNull(heap);
    }

    @Test
    public void testConstroi() {
        FPHeapMax heap = new FPHeapMax(10);
        MeuItem[] items = new MeuItem[11];
        for (int i = 1; i <= 10; i++) {
            items[i] = new MeuItem(i);
        }
        heap.copia(items);
        heap.constroi();
        assertEquals(10, heap.max().recuperaChave());
    }

    @Test
    public void testInsere() {
        FPHeapMax heap = new FPHeapMax(10);
        MeuItem[] items = new MeuItem[11];
        for (int i = 1; i <= 10; i++) {
            items[i] = new MeuItem(i);
        }
        heap.copia(items);
        MeuItem newItem = new MeuItem(11);
        try {
            heap.insere(newItem);
            assertEquals(11, heap.max().recuperaChave());
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test
    public void testRet