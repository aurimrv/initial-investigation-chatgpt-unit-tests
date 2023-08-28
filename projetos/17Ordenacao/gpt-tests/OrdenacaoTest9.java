
package ds;import org.junit.Before;
import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.*;

public class OrdenacaoTest9 {

    private Item[] v;
    private int tam;
    private int n;

    @Before
    public void setUp() {
        tam = 20;
        n = 20;
        v = new Item[tam + 1];
        for (int i = 1; i <= n; i++) {
            v[i] = new MeuItem(i);
        }
    }

    @Test
    public void testSelecao() {
        Ordenacao.selecao(v, n);
        for (int i = 1; i < n; i++) {
            assertTrue(v[i].compara(v[i + 1]) <= 0);
        }
    }

    @Test
    public void testInsercao() {
        Ordenacao.insercao(v, n);
        for (int i = 1; i < n; i++) {
            assertTrue(v[i].compara(v[i + 1]) <= 0);
        }
    }

    @Test
    public void testShellsort() {
        Ordenacao.shellsort(v, n);
        for (int i = 1; i < n; i++) {
            assertTrue(v[i].compara(v[i + 1]) <= 0);
        }
    }

    @Test
    public void testQuicksort() {
        Ordenacao.quicksort(v, n);
        for (int i = 1; i < n; i++) {
            assertTrue(v[i].compara(v[i + 1]) <= 0);
        }
    }

    @Test
    public void testHeapsort() {
        Ordenacao.heapsort(v, n);
        for (int i = 1; i < n; i++) {
            assertTrue(v[i].compara(v[i + 1]) <= 0);
        }
    }
}