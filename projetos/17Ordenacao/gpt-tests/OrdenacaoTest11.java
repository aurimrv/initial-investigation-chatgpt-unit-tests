
package ds;import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest11 {

    @Test
    public void testPermut_CharArray() {
        char[] v = {'a','b','c','d','e'};
        int n = v.length;
        char[] expected = {'a','e','c','b','d'};
        Ordenacao.permut(v, n);
        assertArrayEquals(expected, v);
    }

    @Test
    public void testPermut_IntArray() {
        int[] v = {1,2,3,4,5};
        int n = v.length;
        int[] expected = {1,5,3,2,4};
        Ordenacao.permut(v, n);
        assertArrayEquals(expected, v);
    }

    @Test
    public void testPermut_MeuItemArray() {
        MeuItem[] v = {new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(5)};
        int n = v.length;
        MeuItem[] expected = {new MeuItem(1), new MeuItem(5), new MeuItem(3), new MeuItem(2), new MeuItem(4)};
        Ordenacao.permut(v, n);
        assertArrayEquals(expected, v);
    }

    @Test
    public void testSelecao() {
        MeuItem[] v = {new MeuItem(5), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(1)};
        int n = v.length;
        MeuItem[] expected = {new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(5)};
        Ordenacao.selecao(v, n);
        assertArrayEquals(expected, v);
    }

    @Test
    public void testInsercao() {
        MeuItem[] v = {new MeuItem(5), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(1)};
        int n = v.length;
        MeuItem[] expected = {new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(5)};
        Ordenacao.insercao(v, n);
        assertArrayEquals(expected, v);
    }

    @Test
    public void testShellsort() {
        MeuItem[] v = {new MeuItem(5), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(1)};
        int n = v.length;
        MeuItem[] expected = {new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(5)};
        Ordenacao.shellsort(v, n);
        assertArrayEquals(expected, v);
    }

    @Test
    public void testQuicksort() {
        MeuItem[] v = {new MeuItem(5), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(1)};
        int n = v.length;
        MeuItem[] expected = {new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(5)};
        Ordenacao.quicksort(v, n);
        assertArrayEquals(expected, v);
    }

    @Test
    public void testHeapsort() {
        MeuItem[] v = {new MeuItem(5), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(1)};
        int n = v.length;
        MeuItem[] expected = {new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(5)};
        Ordenacao.heapsort(v, n);
        assertArrayEquals(expected, v);
    }
}