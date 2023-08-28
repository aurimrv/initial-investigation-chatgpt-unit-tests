package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin4Test17{


    @Test
    public void testMaxMin4() {
        int[] v = {1, 2, 3, 4, 5};
        int linf = 0;
        int lsup = 4;
        int[] expected = {5, 1};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin4WithNegativeNumbers() {
        int[] v = {-5, -4, -3, -2, -1};
        int linf = 0;
        int lsup = 4;
        int[] expected = {-1, -5};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin4WithDuplicateNumbers() {
        int[] v = {1, 2, 3, 3, 4, 5};
        int linf = 0;
        int lsup = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin4WithEmptyArray() {
        int[] v = {};
        int linf = 0;
        int lsup = 0;
        int[] expected = {0, 0};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin4WithSingleElementArray() {
        int[] v = {10};
        int linf = 0;
        int lsup = 0;
        int[] expected = {10, 10};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }
}