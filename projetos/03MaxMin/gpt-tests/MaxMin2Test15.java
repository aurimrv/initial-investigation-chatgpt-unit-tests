package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin2Test15{


    @Test
    public void testMaxMin2_1() {
        int v[] = {1, 2, 3, 4, 5};
        int n = 5;
        int expected[] = {5, 1};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }

    @Test
    public void testMaxMin2_2() {
        int v[] = {5, 4, 3, 2, 1};
        int n = 5;
        int expected[] = {5, 1};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }

    @Test
    public void testMaxMin2_3() {
        int v[] = {1, 1, 1, 1, 1};
        int n = 5;
        int expected[] = {1, 1};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }

    @Test
    public void testMaxMin2_4() {
        int v[] = {10};
        int n = 1;
        int expected[] = {10, 10};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }

    @Test
    public void testMaxMin2_5() {
        int v[] = {0, -1, -2, -3, -4};
        int n = 5;
        int expected[] = {0, -4};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }
}