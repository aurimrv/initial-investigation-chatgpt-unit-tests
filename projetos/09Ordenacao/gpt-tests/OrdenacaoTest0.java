
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest0 {
  
  @Test
  public void testMergeSort() {
    int[] input = {5, 3, 8, 1, 2};
    int[] expected = {1, 2, 3, 5, 8};
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
  public void testMergeSortWithOneElement() {
    int[] input = {10};
    int[] expected = {10};
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
  public void testMergeSortWithReverseSortedArray() {
    int[] input = {5, 4, 3, 2, 1};
    int[] expected = {1, 2, 3, 4, 5};
    Ordenacao.mergeSort(input, 0, input.length - 1);
    assertArrayEquals(expected, input);
  }
}
