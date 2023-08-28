package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin2Test22{


    @Test
    public void testMaxMin2() {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }

    @Test
    public void testMaxMin2WithNegativeNumbers() {
        int[] v = {-5, -3, -1, -2, -4};
        int n = 5;
        int[] expected = {-1, -5};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }

    @Test
    public void testMaxMin2WithDuplicateNumbers() {
        int[] v = {1, 2, 3, 3, 2, 1};
        int n = 6;
        int[] expected = {3, 1};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }

    @Test
    public void testMaxMin2WithEmptyArray() {
        int[] v = {};
        int n = 0;
        int[] expected = {0, 0};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }
}