
package ds;import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class MaxMin2Test3 {

  @Test
  public void testMaxMin2() {
    // Test case 1
    int[] input1 = {1, 2, 3, 4, 5};
    int[] expectedOutput1 = {5, 1};
    assertArrayEquals(expectedOutput1, MaxMin2.maxMin2(input1, 5));

    // Test case 2
    int[] input2 = {9, 4, 6, 2, 8};
    int[] expectedOutput2 = {9, 2};
    assertArrayEquals(expectedOutput2, MaxMin2.maxMin2(input2, 5));

    // Test case 3
    int[] input3 = {0, -1, -5, -10, -2};
    int[] expectedOutput3 = {0, -10};
    assertArrayEquals(expectedOutput3, MaxMin2.maxMin2(input3, 5));

    // Test case 4
    int[] input4 = {100};
    int[] expectedOutput4 = {100, 100};
    assertArrayEquals(expectedOutput4, MaxMin2.maxMin2(input4, 1));

    // Test case 5
    int[] input5 = {10, 10, 10, 10};
    int[] expectedOutput5 = {10, 10};
    assertArrayEquals(expectedOutput5, MaxMin2.maxMin2(input5, 4));
  }
}