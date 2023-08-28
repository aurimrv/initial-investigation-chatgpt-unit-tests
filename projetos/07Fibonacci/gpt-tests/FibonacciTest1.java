
package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest1 {

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
    public void testFibIter_WithTen_ReturnsFiftyFive() {
        int result = Fibonacci.fibIter(10);
        assertEquals(55, result);
    }

    @Test
    public void testFibIter_WithNegativeNumber_ReturnsNegativeOne() {
        int result = Fibonacci.fibIter(-5);
        assertEquals(-1, result);
    }
}