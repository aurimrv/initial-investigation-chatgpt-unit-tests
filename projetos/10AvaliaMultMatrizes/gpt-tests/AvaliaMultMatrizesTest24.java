package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class AvaliaMultMatrizesTest24{


    @Test
    public void testMultmatrize() throws IOException {
        int n = 3;
        int[] d = {2, 3, 4};
        AvaliaMultMatrizes.multmatrize(n, d);
        // Add assertions here to verify the correctness of the method
    }
    
    @Test
    public void testMultmatrizeWithZeroN() throws IOException {
        int n = 0;
        int[] d = {};
        AvaliaMultMatrizes.multmatrize(n, d);
        // Add assertions here to verify the correctness of the method
    }
    
    @Test
    public void testMultmatrizeWithNegativeD() throws IOException {
        int n = 4;
        int[] d = {-2, 3, -4, 5};
        AvaliaMultMatrizes.multmatrize(n, d);
        // Add assertions here to verify the correctness of the method
    }
    
    // Add more test cases here
}