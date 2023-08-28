package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FPHeapMinTest17{


    @Test
    public void testRefaz() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(9);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(7);
        FPHeapMin heap = new FPHeapMin(v);
        heap.refaz(1, 5);
        assertEquals(2, heap.min().recuperaChave());
    }

    @Test
    public void testConstroi() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(9);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(7);
        FPHeapMin heap = new FPHeapMin(v);
        heap.constroi();
        assertEquals(2, heap.min().recuperaChave());
    }

    @Test
    public void testRetiraMin() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(9);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(7);
        FPHeapMin heap = new FPHeapMin(v);
        heap.constroi();
        Item min = heap.retiraMin();
        assertEquals(2, min.recuperaChave());
    }

    @Test
    public void testDiminuiChave() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(9);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(7);
        FPHeapMin heap = new FPHeapMin(v);
        heap.constroi();
        heap.diminuiChave(3, 1);
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test
    public void testInsere() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(9);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(7);
        FPHeapMin heap = new FPHeapMin(v);
        heap.constroi();
        Item newItem = new MeuItem(1);
        heap.insere(newItem);
        assertEquals(1, heap.min().recuperaChave());
    }
}