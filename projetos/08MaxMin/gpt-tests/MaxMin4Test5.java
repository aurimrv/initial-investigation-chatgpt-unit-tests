
package ds;
import static org.junit.Assert.*;
import org.junit.Test;
import ds.MaxMin4;

public class MaxMin4Test5 {
  
  @Test
  public void testMaxMin4() {
    int[] v = {2, 3, 4, 5};
    int[] expected = {5, 2};
    assertArrayEquals(expected, MaxMin4.maxMin4(v, 0, v.length - 1));
  }
  
  @Test
  public void testMaxMin4WithDuplicates() {
    int[] v = {2, 3, 3, 5};
    int[] expected = {5, 2};
    assertArrayEquals(expected, MaxMin4.maxMin4(v, 0, v.length - 1));
  }
  
  @Test
  public void testMaxMin4WithNegativeNumbers() {
    int[] v = {-2, -3, -4, -5};
    int[] expected = {-2, -5};
    assertArrayEquals(expected, MaxMin4.maxMin4(v, 0, v.length - 1));
  }
  
  @Test
  public void testMaxMin4WithEmptyArray() {
    int[] v = {};
    int[] expected = {0, 0};
    assertArrayEquals(expected, MaxMin4.maxMin4(v, 0, v.length - 1));
  }
  
  @Test
  public void testMaxMin4WithSingleElement() {
    int[] v = {10};
    int[] expected = {10, 10};
    assertArrayEquals(expected, MaxMin4.maxMin4(v, 0, v.length - 1));
  }
  
}
