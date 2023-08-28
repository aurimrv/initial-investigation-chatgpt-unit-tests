package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin2Test13{


    @Test
    public void testMaxMin2() {
        // Test case 1: Array with positive integers
        int[] v1 = {1, 2, 3, 4, 5};
        int[] expected1 = {5, 1};
        assertArrayEquals(expected1, MaxMin2.maxMin2(v1, v1.length));

        // Test case 2: Array with negative integers
        int[] v2 = {-5, -4, -3, -2, -1};
        int[] expected2 = {-1, -5};
        assertArrayEquals(expected2, MaxMin2.maxMin2(v2, v2.length));

        // Test case 3: Array with a mix of positive and negative integers
        int[] v3 = {-2, 5, -1, 3, -4};
        int[] expected3 = {5, -4};
        assertArrayEquals(expected3, MaxMin2.maxMin2(v3, v3.length));

        // Test case 4: Array with duplicates
        int[] v4 = {1, 2, 3, 3, 2, 1};
        int[] expected4 = {3, 1};
        assertArrayEquals(expected4, MaxMin2.maxMin2(v4, v4.length));

        // Test case 5: Array with length 1
        int[] v5 = {10};
        int[] expected5 = {10, 10};
        assertArrayEquals(expected5, MaxMin2.maxMin2(v5, v5.length));
    }
}