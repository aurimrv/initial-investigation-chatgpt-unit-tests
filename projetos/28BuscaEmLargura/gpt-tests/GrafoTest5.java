
package ds;import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import ds.Grafo;
import ds.BuscaEmLargura;
import ds.Fila;

public class GrafoTest5 {

    private Grafo grafo;
    private BuscaEmLargura busca;

    @Before
    public void setUp() {
        grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 1);
        grafo.insereAresta(1, 3, 1);
        grafo.insereAresta(2, 3, 1);
        grafo.insereAresta(3, 4, 1);
        busca = new BuscaEmLargura(grafo);
    }

    @Test
    public void testBuscaEmLargura() throws Exception {
        busca.buscaEmLargura();
        assertEquals(0, busca.d(0));
        assertEquals(1, busca.d(1));
        assertEquals(1, busca.d(2));
        assertEquals(2, busca.d(3));
        assertEquals(3, busca.d(4));
    }

    @Test
    public void testAntecessor() throws Exception {
        busca.buscaEmLargura();
        assertEquals(-1, busca.antecessor(0));
        assertEquals(0, busca.antecessor(1));
        assertEquals(0, busca.antecessor(2));
        assertEquals(1, busca.antecessor(3));
        assertEquals(3, busca.antecessor(4));
    }

    @Test
    public void testImprimeCaminho() throws Exception {
        busca.buscaEmLargura();
        assertEquals("0", busca.imprimeCaminho(0, 0));
        assertEquals("0 -> 1", busca.imprimeCaminho(0, 1));
        assertEquals("0 -> 2", busca.imprimeCaminho(0, 2));
        assertEquals("0 -> 1 -> 3", busca.imprimeCaminho(0, 3));
        assertEquals("0 -> 1 -> 3 -> 4", busca.imprimeCaminho(0, 4));
    }
}