
package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;
import ds.*;

public class FPHeapMinTest8 {

  @Test
  public void testRefaz() {
    FPHeapMin heap = new FPHeapMin(10);

    Item[] items = new Item[11];
    for (int i = 1; i <= 10; i++) {
      items[i] = new MeuItem(i);
    }
    heap.copia(items);
    assertEquals(10, heap.min().recuperaChave());

    heap.refaz(1, 10);
    assertEquals(1, heap.min().recuperaChave());

    heap.refaz(3, 10);
    assertEquals(1, heap.min().recuperaChave());

    heap.refaz(7, 10);
    assertEquals(1, heap.min().recuperaChave());
  }

  @Test
  public void testConstroi() {
    FPHeapMin heap = new FPHeapMin(10);

    Item[] items = new Item[11];
    for (int i = 1; i <= 10; i++) {
      items[i] = new MeuItem(i);
    }
    heap.copia(items);
    heap.constroi();
    
    assertEquals(1, heap.min().recuperaChave());
  }

  @Test
  public void testRetiraMin() throws Exception {
    FPHeapMin heap = new FPHeapMin(10);

    Item[] items = new Item[11];
    for (int i = 1; i <= 10; i++) {
      items[i] = new MeuItem(i);
    }
    heap.copia(items);

    Item min = heap.retiraMin();
    assertEquals(1, min.recuperaChave());
    assertEquals(2, heap.min().recuperaChave());

    min = heap.retiraMin();
    assertEquals(2, min.recuperaChave());
    assertEquals(3, heap.min().recuperaChave());

    min = heap.retiraMin();
    assertEquals(3, min.recuperaChave());
    assertEquals(4, heap.min().recuperaChave());
  }

  @Test(expected = Exception.class)
  public void testRetiraMinEmptyHeap() throws Exception {
    FPHeapMin heap = new FPHeapMin(10);
    heap.retiraMin();
  }

  @Test
  public void testDiminuiChave() throws Exception {
    FPHeapMin heap = new FPHeapMin(10);

    Item[] items = new Item[11];
    for (int i = 1; i <= 10; i++) {
      items[i] = new MeuItem(i);
    }
    heap.copia(items);

    heap.diminuiChave(3, -5);
    assertEquals(-5, heap.min().recuperaChave());

    heap.diminuiChave(7, -10);
    assertEquals(-10, heap.min().recuperaChave());

    heap.diminuiChave(5, -3);
    assertEquals(-10, heap.min().recuperaChave());
  }

  @Test(expected = Exception.class)
  public void testDiminuiChaveNull() throws Exception {
    FPHeapMin heap = new FPHeapMin(10);

    Item[] items = new Item[11];
    for (int i = 1; i <= 10; i++) {
      items[i] = new MeuItem(i);
    }
    heap.copia(items);

    heap.diminuiChave(7, null);
  }

  @Test
  public void testInsere() throws Exception {
    FPHeapMin heap = new FPHeapMin(10);

    heap.insere(new MeuItem(5));
    assertEquals(5, heap.min().recuperaChave());

    heap.insere(new MeuItem(2));
    assertEquals(2, heap.min().recuperaChave());

    heap.insere(new MeuItem(9));
    assertEquals(2, heap.min().recuperaChave());

    heap.insere(new MeuItem(1));
    assertEquals(1, heap.min().recuperaChave());
  }

  @Test(expected = Exception.class)
  public void testInsereFullHeap() throws Exception {
    FPHeapMin heap = new FPHeapMin(2);
    heap.insere(new MeuItem(1));
    heap.insere(new MeuItem(2));
    heap.insere(new MeuItem(3));
  }

  @Test
  public void testImprime() {
    FPHeapMin heap = new FPHeapMin(10);

    heap.insere(new MeuItem(5));
    heap.insere(new MeuItem(2));
    heap.insere(new MeuItem(9));
    heap.insere(new MeuItem(1));

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    heap.imprime();

    String expectedOutput = "1 2 9 5 \n";
    assertEquals(expectedOutput, outContent.toString());
  }

}