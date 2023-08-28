package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest29{


    @Test
    public void testMergeSort() {
        int[] input = {5, 2, 8, 3, 1};
        int[] expected = {1, 2, 3, 5, 8};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSortWithEmptyArray() {
        int[] input = {};
        int[] expected = {};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSortWithAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSortWithArrayOfSizeOne() {
        int[] input = {5};
        int[] expected = {5};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSortWithNegativeNumbers() {
        int[] input = {-5, -2, -8, -3, -1};
        int[] expected = {-8, -5, -3, -2, -1};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }
}