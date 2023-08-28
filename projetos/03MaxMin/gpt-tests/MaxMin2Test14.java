package ds;import ds.MaxMin2;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MaxMin2Test14{


    @Test
    public void testMaxMin2() {
        int[] v1 = {1, 2, 3, 4, 5};
        int[] expected1 = {5, 1};
        assertArrayEquals(expected1, MaxMin2.maxMin2(v1, v1.length));

        int[] v2 = {5, 4, 3, 2, 1};
        int[] expected2 = {5, 1};
        assertArrayEquals(expected2, MaxMin2.maxMin2(v2, v2.length));

        int[] v3 = {1, 1, 1, 1, 1};
        int[] expected3 = {1, 1};
        assertArrayEquals(expected3, MaxMin2.maxMin2(v3, v3.length));

        int[] v4 = {-1, -2, -3, -4, -5};
        int[] expected4 = {-1, -5};
        assertArrayEquals(expected4, MaxMin2.maxMin2(v4, v4.length));

        int[] v5 = {0, 0, 0, 0, 0};
        int[] expected5 = {0, 0};
        assertArrayEquals(expected5, MaxMin2.maxMin2(v5, v5.length));

        int[] v6 = {1};
        int[] expected6 = {1, 1};
        assertArrayEquals(expected6, MaxMin2.maxMin2(v6, v6.length));
    }
}