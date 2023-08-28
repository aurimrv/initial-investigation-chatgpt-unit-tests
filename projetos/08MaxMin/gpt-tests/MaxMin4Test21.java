package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin4Test21{

    
    @Test
    public void testMaxMin4() {
        int[] v1 = {1, 2, 3, 4, 5};
        int[] expected1 = {5, 1};
        assertArrayEquals(expected1, MaxMin4.maxMin4(v1, 0, v1.length - 1));
        
        int[] v2 = {5, 4, 3, 2, 1};
        int[] expected2 = {5, 1};
        assertArrayEquals(expected2, MaxMin4.maxMin4(v2, 0, v2.length - 1));
        
        int[] v3 = {1, 3, 2, 5, 4};
        int[] expected3 = {5, 1};
        assertArrayEquals(expected3, MaxMin4.maxMin4(v3, 0, v3.length - 1));
        
        int[] v4 = {1, 1, 1, 1, 1};
        int[] expected4 = {1, 1};
        assertArrayEquals(expected4, MaxMin4.maxMin4(v4, 0, v4.length - 1));
        
        int[] v5 = {5};
        int[] expected5 = {5, 5};
        assertArrayEquals(expected5, MaxMin4.maxMin4(v5, 0, v5.length - 1));
    }
}