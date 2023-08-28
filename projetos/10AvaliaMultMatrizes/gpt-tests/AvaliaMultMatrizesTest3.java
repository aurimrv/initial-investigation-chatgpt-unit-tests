
package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;

public class AvaliaMultMatrizesTest3 {
    
    @Test
    public void testMultmatrize() throws IOException {
        int n = 3;
        int[] d = {2, 3, 4};
        
        AvaliaMultMatrizes.multmatrize(n, d);
    }
    
    @Test
    public void testMultmatrizeWithZeroDimensions() throws IOException {
        int n = 0;
        int[] d = {};
        
        AvaliaMultMatrizes.multmatrize(n, d);
    }
    
    @Test
    public void testMultmatrizeWithNegativeDimensions() throws IOException {
        int n = -3;
        int[] d = {-2, -3, -4};
        
        AvaliaMultMatrizes.multmatrize(n, d);
    }
    
    @Test(expected = IOException.class)
    public void testMultmatrizeWithIOException() throws IOException {
        int n = 3;
        int[] d = {2, 3, 4};
        
        AvaliaMultMatrizes.multmatrize(n, d);
        throw new IOException();
    }
}