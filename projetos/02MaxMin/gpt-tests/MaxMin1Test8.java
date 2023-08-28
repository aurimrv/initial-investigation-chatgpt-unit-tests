
package ds;import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MaxMin1Test8 {

  @Test
  public void testMaxMin1() {
    int[] input1 = {4, 7, 2, 9, 1};
    int n1 = 5;
    int[] expected1 = {9, 1};
    assertArrayEquals(expected1, MaxMin1.maxMin1(input1, n1));

    int[] input2 = {1, 2, 3, 4, 5};
    int n2 = 5;
    int[] expected2 = {5, 1};
    assertArrayEquals(expected2, MaxMin1.maxMin1(input2, n2));

    int[] input3 = {10, 5, 8, 3, 6};
    int n3 = 5;
    int[] expected3 = {10, 3};
    assertArrayEquals(expected3, MaxMin1.maxMin1(input3, n3));

    int[] input4 = {6, 2, 9, 4, 7};
    int n4 = 5;
    int[] expected4 = {9, 2};
    assertArrayEquals(expected4, MaxMin1.maxMin1(input4, n4));

    int[] input5 = {3, 6, 1, 9, 5};
    int n5 = 5;
    int[] expected5 = {9, 1};
    assertArrayEquals(expected5, MaxMin1.maxMin1(input5, n5));
  }
}