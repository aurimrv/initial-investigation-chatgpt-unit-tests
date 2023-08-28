package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin3Test29{


    @Test
    public void testMaxMin3() {
        int[] v1 = {1, 2, 3, 4, 5};
        int[] expected1 = {5, 1};
        assertArrayEquals(expected1, MaxMin3.maxMin3(v1, v1.length));

        int[] v2 = {5, 4, 3, 2, 1};
        int[] expected2 = {5, 1};
        assertArrayEquals(expected2, MaxMin3.maxMin3(v2, v2.length));

        int[] v3 = {1, 3, 2, 5, 4};
        int[] expected3 = {5, 1};
        assertArrayEquals(expected3, MaxMin3.maxMin3(v3, v3.length));

        int[] v4 = {1, 2, 3, 4, 5, 6};
        int[] expected4 = {6, 1};
        assertArrayEquals(expected4, MaxMin3.maxMin3(v4, v4.length));

        int[] v5 = {6, 5, 4, 3, 2, 1};
        int[] expected5 = {6, 1};
        assertArrayEquals(expected5, MaxMin3.maxMin3(v5, v5.length));

        int[] v6 = {1, 4, 2, 6, 3, 5};
        int[] expected6 = {6, 1};
        assertArrayEquals(expected6, MaxMin3.maxMin3(v6, v6.length));
    }
}