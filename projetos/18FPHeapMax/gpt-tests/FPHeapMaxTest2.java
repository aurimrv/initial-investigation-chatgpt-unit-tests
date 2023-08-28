
package ds;Test Case 1:
java
import org.junit.Test;
import static org.junit.Assert.*;

public class TestFPHeapMax {
    @Test
    public void testConstructor() {
        FPHeapMax heap = new FPHeapMax(10);
        assertNotNull(heap);
        assertEquals(0, heap.getSize());
    }

    @Test
    public void testInsertAndMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.insert(new MeuItem(5));
        heap.insert(new MeuItem(8));
        heap.insert(new MeuItem(3));
        heap.insert(new MeuItem(10));

        assertEquals(4, heap.getSize());

        assertEquals(10, ((MeuItem) heap.max()).getChave());
    }

    @Test
    public void testRemoveMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.insert(new MeuItem(5));
        heap.insert(new MeuItem(8));
        heap.insert(new MeuItem(3));
        heap.insert(new MeuItem(10));

        assertEquals(4, heap.getSize());

        assertEquals(10, ((MeuItem) heap.removeMax()).getChave());
        assertEquals(3, heap.getSize());
    }

    @Test
    public void testIncreaseKey() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.insert(new MeuItem(5));
        heap