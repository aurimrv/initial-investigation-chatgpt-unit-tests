package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class AvaliaMultMatrizesTest22{


    @Test
    public void testMultmatrize() {
        int n = 3;
        int[] d = {2, 3, 4};
        int[][] expected = {{0, 24, 54}, {0, 0, 24}, {0, 0, 0}};

        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test
    public void testMultmatrizeWithNegativeValues() {
        int n = 4;
        int[] d = {-2, 3, -4, 5};
        int[][] expected = {{0, -6, -18, -38}, {0, 0, -12, -36}, {0, 0, 0, -20}, {0, 0, 0, 0}};

        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test
    public void testMultmatrizeWithZeroValues() {
        int n = 2;
        int[] d = {0, 0};
        int[][] expected = {{0, 0}, {0, 0}};

        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }
}