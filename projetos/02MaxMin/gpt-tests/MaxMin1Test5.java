
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin1Test5 {
    
    @Test
    public void testMaxMin1() {
        int[] v = {1, 2, 3, 4, 5};
        int n = v.length;
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin1.maxMin1(v, n));
    }
    
    @Test
    public void testMaxMin1_NegativeNumbers() {
        int[] v = {-5, -3, -1, -2, -4};
        int n = v.length;
        int[] expected = {-1, -5};
        assertArrayEquals(expected, MaxMin1.maxMin1(v, n));
    }
    
    @Test
    public void testMaxMin1_SameNumbers() {
        int[] v = {7, 7, 7, 7};
        int n = v.length;
        int[] expected = {7, 7};
        assertArrayEquals(expected, MaxMin1.maxMin1(v, n));
    }
    
    @Test
    public void testMaxMin1_EmptyArray() {
        int[] v = {};
        int n = v.length;
        int[] expected = {0, 0};
        assertArrayEquals(expected, MaxMin1.maxMin1(v, n));
    }
    
    @Test
    public void testMaxMin1_OneElement() {
        int[] v = {9};
        int n = v.length;
        int[] expected = {9, 9};
        assertArrayEquals(expected, MaxMin1.maxMin1(v, n));
    }
}


Make sure to import the necessary packages and replace the `MaxMin1Test` class with your own test class name.