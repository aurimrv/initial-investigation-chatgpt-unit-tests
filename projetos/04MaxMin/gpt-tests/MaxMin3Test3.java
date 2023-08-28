
package ds;
import ds.MaxMin3;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin3Test3 {

    @Test
    public void testMaxMin3WithOddLength() {
        int[] v = {1, 3, 5, 2, 4};
        int n = v.length - 1;
        int[] expected = {5, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3WithEvenLength() {
        int[] v = {1, 3, 5, 2, 4, 6};
        int n = v.length - 1;
        int[] expected = {6, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3WithMaxAndMinAtBeginning() {
        int[] v = {5, 3, 2, 4};
        int n = v.length - 1;
        int[] expected = {5, 2};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3WithMaxAndMinAtEnd() {
        int[] v = {1, 3, 4, 2};
        int n = v.length - 1;
        int[] expected = {4, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }
}
