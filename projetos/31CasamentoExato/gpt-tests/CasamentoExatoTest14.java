package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoExatoTest14{


    @Test
    public void testForcaBruta() {
        String T = "abababa";
        String P = "aba";
        CasamentoExato.forcaBruta(T, T.length(), P, P.length());
        // Expected output: "Casamento na posicao: 0", "Casamento na posicao: 2", "Casamento na posicao: 4"
    }

    @Test
    public void testShiftAndExato() {
        String T = "abababa";
        String P = "aba";
        CasamentoExato.shiftAndExato(T, T.length(), P, P.length());
        // Expected output: "Casamento na posicao: 0", "Casamento na posicao: 2", "Casamento na posicao: 4"
    }

    @Test
    public void testBmh() {
        String T = "abababa";
        String P = "aba";
        CasamentoExato.bmh(T, T.length(), P, P.length());
        // Expected output: "Casamento na posicao: 4"
    }

    @Test
    public void testBmhs() {
        String T = "abababa";
        String P = "aba";
        CasamentoExato.bmhs(T, T.length(), P, P.length());
        // Expected output: "Casamento na posicao: 4"
    }
}