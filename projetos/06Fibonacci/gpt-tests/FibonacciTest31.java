package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest31{


    @Test
    public void testFibIterWithZero() {
        int result = Fibonacci.fibIter(0);
        assertEquals(0, result);
    }

    @Test
    public void testFibIterWithOne() {
        int result = Fibonacci.fibIter(1);
        assertEquals(1, result);
    }

    @Test
    public void testFibIterWithPositiveNumber() {
        int result = Fibonacci.fibIter(6);
        assertEquals(8, result);
    }

    @Test
    public void testFibIterWithNegativeNumber() {
        int result = Fibonacci.fibIter(-5);
        assertEquals(-5, result);
    }
}