
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest5 {
  
  @Test
  public void testMergeSortWithEmptyArray() {
    int[] arr = {};
    Ordenacao.mergeSort(arr, 0, arr.length - 1);
    assertArrayEquals(new int[]{}, arr);
  }
  
  @Test
  public void testMergeSortWithSingleElement() {
    int[] arr = {5};
    Ordenacao.mergeSort(arr, 0, arr.length - 1);
    assertArrayEquals(new int[]{5}, arr);
  }
  
  @Test
  public void testMergeSortWithSortedArray() {
    int[] arr = {1, 2, 3, 4, 5};
    Ordenacao.mergeSort(arr, 0, arr.length - 1);
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
  }
  
  @Test
  public void testMergeSortWithReverseSortedArray() {
    int[] arr = {5, 4, 3, 2, 1};
    Ordenacao.mergeSort(arr, 0, arr.length - 1);
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
  }
  
  @Test
  public void testMergeSortWithUnsortedArray() {
    int[] arr = {4, 2, 5, 1, 3};
    Ordenacao.mergeSort(arr, 0, arr.length - 1);
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
  }
}