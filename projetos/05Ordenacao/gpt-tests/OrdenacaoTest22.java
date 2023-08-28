package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest22{


    @Test
    public void testOrdena() {
        int[] v = {5, 3, 8, 1, 2};
        int[] expected = {1, 2, 3, 5, 8};
        Ordenacao.ordena(v, v.length);
        assertArrayEquals(expected, v);
    }

    @Test
    public void testOrdenaEmptyArray() {
        int[] v = {};
        int[] expected = {};
        Ordenacao.ordena(v, v.length);
        assertArrayEquals(expected, v);
    }

    @Test
    public void testOrdenaAlreadySortedArray() {
        int[] v = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        Ordenacao.ordena(v, v.length);
        assertArrayEquals(expected, v);
    }

    @Test
    public void testOrdenaArrayWithDuplicateValues() {
        int[] v = {5, 3, 8, 1, 2, 5, 3};
        int[] expected = {1, 2, 3, 3, 5, 5, 8};
        Ordenacao.ordena(v, v.length);
        assertArrayEquals(expected, v);
    }

    @Test
    public void testOrdenaArrayWithNegativeValues() {
        int[] v = {-5, 3, -8, 1, 2};
        int[] expected = {-8, -5, 1, 2, 3};
        Ordenacao.ordena(v, v.length);
        assertArrayEquals(expected, v);
    }
}