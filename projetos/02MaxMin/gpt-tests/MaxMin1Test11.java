
package ds;import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MaxMin1Test11 {

    @Test
    public void testMaxMin1WithPositiveNumbers() {
        int[] v = {4, 2, 9, 1, 7};
        int n = v.length;
        int[] expected = {9, 1};
        int[] result = MaxMin1.maxMin1(v, n);
        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }

    @Test
    public void testMaxMin1WithNegativeNumbers() {
        int[] v = {-5, -9, -1, -3, -7};
        int n = v.length;
        int[] expected = {-1, -9};
        int[] result = MaxMin1.maxMin1(v, n);
        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }

    @Test
    public void testMaxMin1WithMixedNumbers() {
        int[] v = {-2, 0, 5, -8, 3};
        int n = v.length;
        int[] expected = {5, -8};
        int[] result = MaxMin1.maxMin1(v, n);
        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }

    @Test
    public void testMaxMin1WithDuplicateMaxMin() {
        int[] v = {1, 2, 1, 3, 1};
        int n = v.length;
        int[] expected = {3, 1};
        int[] result = MaxMin1.maxMin1(v, n);
        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }

    @Test
    public void testMaxMin1WithSingleElement() {
        int[] v = {5};
        int n = v.length;
        int[] expected = {5, 5};
        int[] result = MaxMin1.maxMin1(v, n);
        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }
}