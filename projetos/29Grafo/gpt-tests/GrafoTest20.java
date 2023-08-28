package ds;import ds.BuscaEmProfundidade;
import ds.Grafo;
import ds.Cfc;
import ds.Lista;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest20{


    @Test
    public void testBuscaEmProfundidade() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 1);
        grafo.insereAresta(2, 3, 1);
        grafo.insereAresta(3, 4, 1);
        grafo.insereAresta(4, 0, 1);

        BuscaEmProfundidade dfs = new BuscaEmProfundidade(grafo);
        dfs.buscaEmProfundidade();

        assertEquals(1, dfs.d(0));
        assertEquals(2, dfs.d(1));
        assertEquals(3, dfs.d(2));
        assertEquals(4, dfs.d(3));
        assertEquals(5, dfs.d(4));

        assertEquals(5, dfs.t(0));
        assertEquals(4, dfs.t(1));
        assertEquals(3, dfs.t(2));
        assertEquals(2, dfs.t(3));
        assertEquals(1, dfs.t(4));

        assertEquals(-1, dfs.antecessor(0));
        assertEquals(0, dfs.antecessor(1));
        assertEquals(1, dfs.antecessor(2));
        assertEquals(2, dfs.antecessor(3));
        assertEquals(3, dfs.antecessor(4));
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 1);
        grafo.insereAresta(2, 3, 1);
        grafo.insereAresta(3, 4, 1);
        grafo.insereAresta(4, 0, 1);

        Grafo grafoT = grafo.grafoTransposto();

        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(3, 2));
        assertTrue(grafoT.existeAresta(4, 3));
        assertTrue(grafoT.existeAresta(0, 4));
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
    public void testLista() throws Exception {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);

        assertEquals(1, lista.primeiro());
        assertEquals(2, lista.proximo());
        assertEquals(3, lista.proximo());

        assertTrue(lista.estaNaLista(2));
        assertFalse(lista.estaNaLista(4));

        assertEquals(1, lista.retiraPrimeiro());
        assertEquals(2, lista.retira(2));
        assertNull(lista.retira(4));
    }
}