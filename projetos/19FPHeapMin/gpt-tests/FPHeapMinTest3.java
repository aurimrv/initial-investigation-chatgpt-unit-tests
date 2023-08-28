
package ds;import static org.junit.Assert.*;

import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Before;
import org.junit.Test;

public class FPHeapMinTest3 {
	
	private FPHeapMin heap;
	
	@Before
	public void setUp() {
		heap = new FPHeapMin(10);
	}
	
	@Test
	public void testRefaz() {
		Item[] v = new Item[11];
		for (int i = 1; i <= 10; i++) {
			v[i] = new MeuItem(i);
		}
		heap.copia(v);
		heap.refaz(1, 10);
		assertEquals(10, heap.min().recuperaChave());
	}
	
	@Test
	public void testConstroi() {
		Item[] v = new Item[11];
		for (int i = 1; i <= 10; i++) {
			v[i] = new MeuItem(i);
		}
		heap.copia(v);
		heap.constroi();
		assertEquals(1, heap.min().recuperaChave());
	}
	
	@Test
	public void testRetiraMin() throws Exception {
		Item[] v = new Item[11];
		for (int i = 1; i <= 10; i++) {
			v[i] = new MeuItem(i);
		}
		heap.copia(v);
		Item min = heap.retiraMin();
		assertEquals(1, min.recuperaChave());
		assertEquals(2, heap.min().recuperaChave());
	}
	
	@Test(expected = Exception.class)
	public void testRetiraMinEmptyHeap() throws Exception {
		heap.retiraMin();
	}
	
	@Test
	public void testDiminuiChave() throws Exception {
		Item[] v = new Item[11];
		for (int i = 1; i <= 10; i++) {
			v[i] = new MeuItem(i);
		}
		heap.copia(v);
		heap.diminuiChave(5, 0);
		assertEquals(0, heap.min().recuperaChave());
	}
	
	@Test(expected = Exception.class)
	public void testDiminuiChaveWithNullValue() throws Exception {
		Item[] v = new Item[11];
		for (int i = 1; i <= 10; i++) {
			v[i] = new MeuItem(i);
		}
		heap.copia(v);
		heap.diminuiChave(5, null);
	}
	
	@Test
	public void testInsere() throws Exception {
		Item[] v = new Item[11];
		for (int i = 1; i <= 10; i++) {
			v[i] = new MeuItem(i);
		}
		heap.copia(v);
		Item newItem = new MeuItem(0);
		heap.insere(newItem);
		assertEquals(0, heap.min().recuperaChave());
	}
	
	@Test(expected = Exception.class)
	public void testInsereFullHeap() throws Exception {
		Item[] v = new Item[11];
		for (int i = 1; i <= 10; i++) {
			v[i] = new MeuItem(i);
		}
		heap.copia(v);
		Item newItem = new MeuItem(0);
		heap.insere(newItem);
		heap.insere(newItem);
	}
	
	@Test
	public void testImprime() {
		Item[] v = new Item[11];
		for (int i = 1; i <= 10; i++) {
			v[i] = new MeuItem(i);
		}
		heap.copia(v);
		heap.imprime();
	}
	
	@Test
	public void testCopia() {
		Item[] v = new Item[11];
		for (int i = 1; i <= 10; i++) {
			v[i] = new MeuItem(i);
		}
		heap.copia(v);
		assertEquals(10, heap.min().recuperaChave());
	}
}