package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest13{


    @Test
    public void testOrdena() {
        int[] v1 = {5, 2, 7, 1, 9};
        int[] expected1 = {1, 2, 5, 7, 9};
        Ordenacao.ordena(v1, 5);
        assertArrayEquals(expected1, v1);

        int[] v2 = {9, 5, 3, 2, 1};
        int[] expected2 = {1, 2, 3, 5, 9};
        Ordenacao.ordena(v2, 5);
        assertArrayEquals(expected2, v2);

        int[] v3 = {1, 2, 3, 4, 5};
        int[] expected3 = {1, 2, 3, 4, 5};
        Ordenacao.ordena(v3, 5);
        assertArrayEquals(expected3, v3);

        int[] v4 = {5, 4, 3, 2, 1};
        int[] expected4 = {1, 2, 3, 4, 5};
        Ordenacao.ordena(v4, 5);
        assertArrayEquals(expected4, v4);

        int[] v5 = {1};
        int[] expected5 = {1};
        Ordenacao.ordena(v5, 1);
        assertArrayEquals(expected5, v5);
    }
}