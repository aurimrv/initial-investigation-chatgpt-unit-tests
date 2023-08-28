package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin3Test27{


    @Test
    public void testMaxMin3_oddLength() {
        int[] v = {1, 5, 3, 7, 9};
        int n = 5;
        int[] expected = {9, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3_evenLength() {
        int[] v = {4, 2, 6, 8};
        int n = 4;
        int[] expected = {8, 2};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3_duplicateValues() {
        int[] v = {3, 5, 3, 7, 9};
        int n = 5;
        int[] expected = {9, 3};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3_negativeValues() {
        int[] v = {-2, -5, -3, -7, -9};
        int n = 5;
        int[] expected = {-2, -9};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }
}