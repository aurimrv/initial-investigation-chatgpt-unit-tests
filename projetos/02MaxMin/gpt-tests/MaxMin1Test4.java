
package ds;import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MaxMin1Test4 {

    @Test
    public void testMaxMin1() {
        int[] v = {5, 2, 8, 1, 9};
        int[] expected = {9, 1};
        assertArrayEquals(expected, MaxMin1.maxMin1(v, v.length));
    }

    @Test
    public void testMaxMin1_AllEqual() {
        int[] v = {3, 3, 3, 3, 3};
        int[] expected = {3, 3};
        assertArrayEquals(expected, MaxMin1.maxMin1(v, v.length));
    }

    @Test
    public void testMaxMin1_NegativeNumbers() {
        int[] v = {-4, -2, -7, -1};
        int[] expected = {-1, -7};
        assertArrayEquals(expected, MaxMin1.maxMin1(v, v.length));
    }

    @Test
    public void testMaxMin1_EmptyArray() {
        int[] v = {};
        int[] expected = {0, 0};
        assertArrayEquals(expected, MaxMin1.maxMin1(v, v.length));
    }
}