package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FPHeapMinTest19{

  
  @Test
  public void testRefaz() {
    Item[] v = new Item[6];
    v[1] = new MeuItem(5);
    v[2] = new MeuItem(3);
    v[3] = new MeuItem(2);
    v[4] = new MeuItem(4);
    v[5] = new MeuItem(1);
    
    FPHeapMin heap = new FPHeapMin(v);
    heap.refaz(1, 5);
    
    assertEquals(1, heap.min().recuperaChave());
  }
  
  @Test
  public void testConstroi() {
    Item[] v = new Item[6];
    v[1] = new MeuItem(5);
    v[2] = new MeuItem(3);
    v[3] = new MeuItem(2);
    v[4] = new MeuItem(4);
    v[5] = new MeuItem(1);
    
    FPHeapMin heap = new FPHeapMin(v);
    heap.constroi();
    
    assertEquals(1, heap.min().recuperaChave());
  }
  
  @Test
  public void testRetiraMin() throws Exception {
    Item[] v = new Item[6];
    v[1] = new MeuItem(5);
    v[2] = new MeuItem(3);
    v[3] = new MeuItem(2);
    v[4] = new MeuItem(4);
    v[5] = new MeuItem(1);
    
    FPHeapMin heap = new FPHeapMin(v);
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
    Item[] v = new Item[6];
    v[1] = new MeuItem(5);
    v[2] = new MeuItem(3);
    v[3] = new MeuItem(2);
    v[4] = new MeuItem(4);
    v[5] = new MeuItem(1);
    
    FPHeapMin heap = new FPHeapMin(v);
    heap.diminuiChave(3, 1);
    
    assertEquals(1, heap.min().recuperaChave());
  }
  
  @Test(expected = Exception.class)
  public void testDiminuiChaveNull() throws Exception {
    Item[] v = new Item[6];
    v[1] = new MeuItem(5);
    v[2] = new MeuItem(3);
    v[3] = new MeuItem(2);
    v[4] = new MeuItem(4);
    v[5] = new MeuItem(1);
    
    FPHeapMin heap = new FPHeapMin(v);
    heap.diminuiChave(3, null);
  }
  
  @Test
  public void testInsere() throws Exception {
    Item[] v = new Item[6];
    v[1] = new MeuItem(5);
    v[2] = new MeuItem(3);
    v[3] = new MeuItem(2);
    v[4] = new MeuItem(4);
    v[5] = new MeuItem(1);
    
    FPHeapMin heap = new FPHeapMin(v);
    heap.insere(new MeuItem(0));
    
    assertEquals(0, heap.min().recuperaChave());
  }
  
  @Test(expected = Exception.class)
  public void testInsereFullHeap() throws Exception {
    Item[] v = new Item[6];
    v[1] = new MeuItem(5);
    v[2] = new MeuItem(3);
    v[3] = new MeuItem(2);
    v[4] = new MeuItem(4);
    v[5] = new MeuItem(1);
    
    FPHeapMin heap = new FPHeapMin(v);
    heap.insere(new MeuItem(0));
    heap.insere(new MeuItem(6));
  }
  
  @Test
  public void testImprime() {
    Item[] v = new Item[6];
    v[1] = new MeuItem(5);
    v[2] = new MeuItem(3);
    v[3] = new MeuItem(2);
    v[4] = new MeuItem(4);
    v[5] = new MeuItem(1);
    
    FPHeapMin heap = new FPHeapMin(v);
    
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    
    heap.imprime();
    
    String expectedOutput = "1 3 2 5 4 ";
    assertEquals(expectedOutput, outContent.toString());
  }
  
  @Test
  public void testCopia() {
    Item[] v = new Item[6];
    v[1] = new MeuItem(5);
    v[2] = new MeuItem(3);
    v[3] = new MeuItem(2);
    v[4] = new MeuItem(4);
    v[5] = new MeuItem(1);
    
    FPHeapMin heap = new FPHeapMin(10);
    heap.copia(v);
    
    assertEquals(5, heap.min().recuperaChave());
  }
}