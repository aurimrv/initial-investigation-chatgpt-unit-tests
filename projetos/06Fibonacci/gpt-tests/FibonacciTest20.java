package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest20{


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
        int result = Fibonacci.fibIter(-5);
        assertEquals(0, result);
    }
}