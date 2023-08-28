
package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FibonacciTest11 {
  
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
    assertEquals(5, Fibonacci.fibIter(5));
  }
  
  @Test
  public void testFibIterWithNegativeNumber() {
    assertEquals(-1, Fibonacci.fibIter(-1));
  }

  @Test
  public void testFibIterWithLargeNumber() {
    assertEquals(832040, Fibonacci.fibIter(30));
  }
}