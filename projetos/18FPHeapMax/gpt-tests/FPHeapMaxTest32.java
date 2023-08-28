package ds;import ds.FPHeapMax;
import ds.MeuItem;
import org.junit.Test;
import static org.junit.Assert.*;

public class FPHeapMaxTest32{


    @Test
    public void testConstroi() {
        FPHeapMax heap = new FPHeapMax(20);
        MeuItem[] items = new MeuItem[7];
        items[1] = new MeuItem(20);
        items[2] = new MeuItem(15);
        items[3] = new MeuItem(18);
        items[4] = new MeuItem(10);
        items[5] = new MeuItem(12);
        items[6] = new MeuItem(9);
        heap.copia(items);
        heap.constroi();
        assertEquals(20, heap.max().recuperaChave());
    }

    @Test
    public void testInsere() throws Exception {
        FPHeapMax heap = new FPHeapMax(20);
        MeuItem[] items = new MeuItem[7];
        items[1] = new MeuItem(20);
        items[2] = new MeuItem(15);
        items[3] = new MeuItem(18);
        items[4] = new MeuItem(10);
        items[5] = new MeuItem(12);
        items[6] = new MeuItem(9);
        heap.copia(items