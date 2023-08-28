
package ds;
import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class AvaliaMultMatrizesTest10 {

    @Test
    public void testMultmatrize() {
        int[] d = {1, 2, 3, 4};
        try {
            AvaliaMultMatrizes.multmatrize(3, d);
            // Add assertions here to verify the expected output
        } catch (IOException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testMultmatrizeInvalidInput() {
        int[] d = {1, 2, 3, -4}; // Invalid input with negative value
        try {
            AvaliaMultMatrizes.multmatrize(3, d);
            fail("No exception thrown");
        } catch (IOException e) {
            assertEquals("Invalid input", e.getMessage());
        }
    }
}