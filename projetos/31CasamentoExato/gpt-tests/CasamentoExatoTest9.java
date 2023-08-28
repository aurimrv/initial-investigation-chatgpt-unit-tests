
package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class CasamentoExatoTest9 {

    @Test
    public void testForcaBrutaEmptyTextAndEmptyPattern() {
        String T = "";
        int n = T.length();
        String P = "";
        int m = P.length();
        CasamentoExato.forcaBruta(T, n, P, m);
        // Add assertions
    }

    @Test
    public void testShiftAndExatoEmptyTextAndEmptyPattern() {
        String T = "";
        int n = T.length();
        String P = "";
        int m = P.length();
        CasamentoExato.shiftAndExato(T, n, P, m);
        // Add assertions
    }

    @Test
    public void testBmhEmptyTextAndEmptyPattern() {
        String T = "";
        int n = T.length();
        String P = "";
        int m = P.length();
        CasamentoExato.bmh(T, n, P, m);
        // Add assertions
    }

    @Test
    public void testBmhsEmptyTextAndEmptyPattern() {
        String T = "";
        int n = T.length();
        String P = "";
        int m = P.length();
        CasamentoExato.bmhs(T, n, P, m);
        // Add assertions
    }

    // Add more test cases...

}