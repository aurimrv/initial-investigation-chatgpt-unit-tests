
package ds;import ds.CasamentoExato;
import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoExatoTest11 {
    
    @Test
    public void testForcaBruta() {
        String T = "abcdefg";
        int n = T.length();
        String P = "def";
        int m = P.length();
        CasamentoExato.forcaBruta(T, n, P, m);
        // Add assertions here
    }
    
    @Test
    public void testShiftAndExato() {
        String T = "abcdefgh";
        int n = T.length();
        String P = "def";
        int m = P.length();
        CasamentoExato.shiftAndExato(T, n, P, m);
        // Add assertions here
    }
    
    @Test
    public void testBmh() {
        String T = "abcdefgh";
        int n = T.length();
        String P = "def";
        int m = P.length();
        CasamentoExato.bmh(T, n, P, m);
        // Add assertions here
    }
    
    @Test
    public void testBmhs() {
        String T = "abcdefgh";
        int n = T.length();
        String P = "def";
        int m = P.length();
        CasamentoExato.bmhs(T, n, P, m);
        // Add assertions here
    }
}
