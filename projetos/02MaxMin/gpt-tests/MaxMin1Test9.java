
package ds;
import ds.MaxMin1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaxMin1Test9 {

    @Test
    public void testMaxMin1() {
        int[] v = {1, 2, 3, 4, 5};
        int n = v.length;
      
        int[] expected = {5, 1};
        int[] actual = MaxMin1.maxMin1(v, n);
      
        assertArrayEquals(expected, actual);
    }
  
    @Test
    public void testMaxMin1_AllEqual() {
        int[] v = {5, 5, 5, 5, 5};
        int n = v.length;
      
        int[] expected = {5, 5};
        int[] actual = MaxMin1.maxMin1(v, n);
      
        assertArrayEquals(expected, actual);
    }
  
    @Test
    public void testMaxMin1_NegativeValues() {
        int[] v = {-5, -3, -7, -1, -9};
        int n = v.length;
      
        int[] expected = {-1, -9};
        int[] actual = MaxMin1.maxMin1(v, n);
      
        assertArrayEquals(expected, actual);
    }
  
    @Test
    public void testMaxMin1_EmptyArray() {
        int[] v = {};
        int n = v.length;
      
        int[] expected = null;
        int[] actual = MaxMin1.maxMin1(v, n);
      
        assertArrayEquals(expected, actual);
    }
}
