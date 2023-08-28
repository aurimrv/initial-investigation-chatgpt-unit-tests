package ds;import ds.Ordenacao;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest14{


    @Test
    public void testMergeSort() {
        int[] input = {5, 2, 7, 3, 1};
        int[] expected = {1, 2, 3, 5, 7};
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
    public void testMergeSortWithSingleElement() {
        int[] input = {5};
        int[] expected = {5};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSortWithDuplicateElements() {
        int[] input = {5, 2, 7, 3, 1, 2, 5};
        int[] expected = {1, 2, 2, 3, 5, 5, 7};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }
}