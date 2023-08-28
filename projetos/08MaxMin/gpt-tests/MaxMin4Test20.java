package ds;import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxMin4Test20{


    @Test
    public void testMaxMin4() {
        int[] v = {1, 2, 3, 4, 5};
        int linf = 0;
        int lsup = 4;
        int[] expected = {5, 1};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }
    
    @Test
    public void testMaxMin4WithNegativeValues() {
        int[] v = {-5, -4, -3, -2, -1};
        int linf = 0;
        int lsup = 4;
        int[] expected = {-1, -5};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }
    
    @Test
    public void testMaxMin4WithDuplicateValues() {
        int[] v = {1, 1, 2, 2, 3, 3};
        int linf = 0;
        int lsup = 5;
        int[] expected = {3, 1};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }
    
    @Test
    public void testMaxMin4WithEmptyArray() {
        int[] v = {};
        int linf = 0;
        int lsup = 0;
        int[] expected = {0, 0};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }
}