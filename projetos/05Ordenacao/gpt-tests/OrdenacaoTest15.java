package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest15{


    @Test
    public void testOrdena() {
        int[] v = {5, 2, 7, 1, 4};
        Ordenacao.ordena(v, 5);
        int[] expected = {1, 2, 4, 5, 7};
        assertArrayEquals(expected, v);
    }

    @Test
    public void testOrdenaEmptyArray() {
        int[] v = {};
        Ordenacao.ordena(v, 0);
        int[] expected = {};
        assertArrayEquals(expected, v);
    }

    @Test
    public void testOrdenaAlreadySortedArray() {
        int[] v = {1, 2, 3, 4, 5};
        Ordenacao.ordena(v, 5);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, v);
    }

    @Test
    public void testOrdenaArrayWithDuplicates() {
        int[] v = {5, 2, 7, 1, 4, 2, 7};
        Ordenacao.ordena(v, 7);
        int[] expected = {1, 2, 2, 4, 5, 7, 7};
        assertArrayEquals(expected, v);
    }
}