
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class FPHeapMinTest7 {
  
  @Test
  public void testConstructorMaxTam() {
    FPHeapMin heap = new FPHeapMin(10);
    assertNotNull(heap);
    assertEquals(0, heap.getSize());
  }
  
  @Test
  public void testConstructorArray() {
    Item[] items = {new MeuItem(4), new MeuItem(3), new MeuItem(8)};
    FPHeapMin heap = new FPHeapMin(items);
    assertNotNull(heap);
    assertEquals(3, heap.getSize());
  }
  
  @Test
  public void testRefaz() {
    Item[] items = {new MeuItem(4), new MeuItem(3), new MeuItem(8)};
    FPHeapMin heap = new FPHeapMin(items);
    heap.refaz(1, 3);
    assertEquals(3, heap.min().recuperaChave());
  }
  
  @Test
  public void testConstroi() {
    Item[] items = {new MeuItem(4), new MeuItem(3), new MeuItem(8)};
    FPHeapMin heap = new FPHeapMin(items);
    heap.constroi();
    assertEquals(3, heap.min().recuperaChave());
  }
  
  @Test
  public void testMin() {
    Item[] items = {new MeuItem(4), new MeuItem(3), new MeuItem(8)};
    FPHeapMin heap = new FPHeapMin(items);
    assertEquals(3, heap.min().recuperaChave());
  }
  
  @Test
  public void testRetiraMin() throws Exception {
    Item[] items = {new MeuItem(4), new MeuItem(3), new MeuItem(8)};
    FPHeapMin heap = new FPHeapMin(items);
    Item min = heap.retiraMin();
    assertEquals(3, min.recuperaChave());
    assertEquals(2, heap.getSize());
    assertEquals(4, heap.min().recuperaChave());
  }
  
  @Test(expected = Exception.class)
  public void testRetiraMinEmptyHeap() throws Exception {
    FPHeapMin heap = new FPHeapMin(10);
    heap.retiraMin();
  }
  
  @Test
  public void testDiminuiChave() throws Exception {
    Item[] items = {new MeuItem(4), new MeuItem(3), new MeuItem(8)};
    FPHeapMin heap = new FPHeapMin(items);
    heap.diminuiChave(2, 1);
    assertEquals(1, heap.min().recuperaChave());
  }
  
  @Test
  public void testInsere() throws Exception {
    Item[] items = {new MeuItem(4), new MeuItem(3), new MeuItem(8)};
    FPHeapMin heap = new FPHeapMin(items);
    heap.insere(new MeuItem(1));
    assertEquals(1, heap.min().recuperaChave());
    assertEquals(4, heap.getSize());
  }
  
  @Test(expected = Exception.class)
  public void testInsereFullHeap() throws Exception {
    Item[] items = {new MeuItem(4), new MeuItem(3), new MeuItem(8)};
    FPHeapMin heap = new FPHeapMin(items);
    heap.insere(new MeuItem(1));
    heap.insere(new MeuItem(2));
    heap.insere(new MeuItem(3));
    heap.insere(new MeuItem(4));
    heap.insere(new MeuItem(5));
  }

}