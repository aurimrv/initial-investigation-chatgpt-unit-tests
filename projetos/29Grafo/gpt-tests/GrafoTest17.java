package ds;import ds.BuscaEmProfundidade;
import ds.Grafo;
import ds.Cfc;
import ds.Lista;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest17{


    @Test
    public void testBuscaEmProfundidade() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 1);
        grafo.insereAresta(2, 3, 1);
        grafo.insereAresta(3, 4, 1);
        BuscaEmProfundidade bfs = new BuscaEmProfundidade(grafo);
        bfs.buscaEmProfundidade();
        assertEquals(1, bfs.d(0));
        assertEquals(2, bfs.d(1));
        assertEquals(3, bfs.d(2));
        assertEquals(4, bfs.d(3));
        assertEquals(5, bfs.d(4));
        assertEquals(5, bfs.t(0));
        assertEquals(4, bfs.t(1));
        assertEquals(3, bfs.t(2));
        assertEquals(2, bfs.t(3));
        assertEquals(1, bfs.t(4));
        assertEquals(-1, bfs.antecessor(0));
        assertEquals(0, bfs.antecessor(1));
        assertEquals(1, bfs.antecessor(2));
        assertEquals(2, bfs.antecessor(3));
        assertEquals(3, bfs.antecessor(4));
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 1);
        grafo.insereAresta(2, 3, 1);
        grafo.insereAresta(3, 4, 1);
        Grafo grafoT = grafo.grafoTransposto();
        assertEquals(true, grafoT.existeAresta(1, 0));
        assertEquals(true, grafoT.existeAresta(2, 1));
        assertEquals(true, grafoT.existeAresta(3, 2));
        assertEquals(true, grafoT.existeAresta(4, 3));
    }

    @Test
    public void testObterCfc() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 1);
        grafo.insereAresta(2, 0, 1);
        grafo.insereAresta(2, 3, 1);
        grafo.insereAresta(3, 4, 1);
        Cfc cfc = new Cfc(grafo);
        cfc.obterCfc();
    }

    @Test
    public void testLista() {
        Lista lista = new Lista();
        assertEquals(true, lista.vazia());
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        assertEquals(false, lista.vazia());
        assertEquals(true, lista.estaNaLista(2));
        assertEquals(false, lista.estaNaLista(4));
        assertEquals(1, lista.primeiro());
        assertEquals(2, lista.proximo());
        assertEquals(3, lista.proximo());
        assertEquals(null, lista.proximo());
        try {
            assertEquals(1, lista.retiraPrimeiro());
            assertEquals(2, lista.retiraPrimeiro());
            assertEquals(3, lista.retiraPrimeiro());
        } catch (Exception e) {
            fail("Exception thrown");
        }
        assertEquals(true, lista.vazia());
    }
}