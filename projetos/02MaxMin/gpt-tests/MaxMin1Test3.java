
package ds;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MaxMin1Test3 {
  
  @Test
  public void testMaxMin1() {
    // Test case 1: Array with positive integers
    int[] arr1 = {5, 3, 8, 2, 9};
    int[] expected1 = {9, 2};
    assertEquals(expected1, MaxMin1.maxMin1(arr1, arr1.length));
    
    // Test case 2: Array with negative integers
    int[] arr2 = {-9, -2, -5, -3, -8};
    int[] expected2 = {-2, -9};
    assertEquals(expected2, MaxMin1.maxMin1(arr2, arr2.length));
    
    // Test case 3: Array with both positive and negative integers
    int[] arr3 = {10, -5, 3, -2, 7};
    int[] expected3 = {10, -5};
    assertEquals(expected3, MaxMin1.maxMin1(arr3, arr3.length));
    
    // Test case 4: Array with duplicate integers
    int[] arr4 = {1, 5, 5, 2, 2, 9};
    int[] expected4 = {9, 1};
    assertEquals(expected4, MaxMin1.maxMin1(arr4, arr4.length));
    
    // Test case 5: Array with only one element
    int[] arr5 = {5};
    int[] expected5 = {5, 5};
    assertEquals(expected5, MaxMin1.maxMin1(arr5, arr5.length));
  }
}