
package ds;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import ds.Grafo;

public class GrafoTest11 {
  
  private Grafo grafo;
  
  @Before
  public void setUp() {
    grafo = new Grafo();
  }
  
  @Test
  public void testInsereAresta() {
    grafo.insereAresta(0, 1, 5);
    assertTrue(grafo.existeAresta(0, 1));
    assertFalse(grafo.existeAresta(0, 2));
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
    grafo.insereAresta(0, 3, 15);
    
    Grafo.Aresta firstAdj = grafo.primeiroListaAdj(0);
    assertEquals(0, firstAdj.v1());
    assertEquals(1, firstAdj.v2());
    assertEquals(5, firstAdj.peso());
  }
  
  @Test
  public void testProxAdj() {
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(0, 2, 10);
    grafo.insereAresta(0, 3, 15);
    
    Grafo.Aresta firstAdj = grafo.primeiroListaAdj(0);
    Grafo.Aresta nextAdj1 = grafo.proxAdj(0);
    Grafo.Aresta nextAdj2 = grafo.proxAdj(0);
    
    assertEquals(1, firstAdj.v2());
    assertEquals(5, firstAdj.peso());
    
    assertEquals(2, nextAdj1.v2());
    assertEquals(10, nextAdj1.peso());
    
    assertNull(nextAdj2);
  }
  
  @Test
  public void testRetiraAresta() throws Exception {
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(0, 2, 10);
    
    Grafo.Aresta removedAresta = grafo.retiraAresta(0, 1);
    assertNull(grafo.retiraAresta(0, 1));
    assertEquals(0, removedAresta.v1());
    assertEquals(1, removedAresta.v2());
    assertEquals(5, removedAresta.peso());
  }
  
  @Test
  public void testNumVertices() {
    assertEquals(100, grafo.numVertices());
  }
  
  @Test
  public void testGrafoTransposto() {
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(0, 2, 10);
    
    Grafo transposedGrafo = grafo.grafoTransposto();
    
    assertTrue(transposedGrafo.existeAresta(1, 0));
    assertTrue(transposedGrafo.existeAresta(2, 0));
    
    assertFalse(transposedGrafo.existeAresta(0, 1));
    assertFalse(transposedGrafo.existeAresta(0, 2));
  }
  
}