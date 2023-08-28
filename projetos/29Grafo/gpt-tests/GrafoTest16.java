package ds;import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import ds.Grafo;

public class GrafoTest16{

  
  private Grafo grafo;
  
  @Before
  public void setUp() {
    grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 1);
    grafo.insereAresta(1, 2, 2);
    grafo.insereAresta(2, 3, 3);
    grafo.insereAresta(3, 4, 4);
    grafo.insereAresta(4, 0, 5);
  }
  
  @Test
  public void testExisteAresta() {
    assertTrue(grafo.existeAresta(0, 1));
    assertTrue(grafo.existeAresta(1, 2));
    assertTrue(grafo.existeAresta(2, 3));
    assertTrue(grafo.existeAresta(3, 4));
    assertTrue(grafo.existeAresta(4, 0));
    
    assertFalse(grafo.existeAresta(0, 2));
    assertFalse(grafo.existeAresta(1, 3));
    assertFalse(grafo.existeAresta(2, 4));
    assertFalse(grafo.existeAresta(3, 0));
    assertFalse(grafo.existeAresta(4, 1));
  }
  
  @Test
  public void testListaAdjVazia() {
    assertFalse(grafo.listaAdjVazia(0));
    assertFalse(grafo.listaAdjVazia(1));
    assertFalse(grafo.listaAdjVazia(2));
    assertFalse(grafo.listaAdjVazia(3));
    assertFalse(grafo.listaAdjVazia(4));
    
    assertTrue(grafo.listaAdjVazia(5));
    assertTrue(grafo.listaAdjVazia(6));
    assertTrue(grafo.listaAdjVazia(7));
    assertTrue(grafo.listaAdjVazia(8));
    assertTrue(grafo.listaAdjVazia(9));
  }
  
  @Test
  public void testPrimeiroListaAdj() {
    assertEquals(1, grafo.primeiroListaAdj(0).v2());
    assertEquals(2, grafo.primeiroListaAdj(1).v2());
    assertEquals(3, grafo.primeiroListaAdj(2).v2());
    assertEquals(4, grafo.primeiroListaAdj(3).v2());
    assertEquals(0, grafo.primeiroListaAdj(4).v2());
    
    assertNull(grafo.primeiroListaAdj(5));
    assertNull(grafo.primeiroListaAdj(6));
    assertNull(grafo.primeiroListaAdj(7));
    assertNull(grafo.primeiroListaAdj(8));
    assertNull(grafo.primeiroListaAdj(9));
  }
  
  @Test
  public void testProxAdj() {
    assertEquals(2, grafo.proxAdj(0).v2());
    assertEquals(3, grafo.proxAdj(1).v2());
    assertEquals(4, grafo.proxAdj(2).v2());
    assertEquals(0, grafo.proxAdj(3).v2());
    assertEquals(1, grafo.proxAdj(4).v2());
    
    assertNull(grafo.proxAdj(5));
    assertNull(grafo.proxAdj(6));
    assertNull(grafo.proxAdj(7));
    assertNull(grafo.proxAdj(8));
    assertNull(grafo.proxAdj(9));
  }
  
  @Test
  public void testRetiraAresta() throws Exception {
    assertNotNull(grafo.retiraAresta(0, 1));
    assertNotNull(grafo.retiraAresta(1, 2));
    assertNotNull(grafo.retiraAresta(2, 3));
    assertNotNull(grafo.retiraAresta(3, 4));
    assertNotNull(grafo.retiraAresta(4, 0));
    
    assertNull(grafo.retiraAresta(0, 2));
    assertNull(grafo.retiraAresta(1, 3));
    assertNull(grafo.retiraAresta(2, 4));
    assertNull(grafo.retiraAresta(3, 0));
    assertNull(grafo.retiraAresta(4, 1));
  }
  
  @Test
  public void testNumVertices() {
    assertEquals(5, grafo.numVertices());
  }
  
  @Test
  public void testGrafoTransposto() {
    Grafo grafoT = grafo.grafoTransposto();
    
    assertTrue(grafoT.existeAresta(1, 0));
    assertTrue(grafoT.existeAresta(2, 1