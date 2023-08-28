package ds;import ds.Ordenacao;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest12{


    @Test
    public void testOrdena() {
        // Test case 1: Empty array
        int[] arr1 = {};
        Ordenacao.ordena(arr1, 0);
        assertArrayEquals(new int[]{}, arr1);

        // Test case 2: Array with one element
        int[] arr2 = {5};
        Ordenacao.ordena(arr2, 1);
        assertArrayEquals(new int[]{5}, arr2);

        // Test case 3: Array with two elements in ascending order
        int[] arr3 = {3, 7};
        Ordenacao.ordena(arr3, 2);
        assertArrayEquals(new int[]{3, 7}, arr3);

        // Test case 4: Array with two elements in descending order
        int[] arr4 = {9, 2};
        Ordenacao.ordena(arr4, 2);
        assertArrayEquals(new int[]{2, 9}, arr4);

        // Test case 5: Array with multiple elements in random order
        int[] arr5 = {6, 3, 9, 1, 5};
        Ordenacao.ordena(arr5, 5);
        assertArrayEquals(new int[]{1, 3, 5, 6, 9}, arr5);
    }
}