
package ds;
import ds.AvaliaMultMatrizes;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class AvaliaMultMatrizesTest11 {

    @Test
    public void testMultmatrize() throws IOException {
        int n = 3;
        int[] d = {2, 3, 4};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        AvaliaMultMatrizes.multmatrize(n, d);

        String expectedOutput = " m[1][2]= 24\n" +
                " m[2][3]= 32\n" +
                " m[1][3]= 56\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMultmatrizeWithZeroDimensions() throws IOException {
        int n = 0;
        int[] d = {};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        AvaliaMultMatrizes.multmatrize(n, d);

        String expectedOutput = "";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMultmatrizeWithOneDimension() throws IOException {
        int n = 1;
        int[] d = {5};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        AvaliaMultMatrizes.multmatrize(n, d);

        String expectedOutput = "";
        assertEquals(expectedOutput, outContent.toString());
    }
}