
package ds;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class MaxMin1Test10 {

  @Test
  public void testMaxMin1_ValidInput_ReturnsMaxAndMin() {
    int[] v = { 2, 4, 1, 6, 3 };
    int n = 5;
    int[] expected = { 6, 1 };
    int[] actual = MaxMin1.maxMin1(v, n);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testMaxMin1_AllEqualValues_ReturnsSameValue() {
    int[] v = { 5, 5, 5, 5, 5 };
    int n = 5;
    int[] expected = { 5, 5 };
    int[] actual = MaxMin1.maxMin1(v, n);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testMaxMin1_EmptyArray_ReturnsNull() {
    int[] v = {};
    int n = 0;
    int[] expected = { 0, 0 };
    int[] actual = MaxMin1.maxMin1(v, n);
    assertArrayEquals(expected, actual);
  }

  @Test(expected = NullPointerException.class)
  public void testMaxMin1_NullInput_ThrowsNullPointerException() {
    int[] v = null;
    int n = 5;
    MaxMin1.maxMin1(v, n);
  }

}


Note: Make sure to import the correct MaxMin1 class from the ds package, as the provided code snippet is declared inside the ds package.