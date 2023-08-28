
package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest11 {

    @Test
    public void testFibIterForZero() {
        assertEquals(0, Fibonacci.fibIter(0));
    }

    @Test
    public void testFibIterForPositiveNumbers() {
        assertEquals(1, Fibonacci.fibIter(1));
        assertEquals(1, Fibonacci.fibIter(2));
        assertEquals(2, Fibonacci.fibIter(3));
        assertEquals(3, Fibonacci.fibIter(4));
        assertEquals(5, Fibonacci.fibIter(5));

        // Add more test cases for positive numbers if needed
    }

    @Test
    public void testFibIterForNegativeNumbers() {
        // Fibonacci series is defined only for non-negative integers
        // Handling negative numbers should throw an exception or return an error code
        // Add test case(s) to represent this behavior if needed
    }

    @Test
    public void testFibIterForLargeNumbers() {
        // Add test case(s) to check the behavior of Fibonacci series for large numbers
    }
}