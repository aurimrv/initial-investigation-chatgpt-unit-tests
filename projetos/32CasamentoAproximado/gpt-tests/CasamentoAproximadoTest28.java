package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest28{


    @Test
    public void testShiftAndAproximado() {
        String T = "abracadabra";
        String P = "abra";
        int k = 1;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
        // Assert the expected output
    }

    @Test
    public void testShiftAndAproximadoWithNoMatch() {
        String T = "abracadabra";
        String P = "xyz";
        int k = 1;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
        // Assert the expected output
    }

    @Test
    public void testShiftAndAproximadoWithMultipleMatches() {
        String T = "abracadabra";
        String P = "a";
        int k = 2;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
        // Assert the expected output
    }
}