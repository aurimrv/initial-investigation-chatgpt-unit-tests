
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin3Test2 {

    @Test
    public void testMaxMin3_WithEvenSizeArray_ReturnsCorrectMaxAndMin() {
        int[] v = {3, 7, 2, 9, 5, 1};
        int n = v.length;
        int[] expected = {9, 1};
        int[] actual = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testMaxMin3_WithOddSizeArray_ReturnsCorrectMaxAndMin() {
        int[] v = {4, 6, 1, 8, 3};
        int n = v.length;
        int[] expected = {8, 1};
        int[] actual = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testMaxMin3_WithArrayInAscendingOrder_ReturnsCorrectMaxAndMin() {
        int[] v = {1, 2, 3, 4, 5};
        int n = v.length;
        int[] expected = {5, 1};
        int[] actual = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testMaxMin3_WithArrayInDescendingOrder_ReturnsCorrectMaxAndMin() {
        int[] v = {5, 4, 3, 2, 1};
        int n = v.length;
        int[] expected = {5, 1};
        int[] actual = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testMaxMin3_WithArrayWithNegativeNumbers_ReturnsCorrectMaxAndMin() {
        int[] v = {-5, -2, -9, -1, -7};
        int n = v.length;
        int[] expected = {-1, -9};
        int[] actual = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, actual);
    }
}
