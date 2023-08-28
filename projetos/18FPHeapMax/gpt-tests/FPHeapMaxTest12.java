package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.*;

public class FPHeapMaxTest12{


  @Test
  public void testCopia() {
    FPHeapMax heap = new FPHeapMax(10);
    MeuItem[] items = new MeuItem[5];
    for (int i = 1; i <= 5; i++) {
      items[i] = new MeuItem(i);
    }
    heap.copia(items);
    assertEquals(5, heap.max().recuperaChave());
  }

  @Test
  public void testConstroi() {
    FPHeapMax heap = new FPHeapMax(10);
    MeuItem[] items = new MeuItem[5];
    for (int i = 1; i <= 5; i++) {
      items[i] = new MeuItem(i);
    }
    heap.copia(items);
    heap.constroi();
    assertEquals(5, heap.max().recuperaChave());
  }

  @Test
  public void testInsere() throws Exception {
    FPHeapMax heap = new FPHeapMax(10);
    heap.insere(new MeuItem(5));
    assertEquals(5, heap.max().recuperaChave());
  }

  @Test
  public void testRetiraMax() throws Exception {
    FPHeapMax heap = new FPHeapMax(10);
    heap.insere(new MeuItem(