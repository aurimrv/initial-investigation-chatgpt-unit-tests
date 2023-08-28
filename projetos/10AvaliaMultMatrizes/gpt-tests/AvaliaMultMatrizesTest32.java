package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class AvaliaMultMatrizesTest32{


    @Test
    public void testMultmatrize() {
        int n = 3;
        int[] d = {2, 3, 4};
        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test
    public void testMultmatrizeWithZeroN() {
        int n = 0;
        int[] d = {};
        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test
    public void testMultmatrizeWithNegativeN() {
        int n = -3;
        int[] d = {2, 3, 4};
        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test
    public void testMultmatrizeWithNullD() {
        int n = 3;
        int[] d = null;
        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test
    public void testMultmatrizeWithEmptyD() {
        int n = 3;
        int[] d = {};
        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }
}