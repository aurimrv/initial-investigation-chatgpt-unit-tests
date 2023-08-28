package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FPHeapMaxTest14{


    @Test
    public void testConstroi() {
        FPHeapMax A = new FPHeapMax(20);
        MeuItem V[] = new MeuItem[7];
        V[1] = new MeuItem(20);
        V[2] = new MeuItem(15);
        V[3] = new MeuItem(18);
        V[4] = new MeuItem(10);
        V[5] = new MeuItem(12);
        V[6] = new MeuItem(9);

        A.copia(V);
        A.constroi();
        MeuItem expected[] = new MeuItem[7];
        expected[1] = new MeuItem(20);
        expected[2] = new MeuItem(15);
        expected[3] = new MeuItem(18);
        expected[4] = new MeuItem(10);
        expected[5] = new MeuItem(12);
        expected[6] = new MeuItem(9);

        assertArrayEquals(expected, A.getV());
    }

    @Test
    public void testInsere() throws Exception {
        FPHeapMax A = new FPHeapMax(20);
        MeuItem V[] = new MeuItem[