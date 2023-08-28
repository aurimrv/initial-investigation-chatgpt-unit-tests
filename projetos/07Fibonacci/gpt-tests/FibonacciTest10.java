
package ds;
import ds.Fibonacci;
import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest10 {

    @Test
    public void testFibIter() {
        assertEquals(0, Fibonacci.fibIter(0)); // Base case: n = 0
        assertEquals(1, Fibonacci.fibIter(1)); // Base case: n = 1
        assertEquals(1, Fibonacci.fibIter(2)); // n > 1
        assertEquals(2, Fibonacci.fibIter(3)); // n > 1
        assertEquals(3, Fibonacci.fibIter(4)); // n > 1
        assertEquals(5, Fibonacci.fibIter(5)); // n > 1
        assertEquals(8, Fibonacci.fibIter(6)); // n > 1
        // Add more test cases as needed
    }
}