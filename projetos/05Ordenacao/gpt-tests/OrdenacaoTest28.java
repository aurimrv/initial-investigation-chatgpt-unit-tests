package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest28{


    @Test
    public void testOrdena() {
        int[] v = {5, 2, 8, 1, 9};
        int n = v.length;
        Ordenacao.ordena(v, n);
        int[] expected = {1, 2, 5, 8, 9};
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
        int[] v = {5, 2, 8, 1, 9, 2, 5};
        int n = v.length;
        Ordenacao.ordena(v, n);
        int[] expected = {1, 2, 2, 5, 5, 8, 9};
        assertArrayEquals(expected, v);
    }
}