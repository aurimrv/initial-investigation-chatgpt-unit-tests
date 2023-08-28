
package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin2Test11 {

    @Test
    public void testMaxMin2() {
        int[] v = {1, 2, 3, 4, 5};
        int[] expectedResult = {5, 1};
        assertArrayEquals(expectedResult, MaxMin2.maxMin2(v, v.length));
    }

    @Test
    public void testMaxMin2_allSameValues() {
        int[] v = {3, 3, 3, 3, 3};
        int[] expectedResult = {3, 3};
        assertArrayEquals(expectedResult, MaxMin2.maxMin2(v, v.length));
    }

    @Test
    public void testMaxMin2_negativeValues() {
        int[] v = {-5, -2, -10, -1, -8};
        int[] expectedResult = {-1, -10};
        assertArrayEquals(expectedResult, MaxMin2.maxMin2(v, v.length));
    }

    @Test
    public void testMaxMin2_emptyArray() {
        int[] v = {};
        int[] expectedResult = {0, 0}; // or any other default values
        assertArrayEquals(expectedResult, MaxMin2.maxMin2(v, v.length));
    }
}