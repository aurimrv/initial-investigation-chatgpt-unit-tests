package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class AvaliaMultMatrizesTest19{


    @Test
    public void testMultmatrize() {
        int n = 3;
        int[] d = {2, 3, 4};
        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testMultmatrizeWithNegativeValues() {
        int n = 4;
        int[] d = {2, -3, 4, -5};
        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test(expected = IOException.class)
    public void testMultmatrizeWithInvalidInput() throws IOException {
        int n = -1;
        int[] d = {};
        AvaliaMultMatrizes.multmatrize(n, d);
    }
}