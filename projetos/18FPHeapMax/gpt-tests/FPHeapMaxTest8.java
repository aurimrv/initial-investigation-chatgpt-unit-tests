
package ds;java
package ds;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestFPHeapMax {

    @Test
    public void testCopia() {
        FPHeapMax heap = new FPHeapMax(20);
        MeuItem[] items = new MeuItem[7];
        for (int i = 1; i <= 6; i++) {
            items[i] = new MeuItem(i);
        }
        heap.copia(items);
        assertEquals(6, heap.n);
        for (int i = 1; i <= 6; i++) {
            assertEquals(items[i].chave, heap.v[i].chave);
        }
    }

    @Test
    public void testConstroi() {
        FPHeapMax heap = new FPHeapMax(20);
        MeuItem[] items = new MeuItem[7];
        for (int i = 1; i <= 6; i++) {
            items[i] = new MeuItem(i);
        }
        heap.copia(items);
        heap.constroi();
        assertEquals(6, heap.n);
        for (int i = heap.n / 2; i >= 1; i--) {
            int leftChild = 2 * i;
            int rightChild = 2 * i + 1;
            assertTrue(heap.v[i].chave >= heap.v[leftChild].chave);
            if (rightChild <= heap.n) {
