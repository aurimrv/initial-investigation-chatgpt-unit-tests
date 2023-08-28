package ds;import ds.FPHeapMax;
import ds.MeuItem;
import org.junit.Test;
import static org.junit.Assert.*;

public class FPHeapMaxTest23{


    @Test
    public void testCopia() {
        FPHeapMax heap = new FPHeapMax(20);
        MeuItem[] V = new MeuItem[8];
        for (int i = 1; i <= 7; i++) {
            V[i] = new MeuItem(i);
        }
        heap.copia(V);
        assertEquals(7, heap.max().recuperaChave());
    }

    @Test
    public void testConstroi() {
        FPHeapMax heap = new FPHeapMax(20);
        MeuItem[] V = new MeuItem[8];
        for (int i = 1; i <= 7; i++) {
            V[i] = new MeuItem(i);
        }
        heap.copia(V);
        heap.constroi();
        assertEquals(7, heap.max().recuperaChave());
    }

    @Test
    public void testInsere() throws Exception {
        FPHeapMax heap = new FPHeapMax(20);
        MeuItem[] V = new MeuItem[8];
        for (int i = 1; i <= 7; i++) {
            V[i] = new MeuItem(i);
        }
        heap.copia(V);
        heap.constroi