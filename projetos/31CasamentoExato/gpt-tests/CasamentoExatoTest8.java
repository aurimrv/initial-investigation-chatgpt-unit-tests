
package ds;import ds.CasamentoExato;
import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoExatoTest8 {

    @Test
    public void testForcaBrutaShouldFindMatch() {
        String T = "ababab";
        int n = T.length();
        String P = "aba";
        int m = P.length();
        CasamentoExato.forcaBruta(T, n, P, m);
        // TODO: Add assertion for the output message
    }

    @Test
    public void testShiftAndExatoShouldFindMatch() {
        String T = "ababab";
        int n = T.length();
        String P = "aba";
        int m = P.length();
        CasamentoExato.shiftAndExato(T, n, P, m);
        // TODO: Add assertion for the output message
    }

    @Test
    public void testBmhShouldFindMatch() {
        String T = "ababab";
        int n = T.length();
        String P = "aba";
        int m = P.length();
        CasamentoExato.bmh(T, n, P, m);
        // TODO: Add assertion for the output message
    }

    @Test
    public void testBmhsShouldFindMatch() {
        String T = "ababab";
        int n = T.length();
        String P = "aba";
        int m = P.length();
        CasamentoExato.bmhs(T, n, P, m);
        // TODO: Add assertion for the output message
    }
}