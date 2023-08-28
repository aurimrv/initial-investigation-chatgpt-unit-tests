
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest5 {
  
  @Test
  public void testInsereAresta() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(1, 2, 3);
    
    assertTrue(grafo.existeAresta(0, 1));
    assertTrue(grafo.existeAresta(1, 2));
    assertFalse(grafo.existeAresta(0, 2));
  }
  
  @Test
  public void testRetiraAresta() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(1, 2, 3);
    
    assertEquals(new Grafo.Aresta(0, 1, 5), grafo.retiraAresta(0, 1));
    assertNull(grafo.retiraAresta(0, 1));
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
    grafo.insereAresta(0, 2, 3);
    
    assertEquals(new Grafo.Aresta(0, 1, 5), grafo.primeiroListaAdj(0));
    assertNull(grafo.primeiroListaAdj(1));
  }
  
  @Test
  public void testProxAdj() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(0, 2, 3);
    
    grafo.primeiroListaAdj(0);
    assertEquals(new Grafo.Aresta(0, 2, 3), grafo.proxAdj(0));
    assertNull(grafo.proxAdj(0));
  }
  
  @Test
  public void testGrafoTransposto() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(1, 2, 3);
    
    Grafo grafoTransposto = grafo.grafoTransposto();
    
    assertTrue(grafoTransposto.existeAresta(1, 0));
    assertTrue(grafoTransposto.existeAresta(2, 1));
    assertFalse(grafoTransposto.existeAresta(0, 2));
  }
}