package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest18{


    @Test
    public void testOrdena() {
        int[] v = {5, 2, 7, 1, 3};
        Ordenacao.ordena(v, 5);
        assertArrayEquals(new int[]{1, 2, 3, 5, 7}, v);
    }

    @Test
    public void testOrdenaEmptyArray() {
        int[] v = {};
        Ordenacao.ordena(v, 0);
        assertArrayEquals(new int[]{}, v);
    }

    @Test
    public void testOrdenaAlreadySortedArray() {
        int[] v = {1, 2, 3, 4, 5};
        Ordenacao.ordena(v, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, v);
    }

    @Test
    public void testOrdenaArrayWithDuplicates() {
        int[] v = {3, 2, 1, 2, 3};
        Ordenacao.ordena(v, 5);
        assertArrayEquals(new int[]{1, 2, 2, 3, 3}, v);
    }

    @Test
    public void testOrdenaArrayWithNegativeNumbers() {
        int[] v = {-5, 2, -7, 1, 3};
        Ordenacao.ordena(v, 5);
        assertArrayEquals(new int[]{-7, -5, 1, 2, 3}, v);
    }
}