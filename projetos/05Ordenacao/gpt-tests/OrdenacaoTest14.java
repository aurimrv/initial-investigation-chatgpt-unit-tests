package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest14{


    @Test
    public void testOrdena() {
        // Test case 1: Test with an empty array
        int[] arr1 = {};
        Ordenacao.ordena(arr1, 0);
        assertArrayEquals(new int[]{}, arr1);

        // Test case 2: Test with an array of size 1
        int[] arr2 = {5};
        Ordenacao.ordena(arr2, 1);
        assertArrayEquals(new int[]{5}, arr2);

        // Test case 3: Test with an already sorted array
        int[] arr3 = {1, 2, 3, 4, 5};
        Ordenacao.ordena(arr3, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr3);

        // Test case 4: Test with an array in descending order
        int[] arr4 = {5, 4, 3, 2, 1};
        Ordenacao.ordena(arr4, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr4);

        // Test case 5: Test with an array containing negative numbers
        int[] arr5 = {-5, 3, -2, 0, 1};
        Ordenacao.ordena(arr5, 5);
        assertArrayEquals(new int[]{-5, -2, 0, 1, 3}, arr5);
    }
}