package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin3Test24{


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
        int[] v = {5, 4, 3, 2};
        int n = 4;
        int[] expected = {5, 2};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3_duplicateValues() {
        int[] v = {1, 2, 2, 3, 3, 4, 4, 5, 5};
        int n = 9;
        int[] expected = {5, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3_negativeValues() {
        int[] v = {-5, -4, -3, -2, -1};
        int n = 5;
        int[] expected = {-1, -5};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }
}