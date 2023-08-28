package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoExatoTest20{


    @Test
    public void testForcaBruta() {
        String T = "abcdeabcde";
        int n = T.length();
        String P = "abc";
        int m = P.length();
        CasamentoExato.forcaBruta(T, n, P, m);
        // Expected output: "Casamento na posicao: 0" and "Casamento na posicao: 5"
    }

    @Test
    public void testShiftAndExato() {
        String T = "abcdeabcde";
        int n = T.length();
        String P = "abc";
        int m = P.length();
        CasamentoExato.shiftAndExato(T, n, P, m);
        // Expected output: "Casamento na posicao: 0" and "Casamento na posicao: 5"
    }

    @Test
    public void testBmh() {
        String T = "abcdeabcde";
        int n = T.length();
        String P = "abc";
        int m = P.length();
        CasamentoExato.bmh(T, n, P, m);
        // Expected output: "Casamento na posicao: 5"
    }

    @Test
    public void testBmhs() {
        String T = "abcdeabcde";
        int n = T.length();
        String P = "abc";
        int m = P.length();
        CasamentoExato.bmhs(T, n, P, m);
        // Expected output: "Casamento na posicao: 5"
    }
}