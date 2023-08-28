package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin3Test16{


    @Test
    public void testMaxMin3() {
        int[] v1 = {1, 2, 3};
        int[] expected1 = {3, 1};
        assertArrayEquals(expected1, MaxMin3.maxMin3(v1, v1.length));

        int[] v2 = {5, 2, 7, 1, 9, 4};
        int[] expected2 = {9, 1};
        assertArrayEquals(expected2, MaxMin3.maxMin3(v2, v2.length));

        int[] v3 = {10, 5, 8, 3, 12, 7, 15, 6};
        int[] expected3 = {15, 3};
        assertArrayEquals(expected3, MaxMin3.maxMin3(v3, v3.length));

        int[] v4 = {1, 1, 1, 1, 1};
        int[] expected4 = {1, 1};
        assertArrayEquals(expected4, MaxMin3.maxMin3(v4, v4.length));
    }
}