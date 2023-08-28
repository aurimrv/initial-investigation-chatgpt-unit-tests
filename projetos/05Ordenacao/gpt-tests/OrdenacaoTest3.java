
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest3 {

    @Test
    public void testOrdenaWithEmptyArray() {
        int[] v = {};
        Ordenacao.ordena(v, 0);
        assertEquals(0, v.length);
    }

    @Test
    public void testOrdenaWithSortedArray() {
        int[] v = {1, 2, 3, 4, 5};
        Ordenacao.ordena(v, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, v);
    }

    @Test
    public void testOrdenaWithReverseSortedArray() {
        int[] v = {5, 4, 3, 2, 1};
        Ordenacao.ordena(v, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, v);
    }

    @Test
    public void testOrdenaWithRandomArray() {
        int[] v = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        Ordenacao.ordena(v, 9);
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 5, 5, 6, 9}, v);
    }
}