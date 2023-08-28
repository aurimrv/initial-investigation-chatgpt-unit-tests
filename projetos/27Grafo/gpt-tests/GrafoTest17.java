package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest17{

  
  @Test
  public void testInsereAresta() {
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(1, 2, 3);
    assertTrue(grafo.existeAresta(0, 1));
    assertTrue(grafo.existeAresta(1, 2));
    assertFalse(grafo.existeAresta(0, 2));
  }
  
  @Test
  public void testRetiraAresta() throws Exception {
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(1, 2, 3);
    grafo.retiraAresta(0, 1);
    assertFalse(grafo.existeAresta(0, 1));
    assertTrue(grafo.existeAresta(1, 2));
  }
  
  @Test
  public void testListaAdjVazia() {
    Grafo grafo = new Grafo(3);
    assertTrue(grafo.listaAdjVazia(0));
    grafo.insereAresta(0, 1, 2);
    assertFalse(grafo.listaAdjVazia(0));
  }
  
  @Test
  public void testPrimeiroListaAdj() {
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(0, 2, 3);
    Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
    assertNotNull(aresta);
    assertEquals(0, aresta.v1());
    assertEquals(1, aresta.v2());
    assertEquals(2, aresta.peso());
  }
  
  @Test
  public void testProxAdj() {
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(0, 2, 3);
    grafo.insereAresta(1, 2, 4);
    Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
    assertNotNull(aresta);
    assertEquals(0, aresta.v1());
    assertEquals(1, aresta.v2());
    assertEquals(2, aresta.peso());
    aresta = grafo.proxAdj(0);
    assertNotNull(aresta);
    assertEquals(0, aresta.v1());
    assertEquals(2, aresta.v2());
    assertEquals(3, aresta.peso());
    aresta = grafo.proxAdj(0);
    assertNull(aresta);
  }
  
  @Test
  public void testGrafoTransposto() {
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(1, 2, 3);
    Grafo grafoT = grafo.grafoTransposto();
    assertTrue(grafoT.existeAresta(1, 0));
    assertTrue(grafoT.existeAresta(2, 1));
    assertFalse(grafoT.existeAresta(0, 1));
    assertFalse(grafoT.existeAresta(1, 2));
  }
  
}