
package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin4Test8 {
  
  @Test
  public void testMaxMin4() {
    // Test case 1: lsup - linf <= 1
    int[] v1 = {1, 2};
    int linf1 = 0;
    int lsup1 = 1;
    int[] result1 = MaxMin4.maxMin4(v1, linf1, lsup1);
    int[] expected1 = {2, 1};
    assertArrayEquals(expected1, result1);
    
    // Test case 2: max1 > max2, min1 < min2
    int[] v2 = {4, 2, 6, 1, 3};
    int linf2 = 0;
    int lsup2 = 4;
    int[] result2 = MaxMin4.maxMin4(v2, linf2, lsup2);
    int[] expected2 = {6, 1};
    assertArrayEquals(expected2, result2);
    
    // Test case 3: max1 < max2, min1 > min2
    int[] v3 = {5, 3, 7, 2, 4, 6};
    int linf3 = 0;
    int lsup3 = 5;
    int[] result3 = MaxMin4.maxMin4(v3, linf3, lsup3);
    int[] expected3 = {7, 2};
    assertArrayEquals(expected3, result3);
  }
}