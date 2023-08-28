package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.FPHeapMinIndireto;
import ds.AgmPrim;
import ds.Grafo;
import ds.Lista;

public class AgmPrimTest21{


  @Test
  public void testRefaz() {
    double[] p = {0, 4, 3, 2, 1};
    int[] v = {0, 1, 2, 3, 4};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    heap.refaz(1, 4);
    int[] expected = {0, 4, 3, 2, 1};
    assertArrayEquals(expected, heap.fp);
  }

  @Test
  public void testConstroi() {
    double[] p = {0, 4, 3, 2, 1};
    int[] v = {0, 1, 2, 3, 4};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    heap.constroi();
    int[] expected = {0, 1, 2, 3, 4};
    assertArrayEquals(expected, heap.fp);
  }

  @Test
  public void testRetiraMin() throws Exception {
    double[] p = {0, 4, 3, 2, 1};
    int[] v = {0, 1, 2, 3, 4};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    int min = heap.retiraMin();
    assertEquals(1, min);
  }

  @Test
  public void testDiminuiChave() throws Exception {
    double[] p = {0, 4, 3, 2, 1};
    int[] v = {0, 1, 2, 3, 4};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    heap.diminuiChave(4, 0.5);
    double[] expected = {0, 0.5, 3, 2, 1};
    assertArrayEquals(expected, heap.p, 0.001);
  }

  @Test
  public void testVazio() {
    double[] p = {0};
    int[] v = {0};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    assertTrue(heap.vazio());
  }

  @Test
  public void testObterAgm() throws Exception {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 4);
    grafo.insereAresta(0, 2, 3);
    grafo.insereAresta(0, 3, 2);
    grafo.insereAresta(0, 4, 1);
    AgmPrim agm = new AgmPrim(grafo);
    agm.obterAgm(0);
    int[] expectedAntecessor = {-1, 0, 0, 0, 0};
    double[] expectedPeso = {0, 4, 3, 2, 1};
    assertArrayEquals(expectedAntecessor, agm.antecessor);
    assertArrayEquals(expectedPeso, agm.p, 0.001);
  }

  @Test
  public void testAntecessor() {
    Grafo grafo = new Grafo(5);
    AgmPrim agm = new AgmPrim(grafo);
    agm.antecessor = new int[] {-1, 0, 0, 0, 0};
    assertEquals(0, agm.antecessor(1));
  }

  @Test
  public void testPeso() {
    Grafo grafo = new Grafo(5);
    AgmPrim agm = new AgmPrim(grafo);
    agm.p = new double[] {0, 4, 3, 2, 1};
    assertEquals(4, agm.peso(1), 0.001);
  }

}