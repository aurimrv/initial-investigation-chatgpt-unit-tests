
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest6 {

    @Test
    public void testShiftAndAproximado() {
        String T = "abacabadabacaba";
        String P = "aba";
        int k = 1;
        int n = T.length();
        int m = P.length();
        
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test
    public void testShiftAndAproximado_NoMatches() {
        String T = "abacabadabacaba";
        String P = "xyz";
        int k = 1;
        int n = T.length();
        int m = P.length();
        
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test
    public void testShiftAndAproximado_MultipleMatches() {
        String T = "abacabadabacaba";
        String P = "aba";
        int k = 2;
        int n = T.length();
        int m = P.length();
        
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test
    public void testShiftAndAproximado_EmptyStrings() {
        String T = "";
        String P = "";
        int k = 1;
        int n = T.length();
        int m = P.length();
        
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }
}
