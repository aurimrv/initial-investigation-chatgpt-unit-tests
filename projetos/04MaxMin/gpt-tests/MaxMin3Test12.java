package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin3Test12{


  @Test
  public void testMaxMin3_WithOddLengthArray() {
    int[] v = {1, 5, 2, 6, 3};
    int[] expected = {6, 1};
    int[] result = MaxMin3.maxMin3(v, 5);
    assertArrayEquals(expected, result);
  }

  @Test
  public void testMaxMin3_WithEvenLengthArray() {
    int[] v = {7, 2, 9, 4, 6, 1};
    int[] expected = {9, 1};
    int[] result = MaxMin3.maxMin3(v, 6);
    assertArrayEquals(expected, result);
  }

  @Test
  public void testMaxMin3_WithEmptyArray() {
    int[] v = {};
    int[] expected = {Integer.MIN_VALUE, Integer.MAX_VALUE};
    int[] result = MaxMin3.maxMin3(v, 0);
    assertArrayEquals(expected, result);
  }

  @Test
  public void testMaxMin3_WithSingleElementArray() {
    int[] v = {5};
    int[] expected = {5, 5};
    int[] result = MaxMin3.maxMin3(v, 1);
    assertArrayEquals(expected, result);
  }

  @Test
  public void testMaxMin3_WithNegativeNumbers() {
    int[] v = {-3, -1, -5, -2, -4};
    int[] expected = {-1, -5};
    int[] result = MaxMin3.maxMin3(v, 5);
    assertArrayEquals(expected, result);
  }
}