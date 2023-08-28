
package ds;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class GrafoTest2 {
  
  private Grafo grafo;
  
  @Before
  public void setup() {
    grafo = new Grafo();
  }
  
  @Test
  public void testInsereAresta() {
    grafo.insereAresta(0, 1, 5);
    assertTrue(grafo.existeAresta(0, 1));
    assertFalse(grafo.existeAresta(1, 0));
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
    Aresta primeiraAresta = grafo.primeiroListaAdj(0);
    assertNotNull(primeiraAresta);
    assertEquals(0, primeiraAresta.v1());
    assertEquals(1, primeiraAresta.v2());
    assertEquals(5, primeiraAresta.peso());
  }
  
  @Test
  public void testProxAdj() {
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(0, 2, 10);
    grafo.insereAresta(0, 3, 15);
    Aresta primeiraAresta = grafo.primeiroListaAdj(0);
    assertNotNull(primeiraAresta);
    Aresta segundaAresta = grafo.proxAdj(0);
    assertNotNull(segundaAresta);
    assertEquals(0, segundaAresta.v1());
    assertEquals(2, segundaAresta.v2());
    assertEquals(10, segundaAresta.peso());
  }
  
  @Test
  public void testRetiraAresta() {
    grafo.insereAresta(0, 1, 5);
    Aresta arestaRetirada = grafo.retiraAresta(0, 1);
    assertNotNull(arestaRetirada);
    assertEquals(0, arestaRetirada.v1());
    assertEquals(1, arestaRetirada.v2());
    assertEquals(5, arestaRetirada.peso());
    assertFalse(grafo.existeAresta(0, 1));
  }
  
  @Test
  public void testGrafoTransposto() {
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(0, 2, 10);
    grafo.insereAresta(1, 0, 15);
    Grafo grafoT = grafo.grafoTransposto();
    assertTrue(grafoT.existeAresta(1, 0));
    assertTrue(grafoT.existeAresta(2, 0));
    assertFalse(grafoT.existeAresta(0, 1));
  }
  
  @Test
  public void testImprime() {
    // Testing print method is not possible with Junit since it outputs to console
    // Manually verify the output
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(0, 2, 10);
    grafo.imprime();
  }
}