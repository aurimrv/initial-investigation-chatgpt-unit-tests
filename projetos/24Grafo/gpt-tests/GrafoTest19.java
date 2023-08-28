package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.Aresta;
import ds.Grafo;

public class GrafoTest19{

  
  @Test
  public void testInsereAresta() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    assertTrue(grafo.existeAresta(0, 1));
  }
  
  @Test
  public void testExisteAresta() {
    Grafo grafo = new Grafo();
    assertFalse(grafo.existeAresta(0, 1));
  }
  
  @Test
  public void testListaAdjVazia() {
    Grafo grafo = new Grafo();
    assertTrue(grafo.listaAdjVazia(0));
  }
  
  @Test
  public void testPrimeiroListaAdj() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    Aresta aresta = grafo.primeiroListaAdj(0);
    assertNotNull(aresta);
    assertEquals(0, aresta.v1());
    assertEquals(1, aresta.v2());
    assertEquals(5, aresta.peso());
  }
  
  @Test
  public void testProxAdj() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(0, 2, 10);
    Aresta aresta1 = grafo.primeiroListaAdj(0);
    Aresta aresta2 = grafo.proxAdj(0);
    assertNotNull(aresta2);
    assertEquals(0, aresta2.v1());
    assertEquals(2, aresta2.v2());
    assertEquals(10, aresta2.peso());
  }
  
  @Test
  public void testRetiraAresta() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    Aresta aresta = grafo.retiraAresta(0, 1);
    assertNotNull(aresta);
    assertEquals(0, aresta.v1());
    assertEquals(1, aresta.v2());
    assertEquals(5, aresta.peso());
    assertFalse(grafo.existeAresta(0, 1));
  }
  
  @Test
  public void testGrafoTransposto() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(1, 2, 10);
    Grafo grafoT = grafo.grafoTransposto();
    assertTrue(grafoT.existeAresta(1, 0));
    assertTrue(grafoT.existeAresta(2, 1));
  }
  
}