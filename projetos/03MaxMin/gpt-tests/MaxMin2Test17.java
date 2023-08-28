package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.MaxMin2;

public class MaxMin2Test17{


  @Test
  public void testMaxMin2() {
    // Test case 1: v[] contains positive integers
    int[] v1 = {1, 2, 3, 4, 5};
    int n1 = 5;
    int[] expected1 = {5, 1};
    assertArrayEquals(expected1, MaxMin2.maxMin2(v1, n1));

    // Test case 2: v[] contains negative integers
    int[] v2 = {-5, -4, -3, -2, -1};
    int n2 = 5;
    int[] expected2 = {-1, -5};
    assertArrayEquals(expected2, MaxMin2.maxMin2(v2, n2));

    // Test case 3: v[] contains both positive and negative integers
    int[] v3 = {-5, 2, -3, 4, -1};
    int n3 = 5;
    int[] expected3 = {4, -5};
    assertArrayEquals(expected3, MaxMin2.maxMin2(v3, n3));

    // Test case 4: v[] contains duplicate integers
    int[] v4 = {1, 2, 3, 4, 4};
    int n4 = 5;
    int[] expected4 = {4, 1};
    assertArrayEquals(expected4, MaxMin2.maxMin2(v4, n4));

    // Test case 5: v[] contains only one element
    int[] v5 = {5};
    int n5 = 1;
    int[] expected5 = {5, 5};
    assertArrayEquals(expected5, MaxMin2.maxMin2(v5, n5));
  }
}