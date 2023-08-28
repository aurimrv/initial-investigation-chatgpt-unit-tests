
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest1 {
  
  @Test
  public void testMergeSort() {
    int[] arr = {5, 2, 7, 1, 3};
    int[] expected = {1, 2, 3, 5, 7};
    Ordenacao.mergeSort(arr, 0, arr.length - 1);
    assertArrayEquals(expected, arr);
  }
  
  @Test
  public void testMergeSortWithEmptyArray() {
    int[] arr = {};
    int[] expected = {};
    Ordenacao.mergeSort(arr, 0, arr.length - 1);
    assertArrayEquals(expected, arr);
  }
  
  @Test
  public void testMergeSortWithSortedArray() {
    int[] arr = {1, 2, 3, 4, 5};
    int[] expected = {1, 2, 3, 4, 5};
    Ordenacao.mergeSort(arr, 0, arr.length - 1);
    assertArrayEquals(expected, arr);
  }
  
  @Test
  public void testMergeSortWithReverseSortedArray() {
    int[] arr = {5, 4, 3, 2, 1};
    int[] expected = {1, 2, 3, 4, 5};
    Ordenacao.mergeSort(arr, 0, arr.length - 1);
    assertArrayEquals(expected, arr);
  }
  
  @Test
  public void testMergeSortWithDuplicateElements() {
    int[] arr = {3, 1, 2, 2, 3};
    int[] expected = {1, 2, 2, 3, 3};
    Ordenacao.mergeSort(arr, 0, arr.length - 1);
    assertArrayEquals(expected, arr);
  }
}
