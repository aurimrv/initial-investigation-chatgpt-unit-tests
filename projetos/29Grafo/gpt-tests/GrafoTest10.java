package ds;import ds.BuscaEmProfundidade;
import ds.Grafo;
import ds.Cfc;
import ds.Lista;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest10 {
   @Test
   public void testGrafoConstructor() {
       Grafo grafo = new Grafo(5);
       assertEquals(5, grafo.numVertices);
       assertNotNull(grafo.adj);
       for(int i=0; i<5; i++) {
           assertNotNull(grafo.adj[i]);
           assertTrue(grafo.adj[i].vazia());
       }
   }

   @Test
   public void testGrafoInsereAresta() {
       Grafo grafo = new Grafo(5);
       grafo.insereAresta(0, 1, 2);
       assertTrue(grafo.existeAresta(0, 1));
       assertFalse(grafo.existeAresta(1, 0));
   }

   @Test
   public void testGrafoExisteAresta() {
       Grafo grafo = new Grafo(5);
       assertFalse(grafo.existeAresta(0, 1));
       grafo.insereAresta(0, 1, 2);
       assertTrue(grafo.existeAresta(0, 1));
       assertFalse(grafo.existeAresta(1, 0));
   }
   

   @Test
   public void testGrafoListaAdjVazia() {
       Grafo grafo = new Grafo(5);
       assertTrue(grafo.listaAdjVazia(0));
       grafo.insereAresta(0, 1, 2);
       assertFalse(grafo.listaAdjVazia(0));
   }
   

   @Test
   public void testGrafoPrimeiroListaAdj() {
       Grafo grafo = new Grafo(5);
       grafo.insereAresta(0, 1, 2);
       grafo.insereAresta(0, 2, 3);
       Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
       assertEquals(0, aresta1.v1());
       assertEquals(1, aresta1.v2());
       assertEquals(2, aresta1.peso());
       Grafo.Aresta aresta2 = grafo.primeiroListaAdj(1);
       assertNull(aresta2);
   }
   

   @Test
   public void testGrafoProxAdj() {
       Grafo grafo = new Grafo(5);
       grafo.insereAresta(0, 1, 2);
       grafo.insereAresta(0, 2, 3);
       Grafo.Aresta aresta1 = grafo.proxAdj(0);
       assertEquals(0, aresta1.v1());
       assertEquals(2, aresta1.v2());
       assertEquals(3, aresta1.peso());
       Grafo.Aresta aresta2 = grafo.proxAdj(1);
       assertNull(aresta2);
   }

   @Test
   public void testGrafoRetiraAresta() throws Exception {
       Grafo grafo = new Grafo(5);
       assertFalse(grafo.existeAresta(0, 1));
       grafo.insereAresta(0, 1, 2);
       assertTrue(grafo.existeAresta(0, 1));
       Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
       assertNotNull(aresta);
       assertEquals(0, aresta.v1());
       assertEquals(1, aresta.v2());
       assertEquals(2, aresta.peso());
       assertFalse(grafo.existeAresta(0, 1));
   }

   @Test
   public void testGrafoGrafoTransposto() {
       Grafo grafo = new Grafo(5);
       grafo.insereAresta(0, 1, 2);
       grafo.insereAresta(0, 2, 3);
       Grafo grafoT = grafo.grafoTransposto();
       assertTrue(grafoT.existeAresta(0,1));
   }
}