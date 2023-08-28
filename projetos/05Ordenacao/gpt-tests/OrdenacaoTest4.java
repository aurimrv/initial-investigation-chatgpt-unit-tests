
package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest4 {
    
    @Test
    public void testOrdena() {
        int[] v1 = {5, 2, 8, 1, 9};
        Ordenacao.ordena(v1, 5);
        int[] expected1 = {1, 2, 5, 8, 9};
        assertArrayEquals(expected1, v1);
        
        int[] v2 = {9, 8, 7, 6, 5, 4};
        Ordenacao.ordena(v2, 6);
        int[] expected2 = {4, 5, 6, 7, 8, 9};
        assertArrayEquals(expected2, v2);
        
        int[] v3 = {1, 3, 2, 5, 4};
        Ordenacao.ordena(v3, 5);
        int[] expected3 = {1, 2, 3, 4, 5};
        assertArrayEquals(expected3, v3);
        
        int[] v4 = {1, 1, 1, 1, 1};
        Ordenacao.ordena(v4, 5);
        int[] expected4 = {1, 1, 1, 1, 1};
        assertArrayEquals(expected4, v4);
        
        int[] v5 = {9, 7, 5, 3, 1};
        Ordenacao.ordena(v5, 5);
        int[] expected5 = {1, 3, 5, 7, 9};
        assertArrayEquals(expected5, v5);
    }
}