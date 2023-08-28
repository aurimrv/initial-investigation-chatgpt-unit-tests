
package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin3Test4 {

  @Test
  public void testMaxMin3_oddLength() {
    int[] v = {1, 5, 3, 9, 2};
    int n = 5;
    int[] expected = {9, 1};
    int[] result = MaxMin3.maxMin3(v, n);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin3_evenLength() {
    int[] v = {7, 2, 4, 8, 1, 6};
    int n = 6;
    int[] expected = {8, 1};
    int[] result = MaxMin3.maxMin3(v, n);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin3_maxAtStart() {
    int[] v = {10, 5, 3, 2, 9};
    int n = 5;
    int[] expected = {10, 2};
    int[] result = MaxMin3.maxMin3(v, n);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin3_minAtStart() {
    int[] v = {2, 5, 8, 4, 6};
    int n = 5;
    int[] expected = {8, 2};
    int[] result = MaxMin3.maxMin3(v, n);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin3_maxAtEnd() {
    int[] v = {4, 3, 8, 6, 10};
    int n = 5;
    int[] expected = {10, 3};
    int[] result = MaxMin3.maxMin3(v, n);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin3_minAtEnd() {
    int[] v = {7, 9, 6, 10, 2};
    int n = 5;
    int[] expected = {10, 2};
    int[] result = MaxMin3.maxMin3(v, n);
    assertArrayEquals(expected, result);
  }
}