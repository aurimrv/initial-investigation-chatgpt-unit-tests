
package ds;
import ds.Ordenacao;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest6 {

    @Test
    public void testOrdenaWithEmptyArray() {
        int[] v = new int[0];
        Ordenacao.ordena(v, 0);
        assertArrayEquals(new int[0], v);
    }

    @Test
    public void testOrdenaWithSingleElement() {
        int[] v = {5};
        Ordenacao.ordena(v, 1);
        assertArrayEquals(new int[]{5}, v);
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


These test cases cover various scenarios including empty array, array with a single element, already sorted array, reverse sorted array, and a random array.