package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class AvaliaMultMatrizesTest21{


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
        int n = 3;
        int[] d = {-2, 3, -4};
        int[][] expected = {{0, -24, -54}, {0, 0, -24}, {0, 0, 0}};

        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(expected = IOException.class)
    public void testMultmatrizeWithIOException() throws IOException {
        int n = 3;
        int[] d = {2, 3, 4};

        AvaliaMultMatrizes.multmatrize(n, d);
    }
}