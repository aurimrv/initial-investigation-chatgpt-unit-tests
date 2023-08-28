
package ds;import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import ds.BuscaEmProfundidade;
import ds.Grafo;

public class GrafoTest6 {
  
  private Grafo grafo;
  private BuscaEmProfundidade busca;

  @Before
  public void setUp() {
    grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 1);
    grafo.insereAresta(1, 2, 2);
    grafo.insereAresta(2, 3, 3);
    grafo.insereAresta(3, 4, 4);
    grafo.insereAresta(4, 0, 5);
    busca = new BuscaEmProfundidade(grafo);
  }
  
  @Test
  public void testBuscaEmProfundidade() {
    busca.buscaEmProfundidade();
    assertEquals(1, busca.d(0));
    assertEquals(2, busca.d(1));
    assertEquals(3, busca.d(2));
    assertEquals(4, busca.d(3));
    assertEquals(5, busca.d(4));
    assertEquals(5, busca.t(0));
    assertEquals(4, busca.t(1));
    assertEquals(3, busca.t(2));
    assertEquals(2, busca.t(3));
    assertEquals(1, busca.t(4));
    assertEquals(-1, busca.antecessor(0));
    assertEquals(0, busca.antecessor(1));
    assertEquals(1, busca.antecessor(2));
    assertEquals(2, busca.antecessor(3));
    assertEquals(3, busca.antecessor(4));
  }
  
  @Test
  public void testExisteAresta() {
    assertTrue(grafo.existeAresta(0, 1));
    assertTrue(grafo.existeAresta(1, 2));
    assertTrue(grafo.existeAresta(2, 3));
    assertTrue(grafo.existeAresta(3, 4));
    assertTrue(grafo.existeAresta(4, 0));
    assertFalse(grafo.existeAresta(1, 0));
    assertFalse(grafo.existeAresta(2, 1));
    assertFalse(grafo.existeAresta(3, 2));
    assertFalse(grafo.existeAresta(4, 3));
    assertFalse(grafo.existeAresta(0, 4));
  }
  
  @Test
  public void testListaAdjVazia() {
    assertFalse(grafo.listaAdjVazia(0));
    assertFalse(grafo.listaAdjVazia(1));
    assertFalse(grafo.listaAdjVazia(2));
    assertFalse(grafo.listaAdjVazia(3));
    assertFalse(grafo.listaAdjVazia(4));
    assertTrue(grafo.listaAdjVazia(2));
    assertTrue(grafo.listaAdjVazia(3));
    assertTrue(grafo.listaAdjVazia(4));
  }
  
  @Test
  public void testRetiraAresta() throws Exception {
    assertEquals(new Grafo.Aresta(0, 1, 1), grafo.retiraAresta(0, 1));
    assertEquals(new Grafo.Aresta(1, 2, 2), grafo.retiraAresta(1, 2));
    assertEquals(new Grafo.Aresta(2, 3, 3), grafo.retiraAresta(2, 3));
    assertEquals(new Grafo.Aresta(3, 4, 4), grafo.retiraAresta(3, 4));
    assertEquals(new Grafo.Aresta(4, 0, 5), grafo.retiraAresta(4, 0));
    assertNull(grafo.retiraAresta(1, 0));
    assertNull(grafo.retiraAresta(2, 1));
    assertNull(grafo.retiraAresta(3, 2));
    assertNull(grafo.retiraAresta(4, 3));
    assertNull(grafo.retiraAresta(0, 4));
  }
  
  @Test
  public void testGrafoTransposto() {
    Grafo grafoT = grafo.grafoTransposto();
    assertTrue(grafoT.existeAresta(1, 0));
    assertTrue(grafoT.existeAresta(2, 1));
    assertTrue(grafoT.existeAresta(3, 2));
    assertTrue(grafoT.existeAresta(4, 3));
    assertTrue(grafoT.existeAresta(0, 4));
    assertFalse(grafoT.existeAresta(0, 1));
    assertFalse(grafoT.existeAresta(1, 2));
    assertFalse(grafoT.existeAresta(2, 3));
    assertFalse(grafoT.existeAresta(3, 4));
    assertFalse(grafoT.existeAresta(4, 0));
  }
  
  @Test
  public void testInsereAresta() {
    assertFalse(grafo.existeAresta(0, 3));
    assertFalse(grafo.existeAresta(4, 1));
    grafo.insereAresta(0, 3, 6);
    grafo.insereAresta(4, 1, 7);
    assertTrue(grafo.existeAresta(0, 3));
    assertTrue(grafo.existeAresta(4, 1));
  }
  
  @Test
  public void testNumVertices() {
    assertEquals(5, grafo.numVertices());
  }
  
  @Test
  public void testPesquisa() {
    assertEquals(new Grafo.Celula(1, 0), grafo.pesquisa(new Grafo.Celula(1, 0)));
    assertNull(grafo.pesquisa(new Grafo.Celula(5, 0)));
  }
  
  @Test
  public void testRetira() throws Exception {
    assertEquals(new Grafo.Celula(1, 0), grafo.retira(new Grafo.Celula(1, 0)));
    assertNull(grafo.retira(new Grafo.Celula(5, 0)));
  }
  
  @Test
  public void testVazia() {
    assertFalse(grafo.vazia());
    Grafo emptyGrafo = new Grafo(0);
    assertTrue(emptyGrafo.vazia());
  }
  
  @Test
  public void testRetiraPrimeiro() throws Exception {
    assertEquals(new Grafo.Celula(1, 0), grafo.retiraPrimeiro());
    assertNull(grafo.retiraPrimeiro());
  }

}
