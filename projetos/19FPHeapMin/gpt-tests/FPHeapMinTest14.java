package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;

public class FPHeapMinTest14{


    @Test
    public void testRefaz() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(9);

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
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(9);

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
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(9);

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
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(9);

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
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(9);

        FPHeapMin heap = new FPHeapMin(v);
        heap.insere(new MeuItem(2));

        assertEquals(1, heap.min().recuperaChave());
    }

    @Test
    public void testImprime() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(9);

        FPHeapMin heap = new FPHeapMin(v);
        heap.imprime();
    }

    @Test
    public void testCopia() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(9);

        FPHeapMin heap = new FPHeapMin(10);
        heap.copia(v);

        assertEquals(5, heap.min().recuperaChave());
    }
}