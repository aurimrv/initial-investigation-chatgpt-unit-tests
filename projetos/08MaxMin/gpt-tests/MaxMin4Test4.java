
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin4Test4 {
  
  @Test
  public void testMaxMin4_smallArray() {
    int[] v = {1, 2};
    int linf = 0;
    int lsup = 1;
    
    int[] expected = {2, 1};
    int[] actual = MaxMin4.maxMin4(v, linf, lsup);
    
    assertArrayEquals(expected, actual);
  }
  
  @Test
  public void testMaxMin4_largeArray() {
    int[] v = {8, 2, 5, 1, 9, 4, 3, 7, 6};
    int linf = 0;
    int lsup = 8;
    
    int[] expected = {9, 1};
    int[] actual = MaxMin4.maxMin4(v, linf, lsup);
    
    assertArrayEquals(expected, actual);
  }
  
  @Test
  public void testMaxMin4_duplicateValues() {
    int[] v = {2, 4, 1, 4, 3};
    int linf = 0;
    int lsup = 4;
    
    int[] expected = {4, 1};
    int[] actual = MaxMin4.maxMin4(v, linf, lsup);
    
    assertArrayEquals(expected, actual);
  }
  
  @Test
  public void testMaxMin4_emptyArray() {
    int[] v = {};
    int linf = 0;
    int lsup = -1;
    
    int[] expected = {0, 0};
    int[] actual = MaxMin4.maxMin4(v, linf, lsup);
    
    assertArrayEquals(expected, actual);
  }
}
