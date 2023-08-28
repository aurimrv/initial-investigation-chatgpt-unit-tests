
package ds;import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class OrdenacaoTest1 {

    @Test
    public void testOrdenaWithEmptyArray() {
        int[] v = new int[0];
        Ordenacao.ordena(v, 0);
        int[] expected = new int[0];
        assertArrayEquals(expected, v);
    }

    @Test
    public void testOrdenaWithOneElement() {
        int[] v = {5};
        Ordenacao.ordena(v, 1);
        int[] expected = {5};
        assertArrayEquals(expected, v);
    }

    @Test
    public void testOrdenaWithTwoElementsInAscendingOrder() {
        int[] v = {3, 7};
        Ordenacao.ordena(v, 2);
        int[] expected = {3, 7};
        assertArrayEquals(expected, v);
    }

    @Test
    public void testOrdenaWithTwoElementsInDescendingOrder() {
        int[] v = {7, 3};
        Ordenacao.ordena(v, 2);
        int[] expected = {3, 7};
        assertArrayEquals(expected, v);
    }

    @Test
    public void testOrdenaWithMultipleElements() {
        int[] v = {5, 2, 8, 1, 9};
        Ordenacao.ordena(v, 5);
        int[] expected = {1, 2, 5, 8, 9};
        assertArrayEquals(expected, v);
    }

    @Test
    public void testOrdenaWithNegativeElements() {
        int[] v = {-5, -2, -8, -1, -9};
        Ordenacao.ordena(v, 5);
        int[] expected = {-9, -8, -5, -2, -1};
        assertArrayEquals(expected, v);
    }
}