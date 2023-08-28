
package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import ds.*;

public class TestFPHeapMax {
	
	@Test
	public void testCopia() {
		FPHeapMax heap = new FPHeapMax(10);
		MeuItem[] v = new MeuItem[11];
		for (int i = 1; i <= 10; i++) {
			v[i] = new MeuItem(i);
		}
		try {
			heap.copia(v);
			assertEquals(v[3], heap.max());
			assertEquals(10, heap.retiraMax().chave);
			assertEquals(9, heap.max().chave);
		} catch (Exception e) {
            fail("Exception: " + e.getMessage());
        }
	}
	
	@Test
	public void testConstroi() {
		FPHeapMax heap = new FPHeapMax(10);
		MeuItem[] v = new MeuItem[11];
		v[1] = null;
		for (int i = 2; i <= 10; i++) {
			v[i] = new MeuItem(i-1);
		}
		try {
			heap.copia(v);
			heap.constroi();
			assertEquals(10, heap.max().chave);
		} catch (Exception e) {
            fail("Exception: " + e.getMessage());
        }
	