
package ds;import org.junit.Test;
import static org.junit.Assert.assertEquals;
import ds.Fibonacci;

public class FibonacciTest8 {
  
  @Test
  public void testFibIterWithZero() {
    int actual = Fibonacci.fibIter(0);
    int expected = 0;
    assertEquals(expected, actual);
  }
  
  @Test
  public void testFibIterWithPositiveNumber() {
    int actual = Fibonacci.fibIter(5);
    int expected = 5;
    assertEquals(expected, actual);
  }
  
  @Test
  public void testFibIterWithNegativeNumber() {
    int actual = Fibonacci.fibIter(-3);
    int expected = 0;
    assertEquals(expected, actual);
  }
  
  @Test
  public void testFibIterWithLargeNumber() {
    int actual = Fibonacci.fibIter(10);
    int expected = 55;
    assertEquals(expected, actual);
  }
}