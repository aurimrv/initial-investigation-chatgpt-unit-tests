
package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.FPHeapMinIndireto;
import ds.AgmPrim;
import ds.Grafo;

public class AgmPrimTest2 {
  
  @Test
  public void testObterAgm() throws Exception {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(0, 3, 6);
    grafo.insereAresta(1, 2, 3);
    grafo.insereAresta(1, 3, 8);
    grafo.insereAresta(1, 4, 5);
    grafo.insereAresta(2, 4, 7);
    grafo.insereAresta(3, 4, 9);
    
    AgmPrim agm = new AgmPrim(grafo);
    agm.obterAgm(0);
    
    assertEquals(3, agm.antecessor(4));
    assertEquals(2.0, agm.peso(4), 0.001);
  }
  
  @Test
  public void testRetiraMin() throws Exception {
    double p[] = {0, 5, 3, 10, 8, 2};
    int v[] = {0, 1, 2, 3, 4, 5};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    
    int min = heap.retiraMin();
    
    assertEquals(5, min);
  }
  
  @Test
  public void testDiminuiChave() throws Exception {
    double p[] = {0, 5, 3, 10, 8, 2};
    int v[] = {0, 1, 2, 3, 4, 5};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    
    heap.diminuiChave(4, 1);
    
    assertEquals(4, heap.retiraMin());
  }
  
  @Test
  public void testVazio() {
    double p[] = {0};
    int v[] = {0};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    
    assertTrue(heap.vazio());
  }
  
}

