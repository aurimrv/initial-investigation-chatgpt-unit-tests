
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest6 {
  
  @Test
  public void testMergeSortWithEmptyArray() {
    int[] arr = new int[]{};
    Ordenacao.mergeSort(arr, 0, arr.length - 1);
    assertArrayEquals(new int[]{}, arr);
  }
}