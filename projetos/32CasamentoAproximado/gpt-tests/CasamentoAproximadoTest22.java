package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest22{


    @Test
    public void testShiftAndAproximado() {
        String T = "abracadabra";
        String P = "abra";
        int k = 1;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
        // Assert the expected output here
    }

    @Test
    public void testShiftAndAproximadoEmptyText() {
        String T = "";
        String P = "pattern";
        int k = 2;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
        // Assert the expected output here
    }

    @Test
    public void testShiftAndAproximadoEmptyPattern() {
        String T = "text";
        String P = "";
        int k = 3;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
        // Assert the expected output here
    }

    @Test
    public void testShiftAndAproximadoNoMatch() {
        String T = "abcdefg";
        String P = "xyz";
        int k = 2;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
        // Assert the expected output here
    }
}