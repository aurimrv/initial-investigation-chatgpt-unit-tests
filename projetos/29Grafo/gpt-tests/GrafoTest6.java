
package ds;import static org.junit.Assert.*;
import org.junit.Test;

import ds.BuscaEmProfundidade;
import ds.Grafo;
import ds.Cfc;
import ds.Lista;

public class GrafoTest6 {
  
  @Test
  public void buscaEmProfundidadeTest() {
    Grafo grafo = new Grafo(4);
    grafo.insereAresta(0, 1, 1);
    grafo.insereAresta(0, 2, 1);
    grafo.insereAresta(1, 3, 1);
    grafo.insereAresta(2, 3, 1);
    
    BuscaEmProfundidade bfs = new BuscaEmProfundidade(grafo);
    bfs.buscaEmProfundidade();
    
    assertEquals(1, bfs.d(0));
    assertEquals(2, bfs.d(1));
    assertEquals(3, bfs.d(2));
    assertEquals(4, bfs.d(3));
    
    assertEquals(8, bfs.t(0));
    assertEquals(7, bfs.t(1));
    assertEquals(6, bfs.t(2));
    assertEquals(5, bfs.t(3));
    
    assertEquals(-1, bfs.antecessor(0));
    assertEquals(0, bfs.antecessor(1));
    assertEquals(0, bfs.antecessor(2));
    assertEquals(1, bfs.antecessor(3));
  }
  
  @Test
  public void grafoTranspostoTest() {
    Grafo grafo = new Grafo(4);
    grafo.insereAresta(0, 1, 1);
    grafo.insereAresta(0, 2, 1);
    grafo.insereAresta(1, 3, 1);
    grafo.insereAresta(2, 3, 1);
    
    Grafo grafoT = grafo.grafoTransposto();
    
    assertTrue(grafoT.existeAresta(1, 0));
    assertTrue(grafoT.existeAresta(2, 0));
    assertTrue(grafoT.existeAresta(3, 1));
    assertTrue(grafoT.existeAresta(3, 2));
  }
  
  @Test
  public void obterCfcTest() {
    Grafo grafo = new Grafo(4);
    grafo.insereAresta(0, 1, 1);
    grafo.insereAresta(1, 2, 1);
    grafo.insereAresta(2, 0, 1);
    grafo.insereAresta(1, 3, 1);
    
    Cfc cfc = new Cfc(grafo);
    cfc.obterCfc();
  }
  
  @Test
  public void insereRetiraArestaTest() {
    Grafo grafo = new Grafo(4);
    grafo.insereAresta(0, 1, 1);
    grafo.insereAresta(0, 2, 1);
    
    assertTrue(grafo.existeAresta(0, 1));
    assertTrue(grafo.existeAresta(0, 2));
    
    grafo.retiraAresta(0, 2);
    
    assertFalse(grafo.existeAresta(0, 2));
  }
  
  @Test
  public void listaAdjVaziaTest() {
    Grafo grafo = new Grafo(4);
    
    assertTrue(grafo.listaAdjVazia(0));
    
    grafo.insereAresta(0, 1, 1);
    
    assertFalse(grafo.listaAdjVazia(0));
  }
  
  @Test
  public void primeiroListaAdjTest() {
    Grafo grafo = new Grafo(4);
    grafo.insereAresta(0, 1, 1);
    grafo.insereAresta(0, 2, 1);
    
    Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
    
    assertNotNull(aresta);
    assertEquals(0, aresta.v1());
    assertEquals(1, aresta.v2());
    assertEquals(1, aresta.peso());
    
    aresta = grafo.primeiroListaAdj(1);
    
    assertNull(aresta);
  }
  
  @Test
  public void proxAdjTest() {
    Grafo grafo = new Grafo(4);
    grafo.insereAresta(0, 1, 1);
    grafo.insereAresta(0, 2, 1);
    
    Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
    aresta = grafo.proxAdj(0);
    
    assertNotNull(aresta);
    assertEquals(0, aresta.v1());
    assertEquals(2, aresta.v2());
    assertEquals(1, aresta.peso());
    
      }
    }