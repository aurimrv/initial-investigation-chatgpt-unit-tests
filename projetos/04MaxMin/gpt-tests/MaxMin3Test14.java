package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin3Test14{


    @Test
    public void testMaxMin3_oddLength() {
        int[] v = {1, 4, 2, 6, 3, 8, 5};
        int[] expected = {8, 1};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, v.length));
    }

    @Test
    public void testMaxMin3_evenLength() {
        int[] v = {1, 4, 2, 6, 3, 8, 5, 7};
        int[] expected = {8, 1};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, v.length));
    }

    @Test
    public void testMaxMin3_allEqual() {
        int[] v = {1, 1, 1, 1, 1, 1, 1};
        int[] expected = {1, 1};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, v.length));
    }

    @Test
    public void testMaxMin3_maxAndMinAtEnds() {
        int[] v = {5, 4, 3, 2, 1};
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, v.length));
    }

    @Test
    public void testMaxMin3_maxAndMinAtMiddle() {
        int[] v = {1, 10, 2, 9, 3, 8, 4, 7, 5, 6};
        int[] expected = {10, 1};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, v.length));
    }
}