
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin4Test9 {
  
  @Test
  public void testMaxMin4() {
    int v1[] = {3, 2, 5, 1};
    int[] result1 = MaxMin4.maxMin4(v1, 0, v1.length-1);
    assertEquals(5, result1[0]);
    assertEquals(1, result1[1]);
    
    int v2[] = {7, 4, 9, 2, 6, 1, 8, 3};
    int[] result2 = MaxMin4.maxMin4(v2, 0, v2.length-1);
    assertEquals(9, result2[0]);
    assertEquals(1, result2[1]);
    
    int v3[] = {2};
    int[] result3 = MaxMin4.maxMin4(v3, 0, v3.length-1);
    assertEquals(2, result3[0]);
    assertEquals(2, result3[1]);
    
    int v4[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    int[] result4 = MaxMin4.maxMin4(v4, 0, v4.length-1);
    assertEquals(9, result4[0]);
    assertEquals(1, result4[1]);
  }
  
}
