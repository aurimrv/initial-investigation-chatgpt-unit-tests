package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest17{


    @Test
    public void testMergeSort() {
        int[] input = {5, 2, 9, 1, 7};
        int[] expectedOutput = {1, 2, 5, 7, 9};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testMergeSortWithEmptyArray() {
        int[] input = {};
        int[] expectedOutput = {};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testMergeSortWithSortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expectedOutput = {1, 2, 3, 4, 5};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testMergeSortWithReverseSortedArray() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expectedOutput = {1, 2, 3, 4, 5};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testMergeSortWithDuplicateElements() {
        int[] input = {5, 2, 9, 1, 7, 2, 5};
        int[] expectedOutput = {1, 2, 2, 5, 5, 7, 9};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expectedOutput, input);
    }
}