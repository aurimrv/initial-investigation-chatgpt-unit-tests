
package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.Ordenacao;

public class OrdenacaoTest8 {
    
    @Test
    public void testOrdenaEmptyArray() {
        int[] arr = {};
        Ordenacao.ordena(arr, arr.length);
        assertArrayEquals(new int[] {}, arr);
    }
    
    @Test
    public void testOrdenaSingleElementArray() {
        int[] arr = {5};
        Ordenacao.ordena(arr, arr.length);
        assertArrayEquals(new int[] {5}, arr);
    }
    
    @Test
    public void testOrdenaNegativeElementsArray() {
        int[] arr = {-2, -5, -1, -9, -7};
        Ordenacao.ordena(arr, arr.length);
        assertArrayEquals(new int[] {-9, -7, -5, -2, -1}, arr);
    }
    
    @Test
    public void testOrdenaSortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        Ordenacao.ordena(arr, arr.length);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, arr);
    }
    
    @Test
    public void testOrdenaReversedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        Ordenacao.ordena(arr, arr.length);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, arr);
    }
    
    @Test
    public void testOrdenaRandomArray() {
        int[] arr = {4, 7, 2, 1, 5};
        Ordenacao.ordena(arr, arr.length);
        assertArrayEquals(new int[] {1, 2, 4, 5, 7}, arr);
    }
}