package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest21{


    @Test
    public void testOrdena() {
        int[] v = {5, 3, 8, 2, 1};
        int n = v.length;
        Ordenacao.ordena(v, n);
        int[] expected = {1, 2, 3, 5, 8};
        assertArrayEquals(expected, v);
    }

    @Test
    public void testOrdenaEmptyArray() {
        int[] v = {};
        int n = v.length;
        Ordenacao.ordena(v, n);
        int[] expected = {};
        assertArrayEquals(expected, v);
    }

    @Test
    public void testOrdenaAlreadySortedArray() {
        int[] v = {1, 2, 3, 4, 5};
        int n = v.length;
        Ordenacao.ordena(v, n);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, v);
    }

    @Test
    public void testOrdenaArrayWithDuplicates() {
        int[] v = {5, 3, 8, 2, 1, 3, 5};
        int n = v.length;
        Ordenacao.ordena(v, n);
        int[] expected = {1, 2, 3, 3, 5, 5, 8};
        assertArrayEquals(expected, v);
    }
}