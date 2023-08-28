
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest8 {

  @Test
  public void testInsereAresta() {
    Grafo grafo = new Grafo(5);
    
    // Test inserting a valid edge
    grafo.insereAresta(1, 2, 10);
    assertTrue(grafo.existeAresta(1, 2));
    
    // Test inserting an edge with invalid vertices
    grafo.insereAresta(6, 7, 5);
    assertFalse(grafo.existeAresta(6, 7));
  }

  @Test
  public void testExisteAresta() {
    Grafo grafo = new Grafo(5);
    
    // Test with an existing edge
    grafo.insereAresta(2, 3, 15);
    assertTrue(grafo.existeAresta(2, 3));
    
    // Test with a non-existing edge
    assertFalse(grafo.existeAresta(3, 4));
  }

  @Test
  public void testListaAdjVazia() {
    Grafo grafo = new Grafo(5);
    
    // Test with an empty adjacency list
    assertTrue(grafo.listaAdjVazia(1));
    
    // Test with a non-empty adjacency list
    grafo.insereAresta(1, 2, 10);
    assertFalse(grafo.listaAdjVazia(1));
  }

  @Test
  public void testPrimeiroListaAdj() {
    Grafo grafo = new Grafo(5);
    
    // Test with an empty adjacency list
    assertNull(grafo.primeiroListaAdj(2));
    
    // Test with a non-empty adjacency list
    grafo.insereAresta(2, 3, 15);
    assertNotNull(grafo.primeiroListaAdj(2));
  }

  @Test
  public void testProxAdj() {
    Grafo grafo = new Grafo(5);
    
    // Test with a non-existing next edge
    assertNull(grafo.proxAdj(1));
    
    // Test with an existing next edge
    grafo.insereAresta(1, 2, 10);
    grafo.insereAresta(1, 3, 20);
    assertNotNull(grafo.proxAdj(1));
  }

  @Test
  public void testRetiraAresta() {
    Grafo grafo = new Grafo(5);
    
    // Test removing an existing edge
    grafo.insereAresta(2, 3, 15);
    assertNotNull(grafo.retiraAresta(2, 3));
    assertFalse(grafo.existeAresta(2, 3));
    
    // Test removing a non-existing edge
    assertNull(grafo.retiraAresta(3, 4));
  }

  @Test
  public void testGrafoTransposto() {
    Grafo grafo = new Grafo(5);
    
    // Test with an empty graph
    Grafo grafoT = grafo.grafoTransposto();
    assertNotNull(grafoT);
    assertEquals(0, grafoT.numVertices());
    
    // Test with a non-empty graph
    grafo.insereAresta(1, 2, 10);
    grafo.insereAresta(2, 3, 20);
    grafoT = grafo.grafoTransposto();
    assertNotNull(grafoT);
    assertTrue(grafoT.existeAresta(2, 1));
    assertTrue(grafoT.existeAresta(3, 2));
  }
}
