
package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.MaxMin3;

public class MaxMin3Test0 {
  
  @Test
  public void testMaxMin3_1() {
    int[] v = {1, 2, 3, 4, 5};
    int n = 5;
    int[] expected = {5, 1};
    int[] result = MaxMin3.maxMin3(v, n);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin3_2() {
    int[] v = {5, 4, 3, 2, 1};
    int n = 5;
    int[] expected = {5, 1};
    int[] result = MaxMin3.maxMin3(v, n);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin3_3() {
    int[] v = {1, 3, 2, 5, 4};
    int n = 5;
    int[] expected = {5, 1};
    int[] result = MaxMin3.maxMin3(v, n);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin3_4() {
    int[] v = {1, 2, 3, 4, 5, 6};
    int n = 6;
    int[] expected = {6, 1};
    int[] result = MaxMin3.maxMin3(v, n);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin3_5() {
    int[] v = {6, 5, 4, 3, 2, 1};
    int n = 6;
    int[] expected = {6, 1};
    int[] result = MaxMin3.maxMin3(v, n);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin3_6() {
    int[] v = {1, 3, 2, 5, 4, 6};
    int n = 6;
    int[] expected = {6, 1};
    int[] result = MaxMin3.maxMin3(v, n);
    assertArrayEquals(expected, result);
  }
}