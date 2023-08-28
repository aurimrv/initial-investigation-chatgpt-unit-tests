package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.FPHeapMinIndireto;
import ds.AgmPrim;
import ds.Grafo;
import ds.Lista;

public class AgmPrimTest29{


    @Test
    public void testRefaz() {
        double[] p = {0, 1, 2, 3, 4};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.refaz(1, 4);
        int[] expected = {0, 1, 2, 3, 4};
        assertArrayEquals(expected, heap.fp);
    }

    @Test
    public void testConstroi() {
        double[] p = {0, 4, 3, 2, 1};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.constroi();
        int[] expected = {0, 1, 2, 3, 4};
        assertArrayEquals(expected, heap.fp);
    }

    @Test
    public void testRetiraMin() throws Exception {
        double[] p = {0, 4, 3, 2, 1};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        int min = heap.retiraMin();
        assertEquals(1, min);
    }

    @Test
    public void testDiminuiChave() throws Exception {
        double[] p = {0, 4, 3, 2, 1};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.diminuiChave(4, 0.5);
        double[] expected = {0, 0.5, 3, 2, 1};
        assertArrayEquals(expected, heap.p, 0.001);
    }

    @Test
    public void testVazio() {
        double[] p = {0};
        int[] v = {0};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        assertTrue(heap.vazio());
    }

    @Test
    public void testObterAgm() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 4);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(0, 3, 2);
        grafo.insereAresta(0, 4, 1);
        AgmPrim agm = new AgmPrim(grafo);
        agm.obterAgm(0);
        int[] expectedAntecessor = {-1, 0, 0, 0, 0};
        double[] expectedPeso = {0, 4, 3, 2, 1};
        assertArrayEquals(expectedAntecessor, agm.antecessor);
        assertArrayEquals(expectedPeso, agm.p, 0.001);
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 4);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(0, 3, 2);
        grafo.insereAresta(0, 4, 1);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
        assertTrue(grafoT.existeAresta(3, 0));
        assertTrue(grafoT.existeAresta(4, 0));
    }

    @Test
    public void testLista() throws Exception {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        assertTrue(lista.estaNaLista(2));
        assertEquals(1, lista.retiraPrimeiro());
        assertEquals(2, lista.retira(2));
        assertFalse(lista