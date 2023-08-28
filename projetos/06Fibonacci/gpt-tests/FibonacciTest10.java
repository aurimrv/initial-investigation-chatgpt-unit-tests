
package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest10 {

    @Test
    public void testFibIter_WithZero_ReturnsZero() {
        int result = Fibonacci.fibIter(0);
        assertEquals(0, result);
    }

    @Test
    public void testFibIter_WithOne_ReturnsOne() {
        int result = Fibonacci.fibIter(1);
        assertEquals(1, result);
    }

    @Test
    public void testFibIter_WithTwo_ReturnsOne() {
        int result = Fibonacci.fibIter(2);
        assertEquals(1, result);
    }

    @Test
    public void testFibIter_WithTen_Returns55() {
        int result = Fibonacci.fibIter(10);
        assertEquals(55, result);
    }

    // Add more test cases as needed

}