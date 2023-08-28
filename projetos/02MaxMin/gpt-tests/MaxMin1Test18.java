package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin1Test18{


    @Test
    public void testMaxMin1() {
        int[] v1 = {1, 2, 3, 4, 5};
        int n1 = 5;
        int[] expected1 = {5, 1};
        assertArrayEquals(expected1, MaxMin1.maxMin1(v1, n1));

        int[] v2 = {5, 4, 3, 2, 1};
        int n2 = 5;
        int[] expected2 = {5, 1};
        assertArrayEquals(expected2, MaxMin1.maxMin1(v2, n2));

        int[] v3 = {1, 1, 1, 1, 1};
        int n3 = 5;
        int[] expected3 = {1, 1};
        assertArrayEquals(expected3, MaxMin1.maxMin1(v3, n3));

        int[] v4 = {10, -5, 0, 20, -15};
        int n4 = 5;
        int[] expected4 = {20, -15};
        assertArrayEquals(expected4, MaxMin1.maxMin1(v4, n4));
    }
}