
package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest2 {

    @Test
    public void testShiftAndAproximado() {
        String T = "abcde";
        String P = "cde";
        int k = 1;
        int n = T.length();
        int m = P.length();

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);

        // Add assertions here to check if the output is correct
    }
}