
package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class FPHeapMinTest0 {

    @Test
    public void testRefaz() {
        FPHeapMin heap = new FPHeapMin(5);
        Item[] items = new Item[6];
        items[0] = null;
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(1);
        items[5] = new MeuItem(2);
        heap.copia(items);
        heap.refaz(1, 5);
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test
    public void testConstroi() {
        FPHeapMin heap = new FPHeapMin(5);
        Item[] items = new Item[6];
        items[0] = null;
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(1);
        items[5] = new MeuItem(2);
        heap.copia(items);
        heap.constroi();
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test
    public void testRetiraMin() throws Exception {
        FPHeapMin heap = new FPHeapMin(5);
        Item[] items = new Item[6];
        items[0] = null;
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(1);
        items[5] = new MeuItem(2);
        heap.copia(items);
        Item min = heap.retiraMin();
        assertEquals(1, min.recuperaChave());
    }

    @Test(expected = Exception.class)
    public void testRetiraMinEmptyHeap() throws Exception {
        FPHeapMin heap = new FPHeapMin(5);
        heap.retiraMin();
    }

    @Test
    public void testDiminuiChave() throws Exception {
        FPHeapMin heap = new FPHeapMin(5);
        Item[] items = new Item[6];
        items[0] = null;
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(1);
        items[5] = new MeuItem(2);
        heap.copia(items);
        heap.diminuiChave(3, 0);
        assertEquals(0, heap.min().recuperaChave());
    }

    @Test(expected = Exception.class)
    public void testDiminuiChaveNullValue() throws Exception {
        FPHeapMin heap = new FPHeapMin(5);
        heap.diminuiChave(3, null);
    }

    @Test
    public void testInsere() throws Exception {
        FPHeapMin heap = new FPHeapMin(5);
        Item[] items = new Item[6];
        items[0] = null;
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(1);
        items[5] = new MeuItem(2);
        heap.copia(items);
        Item newItem = new MeuItem(0);
        heap.insere(newItem);
        assertEquals(0, heap.min().recuperaChave());
    }

    @Test(expected = Exception.class)
    public void testInsereFullHeap() throws Exception {
        FPHeapMin heap = new FPHeapMin(5);
        Item[] items = new Item[6];
        items[0] = null;
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(1);
        items[5] = new MeuItem(2);
        heap.copia(items);
        Item newItem = new MeuItem(0);
        heap.insere(newItem);
        heap.insere(newItem);
    }

    @Test
    public void testImprime() throws Exception {
        FPHeapMin heap = new FPHeapMin(5);
        Item[] items = new Item[6];
        items[0] = null;
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(1);
        items[5] = new MeuItem(2);
        heap.copia(items);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        heap.imprime();
        String expectedOutput = "1 2 3 8 5 \n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
