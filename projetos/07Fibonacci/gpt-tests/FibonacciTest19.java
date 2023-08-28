package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest19{


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
        assertEquals(8, Fibonacci.fibIter(6));
    }

    @Test
    public void testFibIterWithLargeNumber() {
        assertEquals(1134903170, Fibonacci.fibIter(45));
    }
}