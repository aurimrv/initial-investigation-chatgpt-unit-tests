
package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.CasamentoAproximado;

public class CasamentoAproximadoTest11 {

    @Test
    public void testShiftAndAproximado() {
        // Test case 1: Pattern with no matches
        String T1 = "abcdefg";
        int n1 = T1.length();
        String P1 = "xyz";
        int m1 = P1.length();
        int k1 = 2;
        CasamentoAproximado.shiftAndAproximado(T1, n1, P1, m1, k1);
        // expected output: no matches

        // Test case 2: Pattern with exact match
        String T2 = "abcde";
        int n2 = T2.length();
        String P2 = "abcde";
        int m2 = P2.length();
        int k2 = 2;
        CasamentoAproximado.shiftAndAproximado(T2, n2, P2, m2, k2);
        // expected output: "Casamento na posição: 0"

        // Test case 3: Pattern with approximate match
        String T3 = "abcdefghijklmnopqrstuvwxyz";
        int n3 = T3.length();
        String P3 = "apple";
        int m3 = P3.length();
        int k3 = 2;
        CasamentoAproximado.shiftAndAproximado(T3, n3, P3, m3, k3);
        // expected output: "Casamento na posição: 0"

        // Test case 4: Empty pattern
        String T4 = "abcdefg";
        int n4 = T4.length();
        String P4 = "";
        int m4 = P4.length();
        int k4 = 2;
        CasamentoAproximado.shiftAndAproximado(T4, n4, P4, m4, k4);
        // expected output: no matches
    }
}