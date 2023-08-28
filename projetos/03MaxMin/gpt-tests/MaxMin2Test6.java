
package ds;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MaxMin2Test6 {
  
  @Test
  public void testMaxMin2() {
    int[] input1 = {1, 2, 3, 4, 5};
    int[] expected1 = {5, 1};
    assertArrayEquals(expected1, MaxMin2.maxMin2(input1, input1.length));
    
    int[] input2 = {5, 4, 3, 2, 1};
    int[] expected2 = {5, 1};
    assertArrayEquals(expected2, MaxMin2.maxMin2(input2, input2.length));
    
    int[] input3 = {1, 2, 5, 3, 4};
    int[] expected3 = {5, 1};
    assertArrayEquals(expected3, MaxMin2.maxMin2(input3, input3.length));
    
    int[] input4 = {-1, -2, -3, -4, -5};
    int[] expected4 = {-1, -5};
    assertArrayEquals(expected4, MaxMin2.maxMin2(input4, input4.length));
    
    int[] input5 = {10};
    int[] expected5 = {10, 10};
    assertArrayEquals(expected5, MaxMin2.maxMin2(input5, input5.length));
  }
  
}
