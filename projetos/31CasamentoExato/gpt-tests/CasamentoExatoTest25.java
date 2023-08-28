package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoExatoTest25{


    @Test
    public void testForcaBruta() {
        String T = "abcdefg";
        int n = T.length();
        String P = "cde";
        int m = P.length();
        CasamentoExato.forcaBruta(T, n, P, m);
        // Add assertions here
    }

    @Test
    public void testShiftAndExato() {
        String T = "abcdefg";
        int n = T.length();
        String P = "cde";
        int m = P.length();
        CasamentoExato.shiftAndExato(T, n, P, m);
        // Add assertions here
    }

    @Test
    public void testBmh() {
        String T = "abcdefg";
        int n = T.length();
        String P = "cde";
        int m = P.length();
        CasamentoExato.bmh(T, n, P, m);
        // Add assertions here
    }

    @Test
    public void testBmhs() {
        String T = "abcdefg";
        int n = T.length();
        String P = "cde";
        int m = P.length();
        CasamentoExato.bmhs(T, n, P, m);
        // Add assertions here
    }
}