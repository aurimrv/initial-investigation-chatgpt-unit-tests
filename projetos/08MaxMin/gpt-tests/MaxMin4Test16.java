package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin4Test16{


    @Test
    public void testMaxMin4() {
        int[] v = {1, 2, 3, 4, 5};
        int linf = 0;
        int lsup = 4;
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }

    @Test
    public void testMaxMin4WithDuplicateValues() {
        int[] v = {5, 5, 5, 5, 5};
        int linf = 0;
        int lsup = 4;
        int[] expected = {5, 5};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }

    @Test
    public void testMaxMin4WithNegativeValues() {
        int[] v = {-5, -4, -3, -2, -1};
        int linf = 0;
        int lsup = 4;
        int[] expected = {-1, -5};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }

    @Test
    public void testMaxMin4WithEmptyArray() {
        int[] v = {};
        int linf = 0;
        int lsup = 0;
        int[] expected = {0, 0};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }

    @Test
    public void testMaxMin4WithSingleElementArray() {
        int[] v = {5};
        int linf = 0;
        int lsup = 0;
        int[] expected = {5, 5};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }
}