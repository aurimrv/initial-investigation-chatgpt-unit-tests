package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin3Test21{


    @Test
    public void testMaxMin3_WithOddLengthArray() {
        int[] input = {5, 10, 3, 8, 2};
        int[] expected = {10, 2};
        assertArrayEquals(expected, MaxMin3.maxMin3(input, input.length));
    }

    @Test
    public void testMaxMin3_WithEvenLengthArray() {
        int[] input = {7, 2, 9, 4, 6, 1};
        int[] expected = {9, 1};
        assertArrayEquals(expected, MaxMin3.maxMin3(input, input.length));
    }

    @Test
    public void testMaxMin3_WithSingleElementArray() {
        int[] input = {5};
        int[] expected = {5, 5};
        assertArrayEquals(expected, MaxMin3.maxMin3(input, input.length));
    }

    @Test
    public void testMaxMin3_WithEmptyArray() {
        int[] input = {};
        int[] expected = {0, 0};
        assertArrayEquals(expected, MaxMin3.maxMin3(input, input.length));
    }

    @Test
    public void testMaxMin3_WithNegativeNumbers() {
        int[] input = {-5, -2, -9, -4, -6, -1};
        int[] expected = {-1, -9};
        assertArrayEquals(expected, MaxMin3.maxMin3(input, input.length));
    }
}