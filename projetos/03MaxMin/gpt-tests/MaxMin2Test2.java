
package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin2Test2 {

    @Test
    public void testMaxMin2() {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin2_EmptyArray() {
        int[] v = {};
        int n = 0;
        int[] expected = {0, 0};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin2_AllEqual() {
        int[] v = {3, 3, 3, 3, 3};
        int n = 5;
        int[] expected = {3, 3};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin2_NegativeNumbers() {
        int[] v = {-5, -2, -10, -8, -3};
        int n = 5;
        int[] expected = {-2, -10};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin2_DuplicateNumbers() {
        int[] v = {2, 2, 1, 3, 1};
        int n = 5;
        int[] expected = {3, 1};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }
}