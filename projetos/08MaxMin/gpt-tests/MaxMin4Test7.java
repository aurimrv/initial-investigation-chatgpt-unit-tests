
package ds;import ds.MaxMin4;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin4Test7 {

    @Test
    public void testMaxMin4() {
        int[] v1 = {1, 2, 3, 4};
        int[] expected1 = {4, 1};
        assertArrayEquals(expected1, MaxMin4.maxMin4(v1, 0, v1.length - 1));

        int[] v2 = {4, 3, 2, 1};
        int[] expected2 = {4, 1};
        assertArrayEquals(expected2, MaxMin4.maxMin4(v2, 0, v2.length - 1));

        int[] v3 = {1, 4, 2, 3};
        int[] expected3 = {4, 1};
        assertArrayEquals(expected3, MaxMin4.maxMin4(v3, 0, v3.length - 1));

        int[] v4 = {4};
        int[] expected4 = {4, 4};
        assertArrayEquals(expected4, MaxMin4.maxMin4(v4, 0, v4.length - 1));
    }
}