
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin2Test9 {

  @Test
  public void testMaxMin2() {
    int[] input1 = {1, 2, 3, 4, 5};
    int[] expected1 = {5, 1};
    assertArrayEquals(expected1, MaxMin2.maxMin2(input1, 5));
    
    int[] input2 = {5, 4, 3, 2, 1};
    int[] expected2 = {5, 1};
    assertArrayEquals(expected2, MaxMin2.maxMin2(input2, 5));
    
    int[] input3 = {1, 1, 1, 1, 1};
    int[] expected3 = {1, 1};
    assertArrayEquals(expected3, MaxMin2.maxMin2(input3, 5));
    
    int[] input4 = {-1, -2, -3, -4, -5};
    int[] expected4 = {-1, -5};
    assertArrayEquals(expected4, MaxMin2.maxMin2(input4, 5));
    
    int[] input5 = {5};
    int[] expected5 = {5, 5};
    assertArrayEquals(expected5, MaxMin2.maxMin2(input5, 1));
  }
}