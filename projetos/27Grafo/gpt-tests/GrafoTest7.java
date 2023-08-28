
package ds;


import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest7 {

    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        assertFalse(grafo.listaAdjVazia(0));
        assertTrue(grafo.existeAresta(0, 1));
        assertNull(grafo.proxAdj(0));
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        assertNotNull(grafo.retiraAresta(0, 1));
        assertTrue(grafo.listaAdjVazia(0));
        assertFalse(grafo.existeAresta(0, 1));
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 4);
        Grafo grafoT = grafo.grafoTransposto();
        assertFalse(grafoT.listaAdjVazia(1));
        assertTrue(grafoT.existeAresta(1, 0));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(5);
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 2);
        assertFalse(grafo.listaAdjVazia(0));
    }
}