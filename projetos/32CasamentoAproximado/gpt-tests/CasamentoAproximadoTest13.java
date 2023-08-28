package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest13{


    @Test
    public void testShiftAndAproximado() {
        String T = "This is a test string";
        String P = "test";
        int k = 1;
        
        // Expected output: "Casamento na posicao: 10"
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
    }
    
    @Test
    public void testShiftAndAproximado_NoMatch() {
        String T = "This is a test string";
        String P = "abcd";
        int k = 2;
        
        // Expected output: no matches found
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
    }
    
    @Test
    public void testShiftAndAproximado_MultipleMatches() {
        String T = "This is a test string with multiple test occurrences";
        String P = "test";
        int k = 1;
        
        // Expected output: "Casamento na posicao: 10" and "Casamento na posicao: 31"
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
    }
}