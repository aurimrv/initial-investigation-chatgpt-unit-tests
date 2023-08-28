package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin1Test22{


    @Test
    public void testMaxMin1() {
        int[] v1 = {1, 2, 3, 4, 5};
        int[] expected1 = {5, 1};
        assertArrayEquals(expected1, MaxMin1.maxMin1(v1, v1.length));

        int[] v2 = {5, 4, 3, 2, 1};
        int[] expected2 = {5, 1};
        assertArrayEquals(expected2, MaxMin1.maxMin1(v2, v2.length));

        int[] v3 = {1, 1, 1, 1, 1};
        int[] expected3 = {1, 1};
        assertArrayEquals(expected3, MaxMin1.maxMin1(v3, v3.length));

        int[] v4 = {1};
        int[] expected4 = {1, 1};
        assertArrayEquals(expected4, MaxMin1.maxMin1(v4, v4.length));

        int[] v5 = {5, 4, 3, 2, 1, 6, 7, 8, 9, 10};
        int[] expected5 = {10, 1};
        assertArrayEquals(expected5, MaxMin1.maxMin1(v5, v5.length));
    }
}