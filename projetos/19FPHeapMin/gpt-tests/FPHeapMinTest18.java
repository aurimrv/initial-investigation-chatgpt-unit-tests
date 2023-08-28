package ds;import ds.FPHeapMin;
import ds.Item;
import ds.MeuItem;
import ds.OrdenacaoParcial;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FPHeapMinTest18{


    @Test
    public void testConstructor() {
        FPHeapMin heap = new FPHeapMin(10);
        Assert.assertEquals(0, heap.n);
        Assert.assertEquals(11, heap.v.length);
    }

    @Test
    public void testConstructorWithArray() {
        Item[] array = new Item[5];
        FPHeapMin heap = new FPHeapMin(array);
        Assert.assertEquals(4, heap.n);
        Assert.assertArrayEquals(array, heap.v);
    }

    @Test
    public void testRefaz() {
        FPHeapMin heap = new FPHeapMin(10);
        heap.v[1] = new MeuItem(5);
        heap.v[2] = new MeuItem(3);
        heap.v[3] = new MeuItem(8);
        heap.v[4] = new MeuItem(2);
        heap.n = 4;
        heap.refaz(1, 4);
        Assert.assertEquals(2, ((MeuItem) heap.v[1]).chave);
        Assert.assertEquals(3, ((MeuItem) heap.v[2]).chave);
        Assert.assertEquals(8, ((MeuItem) heap.v[3]).chave);
        Assert.assertEquals(5, ((MeuItem) heap.v[4]).chave);
    }

    @Test
    public void testConstroi() {
        FPHeapMin heap = new FPHeapMin(10);
        heap.v[1] = new MeuItem(5);
        heap.v[2] = new MeuItem(3);
        heap.v[3] = new MeuItem(8);
        heap.v[4] = new MeuItem(2);
        heap.n = 4;
        heap.constroi();
        Assert.assertEquals(2, ((MeuItem) heap.v[1]).chave);
        Assert.assertEquals(3, ((MeuItem) heap.v[2]).chave);
        Assert.assertEquals(8, ((MeuItem) heap.v[3]).chave);
        Assert.assertEquals(5, ((MeuItem) heap.v[4]).chave);
    }

    @Test
    public void testMin() {
        FPHeapMin heap = new FPHeapMin(10);
        heap.v[1] = new MeuItem(5);
        heap.v[2] = new MeuItem(3);
        heap.v[3] = new MeuItem(8);
        heap.v[4] = new MeuItem(2);
        heap.n = 4;
        Item min = heap.min();
        Assert.assertEquals(2, ((MeuItem) min).chave);
    }

    @Test
    public void testRetiraMin() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        heap.v[1] = new MeuItem(5);
        heap.v[2] = new MeuItem(3);
        heap.v[3] = new MeuItem(8);
        heap.v[4] = new MeuItem(2);
        heap.n = 4;
        Item min = heap.retiraMin();
        Assert.assertEquals(2, ((MeuItem) min).chave);
        Assert.assertEquals(3, ((MeuItem) heap.v[1]).chave);
        Assert.assertEquals(5, ((MeuItem) heap.v[2]).chave);
        Assert.assertEquals(8, ((MeuItem) heap.v[3]).chave);
        Assert.assertEquals(0, heap.v[4]);
        Assert.assertEquals(3, heap.n);
    }

    @Test(expected = Exception.class)
    public void testRetiraMinEmptyHeap() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        heap.retiraMin();
    }

    @Test
    public void testDiminuiChave() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        heap.v[1] = new MeuItem(5);
        heap.v[2] = new MeuItem(3);
        heap.v[3] = new MeuItem(8);
        heap.v[4] = new MeuItem(2);
        heap.n = 4;
        heap.diminuiChave(3, 1);
        Assert.assertEquals(1, ((MeuItem) heap.v[1]).chave);
        Assert.assertEquals(3, ((MeuItem) heap.v[2]).chave);
        Assert.assertEquals(5, ((MeuItem) heap.v[3]).chave);
        Assert.assertEquals(2, ((MeuItem) heap.v[4]).chave);
    }

    @Test(expected = Exception.class)
    public void testDiminuiChaveNull() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        heap.diminuiChave(1, null);
    }

    @Test
    public void testInsere() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        heap.v[1] = new MeuItem(5);
        heap.v[2] = new MeuItem(3);
        heap.v[3] = new MeuItem(8);
        heap.n = 3;
        Item newItem = new MeuItem(1);
        heap.insere(newItem);
        Assert.assertEquals(1, ((MeuItem) heap.v[1]).chave);
        Assert.assertEquals(3, ((MeuItem) heap.v[2]).chave);
        Assert.assertEquals(5, ((MeuItem) heap.v[3]).chave);
        Assert.assertEquals(8, ((MeuItem) heap.v[4]).chave);
        Assert.assertEquals(4, heap.n);
    }

    @Test(expected = Exception.class)
    public void testInsereFullHeap() throws Exception {
        FPHeapMin heap = new FPHeapMin(3);
        heap.v[1] = new MeuItem(5);
        heap.v[2] = new MeuItem(3);
        heap.v[3] = new MeuItem(8);
        heap.n = 3;
        Item newItem = new MeuItem(1);
        heap.insere(newItem);
    }

    @Test
    public void testImprime() {
        FPHeapMin heap = new FPHeapMin(10);
        heap.v[1] = new MeuItem(5);
        heap.v[2] = new MeuItem(3);
        heap.v[3] = new MeuItem(8);
        heap.n = 3;
        heap.imprime();
    }

    @Test
    public void testCopia() {
        FPHeapMin heap = new FPHeapMin(10);
        Item[] array = new Item[5];
        array[1] = new MeuItem(5);
        array[2] = new MeuItem(3);
        array[3] = new MeuItem(8);
        heap.copia(array);
        Assert.assertEquals(3, heap.n);
        Assert.assertArrayEquals(array, heap.v);
    }
}

class OrdenacaoParcialTest {

    @Test
    public void testParticao() {
        Item[] array = new Item[5];
        array[1] = new MeuItem(5);
        array[2] = new MeuItem(3);
        array[3] = new MeuItem(8);
        array[4] = new MeuItem(2);
        OrdenacaoParcial.LimiteParticoes p = OrdenacaoParcial.
                particao(array, 1, 4);
        Assert.assertEquals(2, p.i);
        Assert.assertEquals(3, p.j);
    }

    @Test
    public void testOrdena() {
        Item[] array = new Item[5];
        array[1] = new MeuItem(5);
        array[2] = new MeuItem(3);
        array[3] = new MeuItem(8);
        array[4] = new MeuItem(2);
        OrdenacaoParcial.ordena(array, 1, 4, 2);
        Assert.assertEquals(2, ((MeuItem) array[1]).chave);
        Assert.assertEquals(3, ((MeuItem) array[2]).chave);
        Assert.assertEquals(8, ((MeuItem) array[3]).chave);
        Assert.assertEquals(5, ((MeuItem) array[4]).chave);
    }

    @Test
    public void testSelecaoParcial() {
        Item[] array = new Item[5];
        array[1] = new MeuItem(5);
        array[2] = new MeuItem(3);
        array[3] = new MeuItem(8);
        array[4] = new MeuItem(2);
        OrdenacaoParcial.selecaoParcial(array, 4, 2);
        Assert.assertEquals(2, ((MeuItem) array[1]).chave);
        Assert.assertEquals(3, ((MeuItem) array[2]).chave);
        Assert.assertEquals(8, ((MeuItem) array[