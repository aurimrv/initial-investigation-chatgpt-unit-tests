
package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import ds.BuscaEmLargura;

public class GrafoTest2 {

  @Test
  public void testInsereAresta() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(1, 2, 3);
    grafo.insereAresta(2, 3, 4);

    assertTrue(grafo.existeAresta(0, 1));
    assertTrue(grafo.existeAresta(1, 2));
    assertTrue(grafo.existeAresta(2, 3));
  }

  @Test
  public void testRetiraAresta() throws Exception {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(1, 2, 3);
    grafo.insereAresta(2, 3, 4);

    assertNotNull(grafo.retiraAresta(0, 1));
    assertNull(grafo.retiraAresta(0, 1));
  }

  @Test
  public void testListaAdjVazia() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(1, 2, 3);
    grafo.insereAresta(2, 3, 4);

    assertFalse(grafo.listaAdjVazia(0));
    assertFalse(grafo.listaAdjVazia(1));
    assertFalse(grafo.listaAdjVazia(2));
    assertTrue(grafo.listaAdjVazia(3));
  }

  @Test
  public void testBuscaEmLargura() throws Exception {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(1, 2, 3);
    grafo.insereAresta(2, 3, 4);

    BuscaEmLargura bfs = new BuscaEmLargura(grafo);
    bfs.buscaEmLargura();

    assertEquals(0, bfs.d(0));
    assertEquals(1, bfs.d(1));
    assertEquals(2, bfs.d(2));
    assertEquals(3, bfs.d(3));
    assertEquals(Integer.MAX_VALUE, bfs.d(4));
  }

  @Test
  public void testAntecessor() throws Exception {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(1, 2, 3);
    grafo.insereAresta(2, 3, 4);

    BuscaEmLargura bfs = new BuscaEmLargura(grafo);
    bfs.buscaEmLargura();

    assertEquals(-1, bfs.antecessor(0));
    assertEquals(0, bfs.antecessor(1));
    assertEquals(1, bfs.antecessor(2));
    assertEquals(2, bfs.antecessor(3));
    assertEquals(-1, bfs.antecessor(4));
  }
}