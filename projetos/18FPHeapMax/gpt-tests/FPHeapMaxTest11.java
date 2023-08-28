
package ds;import ds.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestFPHeapMax {

    @Test
    public void testRefaz() {
        FPHeapMax heap = new FPHeapMax(4);
        Item[] v = new Item[5];
        v[1] = new MeuItem(10);
        v[2] = new MeuItem(8);
        v[3] = new MeuItem(12);
        v[4] = new MeuItem(6);
        heap.copia(v);
        heap.refaz(1, 4);
        assertEquals(12, heap.max().recuperaChave());
    }

    @Test
    public void testConstroi() {
        FPHeapMax heap = new FPHeapMax(4);
        Item[] v = new Item[5];
        v[1] = new MeuItem(10);
        v[2] = new MeuItem(8);
        v[3] = new MeuItem(12);
        v[4] = new MeuItem(6);
        heap.copia(v);
        heap.constroi();
        assertEquals(12, heap.max().recuperaChave());
    }

    @Test
    public void testInsere() {
        FPHeapMax heap = new FPHeapMax(4);
        Item[] v = new Item[5];
        v[1] = new MeuItem(10