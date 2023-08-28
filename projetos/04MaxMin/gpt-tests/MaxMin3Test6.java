
package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin3Test6 {

    @Test
    public void testMaxMin3_oddSizeArray() {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3_evenSizeArray() {
        int[] v = {1, 2, 3, 4};
        int n = 4;
        int[] expected = {4, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3_equalElements() {
        int[] v = {1, 1, 1, 1, 1};
        int n = 5;
        int[] expected = {1, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3_negativeElements() {
        int[] v = {-5, -10, -15};
        int n = 3;
        int[] expected = {-5, -15};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3_emptyArray() {
        int[] v = {};
        int n = 0;
        int[] expected = {0, 0};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }
}