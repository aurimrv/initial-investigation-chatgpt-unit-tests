
package ds;import ds.MaxMin2;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin2Test7 {

    @Test
    public void testMaxMin2_normalInput() {
        int[] v = {4, 2, 6, 8, 1, 3};
        int n = v.length;
        int[] expected = {8, 1};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testMaxMin2_negativeInput() {
        int[] v = {-5, -2, -1, -8, -10};
        int n = v.length;
        int[] expected = {-1, -10};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testMaxMin2_duplicateInput() {
        int[] v = {2, 5, 2, 8, 2, 3, 8};
        int n = v.length;
        int[] expected = {8, 2};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testMaxMin2_singleElementInput() {
        int[] v = {9};
        int n = v.length;
        int[] expected = {9, 9};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testMaxMin2_emptyInput() {
        int[] v = {};
        int n = v.length;
        int[] expected = {0, 0};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }
}