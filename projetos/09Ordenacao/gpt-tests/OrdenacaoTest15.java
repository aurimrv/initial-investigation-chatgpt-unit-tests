package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest15{


    @Test
    public void testMergeSort() {
        int[] input = {5, 2, 8, 1, 9};
        int[] expected = {1, 2, 5, 8, 9};
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
    public void testMergeSortWithSingleElementArray() {
        int[] input = {5};
        int[] expected = {5};
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
    public void testMergeSortWithDescendingArray() {
        int[] input = {9, 8, 7, 6, 5};
        int[] expected = {5, 6, 7, 8, 9};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }
}