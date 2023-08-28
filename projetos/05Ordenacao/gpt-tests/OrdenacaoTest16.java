package ds;import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class OrdenacaoTest16{


    @Test
    public void testOrdena() {
        int[] v1 = {5, 2, 7, 1, 3};
        int[] expected1 = {1, 2, 3, 5, 7};
        Ordenacao.ordena(v1, v1.length);
        assertArrayEquals(expected1, v1);

        int[] v2 = {9, 4, 6, 8, 2};
        int[] expected2 = {2, 4, 6, 8, 9};
        Ordenacao.ordena(v2, v2.length);
        assertArrayEquals(expected2, v2);

        int[] v3 = {1, 2, 3, 4, 5};
        int[] expected3 = {1, 2, 3, 4, 5};
        Ordenacao.ordena(v3, v3.length);
        assertArrayEquals(expected3, v3);

        int[] v4 = {5, 5, 5, 5, 5};
        int[] expected4 = {5, 5, 5, 5, 5};
        Ordenacao.ordena(v4, v4.length);
        assertArrayEquals(expected4, v4);

        int[] v5 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expected5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Ordenacao.ordena(v5, v5.length);
        assertArrayEquals(expected5, v5);
    }
}