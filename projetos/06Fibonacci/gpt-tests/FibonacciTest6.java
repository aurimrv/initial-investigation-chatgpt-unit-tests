
package ds;import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FibonacciTest6 {

   @Test
   public void testFibIterWithZero() {
      int result = Fibonacci.fibIter(0);
      assertEquals(0, result);
   }

   @Test
   public void testFibIterWithPositiveNumber() {
      int result = Fibonacci.fibIter(5);
      assertEquals(5, result);
   }

   @Test
   public void testFibIterWithNegativeNumber() {
      int result = Fibonacci.fibIter(-7);
      assertEquals(0, result);
   }
   
   @Test
   public void testFibIterWithLargeNumber() {
      int result = Fibonacci.fibIter(20);
      assertEquals(6765, result);
   }
}