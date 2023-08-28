package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.FPHeapMinIndireto;
import ds.Grafo;
import ds.AgmPrim;

public class AgmPrimTest6 {
@Test
public void testConstructor() {
    double[] p = {0.0, 3.0, 5.0, 2.0, 4.0};
    int[] v = {0, 1, 2, 3, 4};

    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);

    assertNotNull(heap);
    assertEquals(4, heap.n);
    assertArrayEquals(v, heap.fp);
    assertArrayEquals(new int[]{0, 1, 2, 3, 4}, heap.pos);
}

@Test
public void testRefaz() {
    double[] p = {0.0, 3.0, 5.0, 2.0, 4.0};
    int[] v = {0, 1, 2, 3, 4};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);

    heap.refaz(1, 3);
    assertArrayEquals(new int[]{0, 3, 1, 2, 4}, heap.fp);
}

@Test
public void testConstroi() {
    double[] p = {0.0, 3.0, 5.0, 2.0, 4.0};
    int[] v = {0, 1, 2, 3, 4};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);

    heap.constroi();
    assertArrayEquals(new int[]{0, 2, 1, 3, 4}, heap.fp);
}


@Test
public void testRetiraMin() throws Exception {
    double[] p = {0.0, 3.0, 5.0, 2.0, 4.0};
    int[] v = {0, 1, 2, 3, 4};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);

    int min = heap.retiraMin();
    assertEquals(1, min);
    assertArrayEquals(new int[]{0, 4, 1, 3, 2}, heap.fp);
}

@Test
public void testDiminuiChave() throws Exception {
    double[] p = {0.0, 3.0, 5.0, 2.0, 4.0};
    int[] v = {0, 1, 2, 3, 4};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);

    heap.diminuiChave(2, 1.0);
    assertArrayEquals(new int[]{0, 2, 1, 3, 4}, heap.fp);
}


@Test
public void testVazio() {
    double[] p = {0.0, 3.0, 5.0, 2.0, 4.0};
    int[] v = {0, 1, 2, 3, 4};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);

    assertFalse(heap.vazio());
    heap.retiraMin();
    heap.retiraMin();
    heap.retiraMin();
    heap.retiraMin();
    assertTrue(heap.vazio());
}

}