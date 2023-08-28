
package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoExatoTest3 {

    @Test
    public void testForcaBruta() {
        String T = "abcdefg";
        int n = 7;
        String P = "cde";
        int m = 3;
        CasamentoExato.forcaBruta(T, n, P, m);
        // Verify the output
    }

    @Test
    public void testShiftAndExato() {
        String T = "abcdefg";
        int n = 7;
        String P = "cde";
        int m = 3;
        CasamentoExato.shiftAndExato(T, n, P, m);
        // Verify the output
    }

    @Test
    public void testBmh() {
        String T = "abcdefg";
        int n = 7;
        String P = "cde";
        int m = 3;
        CasamentoExato.bmh(T, n, P, m);
        // Verify the output
    }

    @Test
    public void testBmhs() {
        String T = "abcdefg";
        int n = 7;
        String P = "cde";
        int m = 3;
        CasamentoExato.bmhs(T, n, P, m);
        // Verify the output
    }
}