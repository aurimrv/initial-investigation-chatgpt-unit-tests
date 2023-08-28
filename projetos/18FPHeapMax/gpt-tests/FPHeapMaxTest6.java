
package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.*;

public class TestFPHeapMax {
  
  @Test
  public void testCopia() {
    FPHeapMax heap = new FPHeapMax(20);
    MeuItem[] v = new MeuItem[21];
    for (int i = 1; i <= 20; i++) {
      v[i] = new MeuItem(i);
    }
    heap.copia(v);
    for (int i = 1; i <= 20; i++) {
      assertEquals(v[i], heap.v[i]);
    }
  }
  
  @Test
  public void testConstroi() throws Exception {
    FPHeapMax heap = new FPHeapMax(20);
    MeuItem[] v = new MeuItem[21];
    for (int i = 1; i <= 20; i++) {
      v[i] = new MeuItem(i);
    }
    heap.copia(v);
    heap.constroi();
    for (int i = 1; i <= 20; i++) {
      assertEquals(v[i], heap.v[i]);
    }
  }
  
  @Test
  public void testMax() throws Exception {
    FPHeapMax heap = new FPHeapMax(20);
    MeuItem[] v = new MeuItem[21];
    for (int i = 1; i <= 20; i++) {
      v[i