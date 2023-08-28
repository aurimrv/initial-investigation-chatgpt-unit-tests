package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin3Test17{


    @Test
    public void testMaxMin3WithOddLength() {
        int[] v = {4, 2, 9, 7, 5};
        int[] expected = {9, 2};
        int[] result = MaxMin3.maxMin3(v, v.length);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3WithEvenLength() {
        int[] v = {1, 6, 3, 8, 2, 9};
        int[] expected = {9, 1};
        int[] result = MaxMin3.maxMin3(v, v.length);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3WithDuplicates() {
        int[] v = {5, 2, 7, 2, 9, 5};
        int[] expected = {9, 2};
        int[] result = MaxMin3.maxMin3(v, v.length);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3WithNegativeNumbers() {
        int[] v = {-3, -7, -1, -5};
        int[] expected = {-1, -7};
        int[] result = MaxMin3.maxMin3(v, v.length);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3WithEmptyArray() {
        int[] v = {};
        int[] expected = {0, 0};
        int[] result = MaxMin3.maxMin3(v, v.length);
        assertArrayEquals(expected, result);
    }
}