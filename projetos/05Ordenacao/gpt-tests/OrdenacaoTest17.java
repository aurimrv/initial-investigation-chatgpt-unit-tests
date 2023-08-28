package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest17{

    
    @Test
    public void testOrdenaEmptyArray() {
        int[] arr = new int[]{};
        Ordenacao.ordena(arr, 0);
        assertArrayEquals(new int[]{}, arr);
    }
    
    @Test
    public void testOrdenaSingleElementArray() {
        int[] arr = new int[]{5};
        Ordenacao.ordena(arr, 1);
        assertArrayEquals(new int[]{5}, arr);
    }
    
    @Test
    public void testOrdenaSortedArray() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        Ordenacao.ordena(arr, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }
    
    @Test
    public void testOrdenaReverseSortedArray() {
        int[] arr = new int[]{5, 4, 3, 2, 1};
        Ordenacao.ordena(arr, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }
    
    @Test
    public void testOrdenaUnsortedArray() {
        int[] arr = new int[]{4, 2, 5, 1, 3};
        Ordenacao.ordena(arr, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }
}