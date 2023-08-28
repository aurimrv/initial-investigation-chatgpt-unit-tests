package ds;import ds.BuscaEmProfundidade;
import ds.Grafo;
import ds.Lista;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest22{


    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(2, 4, 4);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(0, 2));
        assertTrue(grafo.existeAresta(1, 3));
        assertTrue(grafo.existeAresta(2, 4));
        assertFalse(grafo.existeAresta(0, 3));
        assertFalse(grafo.existeAresta(1, 2));
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(2, 4, 4);
        assertNotNull(grafo.retiraAresta(0, 1));
        assertNotNull(grafo.retiraAresta(0, 2));
        assertNull(grafo.retiraAresta(0, 3));
        assertNull(grafo.retiraAresta(1, 2));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(5);
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 1);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(2, 4, 4);
        assertNotNull(grafo.primeiroListaAdj(0));
        assertNotNull(grafo.primeiroListaAdj(1));
        assertNotNull(grafo.primeiroListaAdj(2));
        assertNull(grafo.primeiroListaAdj(3));
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(2, 4, 4);
        assertNotNull(grafo.proxAdj(0));
        assertNotNull(grafo.proxAdj(1));
        assertNotNull(grafo.proxAdj(2));
        assertNull(grafo.proxAdj(3));
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(2, 4, 4);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
        assertTrue(grafoT.existeAresta(3, 1));
        assertTrue(grafoT.existeAresta(4, 2));
        assertFalse(grafoT.existeAresta(0, 1));
        assertFalse(grafoT.existeAresta(0, 2));
    }

    @Test
    public void testInsere() {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        assertTrue(lista.estaNaLista(1));
        assertTrue(lista.estaNaLista(2));
        assertTrue(lista.estaNaLista(3));
        assertFalse(lista.estaNaLista(4));
    }

    @Test
    public void testRetira() throws Exception {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        assertNotNull(lista.retira(1));
        assertNotNull(lista.retira(2));
        assertNull(lista.retira(4));
    }

    @Test
    public void testRetiraPrimeiro() throws Exception {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        assertNotNull(lista.retiraPrimeiro());
        assertNotNull(lista.retiraPrimeiro());
        assertNotNull(lista.retiraPrimeiro());
        assertNull(lista.retiraPrimeiro());
    }

    @Test
    public void testPesquisa() {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        assertNotNull(lista.pesquisa(1));
        assertNotNull(lista.pesquisa(2));
        assertNotNull(lista.pesquisa(3));
        assertNull(lista.pesquisa(4));
    }

    @Test
    public void testVazia() {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
        lista.insere(1);
        assertFalse(lista.vazia());
    }

    @Test
    public void testPrimeiro() {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        assertEquals(1, lista.primeiro());
    }

    @Test
    public void testProximo() {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        assertEquals(2, lista.proximo());
        assertEquals(3, lista.proximo());
        assertNull(lista.proximo());
    }
}