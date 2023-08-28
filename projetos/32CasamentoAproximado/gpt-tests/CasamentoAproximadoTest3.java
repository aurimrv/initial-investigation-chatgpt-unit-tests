
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest3 {
  
  @Test
  public void testShiftAndAproximado() {
    String T = "abcde";
    String P = "bcd";
    int k = 0;
    CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
    // add assertions here
  }
  
  @Test
  public void testShiftAndAproximadoWithMultipleMatches() {
    String T = "ababab";
    String P = "aba";
    int k = 1;
    CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
    // add assertions here
  }
  
  @Test
  public void testShiftAndAproximadoWithNoMatch() {
    String T = "abcdefgh";
    String P = "ijkl";
    int k = 2;
    CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
    // add assertions here
  }
  
  // add more test cases here
  
}
