
package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoExatoTest10 {

   @Test
   public void testForcaBruta() {
      String T = "This is a test string";
      String P = "test";
      CasamentoExato.forcaBruta(T, T.length(), P, P.length());
      // Write an assertion to verify the output
   }
   
   @Test
   public void testShiftAndExato() {
      String T = "This is a test string";
      String P = "test";
      CasamentoExato.shiftAndExato(T, T.length(), P, P.length());
      // Write an assertion to verify the output
   }
   
   @Test
   public void testBmh() {
      String T = "This is a test string";
      String P = "test";
      CasamentoExato.bmh(T, T.length(), P, P.length());
      // Write an assertion to verify the output
   }
   
   @Test
   public void testBmhs() {
      String T = "This is a test string";
      String P = "test";
      CasamentoExato.bmhs(T, T.length(), P, P.length());
      // Write an assertion to verify the output
   }
}