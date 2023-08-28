
package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest3 {
  
  @Test
  public void testFibIterWithZeroShouldReturnZero() {
    int result = Fibonacci.fibIter(0);
    assertEquals(0, result);
  }
  
  @Test
  public void testFibIterWithOneShouldReturnOne() {
    int result = Fibonacci.fibIter(1);
    assertEquals(1, result);
  }
  
  @Test
  public void testFibIterWithNegativeNumberShouldReturnZero() {
    int result = Fibonacci.fibIter(-5);
    assertEquals(0, result);
  }
  
  @Test
  public void testFibIterWithValidNumberShouldReturnCorrectResult() {
    int result = Fibonacci.fibIter(6);
    assertEquals(8, result);
  }
  
  @Test
  public void testFibIterWithLargeNumberShouldNotCauseOverflow() {
    int result = Fibonacci.fibIter(50);
    assertFalse(result < 0);
  }
}