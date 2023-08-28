
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin4Test3 {
  
  @Test
  public void testMaxMin4() {
    // Test case 1: lsup - linf = 1
    int[] v1 = {5, 10};
    int linf1 = 0;
    int lsup1 = 1;
    int[] expected1 = {10, 5};
    int[] result1 = MaxMin4.maxMin4(v1, linf1, lsup1);
    assertArrayEquals(expected1, result1);
    
    // Test case 2: v[linf] < v[lsup]
    int[] v2 = {5, 10, 3};
    int linf2 = 0;
    int lsup2 = 2;
    int[] expected2 = {10, 3};
    int[] result2 = MaxMin4.maxMin4(v2, linf2, lsup2);
    assertArrayEquals(expected2, result2);
    
    // Test case 3: v[linf] > v[lsup]
    int[] v3 = {10, 5, 3};
    int linf3 = 0;
    int lsup3 = 2;
    int[] expected3 = {10, 3};
    int[] result3 = MaxMin4.maxMin4(v3, linf3, lsup3);
    assertArrayEquals(expected3, result3);
    
    // Test case 4: lsup - linf > 1
    int[] v4 = {5, 2, 10, 7, 3};
    int linf4 = 0;
    int lsup4 = 4;
    int[] expected4 = {10, 2};
    int[] result4 = MaxMin4.maxMin4(v4, linf4, lsup4);
    assertArrayEquals(expected4, result4);
  }
}
