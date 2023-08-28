
package ds;import org.junit.Assert;
import org.junit.Test;

public class OrdenacaoTest9 {
    
    @Test
    public void testOrdenaWithEmptyArray() {
        int[] v = {};
        int n = 0;

        Ordenacao.ordena(v, n);

        Assert.assertArrayEquals(new int[]{}, v);
    }
    
    @Test
    public void testOrdenaWithSortedArray() {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;

        Ordenacao.ordena(v, n);

        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, v);
    }

    @Test
    public void testOrdenaWithReverseSortedArray() {
        int[] v = {5, 4, 3, 2, 1};
        int n = 5;

        Ordenacao.ordena(v, n);

        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, v);
    }

    @Test
    public void testOrdenaWithUnsortedArray() {
        int[] v = {3, 5, 2, 1, 4};
        int n = 5;

        Ordenacao.ordena(v, n);

        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, v);
    }
    
    @Test
    public void testOrdenaWithDuplicateValues() {
        int[] v = {4, 2, 3, 1, 2};
        int n = 5;

        Ordenacao.ordena(v, n);

        Assert.assertArrayEquals(new int[]{1, 2, 2, 3, 4}, v);
    }
    
    @Test
    public void testOrdenaWithArrayContainingZero() {
        int[] v = {0, 4, 2, 3, 1};
        int n = 5;

        Ordenacao.ordena(v, n);

        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4}, v);
    }
}