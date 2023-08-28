
package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.FPHeapMinIndireto;
import ds.Grafo;
import ds.AgmPrim;

public class AgmPrimTest4 {
  
  @Test
  public void testRefaz() {
    // Test case 1: esq = 1, dir = 5
    double p[] = {0, 1, 2, 3, 4, 5};
    int v[] = {0, 1, 2, 3, 4, 5};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    heap.refaz(1, 5);
    int fp[] = heap.getFp();
    int pos[] = heap.getPos();
    int expectedFp[] = {0, 1, 2, 3, 4, 5};
    int expectedPos[] = {0, 1, 2, 3, 4, 5};
    assertArrayEquals(expectedFp, fp);
    assertArrayEquals(expectedPos, pos);
    
    // Test case 2: esq = 2, dir = 4
    double p2[] = {0, 1, 2, 3, 4, 5};
    int v2[] = {0, 1, 2, 3, 4, 5};
    FPHeapMinIndireto heap2 = new FPHeapMinIndireto(p2, v2);
    heap2.refaz(2, 4);
    int fp2[] = heap2.getFp();
    int pos2[] = heap2.getPos();
    int expectedFp2[] = {0, 1, 2, 3, 4, 5};
    int expectedPos2[] = {0, 3, 2, 1, 4, 5};
    assertArrayEquals(expectedFp2, fp2);
    assertArrayEquals(expectedPos2, pos2);
  }
  
  @Test
  public void testConstroi() {
    // Test case 1
    double p[] = {0, 3, 2, 1, 4, 5};
    int v[] = {0, 3, 2, 1, 4, 5};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    heap.constroi();
    int fp[] = heap.getFp();
    int pos[] = heap.getPos();
    int expectedFp[] = {0, 1, 2, 3, 4, 5};
    int expectedPos[] = {0, 3, 2, 1, 4, 5};
    assertArrayEquals(expectedFp, fp);
    assertArrayEquals(expectedPos, pos);
    
    // Test case 2
    double p2[] = {0, 5, 4, 3, 2, 1};
    int v2[] = {0, 5, 4, 3, 2, 1};
    FPHeapMinIndireto heap2 = new FPHeapMinIndireto(p2, v2);
    heap2.constroi();
    int fp2[] = heap2.getFp();
    int pos2[] = heap2.getPos();
    int expectedFp2[] = {0, 1, 2, 3, 4, 5};
    int expectedPos2[] = {0, 5, 4, 3, 2, 1};
    assertArrayEquals(expectedFp2, fp2);
    assertArrayEquals(expectedPos2, pos2);
  }
  
  @Test
  public void testRetiraMin() throws Exception {
    // Test case 1
    double p[] = {0, 1, 2, 3, 4, 5};
    int v[] = {0, 1, 2, 3, 4, 5};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    int min = heap.retiraMin();
    assertEquals(1, min);
    
    // Test case 2
    double p2[] = {0, 5, 4, 3, 2, 1};
    int v2[] = {0, 5, 4, 3, 2, 1};
    FPHeapMinIndireto heap2 = new FPHeapMinIndireto(p2, v2);
    int min2 = heap2.retiraMin();
    assertEquals(1, min2);
  }
  
}