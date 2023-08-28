package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FPHeapMaxTest29{


    @Test
    public void testCopia() {
        FPHeapMax A = new FPHeapMax(20);
        MeuItem[] V = new MeuItem[8];
        V[1] = new MeuItem(20);
        V[2] = new MeuItem(15);
        V[3] = new MeuItem(18);
        V[4] = new MeuItem(10);
        V[5] = new MeuItem(12);
        V[6] = new MeuItem(9);
        V[7] = new MeuItem(13);
        A.copia(V);
        assertEquals(7, A.max().recuperaChave());
    }

    @Test
    public void testConstroi() {
        FPHeapMax A = new FPHeapMax(20);
        MeuItem[] V = new MeuItem[8];
        V[1] = new MeuItem(20);
        V[2] = new MeuItem(15);
        V[3] = new MeuItem(18);
        V[4] = new MeuItem(10);
        V[5] = new MeuItem(12);
        V[6] = new MeuItem(9);
        V