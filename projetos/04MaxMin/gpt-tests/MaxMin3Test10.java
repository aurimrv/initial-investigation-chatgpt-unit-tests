
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin3Test10 {

  @Test
  public void testMaxMin3_oddLength() {
    int[] arr = {5, 10, 3, 8, 2};
    int[] expected = {10, 2};
    assertArrayEquals(expected, MaxMin3.maxMin3(arr, arr.length));
  }

  @Test
  public void testMaxMin3_evenLength() {
    int[] arr = {7, 2, 9, 4, 6, 1};
    int[] expected = {9, 1};
    assertArrayEquals(expected, MaxMin3.maxMin3(arr, arr.length));
  }

  @Test
  public void testMaxMin3_duplicateElements() {
    int[] arr = {3, 7, 6, 3, 5, 3, 9};
    int[] expected = {9, 3};
    assertArrayEquals(expected, MaxMin3.maxMin3(arr, arr.length));
  }

  @Test
  public void testMaxMin3_allEqualElements() {
    int[] arr = {2, 2, 2, 2, 2};
    int[] expected = {2, 2};
    assertArrayEquals(expected, MaxMin3.maxMin3(arr, arr.length));
  }
}