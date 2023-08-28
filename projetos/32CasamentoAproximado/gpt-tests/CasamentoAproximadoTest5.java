
package ds;
import ds.CasamentoAproximado;
import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest5 {

    @Test
    public void testShiftAndAproximado() {
        // Test case 1
        String T = "abababab";
        String P = "aba";
        int k = 1;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
        // Add assertions here
        
        // Test case 2
        T = "abcdeabcde";
        P = "abcde";
        k = 0;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
        // Add assertions here
        
        // Test case 3
        T = "abcde";
        P = "xyz";
        k = 2;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
        // Add assertions here
        
        // Test case 4
        T = "abcdeabcde";
        P = "abcde";
        k = 2;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
        // Add assertions here
    }
}