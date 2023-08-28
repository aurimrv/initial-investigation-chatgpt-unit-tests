
package ds;import org.junit.Assert;
import org.junit.Test;

public class MaxMin2Test5 {

  @Test
  public void testMaxMin2() {
    int[] input1 = {1, 2, 3, 4, 5};
    int[] expected1 = {5, 1};
    Assert.assertArrayEquals(expected1, MaxMin2.maxMin2(input1, input1.length));

    int[] input2 = {5, 4, 3, 2, 1};
    int[] expected2 = {5, 1};
    Assert.assertArrayEquals(expected2, MaxMin2.maxMin2(input2, input2.length));

    int[] input3 = {1, 3, 2, 5, 4};
    int[] expected3 = {5, 1};
    Assert.assertArrayEquals(expected3, MaxMin2.maxMin2(input3, input3.length));

    int[] input4 = {5};
    int[] expected4 = {5, 5};
    Assert.assertArrayEquals(expected4, MaxMin2.maxMin2(input4, input4.length));
  }

}