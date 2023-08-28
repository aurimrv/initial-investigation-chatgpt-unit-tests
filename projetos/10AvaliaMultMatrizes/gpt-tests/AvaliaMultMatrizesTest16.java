package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class AvaliaMultMatrizesTest16{


    @Test
    public void testMultmatrize() throws IOException {
        int n = 4;
        int[] d = {1, 2, 3, 4};
        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test
    public void testMultmatrizeWithZeroN() throws IOException {
        int n = 0;
        int[] d = {};
        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test
    public void testMultmatrizeWithNegativeN() throws IOException {
        int n = -3;
        int[] d = {1, 2, 3};
        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test
    public void testMultmatrizeWithNullD() throws IOException {
        int n = 3;
        int[] d = null;
        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test
    public void testMultmatrizeWithEmptyD() throws IOException {
        int n = 3;
        int[] d = {};
        AvaliaMultMatrizes.multmatrize(n, d);
    }
}