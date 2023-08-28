package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.*;

public class FPHeapMinTest15{

  
  @Test
  public void testRefaz() {
    FPHeapMin heap = new FPHeapMin(5);
    Item[] items = new Item[6];
    items[1] = new MeuItem(5);
    items[2] = new MeuItem(2);
    items[3] = new MeuItem(8);
    items[4] = new MeuItem(1);
    items[5] = new MeuItem(7);
    heap.copia(items);
    heap.refaz(1, 5);
    assertEquals(1, heap.min().recuperaChave());
  }
  
  @Test
  public void testConstroi() {
    FPHeapMin heap = new FPHeapMin(5);
    Item[] items = new Item[6];
    items[1] = new MeuItem(5);
    items[2] = new MeuItem(2);
    items[3] = new MeuItem(8);
    items[4] = new MeuItem(1);
    items[5] = new MeuItem(7);
    heap.copia(items);
    heap.constroi();
    assertEquals(1, heap.min().recuperaChave());
  }
  
  @Test
  public void testRetiraMin() throws Exception {
    FPHeapMin heap = new FPHeapMin(5);
    Item[] items = new Item[6];
    items[1] = new MeuItem(5);
    items[2] = new MeuItem(2);
    items[3] = new MeuItem(8);
    items[4] = new MeuItem(1);
    items[5] = new MeuItem(7);
    heap.copia(items);
    Item min = heap.retiraMin();
    assertEquals(1, min.recuperaChave());
  }
  
  @Test
  public void testDiminuiChave() throws Exception {
    FPHeapMin heap = new FPHeapMin(5);
    Item[] items = new Item[6];
    items[1] = new MeuItem(5);
    items[2] = new MeuItem(2);
    items[3] = new MeuItem(8);
    items[4] = new MeuItem(1);
    items[5] = new MeuItem(7);
    heap.copia(items);
    heap.diminuiChave(3, 3);
    assertEquals(3, heap.min().recuperaChave());
  }
  
  @Test
  public void testInsere() throws Exception {
    FPHeapMin heap = new FPHeapMin(5);
    Item[] items = new Item[6];
    items[1] = new MeuItem(5);
    items[2] = new MeuItem(2);
    items[3] = new MeuItem(8);
    items[4] = new MeuItem(1);
    items[5] = new MeuItem(7);
    heap.copia(items);
    heap.insere(new MeuItem(3));
    assertEquals(1, heap.min().recuperaChave());
  }
  
  @Test
  public void testImprime() {
    FPHeapMin heap = new FPHeapMin(5);
    Item[] items = new Item[6];
    items[1] = new MeuItem(5);
    items[2] = new MeuItem(2);
    items[3] = new MeuItem(8);
    items[4] = new MeuItem(1);
    items[5] = new MeuItem(7);
    heap.copia(items);
    heap.imprime();
  }
  
  @Test
  public void testCopia() {
    FPHeapMin heap = new FPHeapMin(5);
    Item[] items = new Item[6];
    items[1] = new MeuItem(5);
    items[2] = new MeuItem(2);
    items[3] = new MeuItem(8);
    items[4] = new MeuItem(1);
    items[5] = new MeuItem(7);
    heap.copia(items);
    assertEquals(5, heap.min().recuperaChave());
  }
}