package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin3Test19{


    @Test
    public void testMaxMin3_oddLength() {
        int[] v = {1, 5, 3, 7, 9};
        int[] expected = {9, 1};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, v.length));
    }

    @Test
    public void testMaxMin3_evenLength() {
        int[] v = {2, 4, 6, 8};
        int[] expected = {8, 2};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, v.length));
    }

    @Test
    public void testMaxMin3_duplicateMax() {
        int[] v = {5, 3, 7, 9, 9};
        int[] expected = {9, 3};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, v.length));
    }

    @Test
    public void testMaxMin3_duplicateMin() {
        int[] v = {5, 3, 1, 1, 9};
        int[] expected = {9, 1};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, v.length));
    }

    @Test
    public void testMaxMin3_allEqual() {
        int[] v = {5, 5, 5, 5, 5};
        int[] expected = {5, 5};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, v.length));
    }
}