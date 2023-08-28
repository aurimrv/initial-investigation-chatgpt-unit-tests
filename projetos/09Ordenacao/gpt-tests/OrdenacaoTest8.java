
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest8 {

    @Test
    public void testMergeSort() {
        int[] arr = {4, 1, 3, 2};
        Ordenacao.mergeSort(arr, 0, arr.length - 1);
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortWithEmptyArray() {
        int[] arr = {};
        Ordenacao.mergeSort(arr, 0, arr.length - 1);
        int[] expected = {};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortWithSortedArray() {
        int[] arr = {1, 2, 3, 4};
        Ordenacao.mergeSort(arr, 0, arr.length - 1);
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortWithDuplicateValues() {
        int[] arr = {4, 3, 2, 2, 1};
        Ordenacao.mergeSort(arr, 0, arr.length - 1);
        int[] expected = {1, 2, 2, 3, 4};
        assertArrayEquals(expected, arr);
    }
}