package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class AvaliaMultMatrizesTest18{


    @Test
    public void testMultmatrize() throws Exception {
        int n = 3;
        int[] d = {2, 3, 4};
        AvaliaMultMatrizes.multmatrize(n, d);
        // Add assertions here to verify the output
    }

    @Test
    public void testMultmatrizeWithZeroN() throws Exception {
        int n = 0;
        int[] d = {};
        AvaliaMultMatrizes.multmatrize(n, d);
        // Add assertions here to verify the output
    }

    @Test
    public void testMultmatrizeWithNegativeD() throws Exception {
        int n = 4;
        int[] d = {2, -3, 4, -5};
        AvaliaMultMatrizes.multmatrize(n, d);
        // Add assertions here to verify the output
    }

    // Add more test cases here

}