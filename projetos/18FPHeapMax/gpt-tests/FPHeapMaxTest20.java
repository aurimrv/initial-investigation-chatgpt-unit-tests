package ds;import ds.FPHeapMax;
import ds.MeuItem;
import org.junit.Test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import static org.junit.Assert.assertEquals;

public class FPHeapMaxTest20{


    @Test
    public void testCopia() {
        FPHeapMax A = new FPHeapMax(20);
        MeuItem[] V = new MeuItem[7];
        V[1] = new MeuItem(20);
        V[2] = new MeuItem(15);
        V[3] = new MeuItem(18);
        V[4] = new MeuItem(10);
        V[5] = new MeuItem(12);
        V[6] = new MeuItem(9);
        A.copia(V);
        assertEquals(V[1], A.max());
        assertEquals(V[2], A.retiraMax());
    }

    @Test
    public void testConstroi() {
        FPHeapMax A = new FPHeapMax(20);
        MeuItem[] V = new MeuItem[7];
        V[1] = new MeuItem(20);
        V[2] = new MeuItem(15);
        V[3] = new MeuItem(18);
        V[4] = new MeuItem(10);
        V[5] = new MeuItem(12);
        V[6] = new