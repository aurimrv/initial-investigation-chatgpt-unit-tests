package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest23{


    @Test
    public void testOrdenaEmptyArray() {
        int[] array = {};
        Ordenacao.ordena(array, 0);
        assertEquals(0, array.length);
    }

    @Test
    public void testOrdenaArrayWithOneElement() {
        int[] array = {5};
        Ordenacao.ordena(array, 1);
        assertEquals(5, array[0]);
    }

    @Test
    public void testOrdenaArrayWithTwoElementsInOrder() {
        int[] array = {2, 5};
        Ordenacao.ordena(array, 2);
        assertEquals(2, array[0]);
        assertEquals(5, array[1]);
    }

    @Test
    public void testOrdenaArrayWithTwoElementsOutOfOrder() {
        int[] array = {5, 2};
        Ordenacao.ordena(array, 2);
        assertEquals(2, array[0]);
        assertEquals(5, array[1]);
    }

    @Test
    public void testOrdenaArrayWithMultipleElements() {
        int[] array = {5, 2, 7, 1, 9};
        Ordenacao.ordena(array, 5);
        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(5, array[2]);
        assertEquals(7, array[3]);
        assertEquals(9, array[4]);
    }
}