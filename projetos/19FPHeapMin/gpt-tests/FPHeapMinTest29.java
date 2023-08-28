package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FPHeapMinTest29{


    @Test
    public void testRefaz() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
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
        v[3] = new MeuItem(8);
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
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(7);
        FPHeapMin heap = new FPHeapMin(v);
        Item min = heap.retiraMin();
        assertEquals(2, min.recuperaChave());
        assertEquals(3, heap.min().recuperaChave());
    }

    @Test
    public void testDiminuiChave() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(7);
        FPHeapMin heap = new FPHeapMin(v);
        heap.diminuiChave(3, 1);
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test
    public void testInsere() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(7);
        FPHeapMin heap = new FPHeapMin(v);
        heap.insere(new MeuItem(1));
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test
    public void testImprime() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(7);
        FPHeapMin heap = new FPHeapMin(v);
        heap.imprime();
    }

    @Test
    public void testCopia() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(7);
        FPHeapMin heap = new FPHeapMin(v);
        Item[] copy = new Item[6];
        heap.copia(copy);
        assertEquals(5, copy[1].recuperaChave());
        assertEquals(3, copy[2].recuperaChave());
        assertEquals(8, copy[3].recuperaChave());
        assertEquals(2, copy[4].recuperaChave());
        assertEquals(7, copy[5].recuperaChave());
    }
}