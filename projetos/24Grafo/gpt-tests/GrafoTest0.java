
package ds;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class GrafoTest0 {
  
  private Grafo grafo;
  
  @Before
  public void setUp() {
    grafo = new Grafo();
  }
  
  @Test
  public void testInsereAresta() {
    grafo.insereAresta(0, 1, 5);
    assertTrue(grafo.existeAresta(0, 1));
    assertFalse(grafo.existeAresta(1, 0));
    assertEquals(5, grafo.mat[0][1]);
  }
  
  @Test
  public void testExisteAresta() {
    assertFalse(grafo.existeAresta(0, 1));
    grafo.insereAresta(0, 1, 5);
    assertTrue(grafo.existeAresta(0, 1));
  }
  
  @Test
  public void testListaAdjVazia() {
    assertTrue(grafo.listaAdjVazia(0));
    grafo.insereAresta(0, 1, 5);
    assertFalse(grafo.listaAdjVazia(0));
  }
  
  @Test
  public void testPrimeiroListaAdj() {
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(0, 2, 10);
    grafo.insereAresta(1, 2, 3);
    Aresta aresta = grafo.primeiroListaAdj(0);
    assertEquals(0, aresta.v1());
    assertEquals(1, aresta.v2());
    assertEquals(5, aresta.peso());
  }
  
  @Test
  public void testProxAdj() {
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(0, 2, 10);
    grafo.insereAresta(1, 2, 3);
    grafo.primeiroListaAdj(0);
    Aresta aresta = grafo.proxAdj(0);
    assertEquals(0, aresta.v1());
    assertEquals(2, aresta.v2());
    assertEquals(10, aresta.peso());
  }
  
  @Test
  public void testRetiraAresta() {
    assertNull(grafo.retiraAresta(0, 1));
    grafo.insereAresta(0, 1, 5);
    assertNotNull(grafo.retiraAresta(0, 1));
    assertFalse(grafo.existeAresta(0, 1));
  }
  
  @Test
  public void testGrafoTransposto() {
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(0, 2, 10);
    grafo.insereAresta(1, 2, 3);
    Grafo grafoT = grafo.grafoTransposto();
    assertTrue(grafoT.existeAresta(1, 0));
    assertTrue(grafoT.existeAresta(2, 0));
    assertTrue(grafoT.existeAresta(2, 1));
  }
  
}
