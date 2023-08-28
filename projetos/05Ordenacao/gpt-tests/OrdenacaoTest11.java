
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest11 {

    @Test
    public void testOrdenaEmptyArray() {
        int[] array = {};
        Ordenacao.ordena(array, 0);
        assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void testOrdenaArrayWithDuplicates() {
        int[] array = {4, 2, 5, 2, 1};
        Ordenacao.ordena(array, 5);
        assertArrayEquals(new int[]{1, 2, 2, 4, 5}, array);
    }

    @Test
    public void testOrdenaSortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        Ordenacao.ordena(array, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testOrdenaReverseSortedArray() {
        int[] array = {5, 4, 3, 2, 1};
        Ordenacao.ordena(array, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testOrdenaArrayWithNegativeNumbers() {
        int[] array = {-3, -1, -5, -2, -4};
        Ordenacao.ordena(array, 5);
        assertArrayEquals(new int[]{-5, -4, -3, -2, -1}, array);
    }
}