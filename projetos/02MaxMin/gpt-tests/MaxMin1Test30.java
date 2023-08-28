package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin1Test30{


    @Test
    public void testMaxMin1() {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin1WithNegativeNumbers() {
        int[] v = {-5, -4, -3, -2, -1};
        int n = 5;
        int[] expected = {-1, -5};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin1WithDuplicateNumbers() {
        int[] v = {1, 2, 3, 3, 4, 5};
        int n = 6;
        int[] expected = {5, 1};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin1WithEmptyArray() {
        int[] v = {};
        int n = 0;
        int[] expected = {0, 0};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }
}