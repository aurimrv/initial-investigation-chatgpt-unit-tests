package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin2Test1 {

    @Test
    public void testMaxMin2() {
        // Test case 1
        int[] v1 = {1, 2, 3, 4, 5};
        int[] expected1 = {5, 1};
        assertArrayEquals(expected1, MaxMin2.maxMin2(v1, v1.length));

        // Test case 2
        int[] v2 = {5, 4, 3, 2, 1};
        int[] expected2 = {5, 1};
        assertArrayEquals(expected2, MaxMin2.maxMin2(v2, v2.length));

        // Test case 3
        int[] v3 = {1, 1, 1, 1, 1};
        int[] expected3 = {1, 1};
        assertArrayEquals(expected3, MaxMin2.maxMin2(v3, v3.length));

        // Test case 4
        int[] v4 = {1};
        int[] expected4 = {1, 1};
        assertArrayEquals(expected4, MaxMin2.maxMin2(v4, v4.length));

        // Test case 5
        int[] v5 = {5, 2, 10, 4, 1};
        int[] expected5 = {10, 1};
        assertArrayEquals(expected5, MaxMin2.maxMin2(v5, v5.length));
    }
}