
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest2 {

    @Test
    public void testFibIterWithZero() {
        assertEquals(0, Fibonacci.fibIter(0));
    }

    @Test
    public void testFibIterWithOne() {
        assertEquals(1, Fibonacci.fibIter(1));
    }

    @Test
    public void testFibIterWithPositiveNumber() {
        assertEquals(1, Fibonacci.fibIter(2));
        assertEquals(2, Fibonacci.fibIter(3));
        assertEquals(5, Fibonacci.fibIter(5));
        assertEquals(8, Fibonacci.fibIter(6));
    }

    @Test
    public void testFibIterWithNegativeNumber() {
        assertEquals(-1, Fibonacci.fibIter(-1));
        assertEquals(1, Fibonacci.fibIter(-2));
        assertEquals(-2, Fibonacci.fibIter(-3));
        assertEquals(3, Fibonacci.fibIter(-4));
        assertEquals(-5, Fibonacci.fibIter(-5));
    }
}