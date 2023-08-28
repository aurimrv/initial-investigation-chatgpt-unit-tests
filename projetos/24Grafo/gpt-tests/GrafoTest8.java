
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest8 {
  
  @Test
  public void testInsereAresta() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(1, 2, 20);
    grafo.insereAresta(2, 3, 30);
    assertTrue(grafo.existeAresta(0, 1));
    assertTrue(grafo.existeAresta(1, 2));
    assertTrue(grafo.existeAresta(2, 3));
    assertFalse(grafo.existeAresta(3, 4));
  }
  
  @Test
  public void testExisteAresta() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(1, 2, 20);
    grafo.insereAresta(2, 3, 30);
    assertTrue(grafo.existeAresta(0, 1));
    assertTrue(grafo.existeAresta(1, 2));
    assertTrue(grafo.existeAresta(2, 3));
    assertFalse(grafo.existeAresta(3, 4));
  }
  
  @Test
  public void testListaAdjVazia() {
    Grafo grafo = new Grafo();
    assertTrue(grafo.listaAdjVazia(0));
    grafo.insereAresta(0, 1, 10);
    assertFalse(grafo.listaAdjVazia(0));
  }
  
  @Test
  public void testPrimeiroListaAdj() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(0, 2, 20);
    Aresta adj = grafo.primeiroListaAdj(0);
    assertEquals(adj.v2(), 1);
    assertEquals(adj.peso(), 10);
  }
  
  @Test
  public void testProxAdj() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(0, 2, 20);
    Aresta adj = grafo.primeiroListaAdj(0);
    assertEquals(adj.v2(), 1);
    assertEquals(adj.peso(), 10);
    adj = grafo.proxAdj(0);
    assertEquals(adj.v2(), 2);
    assertEquals(adj.peso(), 20);
  }
  
  @Test
  public void testRetiraAresta() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(1, 2, 20);
    Aresta aresta = grafo.retiraAresta(0, 1);
    assertEquals(aresta.v1(), 0);
    assertEquals(aresta.v2(), 1);
    assertEquals(aresta.peso(), 10);
    assertFalse(grafo.existeAresta(0, 1));
  }
  
  @Test
  public void testGrafoTransposto() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(1, 2, 20);
    grafo.insereAresta(2, 3, 30);
    Grafo transposto = grafo.grafoTransposto();
    assertTrue(transposto.existeAresta(1, 0));
    assertTrue(transposto.existeAresta(2, 1));
    assertTrue(transposto.existeAresta(3, 2));
  }
}
