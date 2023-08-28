package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FPHeapMinTest24{


    @Test
    public void testRefaz() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(1);
        FPHeapMin heap = new FPHeapMin(v);
        heap.refaz(1, 5);
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test
    public void testConstroi() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(1);
        FPHeapMin heap = new FPHeapMin(v);
        heap.constroi();
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test
    public void testRetiraMin() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(1);
        FPHeapMin heap = new FPHeapMin(v);
        Item min = heap.retiraMin();
        assertEquals(1, min.recuperaChave());
    }

    @Test
    public void testDiminuiChave() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(1);
        FPHeapMin heap = new FPHeapMin(v);
        heap.diminuiChave(3, 2);
        assertEquals(2, heap.min().recuperaChave());
    }

    @Test
    public void testInsere() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(1);
        FPHeapMin heap = new FPHeapMin(v);
        Item newItem = new MeuItem(4);
        heap.insere(newItem);
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test
    public void testImprime() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(1);
        FPHeapMin heap = new FPHeapMin(v);
        heap.imprime();
    }

    @Test
    public void testCopia() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(1);
        FPHeapMin heap = new FPHeapMin(v);
        Item[] copy = new Item[6];
        heap.copia(copy);
        assertEquals(5, copy[1].recuperaChave());
        assertEquals(3, copy[2].recuperaChave());
        assertEquals(7, copy[3].recuperaChave());
        assertEquals(2, copy[4].recuperaChave());
        assertEquals(1, copy[5].recuperaChave());
    }
}