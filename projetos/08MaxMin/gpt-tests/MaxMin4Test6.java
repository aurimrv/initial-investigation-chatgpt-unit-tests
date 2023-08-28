
package ds;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class MaxMin4Test6 {
  
  @Test
  public void testMaxMin4ReturnsMaxAndMinValues() {
    int[] v = {5, 2, 9, 1, 7, 4};
    int linf = 0;
    int lsup = v.length - 1;
    int[] expected = {9, 1};
    
    assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
  }
  
  @Test
  public void testMaxMin4ReturnsSameMaxAndMinValuesForSortedArray() {
    int[] v = {1, 2, 3, 4, 5};
    int linf = 0;
    int lsup = v.length - 1;
    int[] expected = {5, 1};
    
    assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
  }
  
  @Test
  public void testMaxMin4ReturnsSameMaxAndMinValuesForSingleElementArray() {
    int[] v = {3};
    int linf = 0;
    int lsup = 0;
    int[] expected = {3, 3};
    
    assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
  }
  
  @Test
  public void testMaxMin4ReturnsSameMaxAndMinValuesForEmptyArray() {
    int[] v = {};
    int linf = 0;
    int lsup = -1;
    int[] expected = {Integer.MIN_VALUE, Integer.MAX_VALUE};
    
    assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
  }
}
