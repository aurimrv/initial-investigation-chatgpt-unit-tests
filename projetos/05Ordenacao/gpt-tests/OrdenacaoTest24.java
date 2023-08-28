package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest24{


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

        // Test case 3: Testing with an already sorted array
        int[] arr3 = {1, 2, 3, 4, 5};
        Ordenacao.ordena(arr3, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr3);

        // Test case 4: Testing with an array in descending order
        int[] arr4 = {5, 4, 3, 2, 1};
        Ordenacao.ordena(arr4, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr4);

        // Test case 5: Testing with an array containing negative numbers
        int[] arr5 = {-5, 10, -3, 0, 7};
        Ordenacao.ordena(arr5, 5);
        assertArrayEquals(new int[]{-5, -3, 0, 7, 10}, arr5);
    }
}