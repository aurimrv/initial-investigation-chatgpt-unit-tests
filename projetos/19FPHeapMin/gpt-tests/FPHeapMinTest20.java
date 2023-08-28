package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FPHeapMinTest20{


    @Test
    public void testRefaz() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(7);
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
        v[3] = new MeuItem(7);
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
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(5);
        FPHeapMin heap = new FPHeapMin(v);
        Item min = heap.retiraMin();
        assertEquals(1, min.recuperaChave());
        assertEquals(2, heap.min().recuperaChave());
    }

    @Test
    public void testDiminuiChave() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(5);
        FPHeapMin heap = new FPHeapMin(v);
        heap.diminuiChave(3, 3);
        assertEquals(3, heap.min().recuperaChave());
    }

    @Test
    public void testInsere() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(5);
        FPHeapMin heap = new FPHeapMin(v);
        heap.insere(new MeuItem(3));
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test
    public void testImprime() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(7);
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
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(5);
        FPHeapMin heap = new FPHeapMin(v);
        Item[] v2 = new Item[6];
        heap.copia(v2);
        assertEquals(4, v2[1].recuperaChave());
        assertEquals(2, v2[2].recuperaChave());
        assertEquals(7, v2[3].recuperaChave());
        assertEquals(1, v2[4].recuperaChave());
        assertEquals(5, v2[5].recuperaChave());
    }
}