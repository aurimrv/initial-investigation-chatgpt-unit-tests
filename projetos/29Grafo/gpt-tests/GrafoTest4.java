package ds;import ds.BuscaEmProfundidade;
import ds.Grafo;
import ds.Cfc;
import ds.Lista;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest4 {
@Test
public void testConstructor() {
    Grafo grafo = new Grafo(5);
    assertEquals(5, grafo.numVertices());
}



@Test
public void testInsereAresta() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(0, 2, 5);
    grafo.insereAresta(1, 3, 7);
    
    assertTrue(grafo.existeAresta(0, 1));
    assertTrue(grafo.existeAresta(0, 2));
    assertTrue(grafo.existeAresta(1, 3));
    assertFalse(grafo.existeAresta(2, 3));
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
    grafo.insereAresta(0, 2, 5);
    
    Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
    assertEquals(0, aresta.v1());
    assertEquals(1, aresta.v2());
    assertEquals(10, aresta.peso());
}


@Test
public void testProxAdj() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(0, 2, 5);
    
    Grafo.Aresta aresta = grafo.proxAdj(0);
    assertEquals(0, aresta.v1());
    assertEquals(2, aresta.v2());
    assertEquals(5, aresta.peso());
}



@Test
public void testRetiraAresta() throws Exception {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(0, 2, 5);
    
    Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
    assertEquals(0, aresta.v1());
    assertEquals(1, aresta.v2());
    assertEquals(10, aresta.peso());
    
    assertFalse(grafo.existeAresta(0, 1));
}

}