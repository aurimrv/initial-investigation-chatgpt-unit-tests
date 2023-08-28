
package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest0 {

    @Test
    public void testOrdena() {
        int[] v = {5, 2, 7, 1, 3};
        int[] expected = {1, 2, 3, 5, 7};
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
        int[] v = {5, 2, 7, 1, 3, 2};
        int[] expected = {1, 2, 2, 3, 5, 7};
        Ordenacao.ordena(v, v.length);
        assertArrayEquals(expected, v);
    }

    @Test
    public void testOrdenaArrayWithNegativeNumbers() {
        int[] v = {5, -2, 7, 1, -3};
        int[] expected = {-3, -2, 1, 5, 7};
        Ordenacao.ordena(v, v.length);
        assertArrayEquals(expected, v);
    }
}