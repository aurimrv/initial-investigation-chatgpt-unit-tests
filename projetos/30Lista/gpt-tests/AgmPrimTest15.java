package ds;import ds.AgmPrim;
import ds.FPHeapMinIndireto;
import ds.Grafo;
import ds.Lista;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AgmPrimTest15{

    private AgmPrim agmPrim;

    @Before
    public void setUp() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 3, 6);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(1, 3, 8);
        grafo.insereAresta(1, 4, 5);
        grafo.insereAresta(2, 4, 7);
        grafo.insereAresta(3, 4, 9);
        agmPrim = new AgmPrim(grafo);
    }

    @Test
    public void obterAgm() throws Exception {
        agmPrim.obterAgm(0);
        assertEquals(0, agmPrim.antecessor(0));
        assertEquals(0, agmPrim.antecessor(1));
        assertEquals(1, agmPrim.antecessor(2));
        assertEquals(0, agmPrim.antecessor(3));
        assertEquals(1, agmPrim.antecessor(4));
    }

    @Test
    public void antecessor() throws Exception {
        agmPrim.obterAgm(0);
        assertEquals(0, agmPrim.antecessor(0));
        assertEquals(0, agmPrim.antecessor(1));
        assertEquals(1, agmPrim.antecessor(2));
        assertEquals(0, agmPrim.antecessor(3));
        assertEquals(1, agmPrim.antecessor(4));
    }

    @Test
    public void peso() throws Exception {
        agmPrim.obterAgm(0);
        assertEquals(0, agmPrim.peso(0), 0);
        assertEquals(2, agmPrim.peso(1), 0);
        assertEquals(3, agmPrim.peso(2), 0);
        assertEquals(6, agmPrim.peso(3), 0);
        assertEquals(5, agmPrim.peso(4), 0);
    }

    @Test
    public void imprime() throws Exception {
        agmPrim.obterAgm(0);
        agmPrim.imprime();
    }
}

    private FPHeapMinIndireto fpHeapMinIndireto;

    @Before
    public void setUp() throws Exception {
        double[] p = {0, 3, 2, 4, 1};
        int[] v = {0, 4, 3, 1, 2};
        fpHeapMinIndireto = new FPHeapMinIndireto(p, v);
    }

    @Test
    public void refaz() throws Exception {
        fpHeapMinIndireto.refaz(1, 4);
        assertEquals(3, fpHeapMinIndireto.retiraMin());
        assertEquals(2, fpHeapMinIndireto.retiraMin());
        assertEquals(1, fpHeapMinIndireto.retiraMin());
        assertEquals(4, fpHeapMinIndireto.retiraMin());
    }

    @Test
    public void constroi() throws Exception {
        fpHeapMinIndireto.constroi();
        assertEquals(1, fpHeapMinIndireto.retiraMin());
        assertEquals(2, fpHeapMinIndireto.retiraMin());
        assertEquals(3, fpHeapMinIndireto.retiraMin());
        assertEquals(4, fpHeapMinIndireto.retiraMin());
    }

    @Test
    public void retiraMin() throws Exception {
        assertEquals(4, fpHeapMinIndireto.retiraMin());
        assertEquals(2, fpHeapMinIndireto.retiraMin());
        assertEquals(3, fpHeapMinIndireto.retiraMin());
        assertEquals(1, fpHeapMinIndireto.retiraMin());
    }

    @Test
    public void diminuiChave() throws Exception {
        fpHeapMinIndireto.diminuiChave(4, 0);
        assertEquals(4, fpHeapMinIndireto.retiraMin());
        assertEquals(2, fpHeapMinIndireto.retiraMin());
        assertEquals(3, fpHeapMinIndireto.retiraMin());
        assertEquals(1, fpHeapMinIndireto.retiraMin());
    }

    @Test
    public void v