
package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin4Test11 {

  @Test
  public void testMaxMin4_withTwoElements() {
    int[] v = {5, 3};
    int linf = 0;
    int lsup = 1;
    int[] expected = {5, 3};
    
    assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
  }
  
  @Test
  public void testMaxMin4_withThreeElements() {
    int[] v = {7, 2, 9};
    int linf = 0;
    int lsup = 2;
    int[] expected = {9, 2};
    
    assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
  }
  
  @Test
  public void testMaxMin4_withFourElements() {
    int[] v = {4, 1, 6, 3};
    int linf = 0;
    int lsup = 3;
    int[] expected = {6, 1};
    
    assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
  }
  
  @Test
  public void testMaxMin4_withMultipleElements() {
    int[] v = {2, 5, 3, 8, 1, 9, 7};
    int linf = 0;
    int lsup = 6;
    int[] expected = {9, 1};
    
    assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
  }
  
  @Test
  public void testMaxMin4_withDuplicateElements() {
    int[] v = {3, 5, 2, 7, 5, 3};
    int linf = 0;
    int lsup = 5;
    int[] expected = {7, 2};
    
    assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
  }
}