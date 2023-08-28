
package ds;import static org.junit.Assert.*;
import org.junit.Test;


public class CasamentoExatoTest6 {

  @Test
  public void testForcaBruta() {
    String T = "Hello, World!";
    String P = "World";
    int n = T.length();
    int m = P.length();
    
    CasamentoExato.forcaBruta(T, n, P, m);
  }

  @Test
  public void testShiftAndExato() {
    String T = "Hello, World!";
    String P = "World";
    int n = T.length();
    int m = P.length();
    
    CasamentoExato.shiftAndExato(T, n, P, m);
  }

  @Test
  public void testBmh() {
    String T = "Hello, World!";
    String P = "World";
    int n = T.length();
    int m = P.length();
    
    CasamentoExato.bmh(T, n, P, m);
  }

  @Test
  public void testBmhs() {
    String T = "Hello, World!";
    String P = "World";
    int n = T.length();
    int m = P.length();
    
    CasamentoExato.bmhs(T, n, P, m);
  }
}