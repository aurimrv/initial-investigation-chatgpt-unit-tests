
package ds;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import ds.Grafo;

public class GrafoTest5 {
  
  private Grafo grafo;
  
  @Before
  public void setUp() {
    grafo = new Grafo();
  }
  
  @Test
  public void testInsereAresta() {
    grafo.insereAresta(0, 1, 2);
    assertTrue(grafo.existeAresta(0, 1));
    assertFalse(grafo.existeAresta(1, 0));
  }
  
  @Test
  public void testExisteAresta() {
    grafo.insereAresta(0, 1, 2);
    assertTrue(grafo.existeAresta(0, 1));
    assertFalse(grafo.existeAresta(1, 0));
  }
  
  @Test
  public void testListaAdjVazia() {
    assertTrue(grafo.listaAdjVazia(0));
    grafo.insereAresta(0, 1, 2);
    assertFalse(grafo.listaAdjVazia(0));
  }
  
  @Test
  public void testPrimeiroListaAdj() {
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(0, 2, 3);
    Aresta primeiraAresta = grafo.primeiroListaAdj(0);
    assertEquals(0, primeiraAresta.v1());
    assertEquals(1, primeiraAresta.v2());
    assertEquals(2, primeiraAresta.peso());
  }
  
  @Test
  public void testProxAdj() {
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(0, 2, 3);
    grafo.insereAresta(0, 3, 4);
    Aresta primeiraAresta = grafo.primeiroListaAdj(0);
    assertEquals(0, primeiraAresta.v1());
    assertEquals(1, primeiraAresta.v2());
    assertEquals(2, primeiraAresta.peso());
    
    Aresta segundaAresta = grafo.proxAdj(0);
    assertEquals(0, segundaAresta.v1());
    assertEquals(2, segundaAresta.v2());
    assertEquals(3, segundaAresta.peso());
    
    Aresta terceiraAresta = grafo.proxAdj(0);
    assertEquals(0, terceiraAresta.v1());
    assertEquals(3, terceiraAresta.v2());
    assertEquals(4, terceiraAresta.peso());
  }
  
  @Test
  public void testRetiraAresta() {
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(0, 2, 3);
    Aresta aresta = grafo.retiraAresta(0, 1);
    assertNotNull(aresta);
    assertEquals(0, aresta.v1());
    assertEquals(1, aresta.v2());
    assertEquals(2, aresta.peso());
    assertFalse(grafo.existeAresta(0, 1));
  }
  
  @Test
  public void testGrafoTransposto() {
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(0, 2, 3);
    Grafo grafoT = grafo.grafoTransposto();
    assertFalse(grafoT.existeAresta(0, 1));
    assertFalse(grafoT.existeAresta(0, 2));
    assertTrue(grafoT.existeAresta(1, 0));
    assertTrue(grafoT.existeAresta(2, 0));
  }
  
  @Test
  public void testImprime() {
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(0, 2, 3);
    grafo.insereAresta(1, 2, 4);
    grafo.insereAresta(2, 3, 5);
    grafo.imprime();
  }
}