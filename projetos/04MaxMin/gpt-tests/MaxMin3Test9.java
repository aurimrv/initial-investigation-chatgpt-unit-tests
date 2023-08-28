
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin3Test9 {
  
  @Test
  public void testMaxMin3_1() {
    int[] v = {1, 2, 3, 4, 5};
    int n = 5;
    int[] expected = {5, 1};
    int[] actual = MaxMin3.maxMin3(v, n);
    assertArrayEquals(expected, actual);
  }
  
  @Test
  public void testMaxMin3_2() {
    int[] v = {5, 4, 3, 2, 1};
    int n = 5;
    int[] expected = {5, 1};
    int[] actual = MaxMin3.maxMin3(v, n);
    assertArrayEquals(expected, actual);
  }
  
  @Test
  public void testMaxMin3_3() {
    int[] v = {2, 5, 1, 4, 3};
    int n = 5;
    int[] expected = {5, 1};
    int[] actual = MaxMin3.maxMin3(v, n);
    assertArrayEquals(expected, actual);
  }
  
  @Test
  public void testMaxMin3_4() {
    int[] v = {1, 3, 2};
    int n = 3;
    int[] expected = {3, 1};
    int[] actual = MaxMin3.maxMin3(v, n);
    assertArrayEquals(expected, actual);
  }
  
  @Test
  public void testMaxMin3_5() {
    int[] v = {2, 1};
    int n = 2;
    int[] expected = {2, 1};
    int[] actual = MaxMin3.maxMin3(v, n);
    assertArrayEquals(expected, actual);
  }
 
}