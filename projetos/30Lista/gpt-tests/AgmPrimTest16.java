package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.FPHeapMinIndireto;
import ds.Grafo;
import ds.AgmPrim;
import ds.Lista;

public class AgmPrimTest16{

  
  @Test
  public void testRefaz() {
    double p[] = {0, 3, 4, 5, 2, 1};
    int v[] = {0, 1, 2, 3, 4, 5};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    heap.refaz(1, 5);
    int expected[] = {0, 4, 3, 5, 2, 1};
    assertArrayEquals(expected, heap.fp);
  }
  
  @Test
  public void testConstroi() {
    double p[] = {0, 3, 4, 5, 2, 1};
    int v[] = {0, 1, 2, 3, 4, 5};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    heap.constroi();
    int expected[] = {0, 1, 2, 5, 4, 3};
    assertArrayEquals(expected, heap.fp);
  }
  
  @Test
  public void testRetiraMin() throws Exception {
    double p[] = {0, 3, 4, 5, 2, 1};
    int v[] = {0, 1, 2, 3, 4, 5};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    int min = heap.retiraMin();
    assertEquals(5, min);
    int expected[] = {0, 1, 2, 3, 4, 0};
    assertArrayEquals(expected, heap.fp);
  }
  
  @Test
  public void testDiminuiChave() throws Exception {
    double p[] = {0, 3, 4, 5, 2, 1};
    int v[] = {0, 1, 2, 3, 4, 5};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    heap.diminuiChave(2, 1);
    double expected[] = {0, 1, 1, 5, 2, 3};
    assertArrayEquals(expected, heap.p, 0.001);
  }
  
  @Test
  public void testVazio() {
    double p[] = {0, 3, 4, 5, 2, 1};
    int v[] = {0, 1, 2, 3, 4, 5};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    assertFalse(heap.vazio());
  }
  
  @Test
  public void testImprime() {
    double p[] = {0, 3, 4, 5, 2, 1};
    int v[] = {0, 1, 2, 3, 4, 5};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    heap.imprime();
    // Check console output manually
  }
  
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
    int expectedAntecessor[] = {-1, 0, 1, 0, 1};
    double expectedPeso[] = {0, 2, 3, 6, 5};
    assertArrayEquals(expectedAntecessor, agm.antecessor);
    assertArrayEquals(expectedPeso, agm.p, 0.001);
  }
  
  @Test
  public void testAntecessor() {
    Grafo