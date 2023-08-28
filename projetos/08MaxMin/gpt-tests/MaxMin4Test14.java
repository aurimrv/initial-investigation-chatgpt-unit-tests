package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin4Test14{


    @Test
    public void testMaxMin4_1() {
        int[] v = {1, 2, 3, 4, 5};
        int linf = 0;
        int lsup = 4;
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }

    @Test
    public void testMaxMin4_2() {
        int[] v = {5, 4, 3, 2, 1};
        int linf = 0;
        int lsup = 4;
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }

    @Test
    public void testMaxMin4_3() {
        int[] v = {1, 3, 2, 5, 4};
        int linf = 0;
        int lsup = 4;
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }

    @Test
    public void testMaxMin4_4() {
        int[] v = {1};
        int linf = 0;
        int lsup = 0;
        int[] expected = {1, 1};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }

    @Test
    public void testMaxMin4_5() {
        int[] v = {5, 5, 5, 5, 5};
        int linf = 0;
        int lsup = 4;
        int[] expected = {5, 5};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }
}