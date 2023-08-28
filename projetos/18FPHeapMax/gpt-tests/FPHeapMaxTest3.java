
package ds;import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import ds.Item;
import ds.FPHeapMax;
import ds.MeuItem;

public class TestFPHeapMax {
    private FPHeapMax heap;

    @Before
    public void setup() {
        heap = new FPHeapMax(20);
    }

    @Test
    public void testConstroi() {
        MeuItem[] items = new MeuItem[21];
        for (int i = 1; i <= 20; i++) {
            items[i] = new MeuItem(i);
        }
        heap.copia(items);
        heap.constroi();
        assertEquals("20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1", heap.imprime());
    }

    @Test
    public void testInsere() throws Exception {
        MeuItem[] items = new MeuItem[21];
        for (int i = 1; i <= 20; i++) {
            items[i] = new MeuItem(i);
        }
        heap.insere(new MeuItem(13));
        assertEquals("13", heap.imprime());
    }

    @Test
    public void testMax() throws Exception {
        MeuItem[] items = new MeuItem[21];
        for (int i = 1