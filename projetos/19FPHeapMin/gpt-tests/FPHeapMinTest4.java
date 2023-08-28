
package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.FPHeapMin;
import ds.Item;
import ds.MeuItem;
import ds.OrdenacaoParcial;

public class FPHeapMinTest4 {

    @Test
    public void testRefaz() {
        FPHeapMin heap = new FPHeapMin(5);
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(2);
        heap.copia(v);
        heap.refaz(1, 5);
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test
    public void testConstroi() {
        FPHeapMin heap = new FPHeapMin(5);
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(2);
        heap.copia(v);
        heap.constroi();
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test
    public void testRetiraMin() throws Exception {
        FPHeapMin heap = new FPHeapMin(5);
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(2);
        heap.copia(v);
        Item min = heap.retiraMin();
        assertEquals(1, min.recuperaChave());
    }

    @Test
    public void testDiminuiChave() throws Exception {
        FPHeapMin heap = new FPHeapMin(5);
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(2);
        heap.copia(v);
        heap.diminuiChave(3, 0);
        assertEquals(0, heap.min().recuperaChave());
    }

    @Test
    public void testInsere() throws Exception {
        FPHeapMin heap = new FPHeapMin(5);
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(2);
        heap.copia(v);
        heap.insere(new MeuItem(0));
        assertEquals(0, heap.min().recuperaChave());
    }

}
