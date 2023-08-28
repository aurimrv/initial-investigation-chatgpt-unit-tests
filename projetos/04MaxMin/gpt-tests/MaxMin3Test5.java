
package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.MaxMin3;

public class MaxMin3Test5 {

  @Test
  public void testMaxMin3_case1() {
    int[] v = {2, 4, 6, 8, 10};
    int[] expected = {10, 2};
    assertArrayEquals(expected, MaxMin3.maxMin3(v, v.length));
  }

  @Test
  public void testMaxMin3_case2() {
    int[] v = {5, 3, 1, 7};
    int[] expected = {7, 1};
    assertArrayEquals(expected, MaxMin3.maxMin3(v, v.length));
  }

  @Test
  public void testMaxMin3_case3() {
    int[] v = {9, 9, 9, 9, 9};
    int[] expected = {9, 9};
    assertArrayEquals(expected, MaxMin3.maxMin3(v, v.length));
  }

  @Test
  public void testMaxMin3_case4() {
    int[] v = {1, 2, 3, 4, 5, 6, 7};
    int[] expected = {7, 1};
    assertArrayEquals(expected, MaxMin3.maxMin3(v, v.length));
  }

  @Test
  public void testMaxMin3_case5() {
    int[] v = {0, -5, -10, -15, -20};
    int[] expected = {0, -20};
    assertArrayEquals(expected, MaxMin3.maxMin3(v, v.length));
  }
}