
package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest5 {

    @Test
    public void testOrdena() {
        int[] v = {5, 3, 2, 4, 1};
        Ordenacao.ordena(v, v.length);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, v);
    }

    @Test
    public void testOrdenaEmptyArray() {
        int[] v = {};
        Ordenacao.ordena(v, v.length);
        int[] expected = {};
        assertArrayEquals(expected, v);
    }

    @Test
    public void testOrdenaAlreadySortedArray() {
        int[] v = {1, 2, 3, 4, 5};
        Ordenacao.ordena(v, v.length);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, v);
    }

    @Test
    public void testOrdenaArrayWithDuplicates() {
        int[] v = {5, 3, 2, 4, 1, 5, 2};
        Ordenacao.ordena(v, v.length);
        int[] expected = {1, 2, 2, 3, 4, 5, 5};
        assertArrayEquals(expected, v);
    }
}