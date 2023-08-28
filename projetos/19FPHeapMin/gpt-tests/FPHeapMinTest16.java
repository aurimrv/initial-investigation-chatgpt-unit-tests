package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FPHeapMinTest16{


    @Test
    public void testRefaz() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(3);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(5);
        FPHeapMin heap = new FPHeapMin(v);
        heap.refaz(1, 5);
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test
    public void testConstroi() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(3);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(5);
        FPHeapMin heap = new FPHeapMin(v);
        heap.constroi();
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test
    public void testRetiraMin() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(3);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(5);
        FPHeapMin heap = new FPHeapMin(v);
        Item min = heap.retiraMin();
        assertEquals(1, min.recuperaChave());
    }

    @Test
    public void testDiminuiChave() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(3);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(5);
        FPHeapMin heap = new FPHeapMin(v);
        heap.diminuiChave(5, 0);
        assertEquals(0, heap.min().recuperaChave());
    }

    @Test
    public void testInsere() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(3);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(5);
        FPHeapMin heap = new FPHeapMin(v);
        Item newItem = new MeuItem(0);
        heap.insere(newItem);
        assertEquals(0, heap.min().recuperaChave());
    }

    @Test
    public void testImprime() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(3);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(5);
        FPHeapMin heap = new FPHeapMin(v);
        heap.imprime();
    }

    @Test
    public void testCopia() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(3);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(5);
        FPHeapMin heap = new FPHeapMin(v);
        Item[] copy = new Item[6];
        heap.copia(copy);
        for (int i = 1; i < v.length; i++) {
            assertEquals(v[i].recuperaChave(), copy[i].recuperaChave());
        }
    }

}