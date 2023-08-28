package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.FPHeapMinIndireto;
import ds.Grafo;
import ds.AgmPrim;
import ds.Lista;

public class AgmPrimTest14{


	@Test
	public void testRefaz() {
		double p[] = {0, 1, 2, 3, 4};
		int v[] = {0, 1, 2, 3, 4};
		FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
		heap.refaz(1, 4);
		assertEquals(3, heap.retiraMin());
	}

	@Test
	public void testConstroi() {
		double p[] = {0, 4, 3, 2, 1};
		int v[] = {0, 1, 2, 3, 4};
		FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
		heap.constroi();
		assertEquals(1, heap.retiraMin());
	}

	@Test
	public void testRetiraMin() throws Exception {
		double p[] = {0, 1, 2, 3, 4};
		int v[] = {0, 1, 2, 3, 4};
		FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
		assertEquals(1, heap.retiraMin());
	}

	@Test
	public void testDiminuiChave() throws Exception {
		double p[] = {0, 4, 3, 2, 1};
		int v[] = {0, 1, 2, 3, 4};
		FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
		heap.diminuiChave(4, 0);
		assertEquals(4, heap.retiraMin());
	}

	@Test
	public void testVazio() {
		double p[] = {0};
		int v[] = {0};
		FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
		assertTrue(heap.vazio());
	}

	@Test
	public void testImprime() {
		double p[] = {0, 1, 2, 3, 4};
		int v[] = {0, 1, 2, 3, 4};
		FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
		heap.imprime();
	}

	@Test
	public void testObterAgm() throws Exception {
		Grafo grafo = new Grafo(5);
		grafo.insereAresta(0, 1, 1);
		grafo.insereAresta(1, 2, 2);
		grafo.insereAresta(1, 3, 3);
		grafo.insereAresta(2, 4, 4);
		grafo.insereAresta(3, 4, 5);
		AgmPrim agm = new AgmPrim(grafo);
		agm.obterAgm(0);
		assertEquals(0, agm.antecessor(0));
		assertEquals(1, agm.antecessor(1));
		assertEquals(1, agm.antecessor(2));
		assertEquals(3, agm.antecessor(3));
		assertEquals(2, agm.antecessor(4));
	}

	@Test
	public void testPeso() throws Exception {
		Grafo grafo = new Grafo(5);
		grafo.insereAresta(0, 1, 1);
		grafo.insereAresta(1, 2, 2);
		grafo.insereAresta(1, 3, 3);
		grafo.insereAresta(2, 4, 4);
		grafo.insereAresta(3, 4, 5);
		AgmPrim agm = new AgmPrim(grafo);
		agm.obterAgm(0);
		assertEquals(0.0, agm.peso(0), 0.001);
		assertEquals(1.0, agm.peso(1), 0.001);
		assertEquals(2.0, agm.peso(2), 0.001);
		assertEquals(3.0, agm.peso(3), 0.001);
		assertEquals(4.0, agm.peso(4), 0.001);
	}

	@Test
