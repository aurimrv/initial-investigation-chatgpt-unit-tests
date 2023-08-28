package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin1Test16{


    @Test
    public void testMaxMin1() {
        // Test case 1: Testing with positive integers
        int[] v1 = {1, 2, 3, 4, 5};
        int n1 = 5;
        int[] expected1 = {5, 1};
        assertArrayEquals(expected1, MaxMin1.maxMin1(v1, n1));

        // Test case 2: Testing with negative integers
        int[] v2 = {-5, -4, -3, -2, -1};
        int n2 = 5;
        int[] expected2 = {-1, -5};
        assertArrayEquals(expected2, MaxMin1.maxMin1(v2, n2));

        // Test case 3: Testing with mixed positive and negative integers
        int[] v3 = {-5, 0, 5, -10, 10};
        int n3 = 5;
        int[] expected3 = {10, -10};
        assertArrayEquals(expected3, MaxMin1.maxMin1(v3, n3));

        // Test case 4: Testing with duplicate integers
        int[] v4 = {1, 1, 1, 1, 1};
        int n4 = 5;
        int[] expected4 = {1, 1};
        assertArrayEquals(expected4, MaxMin1.maxMin1(v4, n4));

        // Test case 5: Testing with an empty array
        int[] v5 = {};
        int n5 = 0;
        int[] expected5 = {0, 0};
        assertArrayEquals(expected5, MaxMin1.maxMin1(v5, n5));
    }
}