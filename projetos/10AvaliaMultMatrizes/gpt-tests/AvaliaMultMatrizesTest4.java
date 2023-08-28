
package ds;import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

public class AvaliaMultMatrizesTest4 {

    @Test
    public void testMultmatrize() throws IOException {
        int n = 4;
        int[] d = {2, 3, 4, 5};
        int[][] expectedMatrix = {
            {0, 24, 54, 88},
            {0, 0, 60, 94},
            {0, 0, 0, 120},
            {0, 0, 0, 0}
        };

        AvaliaMultMatrizes.multmatrize(n, d);

        assertArrayEquals(expectedMatrix, m);
    }
}