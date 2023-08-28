package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin3Test25{


    @Test
    public void testMaxMin3_oddLength() {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3_evenLength() {
        int[] v = {5, 4, 3, 2, 1, 0};
        int n = 6;
        int[] expected = {5, 0};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3_duplicateMax() {
        int[] v = {1, 2, 3, 4, 5, 5};
        int n = 6;
        int[] expected = {5, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3_duplicateMin() {
        int[] v = {5, 4, 3, 2, 1, 1};
        int n = 6;
        int[] expected = {5, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3_allEqual() {
        int[] v = {1, 1, 1, 1, 1, 1};
        int n = 6;
        int[] expected = {1, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }
}