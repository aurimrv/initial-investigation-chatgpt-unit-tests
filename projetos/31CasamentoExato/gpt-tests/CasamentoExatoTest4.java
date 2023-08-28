
package ds;import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CasamentoExatoTest4 {

    @Test
    public void testForcaBruta() {
        String T = "Lorem ipsum dolor sit amet";
        int n = T.length();
        String P = "ipsum";
        int m = P.length();

        CasamentoExato.forcaBruta(T, n, P, m);

        // Add assertion here
    }

    @Test
    public void testShiftAndExato() {
        String T = "Lorem ipsum dolor sit amet";
        int n = T.length();
        String P = "ipsum";
        int m = P.length();

        CasamentoExato.shiftAndExato(T, n, P, m);

        // Add assertion here
    }

    @Test
    public void testBmh() {
        String T = "Lorem ipsum dolor sit amet";
        int n = T.length();
        String P = "ipsum";
        int m = P.length();

        CasamentoExato.bmh(T, n, P, m);

        // Add assertion here
    }

    @Test
    public void testBmhs() {
        String T = "Lorem ipsum dolor sit amet";
        int n = T.length();
        String P = "ipsum";
        int m = P.length();

        CasamentoExato.bmhs(T, n, P, m);

        // Add assertion here
    }
}