
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest9 {
    
    @Test
    public void testMergeSort() {
        int[] array = {5, 2, 7, 1, 3};
        Ordenacao.mergeSort(array, 0, array.length - 1);
        int[] expected = {1, 2, 3, 5, 7};
        assertArrayEquals(expected, array);
    }
    
    @Test
    public void testMergeSortWithEmptyArray() {
        int[] array = {};
        Ordenacao.mergeSort(array, 0, array.length - 1);
        int[] expected = {};
        assertArrayEquals(expected, array);
    }
    
    @Test
    public void testMergeSortWithAlreadySortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        Ordenacao.mergeSort(array, 0, array.length - 1);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, array);
    }
    
    @Test
    public void testMergeSortWithArrayOfSingleElement() {
        int[] array = {5};
        Ordenacao.mergeSort(array, 0, array.length - 1);
        int[] expected = {5};
        assertArrayEquals(expected, array);
    }
    
    @Test
    public void testMergeSortWithNegativeNumbers() {
        int[] array = {5, -2, 7, -1, 3};
        Ordenacao.mergeSort(array, 0, array.length - 1);
        int[] expected = {-2, -1, 3, 5, 7};
        assertArrayEquals(expected, array);
    }
}