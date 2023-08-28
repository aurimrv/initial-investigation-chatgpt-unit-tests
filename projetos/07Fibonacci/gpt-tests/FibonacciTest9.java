
package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest9 {

    @Test
    public void testFibIterWithZero() {
        int result = Fibonacci.fibIter(0);
        assertEquals(0, result);
    }

    @Test
    public void testFibIterWithPositiveNumber() {
        int result = Fibonacci.fibIter(5);
        assertEquals(5, result);
    }

    @Test
    public void testFibIterWithNegativeNumber() {
        int result = Fibonacci.fibIter(-10);
        assertEquals(-55, result);
    }

    @Test
    public void testFibIterWithLargeNumber() {
        int result = Fibonacci.fibIter(40);
        assertEquals(102334155, result);
    }
}