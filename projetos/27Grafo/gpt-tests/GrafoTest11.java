
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest11 {

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
    assertFalse(grafo.existeAresta(0, 4));
}


@Test
public void testPrimeiroListaAdj() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(1, 2, 20);
    grafo.insereAresta(2, 3, 30);
    grafo.insereAresta(3, 4, 40);
    Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
    assertNotNull(aresta1);
    assertEquals(0, aresta1.v1());
    assertEquals(1, aresta1.v2());
    assertEquals(10, aresta1.peso());
    Grafo.Aresta aresta2 = grafo.primeiroListaAdj(2);
    assertNotNull(aresta2);
    assertEquals(2, aresta2.v1());
    assertEquals(3, aresta2.v2());
    assertEquals(30, aresta2.peso());
}


@Test
public void testProxAdj() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(1, 2, 20);
    grafo.insereAresta(2, 3, 30);
    grafo.insereAresta(3, 4, 40);
    Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
    assertNotNull(aresta1);
    Grafo.Aresta aresta2 = grafo.proxAdj(0);
    assertNotNull(aresta2);
    assertEquals(0, aresta2.v1());
    assertEquals(1, aresta2.v2());
    assertEquals(10, aresta2.peso());
    Grafo.Aresta aresta3 = grafo.proxAdj(2);
    assertNotNull(aresta3);
    assertEquals(2, aresta3.v1());
    assertEquals(3, aresta3.v2());
    assertEquals(30, aresta3.peso());
    Grafo.Aresta aresta4 = grafo.proxAdj(3);
    assertNotNull(aresta4);
    assertEquals(3, aresta4.v1());
    assertEquals(4, aresta4.v2());
    assertEquals(40, aresta4.peso());
    Grafo.Aresta aresta5 = grafo.proxAdj(4);
    assertNull(aresta5);
}

@Test
public void testRetiraAresta() throws Exception {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(1, 2, 20);
    grafo.insereAresta(2, 3, 30);
    grafo.insereAresta(3, 4, 40);
    Grafo.Aresta aresta1 = grafo.retiraAresta(0, 1);
    assertNotNull(aresta1);
    assertEquals(0, aresta1.v1());
    assertEquals(1, aresta1.v2());
    assertEquals(10, aresta1.peso());
    assertFalse(grafo.existeAresta(0, 1));
    assertTrue(grafo.existeAresta(1, 2));
    assertTrue(grafo.existeAresta(2, 3));
    assertTrue(grafo.existeAresta(3, 4));
    Grafo.Aresta aresta2 = grafo.retiraAresta(1, 2);
    assertNotNull(aresta2);
    assertEquals(1, aresta2.v1());
    assertEquals(2, aresta2.v2());
    assertEquals(20, aresta2.peso());
    assertFalse(grafo.existeAresta(1, 2));
    assertTrue(grafo.existeAresta(2, 3));
    assertTrue(grafo.existeAresta(3, 4));
}
}