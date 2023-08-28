
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest2 {
    
    @Test
    public void testMergeSort() {
        int[] arr = {5, 2, 8, 3, 1};
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
    public void testMergeSortWithAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        Ordenacao.mergeSort(arr, 0, arr.length - 1);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arr);
    }
    
    @Test
    public void testMergeSortWithArrayContainingDuplicates() {
        int[] arr = {3, 2, 1, 3, 2};
        Ordenacao.mergeSort(arr, 0, arr.length - 1);
        int[] expected = {1, 2, 2, 3, 3};
        assertArrayEquals(expected, arr);
    }
}