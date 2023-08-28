
package ds;import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class CasamentoAproximadoTest7 {

  @Test
  public void testShiftAndAproximado() {
    String T = "abracadabra";
    String P = "abra";
    int k = 1;
    int n = T.length();
    int m = P.length();
    StringBuffer expectedOutput = new StringBuffer();
    expectedOutput.append("Casamento na posicao: a\n");
    expectedOutput.append("Casamento na posicao: b\n");
    expectedOutput.append("Casamento na posicao: r\n");
    expectedOutput.append("Casamento na posicao: a\n");

    // Set up the output stream
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));

    // Call the method
    CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);

    // Get the output
    String actualOutput = baos.toString();

    // Assert the output
    assertEquals(expectedOutput.toString(), actualOutput);
  }
}