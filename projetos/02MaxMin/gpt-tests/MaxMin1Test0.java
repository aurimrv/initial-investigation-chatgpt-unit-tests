
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin1Test0 {

  @Test
  public void testMaxMin1() {
    int[] v = {1, 2, 3, 4, 5};
    int[] expected = {5, 1};
    assertArrayEquals(expected, MaxMin1.maxMin1(v, 5));
  }

  @Test
  public void testMaxMin1WithNegativeNumbers() {
    int[] v = {-5, -3, -1, -2, -4};
    int[] expected = {-1, -5};
    assertArrayEquals(expected, MaxMin1.maxMin1(v, 5));
  }

  @Test
  public void testMaxMin1WithRepeatedNumbers() {
    int[] v = {5, 5, 5, 5, 5};
    int[] expected = {5, 5};
    assertArrayEquals(expected, MaxMin1.maxMin1(v, 5));
  }

  @Test
  public void testMaxMin1WithSingleNumber() {
    int[] v = {1};
    int[] expected = {1, 1};
    assertArrayEquals(expected, MaxMin1.maxMin1(v, 1));
  }

}