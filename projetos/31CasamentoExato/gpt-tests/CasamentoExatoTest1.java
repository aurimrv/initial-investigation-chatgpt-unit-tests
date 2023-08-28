
package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoExatoTest1 {

    @Test
    public void testForcaBruta() {
        String T = "ababcababcabc";
        int n = T.length();
        String P = "abc";
        int m = P.length();
        CasamentoExato.forcaBruta(T, n, P, m);
    }

    @Test
    public void testShiftAndExato() {
        String T = "ababcababcabc";
        int n = T.length();
        String P = "abc";
        int m = P.length();
        CasamentoExato.shiftAndExato(T, n, P, m);
    }

    @Test
    public void testBmh() {
        String T = "ababcababcabc";
        int n = T.length();
        String P = "abc";
        int m = P.length();
        CasamentoExato.bmh(T, n, P, m);
    }

    @Test
    public void testBmhs() {
        String T = "ababcababcabc";
        int n = T.length();
        String P = "abc";
        int m = P.length();
        CasamentoExato.bmhs(T, n, P, m);
    }
}