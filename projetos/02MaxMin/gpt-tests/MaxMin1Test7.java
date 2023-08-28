
package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin1Test7 {

    @Test
    public void testMaxMin1() {
        int[] v1 = {1, 2, 3, 4, 5};
        int[] v2 = {7, 3, 9, 2, 1};
        int[] v3 = {-5, -2, -8, -3, -1};
        int[] v4 = {0, 0, 0, 0, 0};
        int[] v5 = {10};
        
        assertArrayEquals(new int[]{5, 1}, MaxMin1.maxMin1(v1, 5));
        assertArrayEquals(new int[]{9, 1}, MaxMin1.maxMin1(v2, 5));
        assertArrayEquals(new int[]{-1, -8}, MaxMin1.maxMin1(v3, 5));
        assertArrayEquals(new int[]{0, 0}, MaxMin1.maxMin1(v4, 5));
        assertArrayEquals(new int[]{10, 10}, MaxMin1.maxMin1(v5, 1));
    }
}