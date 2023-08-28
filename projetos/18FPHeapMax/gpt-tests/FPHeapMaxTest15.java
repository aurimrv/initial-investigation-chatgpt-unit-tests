package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.FPHeapMax;
import ds.MeuItem;

public class FPHeapMaxTest15{


	@Test
	public void testConstroi() {
		FPHeapMax heap = new FPHeapMax(7);
		MeuItem[] items = new MeuItem[8];
		items[1] = new MeuItem(20);
		items[2] = new MeuItem(15);
		items[3] = new MeuItem(18);
		items[4] = new MeuItem(10);
		items[5] = new MeuItem(12);
		items[6] = new MeuItem(9);
		items[7] = new MeuItem(13);
		
		heap.copia(items);
		heap.constroi();
		
		MeuItem[] expected = new MeuItem[8];
		expected[1] = new MeuItem(20);
		expected[2] = new MeuItem(15);
		expected[3] = new MeuItem(18);
		expected[4] = new MeuItem(10);
		expected[5] = new MeuItem(12);
		expected[6] = new MeuItem(9);
		expected[7] = new MeuItem(13);
		
		assertArrayEquals(expected, heap.getV());
	}

	@Test
	public void test