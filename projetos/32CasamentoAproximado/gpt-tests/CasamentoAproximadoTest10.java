
package ds;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;
import ds.CasamentoAproximado;

public class CasamentoAproximadoTest10 {

    @Test
    public void testShiftAndAproximado() {
        // Test case 1
        String T1 = "abcde";
        int n1 = T1.length();
        String P1 = "bc";
        int m1 = P1.length();
        int k1 = 1;
        String expectedOutput1 = "Casamento na posicao: b" + System.lineSeparator() +
                                "Casamento na posicao: c" + System.lineSeparator();
        String actualOutput1 = getShiftAndAproximadoOutput(T1, n1, P1, m1, k1);
        Assert.assertEquals(expectedOutput1, actualOutput1);
        
        // Test case 2
        String T2 = "abcde";
        int n2 = T2.length();
        String P2 = "xyz";
        int m2 = P2.length();
        int k2 = 1;
        String expectedOutput2 = "";
        String actualOutput2 = getShiftAndAproximadoOutput(T2, n2, P2, m2, k2);
        Assert.assertEquals(expectedOutput2, actualOutput2);
        
        // Test case 3
        String T3 = "aaaaa";
        int n3 = T3.length();
        String P3 = "aa";
        int m3 = P3.length();
        int k3 = 3;
        String expectedOutput3 = "Casamento na posicao: a" + System.lineSeparator() +
                                "Casamento na posicao: a" + System.lineSeparator() +
                                "Casamento na posicao: a" + System.lineSeparator() +
                                "Casamento na posicao: a" + System.lineSeparator();
        String actualOutput3 = getShiftAndAproximadoOutput(T3, n3, P3, m3, k3);
        Assert.assertEquals(expectedOutput3, actualOutput3);
        
        // Add more test cases here...
    }

    private String getShiftAndAproximadoOutput(String T, int n, String P, int m, int k) {
        // Redirect System.out to a string buffer
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        // Call the method
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);

        // Capture the output
        String output = outputStream.toString();

        // Reset System.out
        System.setOut(System.out);

        return output;
    }
}
