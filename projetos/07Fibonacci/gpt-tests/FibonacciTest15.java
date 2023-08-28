package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest15{


    @Test
    public void testFibIterForZero() {
        assertEquals(0, Fibonacci.fibIter(0));
    }

    @Test
    public void testFibIterForOne() {
        assertEquals(1, Fibonacci.fibIter(1));
    }

    @Test
    public void testFibIterForNegativeNumber() {
        assertEquals(-1, Fibonacci.fibIter(-5));
    }

    @Test
    public void testFibIterForLargeNumber() {
        assertEquals(102334155, Fibonacci.fibIter(40));
    }
}