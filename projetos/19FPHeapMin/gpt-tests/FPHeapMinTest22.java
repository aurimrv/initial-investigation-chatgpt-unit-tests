package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FPHeapMinTest22{

  
  @Test
  public void testRefaz() {
    Item[] v = new Item[6];
    v[1] = new MeuItem(5);
    v[2] = new MeuItem(3);
    v[3] = new MeuItem(8);
    v[4] = new MeuItem(2);
    v[5] = new MeuItem(7);
    
    FPHeapMin heap = new FPHeapMin(v);
    heap.refaz(1, 5);
    
    assertEquals(2, heap.min().recuperaChave());
  }
  
  @Test
  public void testConstroi() {
    Item[] v = new Item[6];
    v[1] = new MeuItem(5);
    v[2] = new MeuItem(3);
    v[3] = new MeuItem(8);
    v[4] = new MeuItem(2);
    v[5] = new MeuItem(7);
    
    FPHeapMin heap = new FPHeapMin(v);
    heap.constroi();
    
    assertEquals(2, heap.min().recuperaChave());
  }
  
  @Test
  public void testRetiraMin() throws Exception {
    Item[] v = new Item[6];
    v[1] = new MeuItem(5);
    v[2] = new MeuItem(3);
    v[3] = new MeuItem(8);
    v[4] = new MeuItem(2);
    v[5] = new MeuItem(7);
    
    FPHeapMin heap = new FPHeapMin(v);
    Item min = heap.retiraMin();
    
    assertEquals(2, min.recuperaChave());
    assertEquals(4, heap.min().recuperaChave());
  }
  
  @Test
  public void testDiminuiChave() throws Exception {
    Item[] v = new Item[6];
    v[1] = new MeuItem(5);
    v[2] = new MeuItem(3);
    v[3] = new MeuItem(8);
    v[4] = new MeuItem(2);
    v[5] = new MeuItem(7);
    
    FPHeapMin heap = new FPHeapMin(v);
    heap.diminuiChave(3, 1);
    
    assertEquals(1, heap.min().recuperaChave());
  }
  
  @Test
  public void testInsere() throws Exception {
    Item[] v = new Item[6];
    v[1] = new MeuItem(5);
    v[2] = new MeuItem(3);
    v[3] = new MeuItem(8);
    v[4] = new MeuItem(2);
    v[5] = new MeuItem(7);
    
    FPHeapMin heap = new FPHeapMin(v);
    heap.insere(new MeuItem(1));
    
    assertEquals(1, heap.min().recuperaChave());
  }
  
  @Test
  public void testImprime() {
    Item[] v = new Item[6];
    v[1] = new MeuItem(5);
    v[2] = new MeuItem(3);
    v[3] = new MeuItem(8);
    v[4] = new MeuItem(2);
    v[5] = new MeuItem(7);
    
    FPHeapMin heap = new FPHeapMin(v);
    
    heap.imprime();
  }
  
  @Test
  public void testCopia() {
    Item[] v1 = new Item[6];
    v1[1] = new MeuItem(5);
    v1[2] = new MeuItem(3);
    v1[3] = new MeuItem(8);
    v1[4] = new MeuItem(2);
    v1[5] = new MeuItem(7);
    
    Item[] v2 = new Item[6];
    
    FPHeapMin heap1 = new FPHeapMin(v1);
    FPHeapMin heap2 = new FPHeapMin(v2);
    
    heap2.copia(v1);
    
    assertEquals(heap1.min().recuperaChave(), heap2.min().recuperaChave());
  }
}