
package ds;import ds.Fibonacci;
import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest7 {

    @Test
    public void testFibonacciZero() {
        int result = Fibonacci.fibIter(0);
        assertEquals(0, result);
    }

    @Test
    public void testFibonacciOne() {
        int result = Fibonacci.fibIter(1);
        assertEquals(1, result);
    }

    @Test
    public void testFibonacciSmallNumber() {
        int result = Fibonacci.fibIter(5);
        assertEquals(5, result);
    }

    @Test
    public void testFibonacciLargeNumber() {
        int result = Fibonacci.fibIter(10);
        assertEquals(55, result);
    }
}