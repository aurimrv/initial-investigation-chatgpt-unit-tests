package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest31{


    @Test
    public void testOrdena() {
        int[] v = {5, 2, 8, 1, 9};
        int[] expected = {1, 2, 5, 8, 9};
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
    public void testOrdenaArrayWithDuplicates() {
        int[] v = {5, 2, 8, 1, 9, 2, 5};
        int[] expected = {1, 2, 2, 5, 5, 8, 9};
        Ordenacao.ordena(v, v.length);
        assertArrayEquals(expected, v);
    }

    @Test
    public void testOrdenaArrayWithNegativeNumbers() {
        int[] v = {5, -2, 8, -1, 9};
        int[] expected = {-2, -1, 5, 8, 9};
        Ordenacao.ordena(v, v.length);
        assertArrayEquals(expected, v);
    }
}