
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest5 {

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
        assertEquals(832040, Fibonacci.fibIter(30));
    }
}