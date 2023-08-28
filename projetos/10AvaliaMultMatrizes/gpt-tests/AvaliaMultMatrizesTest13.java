package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class AvaliaMultMatrizesTest13{


    @Test
    public void testMultmatrize() {
        int n = 3;
        int[] d = {2, 3, 4};
        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            fail("An exception occurred: " + e.getMessage());
        }
    }

    @Test
    public void testMultmatrizeWithNegativeValues() {
        int n = 4;
        int[] d = {-2, 3, 4, -5};
        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            fail("An exception occurred: " + e.getMessage());
        }
    }

    @Test(expected = IOException.class)
    public void testMultmatrizeWithZeroN() throws IOException {
        int n = 0;
        int[] d = {2, 3, 4};
        AvaliaMultMatrizes.multmatrize(n, d);
    }
}