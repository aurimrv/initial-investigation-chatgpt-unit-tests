package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoExatoTest15{


    @Test
    public void testForcaBruta() {
        String T = "abcde";
        int n = T.length();
        String P = "cd";
        int m = P.length();

        CasamentoExato.forcaBruta(T, n, P, m);
    }

    @Test
    public void testShiftAndExato() {
        String T = "abcde";
        int n = T.length();
        String P = "cd";
        int m = P.length();

        CasamentoExato.shiftAndExato(T, n, P, m);
    }

    @Test
    public void testBmh() {
        String T = "abcde";
        int n = T.length();
        String P = "cd";
        int m = P.length();

        CasamentoExato.bmh(T, n, P, m);
    }

    @Test
    public void testBmhs() {
        String T = "abcde";
        int n = T.length();
        String P = "cd";
        int m = P.length();

        CasamentoExato.bmhs(T, n, P, m);
    }
}