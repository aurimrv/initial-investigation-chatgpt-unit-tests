
package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.*;

public class GrafoTest7 {

  @Test
  public void testInsereAresta() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);
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
    assertNull(grafo.primeiroListaAdj(0));
  }

  @Test
  public void testProxAdj() {
    Grafo grafo = new Grafo();
    assertNull(grafo.proxAdj(0));
  }
  
  @Test
  public void testRetiraAresta() {
    Grafo grafo = new Grafo();
    assertNull(grafo.retiraAresta(0, 1));
  }
  
  @Test
  public void testGrafoTransposto() {
    Grafo grafo = new Grafo();
    Grafo grafoTransposto = grafo.grafoTransposto();
    assertNotNull(grafoTransposto);
  }

}