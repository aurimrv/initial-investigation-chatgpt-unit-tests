
package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin2Test10 {
    
    @Test
    public void testMaxMin2_SingleElementArray() {
        int[] v = {1};
        int[] expected = {1, 1};
        int[] result = MaxMin2.maxMin2(v, 1);
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testMaxMin2_AllEqualElements() {
        int[] v = {2, 2, 2, 2, 2};
        int[] expected = {2, 2};
        int[] result = MaxMin2.maxMin2(v, 5);
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testMaxMin2_AllDistinctElements() {
        int[] v = {1, 3, 5, 7, 9};
        int[] expected = {9, 1};
        int[] result = MaxMin2.maxMin2(v, 5);
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testMaxMin2_NegativeElements() {
        int[] v = {-5, -3, -1, -7, -9};
        int[] expected = {-1, -9};
        int[] result = MaxMin2.maxMin2(v, 5);
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testMaxMin2_RepeatingElements() {
        int[] v = {4, 2, 2, 7, 4};
        int[] expected = {7, 2};
        int[] result = MaxMin2.maxMin2(v, 5);
        assertArrayEquals(expected, result);
    }
}