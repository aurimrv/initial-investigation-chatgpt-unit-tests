package ds;import ds.BuscaEmLargura;
import ds.Grafo;
import ds.Fila;
import ds.Lista;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest15{


    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(1, 3, 4);
        grafo.insereAresta(2, 4, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(0, 2));
        assertTrue(grafo.existeAresta(1, 3));
        assertTrue(grafo.existeAresta(2, 4));
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(1, 3, 4);
        grafo.insereAresta(2, 4, 5);
        assertNotNull(grafo.retiraAresta(0, 1));
        assertNotNull(grafo.retiraAresta(0, 2));
        assertNotNull(grafo.retiraAresta(1, 3));
        assertNotNull(grafo.retiraAresta(2, 4));
        assertFalse(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(0, 2));
        assertFalse(grafo.existeAresta(1, 3));
        assertFalse(grafo.existeAresta(2, 4));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(5);
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 2);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(1, 3, 4);
        grafo.insereAresta(2, 4, 5);
        assertNotNull(grafo.primeiroListaAdj(0));
        assertNotNull(grafo.primeiroListaAdj(1));
        assertNotNull(grafo.primeiroListaAdj(2));
        assertNull(grafo.primeiroListaAdj(3));
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(1, 3, 4);
        grafo.insereAresta(2, 4, 5);
        assertNotNull(grafo.proxAdj(0));
        assertNotNull(grafo.proxAdj(1));
        assertNotNull(grafo.proxAdj(2));
        assertNull(grafo.proxAdj(3));
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(1, 3, 4);
        grafo.insereAresta(2, 4, 5);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
        assertTrue(grafoT.existeAresta(3, 1));
        assertTrue(grafoT.existeAresta(4, 2));
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
    }

    @Test
    public void testRetira() throws Exception {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        assertNotNull(lista.retira(1));
        assertNotNull(lista.retira(2));
        assertNotNull(lista.retira(3));
        assertFalse(lista.estaNaLista(1));
        assertFalse(lista.estaNaLista(2));
        assertFalse(lista.estaNaLista(3));
    }

    @Test
    public void testRetiraPrimeiro() throws Exception {
        Lista lista =