package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class AvaliaMultMatrizesTest28{


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
    public void testMultmatrizeWithZeroDimension() {
        int n = 0;
        int[] d = {};
        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testMultmatrizeWithNegativeDimension() {
        int n = -3;
        int[] d = {2, 3, 4};
        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testMultmatrizeWithNullArray() {
        int n = 3;
        int[] d = null;
        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }
}