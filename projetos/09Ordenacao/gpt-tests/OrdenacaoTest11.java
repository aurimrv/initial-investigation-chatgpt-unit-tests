
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest11 {
    @Test
    public void testMergeSort() {
        int[] arr = {5, 2, 7, 1, 6};
        Ordenacao.mergeSort(arr, 0, arr.length-1);
        int[] expected = {1, 2, 5, 6, 7};
        assertArrayEquals(expected, arr);
    }
    
    @Test
    public void testMergeSortWithEmptyArray() {
        int[] arr = {};
        Ordenacao.mergeSort(arr, 0, arr.length-1);
        int[] expected = {};
        assertArrayEquals(expected, arr);
    }
    
    @Test
    public void testMergeSortWithSingleElementArray() {
        int[] arr = {1};
        Ordenacao.mergeSort(arr, 0, arr.length-1);
        int[] expected = {1};
        assertArrayEquals(expected, arr);
    }
    
    @Test
    public void testMergeSortWithNegativeNumbers() {
        int[] arr = {5, -2, 7, -1, 6};
        Ordenacao.mergeSort(arr, 0, arr.length-1);
        int[] expected = {-2, -1, 5, 6, 7};
        assertArrayEquals(expected, arr);
    }
}