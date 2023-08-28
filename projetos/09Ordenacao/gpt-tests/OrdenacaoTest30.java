package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest30{


    @Test
    public void testMergeSort() {
        int[] arr = {5, 2, 8, 3, 1};
        Ordenacao.mergeSort(arr, 0, arr.length - 1);
        int[] expected = {1, 2, 3, 5, 8};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortEmptyArray() {
        int[] arr = {};
        Ordenacao.mergeSort(arr, 0, arr.length - 1);
        int[] expected = {};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        Ordenacao.mergeSort(arr, 0, arr.length - 1);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        Ordenacao.mergeSort(arr, 0, arr.length - 1);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortDuplicateElements() {
        int[] arr = {5, 2, 8, 3, 1, 2, 5};
        Ordenacao.mergeSort(arr, 0, arr.length - 1);
        int[] expected = {1, 2, 2, 3, 5, 5, 8};
        assertArrayEquals(expected, arr);
    }
}