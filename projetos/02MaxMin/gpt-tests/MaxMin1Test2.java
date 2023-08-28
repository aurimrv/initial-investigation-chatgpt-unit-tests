
package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin1Test2 {

  @Test
  public void testMaxMin1() {
    int[] v = {1, 2, 3, 4, 5};
    int n = 5;
    int[] expected = {5, 1};
    assertArrayEquals(expected, MaxMin1.maxMin1(v, n));
  }

  @Test
  public void testMaxMin1_EmptyArray() {
    int[] v = {};
    int n = 0;
    int[] expected = {0, 0};
    assertArrayEquals(expected, MaxMin1.maxMin1(v, n));
  }

  @Test
  public void testMaxMin1_SingleElementArray() {
    int[] v = {10};
    int n = 1;
    int[] expected = {10, 10};
    assertArrayEquals(expected, MaxMin1.maxMin1(v, n));
  }

  @Test
  public void testMaxMin1_RepeatedElements() {
    int[] v = {5, 5, 5, 5, 5};
    int n = 5;
    int[] expected = {5, 5};
    assertArrayEquals(expected, MaxMin1.maxMin1(v, n));
  }

  @Test
  public void testMaxMin1_NegativeNumbers() {
    int[] v = {-5, -10, -3, -1, -7};
    int n = 5;
    int[] expected = {-1, -10};
    assertArrayEquals(expected, MaxMin1.maxMin1(v, n));
  }
}