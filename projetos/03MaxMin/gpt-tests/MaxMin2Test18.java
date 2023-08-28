package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin2Test18{


    @Test
    public void testMaxMin2() {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin2NegativeNumbers() {
        int[] v = {-5, -4, -3, -2, -1};
        int n = 5;
        int[] expected = {-1, -5};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin2EmptyArray() {
        int[] v = {};
        int n = 0;
        int[] expected = {0, 0};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin2SingleElement() {
        int[] v = {10};
        int n = 1;
        int[] expected = {10, 10};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin2RepeatedElements() {
        int[] v = {1, 1, 1, 1, 1};
        int n = 5;
        int[] expected = {1, 1};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }
}