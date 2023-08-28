
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoExatoTest5 {

    @Test
    public void testForcaBruta() {
        String T = "abracadabra";
        String P = "abra";
        CasamentoExato.forcaBruta(T, T.length(), P, P.length());
        // Expected output: "Casamento na posicao: 0" and "Casamento na posicao: 7"
    }

    @Test
    public void testShiftAndExato() {
        String T = "abracadabra";
        String P = "abra";
        CasamentoExato.shiftAndExato(T, T.length(), P, P.length());
        // Expected output: "Casamento na posicao: 0" and "Casamento na posicao: 7"
    }

    @Test
    public void testBmh() {
        String T = "abracadabra";
        String P = "abra";
        CasamentoExato.bmh(T, T.length(), P, P.length());
        // Expected output: "Casamento na posicao: 7" and "Casamento na posicao: 10"
    }

    @Test
    public void testBmhs() {
        String T = "abracadabra";
        String P = "abra";
        CasamentoExato.bmhs(T, T.length(), P, P.length());
        // Expected output: "Casamento na posicao: 7" and "Casamento na posicao: 10"
    }
}