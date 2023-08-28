package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FPHeapMinTest13{


    @Test
    public void testRefaz() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(2);
        v[2] = new MeuItem(7);
        v[3] = new MeuItem(5);
        v[4] = new MeuItem(9);
        v[5] = new MeuItem(3);
        FPHeapMin heap = new FPHeapMin(v);
        heap.refaz(1, 5);
        assertEquals(2, ((MeuItem) heap.min()).recuperaChave());
    }

    @Test
    public void testConstroi() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(2);
        v[2] = new MeuItem(7);
        v[3] = new MeuItem(5);
        v[4] = new MeuItem(9);
        v[5] = new MeuItem(3);
        FPHeapMin heap = new FPHeapMin(v);
        heap.constroi();
        assertEquals(2, ((MeuItem) heap.min()).recuperaChave());
    }

    @Test
    public void testRetiraMin() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(2);
        v[2] = new MeuItem(7);
        v[3] = new MeuItem(5);
        v[4] = new MeuItem(9);
        v[5] = new MeuItem(3);
        FPHeapMin heap = new FPHeapMin(v);
        Item min = heap.retiraMin();
        assertEquals(2, ((MeuItem) min).recuperaChave());
    }

    @Test
    public void testDiminuiChave() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(2);
        v[2] = new MeuItem(7);
        v[3] = new MeuItem(5);
        v[4] = new MeuItem(9);
        v[5] = new MeuItem(3);
        FPHeapMin heap = new FPHeapMin(v);
        heap.diminuiChave(3, 1);
        assertEquals(1, ((MeuItem) heap.min()).recuperaChave());
    }

    @Test
    public void testInsere() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(2);
        v[2] = new MeuItem(7);
        v[3] = new MeuItem(5);
        v[4] = new MeuItem(9);
        v[5] = new MeuItem(3);
        FPHeapMin heap = new FPHeapMin(v);
        heap.insere(new MeuItem(1));
        assertEquals(1, ((MeuItem) heap.min()).recuperaChave());
    }

    @Test
    public void testImprime() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(2);
        v[2] = new MeuItem(7);
        v[3] = new MeuItem(5);
        v[4] = new MeuItem(9);
        v[5] = new MeuItem(3);
        FPHeapMin heap = new FPHeapMin(v);
        heap.imprime();
        // manually verify the printed output
    }

    @Test
    public void testCopia() {
        Item[] v1 = new Item[6];
        v1[1] = new MeuItem(2);
        v1[2] = new MeuItem(7);
        v1[3] = new MeuItem(5);
        v1[4] = new MeuItem(9);
        v1[5] = new MeuItem(3);
        Item[] v2 = new Item[6];
        FPHeapMin heap = new FPHeapMin(v2);
        heap.copia(v1);
        assertEquals(5, heap.retiraMin().recuperaChave());
    }
}