package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.CasamentoExato;

public class CasamentoExatoTest17{

  
  @Test
  public void testForcaBruta() {
    String T = "abcdeabc";
    String P = "abc";
    CasamentoExato.forcaBruta(T, T.length(), P, P.length());
    // add assertion here
  }
  
  @Test
  public void testShiftAndExato() {
    String T = "abcdeabc";
    String P = "abc";
    CasamentoExato.shiftAndExato(T, T.length(), P, P.length());
    // add assertion here
  }
  
  @Test
  public void testBmh() {
    String T = "abcdeabc";
    String P = "abc";
    CasamentoExato.bmh(T, T.length(), P, P.length());
    // add assertion here
  }
  
  @Test
  public void testBmhs() {
    String T = "abcdeabc";
    String P = "abc";
    CasamentoExato.bmhs(T, T.length(), P, P.length());
    // add assertion here
  }
}