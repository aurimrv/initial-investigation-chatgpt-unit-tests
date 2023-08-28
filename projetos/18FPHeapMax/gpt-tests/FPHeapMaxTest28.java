package ds;import ds.FPHeapMax;
import ds.MeuItem;
import org.junit.Test;
import static org.junit.Assert.*;

public class FPHeapMaxTest28{


    @Test
    public void testConstroi() {
        FPHeapMax heap = new FPHeapMax(20);
        MeuItem[] V = new MeuItem[8];
        V[1] = new MeuItem(20);
        V[2] = new MeuItem(15);
        V[3] = new MeuItem(18);
        V[4] = new MeuItem(10);
        V[5] = new MeuItem(12);
        V[6] = new MeuItem(9);
        V[7] = new MeuItem(13);
        heap.copia(V);
        heap.constroi();
        assertEquals(20, heap.max().recuperaChave());
    }

    @Test
    public void testInsere() {
        FPHeapMax heap = new FPHeapMax(20);
        MeuItem[] V = new MeuItem[8];
        V[1] = new MeuItem(20);
        V[2] = new MeuItem(15);
        V[3] = new MeuItem(18);
        V[4] = new MeuItem(10);
        V[5] = new MeuItem(12);
        V[6] = new