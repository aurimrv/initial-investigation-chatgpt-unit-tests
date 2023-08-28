
package ds;import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ds.Ordenacao;

public class OrdenacaoTest10 {

  @Test
  public void testOrdena_EmptyArray() {
    int[] arr = {};
    Ordenacao.ordena(arr, arr.length);
    
    assertEquals(0, arr.length);
  }
  
  @Test
  public void testOrdena_SingleElementArray() {
    int[] arr = {5};
    Ordenacao.ordena(arr, arr.length);
    
    assertEquals(5, arr[0]);
  }
  
  @Test
  public void testOrdena_SortedArray() {
    int[] arr = {1, 2, 3, 4, 5};
    Ordenacao.ordena(arr, arr.length);
    
    assertEquals(1, arr[0]);
    assertEquals(2, arr[1]);
    assertEquals(3, arr[2]);
    assertEquals(4, arr[3]);
    assertEquals(5, arr[4]);
  }
  
  @Test
  public void testOrdena_ReversedArray() {
    int[] arr = {5, 4, 3, 2, 1};
    Ordenacao.ordena(arr, arr.length);
    
    assertEquals(1, arr[0]);
    assertEquals(2, arr[1]);
    assertEquals(3, arr[2]);
    assertEquals(4, arr[3]);
    assertEquals(5, arr[4]);
  }
  
  @Test
  public void testOrdena_UnsortedArray() {
    int[] arr = {3, 1, 4, 2, 5};
    Ordenacao.ordena(arr, arr.length);
    
    assertEquals(1, arr[0]);
    assertEquals(2, arr[1]);
    assertEquals(3, arr[2]);
    assertEquals(4, arr[3]);
    assertEquals(5, arr[4]);
  }
}