
package ds;
import org.junit.Test;
import java.io.IOException;

public class AvaliaMultMatrizesTest8 {

    @Test(expected = IOException.class)
    public void testMultmatrizeWithIOException() throws IOException {
        // Test case for IOException
        AvaliaMultMatrizes.multmatrize(0, new int[]{});
    }

    @Test
    public void testMultmatrizeWithEmptyArray() throws IOException {
        // Test case for an empty array
        AvaliaMultMatrizes.multmatrize(1, new int[]{});
    }

    @Test
    public void testMultmatrizeWithSingleElement() throws IOException {
        // Test case for a single element
        AvaliaMultMatrizes.multmatrize(1, new int[]{5});
    }

    @Test
    public void testMultmatrizeWithSquareMatrix() throws IOException {
        // Test case for a square matrix
        AvaliaMultMatrizes.multmatrize(3, new int[]{2, 3, 4});
    }

    @Test
    public void testMultmatrizeWithNonSquareMatrix() throws IOException {
        // Test case for a non-square matrix
        AvaliaMultMatrizes.multmatrize(3, new int[]{2, 3, 4, 5});
    }
}