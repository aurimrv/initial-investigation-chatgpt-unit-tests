
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest10 {
  
  @Test
  public void testMergeSort_emptyArray() {
    int[] arr = {};
    Ordenacao.mergeSort(arr, 0, 0);
    assertArrayEquals(new int[]{}, arr);
  }
  
  @Test
  public void testMergeSort_singleElementArray() {
    int[] arr = {5};
    Ordenacao.mergeSort(arr, 0, 0);
    assertArrayEquals(new int[]{5}, arr);
  }
  
  @Test
  public void testMergeSort_sortedArray() {
    int[] arr = {1, 2, 3, 4, 5};
    Ordenacao.mergeSort(arr, 0, arr.length - 1);
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
  }
  
  @Test
  public void testMergeSort_reverseArray() {
    int[] arr = {5, 4, 3, 2, 1};
    Ordenacao.mergeSort(arr, 0, arr.length - 1);
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
  }
  
  @Test
  public void testMergeSort_randomArray() {
    int[] arr = {4, 2, 5, 1, 3};
    Ordenacao.mergeSort(arr, 0, arr.length - 1);
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
  }
}