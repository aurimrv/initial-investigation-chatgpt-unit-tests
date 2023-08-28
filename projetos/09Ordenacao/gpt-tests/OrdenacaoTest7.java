
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest7 {

    @Test
    public void testMergeSort() {
        int[] input = {5, 2, 7, 1, 3};
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
    public void testMergeSortWithSortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        
        Ordenacao.mergeSort(input, 0, input.length - 1);
        
        assertArrayEquals(expected, input);
    }
    
    @Test
    public void testMergeSortWithReversedArray() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        
        Ordenacao.mergeSort(input, 0, input.length - 1);
        
        assertArrayEquals(expected, input);
    }
}