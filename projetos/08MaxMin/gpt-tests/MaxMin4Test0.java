
package ds;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class MaxMin4Test0 {
    
    @Test
    public void testMaxMin4() {
        int[] v = {1, 2, 3, 4, 5};
        int linf = 0;
        int lsup = v.length - 1;
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }
    
    @Test
    public void testMaxMin4WithNegativeNumbers() {
        int[] v = {-5, -2, 0, 3, 7};
        int linf = 0;
        int lsup = v.length - 1;
        int[] expected = {7, -5};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }
    
    @Test
    public void testMaxMin4WithDuplicateNumbers() {
        int[] v = {1, 2, 3, 3, 5};
        int linf = 0;
        int lsup = v.length - 1;
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }
    
    @Test
    public void testMaxMin4WithEmptyArray() {
        int[] v = {};
        int linf = 0;
        int lsup = v.length - 1;
        int[] expected = {Integer.MIN_VALUE, Integer.MAX_VALUE};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }
}
