
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest8 {

    @Test
    public void testFibIterWithZero() {
        int result = Fibonacci.fibIter(0);
        assertEquals(0, result);
    }

    @Test
    public void testFibIterWithPositiveNumber() {
        int result = Fibonacci.fibIter(6);
        assertEquals(8, result);
    }

    @Test
    public void testFibIterWithNegativeNumber() {
        int result = Fibonacci.fibIter(-3);
        assertEquals(2, result);
    }

    @Test
    public void testFibIterWithLargeNumber() {
        int result = Fibonacci.fibIter(20);
        assertEquals(6765, result);
    }
}