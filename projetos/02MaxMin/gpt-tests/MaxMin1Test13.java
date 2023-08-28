package ds;import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MaxMin1Test13{


    @Test
    public void testMaxMin1() {
        // Test case 1: Array with positive integers
        int[] v1 = {1, 2, 3, 4, 5};
        int n1 = 5;
        int[] expected1 = {5, 1};
        assertArrayEquals(expected1, MaxMin1.maxMin1(v1, n1));

        // Test case 2: Array with negative integers
        int[] v2 = {-5, -4, -3, -2, -1};
        int n2 = 5;
        int[] expected2 = {-1, -5};
        assertArrayEquals(expected2, MaxMin1.maxMin1(v2, n2));

        // Test case 3: Array with both positive and negative integers
        int[] v3 = {-2, 0, 3, -1, 4};
        int n3 = 5;
        int[] expected3 = {4, -2};
        assertArrayEquals(expected3, MaxMin1.maxMin1(v3, n3));

        // Test case 4: Array with only one element
        int[] v4 = {10};
        int n4 = 1;
        int[] expected4 = {10, 10};
        assertArrayEquals(expected4, MaxMin1.maxMin1(v4, n4));

        // Test case 5: Empty array
        int[] v5 = {};
        int n5 = 0;
        int[] expected5 = {0, 0};
        assertArrayEquals(expected5, MaxMin1.maxMin1(v5, n5));
    }
}