
package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import ds.CasamentoAproximado;

public class CasamentoAproximadoTest9 {
@Test
public void testShiftAndAproximado_matchingPattern() {
    String T = "abcdefg";
    String P = "cde";
    int k = 2;
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
    String expectedOutput = "Casamento na posicao: 2\n";
    assertEquals(expectedOutput, outContent.toString());
}

@Test
public void testShiftAndAproximado_nonMatchingPattern() {
    String T = "abcdefg";
    String P = "xyz";
    int k = 2;
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
    String expectedOutput = "";
    assertEquals(expectedOutput, outContent.toString());
}


@Test
public void testShiftAndAproximado_multipleMatchingPatterns() {
    String T = "ababcababcab";
    String P = "abc";
    int k = 2;
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
    String expectedOutput = "Casamento na posicao: 2\nCasamento na posicao: 5\nCasamento na posicao: 9\n";
    assertEquals(expectedOutput, outContent.toString());
}

@Test
public void testShiftAndAproximado_emptyTextAndPattern() {
    String T = "";
    String P = "";
    int k = 2;
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
    String expectedOutput = "";
    assertEquals(expectedOutput, outContent.toString());
}
}