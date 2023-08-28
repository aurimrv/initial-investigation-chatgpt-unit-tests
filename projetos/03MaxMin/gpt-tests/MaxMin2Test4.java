
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin2Test4 {

    @Test
    public void testMaxMin2_WithPositiveNumbers() {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin2_WithNegativeNumbers() {
        int[] v = {-5, -4, -3, -2, -1};
        int n = 5;
        int[] expected = {-1, -5};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin2_WithMixedNumbers() {
        int[] v = {-5, 10, 0, -2, 8};
        int n = 5;
        int[] expected = {10, -5};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin2_WithDuplicateNumbers() {
        int[] v = {1, 1, 1, 1, 1};
        int n = 5;
        int[] expected = {1, 1};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin2_WithEmptyArray() {
        int[] v = {};
        int n = 0;
        int[] expected = {Integer.MIN_VALUE, Integer.MAX_VALUE};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }
}


Note: Make sure to import the necessary JUnit and MaxMin2 classes.