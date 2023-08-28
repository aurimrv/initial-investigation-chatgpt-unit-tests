
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin1Test1 {

    @Test
    public void testMaxMin1() {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin1.maxMin1(v, n));
    }

    @Test
    public void testMaxMin1_EmptyArray() {
        int[] v = {};
        int n = 0;
        int[] expected = {0, 0};
        assertArrayEquals(expected, MaxMin1.maxMin1(v, n));
    }

    @Test
    public void testMaxMin1_AllSameValues() {
        int[] v = {5, 5, 5, 5};
        int n = 4;
        int[] expected = {5, 5};
        assertArrayEquals(expected, MaxMin1.maxMin1(v, n));
    }

    @Test
    public void testMaxMin1_NegativeValues() {
        int[] v = {-5, -2, -10, -1};
        int n = 4;
        int[] expected = {-1, -10};
        assertArrayEquals(expected, MaxMin1.maxMin1(v, n));
    }
}
