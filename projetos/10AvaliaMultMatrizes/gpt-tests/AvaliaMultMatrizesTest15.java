package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class AvaliaMultMatrizesTest15{


    @Test
    public void testMultMatrizes() {
        int n = 3;
        int[] d = {2, 3, 4};
        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testMultMatrizesWithZeroDimension() {
        int n = 0;
        int[] d = {};
        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testMultMatrizesWithNegativeDimension() {
        int n = -3;
        int[] d = {2, 3, 4};
        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }
}