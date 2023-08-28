
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoExatoTest2 {

    @Test
    public void testForcaBruta() {
        String T = "ababcababc";
        int n = T.length();
        String P = "abc";
        int m = P.length();

        CasamentoExato.forcaBruta(T, n, P, m);

        // Expected output: "Casamento na posicao: 2", "Casamento na posicao: 7"
    }

    @Test
    public void testShiftAndExato() {
        String T = "ababcababc";
        int n = T.length();
        String P = "abc";
        int m = P.length();

        CasamentoExato.shiftAndExato(T, n, P, m);

        // Expected output: "Casamento na posicao: 2", "Casamento na posicao: 7"
    }

    @Test
    public void testBmh() {
        String T = "ababcababc";
        int n = T.length();
        String P = "abc";
        int m = P.length();

        CasamentoExato.bmh(T, n, P, m);

        // Expected output: "Casamento na posicao: 2", "Casamento na posicao: 7"
    }

    @Test
    public void testBmhs() {
        String T = "ababcababc";
        int n = T.length();
        String P = "abc";
        int m = P.length();

        CasamentoExato.bmhs(T, n, P, m);

        // Expected output: "Casamento na posicao: 2", "Casamento na posicao: 7"
    }
}