package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin1Test14{

  
  @Test
  public void testMaxMin1() {
    // Test case 1: v = [1, 2, 3, 4, 5], n = 5
    int[] v1 = {1, 2, 3, 4, 5};
    int n1 = 5;
    int[] expected1 = {5, 1};
    assertArrayEquals(expected1, MaxMin1.maxMin1(v1, n1));
    
    // Test case 2: v = [5, 4, 3, 2, 1], n = 5
    int[] v2 = {5, 4, 3, 2, 1};
    int n2 = 5;
    int[] expected2 = {5, 1};
    assertArrayEquals(expected2, MaxMin1.maxMin1(v2, n2));
    
    // Test case 3: v = [1, 1, 1, 1, 1], n = 5
    int[] v3 = {1, 1, 1, 1, 1};
    int n3 = 5;
    int[] expected3 = {1, 1};
    assertArrayEquals(expected3, MaxMin1.maxMin1(v3, n3));
    
    // Test case 4: v = [10, 20, 30, 40, 50], n = 5
    int[] v4 = {10, 20, 30, 40, 50};
    int n4 = 5;
    int[] expected4 = {50, 10};
    assertArrayEquals(expected4, MaxMin1.maxMin1(v4, n4));
    
    // Test case 5: v = [5], n = 1
    int[] v5 = {5};
    int n5 = 1;
    int[] expected5 = {5, 5};
    assertArrayEquals(expected5, MaxMin1.maxMin1(v5, n5));
  }
}