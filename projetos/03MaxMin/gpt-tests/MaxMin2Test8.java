
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin2Test8 {

    @Test
    public void testMaxMin2_withPositiveValues() {
        int[] v = {4, 8, 2, 10, 6};
        int n = v.length;
        int[] maxMin = MaxMin2.maxMin2(v, n);
        assertArrayEquals(new int[]{10, 2}, maxMin);
    }

    @Test
    public void testMaxMin2_withNegativeValues() {
        int[] v = {-5, -2, -10, -3, -8};
        int n = v.length;
        int[] maxMin = MaxMin2.maxMin2(v, n);
        assertArrayEquals(new int[]{-2, -10}, maxMin);
    }

    @Test
    public void testMaxMin2_withMixedValues() {
        int[] v = {3, -6, 1, 9, -4};
        int n = v.length;
        int[] maxMin = MaxMin2.maxMin2(v, n);
        assertArrayEquals(new int[]{9, -6}, maxMin);
    }
    
    @Test
    public void testMaxMin2_withRepeatedValues() {
        int[] v = {2, 2, 2, 2, 2};
        int n = v.length;
        int[] maxMin = MaxMin2.maxMin2(v, n);
        assertArrayEquals(new int[]{2, 2}, maxMin);
    }
    
    @Test
    public void testMaxMin2_withEmptyArray() {
        int[] v = {};
        int n = v.length;
        int[] maxMin = MaxMin2.maxMin2(v, n);
        assertArrayEquals(new int[]{}, maxMin);
    }
}