
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest3 {

    @Test
    public void testFibIterWithPositiveInput() {
        assertEquals(0, Fibonacci.fibIter(0));
        assertEquals(1, Fibonacci.fibIter(1));
        assertEquals(1, Fibonacci.fibIter(2));
        assertEquals(2, Fibonacci.fibIter(3));
        assertEquals(3, Fibonacci.fibIter(4));
        assertEquals(5, Fibonacci.fibIter(5));
        assertEquals(8, Fibonacci.fibIter(6));
        assertEquals(13, Fibonacci.fibIter(7));
        assertEquals(21, Fibonacci.fibIter(8));
        // additional test cases for positive input
    }

    @Test
    public void testFibIterWithNegativeInput() {
        // additional test cases for negative input
    }

    @Test
    public void testFibIterWithZeroInput() {
        // additional test cases for zero input
    }

    @Test
    public void testFibIterWithLargeInput() {
        // additional test cases for large input
    }
}