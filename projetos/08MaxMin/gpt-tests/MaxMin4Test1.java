
package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin4Test1 {

    @Test
    public void testMaxMin4() {
        int[] v = {3, 7, 2, 5, 1, 9};
        int linf = 0;
        int lsup = v.length - 1;

        int[] expected = {9, 1};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin4SameValues() {
        int[] v = {5, 5, 5, 5, 5};
        int linf = 0;
        int lsup = v.length - 1;

        int[] expected = {5, 5};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin4EmptyArray() {
        int[] v = {};
        int linf = 0;
        int lsup = v.length - 1;

        int[] expected = {0, 0};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin4SingleElement() {
        int[] v = {5};
        int linf = 0;
        int lsup = v.length - 1;

        int[] expected = {5, 5};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin4NegativeValues() {
        int[] v = {-5, -3, -7, -2, -1};
        int linf = 0;
        int lsup = v.length - 1;

        int[] expected = {-1, -7};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }
}