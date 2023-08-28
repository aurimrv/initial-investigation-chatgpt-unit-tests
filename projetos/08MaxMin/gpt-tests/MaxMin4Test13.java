package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin4Test13{

  
  @Test
  public void testMaxMin4() {
    // Test case 1: lsup - linf <= 1
    int[] v1 = {1, 2};
    int linf1 = 0;
    int lsup1 = 1;
    int[] expected1 = {2, 1};
    assertArrayEquals(expected1, MaxMin4.maxMin4(v1, linf1, lsup1));
    
    // Test case 2: lsup - linf > 1
    int[] v2 = {4, 2, 6, 1, 5, 3};
    int linf2 = 0;
    int lsup2 = 5;
    int[] expected2 = {6, 1};
    assertArrayEquals(expected2, MaxMin4.maxMin4(v2, linf2, lsup2));
    
    // Test case 3: lsup - linf > 1 and all elements are equal
    int[] v3 = {3, 3, 3, 3, 3};
    int linf3 = 0;
    int lsup3 = 4;
    int[] expected3 = {3, 3};
    assertArrayEquals(expected3, MaxMin4.maxMin4(v3, linf3, lsup3));
    
    // Test case 4: lsup - linf > 1 and v[linf] > v[lsup]
    int[] v4 = {5, 4, 3, 2, 1};
    int linf4 = 0;
    int lsup4 = 4;
    int[] expected4 = {5, 1};
    assertArrayEquals(expected4, MaxMin4.maxMin4(v4, linf4, lsup4));
  }
}