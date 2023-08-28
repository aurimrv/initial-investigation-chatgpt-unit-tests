
package ds;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CasamentoAproximadoTest0 {
  
  @Test
  public void testShiftAndAproximado() {
    String T = "ABCDABCDABCD";
    String P = "ABCD";
    int k = 1;
    String expected = "Casamento na posicao: 0\nCasamento na posicao: 4\nCasamento na posicao: 8\n";
    assertEquals(expected, CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k));
  }
  
  @Test
  public void testShiftAndAproximadoEmptyText() {
    String T = "";
    String P = "ABCD";
    int k = 1;
    String expected = "";
    assertEquals(expected, CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k));
  }
  
  @Test
  public void testShiftAndAproximadoEmptyPattern() {
    String T = "ABCDABCDABCD";
    String P = "";
    int k = 1;
    String expected = "";
    assertEquals(expected, CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k));
  }
  
  @Test
  public void testShiftAndAproximadoNoMatch() {
    String T = "ABCDABCDABCD";
    String P = "XYZ";
    int k = 1;
    String expected = "";
    assertEquals(expected, CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k));
  }
  
  @Test
  public void testShiftAndAproximadoMultipleMatches() {
    String T = "ABCDABCDABCD";
    String P = "AB";
    int k = 2;
    String expected = "Casamento na posicao: 0\nCasamento na posicao: 4\nCasamento na posicao: 8\n";
    assertEquals(expected, CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k));
  }
  
}
