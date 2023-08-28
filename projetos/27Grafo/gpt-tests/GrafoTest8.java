
package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.BuscaEmProfundidade;
import ds.Grafo;

public class GrafoTest8 {

	@Test
	public void testBuscaEmProfundidade() {
		Grafo grafo = new Grafo(5);
		
		grafo.insereAresta(0, 1, 1);
		grafo.insereAresta(1, 2, 1);
		grafo.insereAresta(2, 3, 1);
		grafo.insereAresta(3, 4, 1);
		grafo.insereAresta(4, 0, 1);
		
		BuscaEmProfundidade busca = new BuscaEmProfundidade(grafo);
		busca.buscaEmProfundidade();
		
		assertEquals(1, busca.d(0));
		assertEquals(2, busca.d(1));
		assertEquals(3, busca.d(2));
		assertEquals(4, busca.d(3));
		assertEquals(5, busca.d(4));
		
		assertEquals(10, busca.t(0));
		assertEquals(9, busca.t(1));
		assertEquals(8, busca.t(2));
		assertEquals(7, busca.t(3));
		assertEquals(6, busca.t(4));
		
		assertEquals(-1, busca.antecessor(0));
		assertEquals(0, busca.antecessor(1));
		assertEquals(1, busca.antecessor(2));
		assertEquals(2, busca.antecessor(3));
		assertEquals(3, busca.antecessor(4));
	}

	@Test
	public void testGrafoTransposto() {
		Grafo grafo = new Grafo(5);
		
		grafo.insereAresta(0, 1, 1);
		grafo.insereAresta(1, 2, 1);
		grafo.insereAresta(2, 3, 1);
		grafo.insereAresta(3, 4, 1);
		grafo.insereAresta(4, 0, 1);
		
		Grafo grafoT = grafo.grafoTransposto();
		
		assertFalse(grafoT.existeAresta(0, 1));
		assertTrue(grafoT.existeAresta(1, 0));
		
		assertFalse(grafoT.existeAresta(1, 2));
		assertTrue(grafoT.existeAresta(2, 1));
		
		assertFalse(grafoT.existeAresta(2, 3));
		assertTrue(grafoT.existeAresta(3, 2));
		
		assertFalse(grafoT.existeAresta(3, 4));
		assertTrue(grafoT.existeAresta(4, 3));
		
		assertFalse(grafoT.existeAresta(4, 0));
		assertTrue(grafoT.existeAresta(0, 4));
	}

	@Test
	public void testRetiraAresta() throws Exception {
		Grafo grafo = new Grafo(5);
		
		grafo.insereAresta(0, 1, 1);
		grafo.insereAresta(1, 2, 1);
		grafo.insereAresta(2, 3, 1);
		grafo.insereAresta(3, 4, 1);
		grafo.insereAresta(4, 0, 1);
		
		grafo.retiraAresta(0, 1);
		assertFalse(grafo.existeAresta(0, 1));
		
		grafo.retiraAresta(1, 2);
		assertFalse(grafo.existeAresta(1, 2));
		
		grafo.retiraAresta(2, 3);
		assertFalse(grafo.existeAresta(2, 3));
		
		grafo.retiraAresta(3, 4);
		assertFalse(grafo.existeAresta(3, 4));
		
		grafo.retiraAresta(4, 0);
		assertFalse(grafo.existeAresta(4, 0));
	}

	@Test
	public void testListaAdjVazia() {
		Grafo grafo = new Grafo(5);
		
		assertTrue(grafo.listaAdjVazia(0));
		
		grafo.insereAresta(0, 1, 1);
		assertFalse(grafo.listaAdjVazia(0));
		
		grafo.insereAresta(0, 2, 1);
		assertFalse(grafo.listaAdjVazia(0));
		
		grafo.insereAresta(1, 0, 1);
		assertFalse(grafo.listaAdjVazia(1));
	}

	@Test
	public void testPrimeiroListaAdj() {
		Grafo grafo = new Grafo(5);
		
		grafo.insereAresta(0, 1, 1);
		grafo.insereAresta(0, 2, 1);
		
		BuscaEmProfundidade.Aresta a1 = grafo.primeiroListaAdj(0);
		assertEquals(0, a1.v1());
		assertEquals(1, a1.v2());
		assertEquals(1, a1.peso());
		
		BuscaEmProfundidade.Aresta a2 = grafo.primeiroListaAdj(1);
		assertEquals(1, a2.v1());
		assertEquals(0, a2.v2());
		assertEquals(1, a2.peso());
	}

	@Test
	public void testProxAdj() {
		Grafo grafo = new Grafo(5);
		
		grafo.insereAresta(0, 1, 1);
		grafo.insereAresta(0, 2, 1);
		
		BuscaEmProfundidade.Aresta a1 = grafo.proxAdj(0);
		assertEquals(0, a1.v1());
		assertEquals(2, a1.v2());
		assertEquals(1, a1.peso());
		
		BuscaEmProfundidade.Aresta a2 = grafo.proxAdj(1);
		assertEquals(1, a2.v1());
		assertEquals(0, a2.v2());
		assertEquals(1, a2.peso());
		
		BuscaEmProfundidade.Aresta a3 = grafo.proxAdj(2);
		assertNull(a3);
	}

	@Test
	public void testNumVertices() {
		Grafo grafo = new Grafo(5);
		assertEquals(5, grafo.numVertices());
	}

	@Test
	public void testImprime() {
		Grafo grafo = new Grafo(5);
		
		grafo.insereAresta(0, 1, 1);
		grafo.insereAresta(1, 2, 1);
		grafo.insereAresta(2, 3, 1);
		grafo.insereAresta(3, 4, 1);
		grafo.insereAresta(4, 0, 1);
		
		grafo.imprime();
	}

	@Test
	public void testInserePrimeiro() {
		Lista lista = new Lista();
		
		lista.inserePrimeiro(1);
		lista.inserePrimeiro(2);
	}
}
	