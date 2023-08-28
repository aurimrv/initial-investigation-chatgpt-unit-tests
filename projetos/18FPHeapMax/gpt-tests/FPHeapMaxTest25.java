package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FPHeapMaxTest25{


    @Test
    public void testCopia() {
        FPHeapMax A = new FPHeapMax(20);
        MeuItem[] V = new MeuItem[8];
        for (int i = 1; i <= 7; i++) {
            V[i] = new MeuItem(i);
        }
        A.copia(V);
        assertEquals(7, A.max().recuperaChave());
    }

    @Test
    public void testConstroi() {
        FPHeapMax A = new FPHeapMax(20);
        MeuItem[] V = new MeuItem[8];
        for (int i = 1; i <= 7; i++) {
            V[i] = new MeuItem(i);
        }
        A.copia(V);
        A.constroi();
        assertEquals(7, A.max().recuperaChave());
    }

    @Test
    public void testInsere() {
        FPHeapMax A = new FPHeapMax(20);
        MeuItem[] V = new MeuItem[8];
        for (int i = 1; i <= 7; i++) {
            V[i] = new MeuItem(i);
        }
        A.copia(V);
        MeuItem x = new Meu