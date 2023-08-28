
package ds;import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FPHeapMinTest11 {

  @Test
  public void testRefaz() {
    MeuItem[] v = criarItens();
    FPHeapMin heap = new FPHeapMin(v);
    
    heap.refaz(1, 7);
    
    assertTrue(heap.min().compara(v[1]) == 0);
    assertTrue(heap.min().compara(v[2]) == -1);
    assertTrue(heap.min().compara(v[3]) == -1);
    assertTrue(heap.min().compara(v[4]) == -1);
    assertTrue(heap.min().compara(v[5]) == -1);
    assertTrue(heap.min().compara(v[6]) == -1);
    assertTrue(heap.min().compara(v[7]) == -1);
  }

  @Test
  public void testConstroi() {
    MeuItem[] v = criarItens();
    FPHeapMin heap = new FPHeapMin(v);
    
    heap.constroi();
    
    assertTrue(heap.min().compara(v[1]) == 0);
    assertTrue(heap.min().compara(v[2]) == -1);
    assertTrue(heap.min().compara(v[3]) == -1);
    assertTrue(heap.min().compara(v[4]) == -1);
    assertTrue(heap.min().compara(v[5]) == -1);
    assertTrue(heap.min().compara(v[6]) == -1);
    assertTrue(heap.min().compara(v[7]) == -1);
  }

  @Test
  public void testRetiraMin() throws Exception {
    MeuItem[] v = criarItens();
    FPHeapMin heap = new FPHeapMin(v);
    
    Item min = heap.retiraMin();
    
    assertEquals(v[1], min);
    assertTrue(heap.min().compara(v[1]) == 0);
    assertTrue(heap.min().compara(v[2]) == 0);
    assertTrue(heap.min().compara(v[3]) == 0);
    assertTrue(heap.min().compara(v[4]) == 0);
    assertTrue(heap.min().compara(v[5]) == 0);
    assertTrue(heap.min().compara(v[6]) == 0);
  }

  @Test
  public void testDiminuiChave() throws Exception {
    MeuItem[] v = criarItens();
    FPHeapMin heap = new FPHeapMin(v);
    
    heap.diminuiChave(4, 0);
    
    assertTrue(heap.min().compara(v[1]) == 0);
    assertTrue(heap.min().compara(v[2]) == -1);
    assertTrue(heap.min().compara(v[3]) == -1);
    assertTrue(heap.min().compara(v[4]) == -1);
    assertTrue(heap.min().compara(v[5]) == -1);
    assertTrue(heap.min().compara(v[6]) == -1);
    assertTrue(heap.min().compara(v[7]) == -1);
  }

  @Test
  public void testInsere() throws Exception {
    MeuItem[] v = criarItens();
    FPHeapMin heap = new FPHeapMin(v);
    
    MeuItem novoItem = new MeuItem(0);
    heap.insere(novoItem);
    
    assertTrue(heap.min().compara(novoItem) == 0);
    assertTrue(heap.min().compara(v[1]) == -1);
    assertTrue(heap.min().compara(v[2]) == -1);
    assertTrue(heap.min().compara(v[3]) == -1);
    assertTrue(heap.min().compara(v[4]) == -1);
    assertTrue(heap.min().compara(v[5]) == -1);
    assertTrue(heap.min().compara(v[6]) == -1);
    assertTrue(heap.min().compara(v[7]) == -1);
  }

  private MeuItem[] criarItens() {
    MeuItem item1 = new MeuItem(5);
    MeuItem item2 = new MeuItem(10);
    MeuItem item3 = new MeuItem(3);
    MeuItem item4 = new MeuItem(7);
    MeuItem item5 = new MeuItem(2);
    MeuItem item6 = new MeuItem(9);
    MeuItem item7 = new MeuItem(1);
    
    MeuItem[] v = {null, item1, item2, item3, item4, item5, item6, item7};
    
    return v;
  }
}