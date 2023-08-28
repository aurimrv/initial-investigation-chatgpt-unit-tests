
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin4Test2 {

  @Test
  public void testMaxMin4() {
    // Test case 1: Array with two elements
    int[] arr1 = {10, 5};
    int[] result1 = MaxMin4.maxMin4(arr1, 0, 1);
    assertArrayEquals(new int[]{10, 5}, result1);

    // Test case 2: Array with three elements
    int[] arr2 = {5, 10, 3};
    int[] result2 = MaxMin4.maxMin4(arr2, 0, 2);
    assertArrayEquals(new int[]{10, 3}, result2);

    // Test case 3: Array with four elements
    int[] arr3 = {7, 2, 9, 4};
    int[] result3 = MaxMin4.maxMin4(arr3, 0, 3);
    assertArrayEquals(new int[]{9, 2}, result3);

    // Test case 4: Array with five elements
    int[] arr4 = {1, 6, 3, 8, 2};
    int[] result4 = MaxMin4.maxMin4(arr4, 0, 4);
    assertArrayEquals(new int[]{8, 1}, result4);
  }
}