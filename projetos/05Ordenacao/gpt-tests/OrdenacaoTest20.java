package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest20{


    @Test
    public void testOrdena() {
        // Test case 1: Testing with an empty array
        int[] arr1 = {};
        Ordenacao.ordena(arr1, 0);
        assertArrayEquals(new int[]{}, arr1);

        // Test case 2: Testing with an array of size 1
        int[] arr2 = {5};
        Ordenacao.ordena(arr2, 1);
        assertArrayEquals(new int[]{5}, arr2);

        // Test case 3: Testing with an array of size 2, already sorted
        int[] arr3 = {1, 2};
        Ordenacao.ordena(arr3, 2);
        assertArrayEquals(new int[]{1, 2}, arr3);

        // Test case 4: Testing with an array of size 2, not sorted
        int[] arr4 = {2, 1};
        Ordenacao.ordena(arr4, 2);
        assertArrayEquals(new int[]{1, 2}, arr4);

        // Test case 5: Testing with an array of size 5, already sorted
        int[] arr5 = {1, 2, 3, 4, 5};
        Ordenacao.ordena(arr5, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr5);

        // Test case 6: Testing with an array of size 5, not sorted
        int[] arr6 = {5, 4, 3, 2, 1};
        Ordenacao.ordena(arr6, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr6);

        // Test case 7: Testing with an array of size 10, already sorted
        int[] arr7 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Ordenacao.ordena(arr7, 10);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, arr7);

        // Test case 8: Testing with an array of size 10, not sorted
        int[] arr8 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Ordenacao.ordena(arr8, 10);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, arr8);
    }
}