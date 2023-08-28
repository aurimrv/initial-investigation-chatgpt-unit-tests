package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin4Test12{

    
    @Test
    public void testMaxMin4_1() {
        int[] v = {1, 2, 3, 4, 5};
        int linf = 0;
        int lsup = 4;
        int[] expected = {5, 1};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testMaxMin4_2() {
        int[] v = {5, 4, 3, 2, 1};
        int linf = 0;
        int lsup = 4;
        int[] expected = {5, 1};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testMaxMin4_3() {
        int[] v = {1, 3, 2, 5, 4};
        int linf = 0;
        int lsup = 4;
        int[] expected = {5, 1};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testMaxMin4_4() {
        int[] v = {1};
        int linf = 0;
        int lsup = 0;
        int[] expected = {1, 1};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testMaxMin4_5() {
        int[] v = {1, 2};
        int linf = 0;
        int lsup = 1;
        int[] expected = {2, 1};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }
}