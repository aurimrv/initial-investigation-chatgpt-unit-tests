package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest25{


    @Test
    public void testOrdena() {
        int[] v = {5, 3, 8, 2, 1};
        int[] expected = {1, 2, 3, 5, 8};
        Ordenacao.ordena(v, v.length);
        assertArrayEquals(expected, v);
    }

    @Test
    public void testOrdenaEmptyArray() {
        int[] v = {};
        int[] expected = {};
        Ordenacao.ordena(v, v.length);
        assertArrayEquals(expected, v);
    }

    @Test
    public void testOrdenaAlreadySortedArray() {
        int[] v = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        Ordenacao.ordena(v, v.length);
        assertArrayEquals(expected, v);
    }

    @Test
    public void testOrdenaArrayWithDuplicates() {
        int[] v = {5, 3, 8, 2, 1, 3, 5};
        int[] expected = {1, 2, 3, 3, 5, 5, 8};
        Ordenacao.ordena(v, v.length);
        assertArrayEquals(expected, v);
    }
}