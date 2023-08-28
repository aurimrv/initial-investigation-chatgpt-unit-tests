package ds;import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MaxMin1Test12{


    @Test
    public void testMaxMin1() {
        // Test case 1: Array with positive integers
        int[] v1 = {1, 2, 3, 4, 5};
        int[] expected1 = {5, 1};
        assertArrayEquals(expected1, MaxMin1.maxMin1(v1, v1.length));

        // Test case 2: Array with negative integers
        int[] v2 = {-5, -4, -3, -2, -1};
        int[] expected2 = {-1, -5};
        assertArrayEquals(expected2, MaxMin1.maxMin1(v2, v2.length));

        // Test case 3: Array with mixed positive and negative integers
        int[] v3 = {-3, 2, -5, 4, -1};
        int[] expected3 = {4, -5};
        assertArrayEquals(expected3, MaxMin1.maxMin1(v3, v3.length));

        // Test case 4: Array with repeated integers
        int[] v4 = {2, 2, 2, 2, 2};
        int[] expected4 = {2, 2};
        assertArrayEquals(expected4, MaxMin1.maxMin1(v4, v4.length));

        // Test case 5: Array with only one element
        int[] v5 = {10};
        int[] expected5 = {10, 10};
        assertArrayEquals(expected5, MaxMin1.maxMin1(v5, v5.length));
    }
}