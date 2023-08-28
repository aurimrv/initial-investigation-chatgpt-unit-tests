package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest12{


    @Test
    public void testMergeSort() {
        int[] arr = {5, 2, 4, 6, 1, 3};
        int[] expected = {1, 2, 3, 4, 5, 6};
        Ordenacao.mergeSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortWithEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        Ordenacao.mergeSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortWithSortedArray() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        Ordenacao.mergeSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortWithReverseSortedArray() {
        int[] arr = {6, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5, 6};
        Ordenacao.mergeSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortWithDuplicateValues() {
        int[] arr = {5, 2, 4, 6, 1, 3, 2, 5};
        int[] expected = {1, 2, 2, 3, 4, 5, 5, 6};
        Ordenacao.mergeSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }
}