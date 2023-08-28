package ds;import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GrafoTest12{


    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);

        assertEquals(true, grafo.existeAresta(0, 1));
        assertEquals(true, grafo.existeAresta(1, 2));
        assertEquals(true, grafo.existeAresta(2, 3));
        assertEquals(true, grafo.existeAresta(3, 4));
        assertEquals(false, grafo.existeAresta(0, 2));
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);

        assertEquals(10, grafo.retiraAresta(0, 1).peso());
        assertEquals(20, grafo.retiraAresta(1, 2).peso());
        assertEquals(30, grafo.retiraAresta(2, 3).peso());
        assertEquals(40, grafo.retiraAresta(3, 4).peso());
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);

        assertEquals(false, grafo.listaAdjVazia(0));
        assertEquals(false, grafo.listaAdjVazia(1));
        assertEquals(false, grafo.listaAdjVazia(2));
        assertEquals(true, grafo.listaAdjVazia(3));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);

        assertEquals(10, grafo.primeiroListaAdj(0).peso());
        assertEquals(20, grafo.primeiroListaAdj(1).peso());
        assertEquals(30, grafo.primeiroListaAdj(2).peso());
        assertEquals(null, grafo.primeiroListaAdj(3));
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);

        assertEquals(20, grafo.proxAdj(1).peso());
        assertEquals(30, grafo.proxAdj(2).peso());
        assertEquals(null, grafo.proxAdj(3));
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);

        Grafo grafoT = grafo.grafoTransposto();

        assertEquals(true, grafoT.existeAresta(1, 0));
        assertEquals(true, grafoT.existeAresta(2, 1));
        assertEquals(true, grafoT.existeAresta(3, 2));
        assertEquals(false, grafoT.existeAresta(0, 1));
    }
}