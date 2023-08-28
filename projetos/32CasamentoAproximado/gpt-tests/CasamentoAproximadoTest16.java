package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest16{


    @Test
    public void testShiftAndAproximado() {
        String T = "abcde";
        int n = T.length();
        String P = "bcd";
        int m = P.length();
        int k = 1;
        
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
        
        // Add assertions here to check the expected output or behavior
    }
    
    @Test
    public void testShiftAndAproximadoWithNoMatch() {
        String T = "abcde";
        int n = T.length();
        String P = "xyz";
        int m = P.length();
        int k = 1;
        
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
        
        // Add assertions here to check the expected output or behavior
    }
    
    // Add more test cases here
    
}