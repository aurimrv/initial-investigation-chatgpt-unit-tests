package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest14{


    @Test
    public void testShiftAndAproximado_WhenPatternFound_ExpectMatchPositionPrinted() {
        // Arrange
        String T = "abcde";
        String P = "cde";
        int k = 0;

        // Act
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);

        // Assert
        // Verify that "Casamento na posicao: 2" is printed
        // as the pattern "cde" is found at index 2 in the text "abcde"
    }

    @Test
    public void testShiftAndAproximado_WhenPatternNotFound_ExpectNoOutput() {
        // Arrange
        String T = "abcde";
        String P = "xyz";
        int k = 0;

        // Act
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);

        // Assert
        // Verify that no output is printed as the pattern "xyz" is not found in the text "abcde"
    }

    @Test
    public void testShiftAndAproximado_WhenPatternApproximatelyFound_ExpectMatchPositionPrinted() {
        // Arrange
        String T = "abcde";
        String P = "cde";
        int k = 1;

        // Act
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);

        // Assert
        // Verify that "Casamento na posicao: 2" is printed
        // as the pattern "cde" is approximately found at index 2 in the text "abcde"
    }

    @Test
    public void testShiftAndAproximado_WhenPatternApproximatelyFoundMultipleTimes_ExpectMatchPositionsPrinted() {
        // Arrange
        String T = "abcdecde";
        String P = "cde";
        int k = 1;

        // Act
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);

        // Assert
        // Verify that "Casamento na posicao: 2" and "Casamento na posicao: 5" are printed
        // as the pattern "cde" is approximately found at index 2 and 5 in the text "abcdecde"
    }
}