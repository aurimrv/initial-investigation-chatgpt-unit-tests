package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest12{


    @Test
    public void testShiftAndAproximado() {
        String T = "abracadabra";
        String P = "abra";
        int k = 1;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
        // Assert expected output
    }

    @Test
    public void testShiftAndAproximadoEmptyText() {
        String T = "";
        String P = "pattern";
        int k = 2;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
        // Assert expected output
    }

    @Test
    public void testShiftAndAproximadoEmptyPattern() {
        String T = "text";
        String P = "";
        int k = 3;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
        // Assert expected output
    }

    @Test
    public void testShiftAndAproximadoNoMatch() {
        String T = "text";
        String P = "pattern";
        int k = 2;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
        // Assert expected output
    }

    @Test
    public void testShiftAndAproximadoMultipleMatches() {
        String T = "abracadabra";
        String P = "a";
        int k = 2;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
        // Assert expected output
    }
}