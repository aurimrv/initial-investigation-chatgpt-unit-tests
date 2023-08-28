
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin3Test1 {
  
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
    int[] v = {1, 3, 2, 4, 5};
    int n = 5;
    int[] expected = {5, 1};
    int[] result = MaxMin3.maxMin3(v, n);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin3_4() {
    int[] v = {-1, -2, -3, -4, -5};
    int n = 5;
    int[] expected = {-1, -5};
    int[] result = MaxMin3.maxMin3(v, n);
    assertArrayEquals(expected, result);
  }
}
