package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest15{

  
  @Test
  public void testInsereAresta() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    assertTrue(grafo.existeAresta(0, 1));
    assertFalse(grafo.existeAresta(1, 0));
  }
  
  @Test
  public void testExisteAresta() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    assertTrue(grafo.existeAresta(0, 1));
    assertFalse(grafo.existeAresta(1, 0));
  }
  
  @Test
  public void testListaAdjVazia() {
    Grafo grafo = new Grafo();
    assertTrue(grafo.listaAdjVazia(0));
    grafo.insereAresta(0, 1, 5);
    assertFalse(grafo.listaAdjVazia(0));
  }
  
  @Test
  public void testPrimeiroListaAdj() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(0, 2, 10);
    Aresta aresta = grafo.primeiroListaAdj(0);
    assertEquals(0, aresta.v1());
    assertEquals(1, aresta.v2());
    assertEquals(5, aresta.peso());
  }
  
  @Test
  public void testProxAdj() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(0, 2, 10);
    grafo.insereAresta(0, 3, 15);
    Aresta aresta1 = grafo.primeiroListaAdj(0);
    Aresta aresta2 = grafo.proxAdj(0);
    Aresta aresta3 = grafo.proxAdj(0);
    assertNull(grafo.proxAdj(0));
    assertEquals(0, aresta1.v1());
    assertEquals(1, aresta1.v2());
    assertEquals(5, aresta1.peso());
    assertEquals(0, aresta2.v1());
    assertEquals(2, aresta2.v2());
    assertEquals(10, aresta2.peso());
    assertEquals(0, aresta3.v1());
    assertEquals(3, aresta3.v2());
    assertEquals(15, aresta3.peso());
  }
  
  @Test
  public void testRetiraAresta() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    Aresta aresta = grafo.retiraAresta(0, 1);
    assertNull(grafo.retiraAresta(0, 1));
    assertEquals(0, aresta.v1());
    assertEquals(1, aresta.v2());
    assertEquals(5, aresta.peso());
  }
  
  @Test
  public void testGrafoTransposto() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(1, 2, 10);
    grafo.insereAresta(2, 0, 15);
    Grafo grafoT = grafo.grafoTransposto();
    assertFalse(grafoT.existeAresta(0, 1));
    assertTrue(grafoT.existeAresta(1, 0));
    assertFalse(grafoT.existeAresta(2, 0));
    assertTrue(grafoT.existeAresta(0, 2));
  }
  
}