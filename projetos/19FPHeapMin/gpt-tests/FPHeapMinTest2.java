
package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class FPHeapMinTest2 {

    @Test
    public void testRefaz() {
        FPHeapMin heap = new FPHeapMin(5);
        Item[] items = new Item[6];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(4);
        items[5] = new MeuItem(2);
        heap.copia(items);
        heap.refaz(1, 5);
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test
    public void testConstroi() {
        FPHeapMin heap = new FPHeapMin(5);
        Item[] items = new Item[6];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(4);
        items[5] = new MeuItem(2);
        heap.copia(items);
        heap.constroi();
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test
    public void testRetiraMin() throws Exception {
        FPHeapMin heap = new FPHeapMin(5);
        Item[] items = new Item[6];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(4);
        items[5] = new MeuItem(2);
        heap.copia(items);
        Item min = heap.retiraMin();
        assertEquals(1, min.recuperaChave());
        assertEquals(2, heap.min().recuperaChave());
    }

    @Test
    public void testDiminuiChave() throws Exception {
        FPHeapMin heap = new FPHeapMin(5);
        Item[] items = new Item[6];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(4);
        items[5] = new MeuItem(2);
        heap.copia(items);
        heap.diminuiChave(4, 0);
        assertEquals(0, heap.min().recuperaChave());
    }

    @Test
    public void testInsere() throws Exception {
        FPHeapMin heap = new FPHeapMin(5);
        Item[] items = new Item[6];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(4);
        items[5] = new MeuItem(2);
        heap.copia(items);
        Item newItem = new MeuItem(0);
        heap.insere(newItem);
        assertEquals(0, heap.min().recuperaChave());
    }
}