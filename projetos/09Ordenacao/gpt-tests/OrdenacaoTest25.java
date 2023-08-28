package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest25{


    @Test
    public void testMergeSort() {
        int[] input = {5, 2, 9, 1, 7};
        int[] expected = {1, 2, 5, 7, 9};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSortEmptyArray() {
        int[] input = {};
        int[] expected = {};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSortAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSortReverseSortedArray() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }
}