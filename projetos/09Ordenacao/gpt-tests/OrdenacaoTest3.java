
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest3 {

    @Test
    public void testMergeSortEmptyArray() {
        int[] arr = {};
        Ordenacao.mergeSort(arr, 0, arr.length-1);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void testMergeSortSingleElementArray() {
        int[] arr = {5};
        Ordenacao.mergeSort(arr, 0, arr.length-1);
        assertArrayEquals(new int[]{5}, arr);
    }

    @Test
    public void testMergeSortSortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        Ordenacao.mergeSort(arr, 0, arr.length-1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testMergeSortReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        Ordenacao.mergeSort(arr, 0, arr.length-1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testMergeSortUnsortedArray() {
        int[] arr = {3, 1, 4, 2, 5};
        Ordenacao.mergeSort(arr, 0, arr.length-1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }
}
