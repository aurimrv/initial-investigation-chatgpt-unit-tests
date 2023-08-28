package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest20{

  
  @Test
  public void testInsereAresta() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(1, 2, 20);
    grafo.insereAresta(2, 3, 30);
    
    assertTrue(grafo.existeAresta(0, 1));
    assertTrue(grafo.existeAresta(1, 2));
    assertTrue(grafo.existeAresta(2, 3));
    assertFalse(grafo.existeAresta(0, 2));
    assertFalse(grafo.existeAresta(1, 3));
  }
  
  @Test
  public void testRetiraAresta() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(1, 2, 20);
    grafo.insereAresta(2, 3, 30);
    
    assertEquals(10, grafo.retiraAresta(0, 1).peso());
    assertFalse(grafo.existeAresta(0, 1));
    
    assertNull(grafo.retiraAresta(0, 2));
    
    assertEquals(30, grafo.retiraAresta(2, 3).peso());
    assertFalse(grafo.existeAresta(2, 3));
  }
  
  @Test
  public void testGrafoTransposto() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(1, 2, 20);
    grafo.insereAresta(2, 3, 30);
    
    Grafo grafoT = grafo.grafoTransposto();
    
    assertTrue(grafoT.existeAresta(1, 0));
    assertTrue(grafoT.existeAresta(2, 1));
    assertTrue(grafoT.existeAresta(3, 2));
    assertFalse(grafoT.existeAresta(0, 2));
    assertFalse(grafoT.existeAresta(3, 1));
  }
  
  @Test
  public void testListaAdjVazia() {
    Grafo grafo = new Grafo(5);
    assertTrue(grafo.listaAdjVazia(0));
    
    grafo.insereAresta(0, 1, 10);
    assertFalse(grafo.listaAdjVazia(0));
  }
  
  @Test
  public void testPrimeiroListaAdj() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(0, 2, 20);
    
    Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
    assertNotNull(aresta);
    assertEquals(1, aresta.v2());
    assertEquals(10, aresta.peso());
  }
  
  @Test
  public void testProxAdj() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(0, 2, 20);
    
    Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
    assertNotNull(aresta);
    assertEquals(1, aresta.v2());
    assertEquals(10, aresta.peso());
    
    aresta = grafo.proxAdj(0);
    assertNotNull(aresta);
    assertEquals(2, aresta.v2());
    assertEquals(20, aresta.peso());
    
    aresta = grafo.proxAdj(0);
    assertNull(aresta);
  }
  
  @Test
  public void testImprime() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(1, 2, 20);
    grafo.insereAresta(2, 3, 30);
    
    // Redirect System.out to a string builder
    StringBuilder sb = new StringBuilder();
    System.setOut(new PrintStream(new OutputStream() {
      public void write(int b) {
        sb.append((char) b);
      }
    }));
    
    grafo.imprime();
    
    String expectedOutput = "Vertice 0:\n  1 (10)\nVertice 1:\n  2 (20)\nVertice 2:\n  3 (30)\nVertice 3:\n";
    assertEquals(expectedOutput, sb.toString());
  }
  
  @Test
  public void testNumVertices() {
    Grafo grafo = new Grafo(5);
    assertEquals(5, grafo.numVertices());
  }
}