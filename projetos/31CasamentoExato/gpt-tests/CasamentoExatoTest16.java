package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoExatoTest16{


    @Test
    public void testForcaBruta() {
        String T = "ababab";
        int n = T.length();
        String P = "aba";
        int m = P.length();
        CasamentoExato.forcaBruta(T, n, P, m);
        // Add assertions here to check the output
    }

    @Test
    public void testShiftAndExato() {
        String T = "ababab";
        int n = T.length();
        String P = "aba";
        int m = P.length();
        CasamentoExato.shiftAndExato(T, n, P, m);
        // Add assertions here to check the output
    }

    @Test
    public void testBmh() {
        String T = "ababab";
        int n = T.length();
        String P = "aba";
        int m = P.length();
        CasamentoExato.bmh(T, n, P, m);
        // Add assertions here to check the output
    }

    @Test
    public void testBmhs() {
        String T = "ababab";
        int n = T.length();
        String P = "aba";
        int m = P.length();
        CasamentoExato.bmhs(T, n, P, m);
        // Add assertions here to check the output
    }
}