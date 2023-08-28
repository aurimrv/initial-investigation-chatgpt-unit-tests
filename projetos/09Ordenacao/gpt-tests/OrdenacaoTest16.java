package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest16{


    @Test
    public void testMergeSort() {
        int[] input = {5, 2, 8, 3, 1};
        int[] expected = {1, 2, 3, 5, 8};
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
    public void testMergeSortArrayWithDuplicates() {
        int[] input = {5, 2, 8, 3, 1, 5};
        int[] expected = {1, 2, 3, 5, 5, 8};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }
}