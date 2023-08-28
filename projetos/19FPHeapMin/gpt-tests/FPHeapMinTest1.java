
package ds;import static org.junit.Assert.*;
import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;

import ds.FPHeapMin;
import ds.Item;
import ds.MeuItem;
import ds.OrdenacaoParcial;

public class FPHeapMinTest1 {

    @Test
    public void testRefaz() {
        Item[] v = {null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(1)};
        FPHeapMin heap = new FPHeapMin(v);
        heap.refaz(1, 4);
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test
    public void testConstroi() {
        Item[] v = {null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(1)};
        FPHeapMin heap = new FPHeapMin(v);
        heap.constroi();
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test
    public void testRetiraMin() throws Exception {
        Item[] v = {null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(1)};
        FPHeapMin heap = new FPHeapMin(v);
        Item min = heap.retiraMin();
        assertEquals(1, min.recuperaChave());
    }

    @Test
    public void testDiminuiChave() throws Exception {
        Item[] v = {null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(1)};
        FPHeapMin heap = new FPHeapMin(v);
        heap.diminuiChave(3, 2);
        assertEquals(2, heap.min().recuperaChave());
    }

    @Test
    public void testInsere() throws Exception {
        Item[] v = {null, new MeuItem(5), new MeuItem(3), new MeuItem(8)};
        FPHeapMin heap = new FPHeapMin(v);
        heap.insere(new MeuItem(1));
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test
    public void testImprime() {
        Item[] v = {null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(1)};
        FPHeapMin heap = new FPHeapMin(v);
        heap.imprime();
    }

    @Test
    public void testCopia() {
        Item[] v1 = {null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(1)};
        Item[] v2 = new Item[6];
        v2[0] = null;
        FPHeapMin heap1 = new FPHeapMin(v1);
        heap1.copia(v2);
        FPHeapMin heap2 = new FPHeapMin(v2);
        assertEquals(1, heap2.min().recuperaChave());
    }
}
