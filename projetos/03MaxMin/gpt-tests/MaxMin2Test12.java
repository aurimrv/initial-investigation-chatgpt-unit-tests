package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin2Test12{


    @Test
    public void testMaxMin2() {
        int[] v1 = {1, 2, 3, 4, 5};
        int n1 = 5;
        int[] expected1 = {5, 1};
        assertArrayEquals(expected1, MaxMin2.maxMin2(v1, n1));

        int[] v2 = {5, 4, 3, 2, 1};
        int n2 = 5;
        int[] expected2 = {5, 1};
        assertArrayEquals(expected2, MaxMin2.maxMin2(v2, n2));

        int[] v3 = {1, 1, 1, 1, 1};
        int n3 = 5;
        int[] expected3 = {1, 1};
        assertArrayEquals(expected3, MaxMin2.maxMin2(v3, n3));

        int[] v4 = {-1, -2, -3, -4, -5};
        int n4 = 5;
        int[] expected4 = {-1, -5};
        assertArrayEquals(expected4, MaxMin2.maxMin2(v4, n4));

        int[] v5 = {0, 0, 0, 0, 0};
        int n5 = 5;
        int[] expected5 = {0, 0};
        assertArrayEquals(expected5, MaxMin2.maxMin2(v5, n5));
    }
}