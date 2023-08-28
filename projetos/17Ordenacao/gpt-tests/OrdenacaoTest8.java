
package ds;import org.junit.Assert;
import org.junit.Test;
import java.util.Random;

public class OrdenacaoTest8 {

    // Test case for selecao method
    @Test
    public void testSelecao() {
        Item[] v = {new MeuItem(5), new MeuItem(2), new MeuItem(8), new MeuItem(1), new MeuItem(3)};
        Ordenacao.selecao(v, v.length);
        Assert.assertArrayEquals(new Item[]{new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(5), new MeuItem(8)}, v);
    }

    // Test case for insercao method
    @Test
    public void testInsercao() {
        Item[] v = {new MeuItem(5), new MeuItem(2), new MeuItem(8), new MeuItem(1), new MeuItem(3)};
        Ordenacao.insercao(v, v.length);
        Assert.assertArrayEquals(new Item[]{new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(5), new MeuItem(8)}, v);
    }

    // Test case for shellsort method
    @Test
    public void testShellsort() {
        Item[] v = {new MeuItem(5), new MeuItem(2), new MeuItem(8), new MeuItem(1), new MeuItem(3)};
        Ordenacao.shellsort(v, v.length);
        Assert.assertArrayEquals(new Item[]{new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(5), new MeuItem(8)}, v);
    }

    // Test case for quicksort method
    @Test
    public void testQuicksort() {
        Item[] v = {new MeuItem(5), new MeuItem(2), new MeuItem(8), new MeuItem(1), new MeuItem(3)};
        Ordenacao.quicksort(v, v.length);
        Assert.assertArrayEquals(new Item[]{new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(5), new MeuItem(8)}, v);
    }

    // Test case for heapsort method
    @Test
    public void testHeapsort() {
        Item[] v = {new MeuItem(5), new MeuItem(2), new MeuItem(8), new MeuItem(1), new MeuItem(3)};
        Ordenacao.heapsort(v, v.length);
        Assert.assertArrayEquals(new Item[]{new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(5), new MeuItem(8)}, v);
    }
}
