
package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class FPHeapMinTest6 {
  
  @Test
  public void testRefaz() {
    Item[] v = new Item[6];
    v[1] = new MeuItem(3);
    v[2] = new MeuItem(1);
    v[3] = new MeuItem(4);
    v[4] = new MeuItem(2);
    v[5] = new MeuItem(5);
    
    FPHeapMin heap = new FPHeapMin(v);
    heap.refaz(1, 5);
    
    assertEquals(1, heap.min().recuperaChave());
  }
  
  @Test
  public void testConstroi() {
    Item[] v = new Item[6];
    v[1] = new MeuItem(3);
    v[2] = new MeuItem(1);
    v[3] = new MeuItem(4);
    v[4] = new MeuItem(2);
    v[5] = new MeuItem(5);
    
    FPHeapMin heap = new FPHeapMin(v);
    heap.constroi();
    
    assertEquals(1, heap.min().recuperaChave());
  }
  
  @Test
  public void testRetiraMin() throws Exception {
    Item[] v = new Item[6];
    v[1] = new MeuItem(3);
    v[2] = new MeuItem(1);
    v[3] = new MeuItem(4);
    v[4] = new MeuItem(2);
    v[5] = new MeuItem(5);
    
    FPHeapMin heap = new FPHeapMin(v);
    
    assertEquals(1, heap.retiraMin().recuperaChave());
    assertEquals(2, heap.min().recuperaChave());
  }
  
  @Test
  public void testDiminuiChave() throws Exception {
    Item[] v = new Item[6];
    v[1] = new MeuItem(3);
    v[2] = new MeuItem(1);
    v[3] = new MeuItem(4);
    v[4] = new MeuItem(2);
    v[5] = new MeuItem(5);
    
    FPHeapMin heap = new FPHeapMin(v);
    heap.diminuiChave(3, 0);
    
    assertEquals(0, heap.min().recuperaChave());
  }
  
  @Test
  public void testInsere() throws Exception {
    Item[] v = new Item[6];
    v[1] = new MeuItem(3);
    v[2] = new MeuItem(1);
    v[3] = new MeuItem(4);
    v[4] = new MeuItem(2);
    v[5] = new MeuItem(5);
    
    FPHeapMin heap = new FPHeapMin(v);
    heap.insere(new MeuItem(0));
    
    assertEquals(0, heap.min().recuperaChave());
  }
  
  @Test
  public void testImprime() {
    Item[] v = new Item[6];
    v[1] = new MeuItem(3);
    v[2] = new MeuItem(1);
    v[3] = new MeuItem(4);
    v[4] = new MeuItem(2);
    v[5] = new MeuItem(5);
    
    FPHeapMin heap = new FPHeapMin(v);
    
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    
    heap.imprime();
    
    String expectedOutput = "1 2 3 4 5 \n";
    assertEquals(expectedOutput, outContent.toString());
  }
  
  @Test
  public void testCopia() {
    Item[] v1 = new Item[6];
    v1[1] = new MeuItem(3);
    v1[2] = new MeuItem(1);
    v1[3] = new MeuItem(4);
    v1[4] = new MeuItem(2);
    v1[5] = new MeuItem(5);
    
    Item[] v2 = new Item[7];
    v2[1] = new MeuItem(0);
    
    FPHeapMin heap = new FPHeapMin(v1);
    
    heap.copia(v2);
    
    assertEquals(5, heap.min().recuperaChave());
  }
}