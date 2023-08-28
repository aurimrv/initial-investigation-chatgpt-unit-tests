
package ds;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MaxMin3Test11 {

    @Test
    public void testMaxMin3WithOneElementArray() {
        int[] expected = {5, 5};
        int[] actual = MaxMin3.maxMin3(new int[]{5}, 1);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMaxMin3WithTwoElementArray() {
        int[] expected = {7, 3};
        int[] actual = MaxMin3.maxMin3(new int[]{7, 3}, 2);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMaxMin3WithOddSizedArray() {
        int[] expected = {9, 2};
        int[] actual = MaxMin3.maxMin3(new int[]{5, 9, 2, 7, 1}, 5);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMaxMin3WithEvenSizedArray() {
        int[] expected = {8, 1};
        int[] actual = MaxMin3.maxMin3(new int[]{4, 2, 8, 1, 6, 3}, 6);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMaxMin3WithDescendingArray() {
        int[] expected = {10, 1};
        int[] actual = MaxMin3.maxMin3(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, 10);
        assertArrayEquals(expected, actual);
    }
}