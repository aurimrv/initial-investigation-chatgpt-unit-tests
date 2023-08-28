package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin4Test19{


    @Test
    public void testMaxMin4() {
        int[] v = {1, 2, 3, 4, 5};
        int linf = 0;
        int lsup = 4;
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }

    @Test
    public void testMaxMin4EmptyArray() {
        int[] v = {};
        int linf = 0;
        int lsup = 0;
        int[] expected = {0, 0};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }

    @Test
    public void testMaxMin4SingleElementArray() {
        int[] v = {5};
        int linf = 0;
        int lsup = 0;
        int[] expected = {5, 5};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }

    @Test
    public void testMaxMin4NegativeNumbers() {
        int[] v = {-5, -2, -10, -1, -7};
        int linf = 0;
        int lsup = 4;
        int[] expected = {-1, -10};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }

    @Test
    public void testMaxMin4LargeArray() {
        int[] v = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        int linf = 0;
        int lsup = 9;
        int[] expected = {1000, 100};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }
}