
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest4 {
  
  @Test
  public void testMergeSort() {
    int[] arr = {5, 2, 8, 10, 1};
    Ordenacao.mergeSort(arr, 0, arr.length - 1);
    int[] expected = {1, 2, 5, 8, 10};
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
  public void testMergeSortWithSingleElementArray() {
    int[] arr = {5};
    Ordenacao.mergeSort(arr, 0, arr.length - 1);
    int[] expected = {5};
    assertArrayEquals(expected, arr);
  }
}