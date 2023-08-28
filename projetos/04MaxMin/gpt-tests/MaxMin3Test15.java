package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin3Test15{


    @Test
    public void testMaxMin3_oddLength() {
        int[] v = {1, 5, 3, 2, 4};
        int n = 5;
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
    }
    
    @Test
    public void testMaxMin3_evenLength() {
        int[] v = {4, 2, 6, 1, 5, 3};
        int n = 6;
        int[] expected = {6, 1};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
    }
    
    @Test
    public void testMaxMin3_singleElement() {
        int[] v = {5};
        int n = 1;
        int[] expected = {5, 5};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
    }
    
    @Test
    public void testMaxMin3_negativeNumbers() {
        int[] v = {-3, -1, -5, -2, -4};
        int n = 5;
        int[] expected = {-1, -5};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
    }
}