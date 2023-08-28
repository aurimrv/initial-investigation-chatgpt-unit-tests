package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest18{


    @Test
    public void testShiftAndAproximado() {
        String T = "abcde";
        String P = "bcd";
        int k = 1;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
        // Add assertions here to check the expected output
    }

    @Test
    public void testShiftAndAproximadoEmptyText() {
        String T = "";
        String P = "abc";
        int k = 2;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
        // Add assertions here to check the expected output
    }

    @Test
    public void testShiftAndAproximadoEmptyPattern() {
        String T = "abcde";
        String P = "";
        int k = 1;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
        // Add assertions here to check the expected output
    }

    @Test
    public void testShiftAndAproximadoNoMatch() {
        String T = "abcde";
        String P = "xyz";
        int k = 1;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
        // Add assertions here to check the expected output
    }
}