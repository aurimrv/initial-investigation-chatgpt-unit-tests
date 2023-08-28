package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin3Test23{


    @Test
    public void testMaxMin3_WithOddLengthArray() {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3_WithEvenLengthArray() {
        int[] v = {5, 4, 3, 2};
        int n = 4;
        int[] expected = {5, 2};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3_WithArrayContainingNegativeNumbers() {
        int[] v = {-5, -3, -1, -2, -4};
        int n = 5;
        int[] expected = {-1, -5};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3_WithArrayContainingDuplicateNumbers() {
        int[] v = {1, 2, 3, 3, 2, 1};
        int n = 6;
        int[] expected = {3, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }
}