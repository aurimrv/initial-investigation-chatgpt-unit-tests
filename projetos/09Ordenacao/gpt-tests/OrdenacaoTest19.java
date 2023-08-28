package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest19{

  
  @Test
  public void testMergeSort() {
    int[] input = {5, 2, 8, 1, 9};
    int[] expectedOutput = {1, 2, 5, 8, 9};
    
    Ordenacao.mergeSort(input, 0, input.length - 1);
    
    assertArrayEquals(expectedOutput, input);
  }
  
  @Test
  public void testMergeSortEmptyArray() {
    int[] input = {};
    int[] expectedOutput = {};
    
    Ordenacao.mergeSort(input, 0, input.length - 1);
    
    assertArrayEquals(expectedOutput, input);
  }
  
  @Test
  public void testMergeSortAlreadySortedArray() {
    int[] input = {1, 2, 3, 4, 5};
    int[] expectedOutput = {1, 2, 3, 4, 5};
    
    Ordenacao.mergeSort(input, 0, input.length - 1);
    
    assertArrayEquals(expectedOutput, input);
  }
  
  @Test
  public void testMergeSortArrayWithDuplicates() {
    int[] input = {5, 2, 8, 1, 9, 2, 5};
    int[] expectedOutput = {1, 2, 2, 5, 5, 8, 9};
    
    Ordenacao.mergeSort(input, 0, input.length - 1);
    
    assertArrayEquals(expectedOutput, input);
  }
}