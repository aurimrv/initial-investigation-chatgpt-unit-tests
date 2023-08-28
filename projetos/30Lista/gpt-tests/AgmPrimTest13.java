package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.*;

public class AgmPrimTest13{

  
  // Test case for constructor
  @Test
  public void testConstructor() {
    double[] p = {1.0, 2.0, 3.0, 4.0};
    int[] v = {1, 2, 3, 4};
    
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    
    assertNotNull(heap);
  }
  
  // Test case for refaz method
  @Test
  public void testRefaz() {
    double[] p = {1.0, 2.0, 3.0, 4.0};
    int[] v = {1, 2, 3, 4};
    
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    
    heap.refaz(1, 3);
    
    // Assert statements
  }
  
  // Test case for constroi method
  @Test
  public void testConstroi() {
    double[] p = {1.0, 2.0, 3.0, 4.0};
    int[] v = {1, 2, 3, 4};
    
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    
    heap.constroi();
    
    // Assert statements
  }
  
  // Test case for retiraMin method
  @Test
  public void testRetiraMin() throws Exception {
    double[] p = {1.0, 2.0, 3.0, 4.0};
    int[] v = {1, 2, 3, 4};
    
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    
    int min = heap.retiraMin();
    
    // Assert statements
  }
  
  // Test case for diminuiChave method
  @Test
  public void testDiminuiChave() throws Exception {
    double[] p = {1.0, 2.0, 3.0, 4.0};
    int[] v = {1, 2, 3, 4};
    
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    
    heap.diminuiChave(2, 0.5);
    
    // Assert statements
  }
  
  // Test case for vazio method
  @Test
  public void testVazio() {
    double[] p = {1.0, 2.0, 3.0, 4.0};
    int[] v = {1, 2, 3, 4};
    
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    
    boolean result = heap.vazio();
    
    // Assert statements
  }
  
  // Test case for imprime method
  @Test
  public void testImprime() {
    double[] p = {1.0, 2.0, 3.0, 4.0};
    int[] v = {1, 2, 3, 4};
    
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    
    heap.imprime();
    
    // Assert statements
  }
  
  // Test case for obterAgm method
  @Test
  public void testObterAgm() throws Exception {
    Grafo grafo = new Grafo(4);
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(0, 2, 3);
    grafo.insereAresta(1, 2, 1);
    grafo.insereAresta(1, 3, 4);
    grafo.insereAresta(2, 3, 5);
    
    AgmPrim agmPrim = new AgmPrim(grafo);
    
    agmPrim.obterAgm(0);
    
    // Assert statements
  }
  
  // Test case for antecessor method
  @Test
  public void testAntecessor() {
    Grafo grafo = new Grafo(4);
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(0, 2, 3);
    grafo.insereAresta(1, 2, 1);
    grafo.insereAresta(1, 3, 4);
