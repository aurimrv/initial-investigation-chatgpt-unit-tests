
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest1 {
  
  @Test
  public void testInsereAresta() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(1, 2, 20);
    grafo.insereAresta(2, 3, 30);
    grafo.insereAresta(3, 4, 40);
    
    assertTrue(grafo.existeAresta(0, 1));
    assertTrue(grafo.existeAresta(1, 2));
    assertTrue(grafo.existeAresta(2, 3));
    assertTrue(grafo.existeAresta(3, 4));
  }
  
  @Test
  public void testRetiraAresta() throws Exception {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(1, 2, 20);
    grafo.insereAresta(2, 3, 30);
    grafo.insereAresta(3, 4, 40);
    
    grafo.retiraAresta(0, 1);
    assertFalse(grafo.existeAresta(0, 1));
    
    grafo.retiraAresta(1, 2);
    assertFalse(grafo.existeAresta(1, 2));
    
    grafo.retiraAresta(2, 3);
    assertFalse(grafo.existeAresta(2, 3));
    
    grafo.retiraAresta(3, 4);
    assertFalse(grafo.existeAresta(3, 4));
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
    
    Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
    assertEquals(0, aresta1.v1());
    assertEquals(1, aresta1.v2());
    assertEquals(10, aresta1.peso());
    
    Grafo.Aresta aresta2 = grafo.proxAdj(0);
    assertEquals(0, aresta2.v1());
    assertEquals(2, aresta2.v2());
    assertEquals(20, aresta2.peso());
  }
  
  @Test
  public void testGrafoTransposto() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(1, 2, 20);
    grafo.insereAresta(2, 3, 30);
    grafo.insereAresta(3, 4, 40);
    
    Grafo grafoT = grafo.grafoTransposto();
    
    assertTrue(grafoT.existeAresta(1, 0));
    assertTrue(grafoT.existeAresta(2, 1));
    assertTrue(grafoT.existeAresta(3, 2));
    assertTrue(grafoT.existeAresta(4, 3));
  }
  
}
