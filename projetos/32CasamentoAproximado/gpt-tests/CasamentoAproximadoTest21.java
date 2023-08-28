package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest21{


    @Test
    public void testShiftAndAproximado() {
        String T = "abcde";
        int n = T.length();
        String P = "bcd";
        int m = P.length();
        int k = 1;
        
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
        
        // Add assertions here to verify the expected output
    }
}