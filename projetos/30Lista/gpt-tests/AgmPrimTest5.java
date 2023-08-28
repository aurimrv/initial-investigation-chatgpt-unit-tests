package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.FPHeapMinIndireto;
import ds.Grafo;
import ds.AgmPrim;

public class AgmPrimTest5 {
@Test
public void testObterAgm() throws Exception {
    // Create the graph
    Grafo grafo = new Grafo(6);
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(0, 2, 4);
    grafo.insereAresta(1, 2, 1);
    grafo.insereAresta(1, 3, 5);
    grafo.insereAresta(2, 3, 8);
    grafo.insereAresta(2, 4, 3);
    grafo.insereAresta(3, 4, 7);
    grafo.insereAresta(3, 5, 6);
    grafo.insereAresta(4, 5, 9);
    
    // Run the method
    AgmPrim agm = new AgmPrim(grafo);
    agm.obterAgm(0);
    
    // Check if the minimum spanning tree is correct
    assertEquals(0, agm.antecessor(0));
    assertEquals(1, agm.antecessor(1));
    assertEquals(0, agm.antecessor(2));
    assertEquals(2, agm.antecessor(3));
    assertEquals(2, agm.antecessor(4));
    assertEquals(3, agm.antecessor(5));
}

@Test
public void testRetiraMin() throws Exception {
    // Create the heap
    double[] p = {0, 2, 4, 1, 5};
    int[] v = {0, 1, 2, 3, 4};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    
    // Remove the minimum value
    int min = heap.retiraMin();
    
    // Check if the minimum value is correct
    assertEquals(3, min);
}

@Test
public void testDiminuiChave() throws Exception {
    // Create the heap
    double[] p = {0, 2, 4, 1, 5};
    int[] v = {0, 1, 2, 3, 4};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    
    // Decrease the key at index 3
    heap.diminuiChave(3, 0.5);
    
    // Check if the key is decreased correctly
    assertEquals(0.5, p[3], 0.001);
}
}