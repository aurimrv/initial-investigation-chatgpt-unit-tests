
package ds;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class AvaliaMultMatrizesTest7 {

    @Test
    public void testMultmatrize_withZeroElements() {
        int n = 0;
        int[] d = {};

        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            assertEquals(IOException.class, e.getClass());
        }
    }

    @Test
    public void testMultmatrize_withOneElement() {
        int n = 1;
        int[] d = {10};

        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            assertEquals(IOException.class, e.getClass());
        }
    }

    @Test
    public void testMultmatrize_withTwoElements() {
        int n = 2;
        int[] d = {10, 20};

        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            assertEquals(IOException.class, e.getClass());
        }
    }

    @Test
    public void testMultmatrize_withThreeElements() {
        int n = 3;
        int[] d = {10, 20, 30};

        try {
            AvaliaMultMatrizes.multmatrize(n, d);
        } catch (Exception e) {
            assertEquals(IOException.class, e.getClass());
        }
    }

    // Add more test cases as needed
    
}