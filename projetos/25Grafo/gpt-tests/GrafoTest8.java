
package ds;
import static org.junit.Assert.*;
import org.junit.Test;
import ds.Grafo;

public class GrafoTest8 {

  @Test
  public void testInsereAresta() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);
    
    assertTrue(grafo.existeAresta(0, 1));
    assertFalse(grafo.existeAresta(1, 0));
    assertFalse(grafo.existeAresta(0, 2));
  }

  @Test
  public void testExisteAresta() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);
    
    assertTrue(grafo.existeAresta(0, 1));
    assertFalse(grafo.existeAresta(1, 0));
    assertFalse(grafo.existeAresta(0, 2));
  }

  @Test
  public void testListaAdjVazia() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);
    
    assertFalse(grafo.listaAdjVazia(0));
    assertTrue(grafo.listaAdjVazia(1));
  }

  @Test
  public void testPrimeiroListaAdj() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);
    
    Grafo.Aresta aresta = grafo.primeiroListaAdj(0);

    assertNotNull(aresta);
    assertEquals(0, aresta.v1());
    assertEquals(1, aresta.v2());
    assertEquals(10, aresta.peso());
  }

  @Test
  public void testProxAdj() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(0, 2, 20);

    Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
    Grafo.Aresta aresta2 = grafo.proxAdj(0);

    assertEquals(0, aresta1.v1());
    assertEquals(1, aresta1.v2());
    assertEquals(10, aresta1.peso());

    assertEquals(0, aresta2.v1());
    assertEquals(2, aresta2.v2());
    assertEquals(20, aresta2.peso());
  }

  @Test
  public void testRetiraAresta() throws Exception {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);

    Grafo.Aresta aresta = grafo.retiraAresta(0, 1);

    assertNotNull(aresta);
    assertEquals(0, aresta.v1());
    assertEquals(1, aresta.v2());
    assertEquals(10, aresta.peso());

    assertFalse(grafo.existeAresta(0, 1));
  }

  @Test
  public void testNumVertices() {
    Grafo grafo = new Grafo();

    assertEquals(100, grafo.numVertices());
  }

  @Test
  public void testGrafoTransposto() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(0, 2, 20);

    Grafo grafoTransposto = grafo.grafoTransposto();

    assertTrue(grafoTransposto.existeAresta(1, 0));
    assertTrue(grafoTransposto.existeAresta(2, 0));
    assertFalse(grafoTransposto.existeAresta(0, 1));
    assertFalse(grafoTransposto.existeAresta(0, 2));
  }

}
