package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest21{


    @Test
    public void testMergeSort() {
        int[] arr = {5, 3, 8, 2, 1};
        Ordenacao.mergeSort(arr, 0, arr.length - 1);
        int[] expected = {1, 2, 3, 5, 8};
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
    public void testMergeSortWithSingleElement() {
        int[] arr = {5};
        Ordenacao.mergeSort(arr, 0, arr.length - 1);
        int[] expected = {5};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortWithSortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        Ordenacao.mergeSort(arr, 0, arr.length - 1);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortWithReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        Ordenacao.mergeSort(arr, 0, arr.length - 1);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arr);
    }
}