
package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin1Test6 {

    @Test
    public void testMaxMin1() {
        int[] input1 = {1, 2, 3, 4, 5};
        int[] expected1 = {5, 1};
        assertArrayEquals(expected1, MaxMin1.maxMin1(input1, input1.length));
        
        int[] input2 = {5, 4, 3, 2, 1};
        int[] expected2 = {5, 1};
        assertArrayEquals(expected2, MaxMin1.maxMin1(input2, input2.length));
        
        int[] input3 = {5, 5, 5, 5, 5};
        int[] expected3 = {5, 5};
        assertArrayEquals(expected3, MaxMin1.maxMin1(input3, input3.length));
        
        int[] input4 = {-1, -2, -3, -4, -5};
        int[] expected4 = {-1, -5};
        assertArrayEquals(expected4, MaxMin1.maxMin1(input4, input4.length));
        
        int[] input5 = {0, 0, 0, 0, 0};
        int[] expected5 = {0, 0};
        assertArrayEquals(expected5, MaxMin1.maxMin1(input5, input5.length));
    }
}