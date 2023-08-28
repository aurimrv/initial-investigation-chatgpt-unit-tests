package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest15{


    @Test
    public void testFibIterWithZero() {
        assertEquals(0, Fibonacci.fibIter(0));
    }

    @Test
    public void testFibIterWithOne() {
        assertEquals(1, Fibonacci.fibIter(1));
    }

    @Test
    public void testFibIterWithSmallNumber() {
        assertEquals(1, Fibonacci.fibIter(2));
        assertEquals(2, Fibonacci.fibIter(3));
        assertEquals(3, Fibonacci.fibIter(4));
        assertEquals(5, Fibonacci.fibIter(5));
        assertEquals(8, Fibonacci.fibIter(6));
    }

    @Test
    public void testFibIterWithLargeNumber() {
        assertEquals(1134903170, Fibonacci.fibIter(45));
        assertEquals(102334155, Fibonacci.fibIter(40));
    }
}