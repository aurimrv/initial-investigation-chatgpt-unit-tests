
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest1 {

    @Test
    public void testShiftAndAproximado() {
        String T = "abccba";
        String P = "abc";
        int k = 1;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
        
        // Add assertions here to check the output
    }
    
    @Test
    public void testShiftAndAproximadoEmptyText() {
        String T = "";
        String P = "abc";
        int k = 1;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
        
        // Add assertions here to check the output
    }
    
    // Add more test cases here
}
