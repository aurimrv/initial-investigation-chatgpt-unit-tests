
package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin2Test0 {
  
  @Test
  public void testMaxMin2_AllPositiveNumbers() {
    int[] input = {1, 2, 3, 4, 5};
    int[] expected = {5, 1};
    int[] result = MaxMin2.maxMin2(input, input.length);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin2_AllNegativeNumbers() {
    int[] input = {-5, -4, -3, -2, -1};
    int[] expected = {-1, -5};
    int[] result = MaxMin2.maxMin2(input, input.length);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin2_PositiveAndNegativeNumbers() {
    int[] input = {-5, 2, -3, 4, -1};
    int[] expected = {4, -5};
    int[] result = MaxMin2.maxMin2(input, input.length);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin2_AllZeroes() {
    int[] input = {0, 0, 0, 0, 0};
    int[] expected = {0, 0};
    int[] result = MaxMin2.maxMin2(input, input.length);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin2_EmptyArray() {
    int[] input = {};
    int[] expected = {0, 0};
    int[] result = MaxMin2.maxMin2(input, input.length);
    assertArrayEquals(expected, result);
  }
}