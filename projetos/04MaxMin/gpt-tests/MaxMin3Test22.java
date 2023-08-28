package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin3Test22{


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
    public void testMaxMin3_duplicateValues() {
        int[] v = {2, 2, 2, 2, 2};
        int n = 5;
        int[] expected = {2, 2};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3_negativeValues() {
        int[] v = {-5, -10, -3, -1, -8};
        int n = 5;
        int[] expected = {-1, -10};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }
}