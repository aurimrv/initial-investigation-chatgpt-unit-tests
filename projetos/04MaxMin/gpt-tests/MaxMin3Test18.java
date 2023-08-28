package ds;import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MaxMin3Test18{

  
  @Test
  public void testMaxMin3_oddLength() {
    int[] v = {1, 3, 5, 7, 9};
    int n = 5;
    int[] expected = {9, 1};
    assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
  }
  
  @Test
  public void testMaxMin3_evenLength() {
    int[] v = {2, 4, 6, 8};
    int n = 4;
    int[] expected = {8, 2};
    assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
  }
  
  @Test
  public void testMaxMin3_duplicateValues() {
    int[] v = {5, 2, 5, 9, 2, 7};
    int n = 6;
    int[] expected = {9, 2};
    assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
  }
  
  @Test
  public void testMaxMin3_negativeValues() {
    int[] v = {-2, -5, -1, -7, -3};
    int n = 5;
    int[] expected = {-1, -7};
    assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
  }
}