package ds;import ds.FPHeapMax;
import ds.MeuItem;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FPHeapMaxTest19{


    @Test
    public void testConstrutor() {
        FPHeapMax heap = new FPHeapMax(10);
        Assert.assertEquals(0, heap.getSize());
    }

    @Test
    public void testInsere() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        MeuItem item1 = new MeuItem(10);
        MeuItem item2 = new MeuItem(20);
        MeuItem item3 = new MeuItem(15);

        heap.insere(item1);
        heap.insere(item2);
        heap.insere(item3);

        Assert.assertEquals(3, heap.getSize());
        Assert.assertEquals(item2, heap.max());
    }

    @Test(expected = Exception.class)
    public void testInsereHeapCheio() throws Exception {
        FPHeapMax heap = new FPHeapMax(2);
        MeuItem item1 = new MeuItem(10);
        MeuItem item2 = new MeuItem(20);
        MeuItem item3 = new MeuItem(15);

        heap.insere(item1);
        heap.insere(item2);
        heap.insere(item3);
    }

    @Test
    public void