package ds;import org.junit.Assert;
import org.junit.Test;

public class OrdenacaoTest23{


    @Test
    public void testMergeSort() {
        int[] input = {5, 2, 8, 1, 9};
        int[] expected = {1, 2, 5, 8, 9};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        Assert.assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSortWithEmptyArray() {
        int[] input = {};
        int[] expected = {};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        Assert.assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSortWithAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        Assert.assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSortWithArrayOfSizeOne() {
        int[] input = {9};
        int[] expected = {9};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        Assert.assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSortWithArrayOfSizeTwo() {
        int[] input = {5, 2};
        int[] expected = {2, 5};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        Assert.assertArrayEquals(expected, input);
    }
}