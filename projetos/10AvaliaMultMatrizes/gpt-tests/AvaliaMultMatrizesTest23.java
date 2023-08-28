package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class AvaliaMultMatrizesTest23{


    @Test
    public void testMultmatrizeWithN1() {
        int n = 1;
        int[] d = {1};
        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testMultmatrizeWithN2() {
        int n = 2;
        int[] d = {1, 2};
        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testMultmatrizeWithN3() {
        int n = 3;
        int[] d = {1, 2, 3};
        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }
}