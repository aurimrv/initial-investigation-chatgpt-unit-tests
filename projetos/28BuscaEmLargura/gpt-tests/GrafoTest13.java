package ds;import org.junit.Test;
import ds.Grafo;
import ds.BuscaEmLargura;

public class GrafoTest13{


    @Test
    public void testBuscaEmLargura() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 1);
        grafo.insereAresta(1, 3, 1);
        grafo.insereAresta(2, 4, 1);
        BuscaEmLargura buscaEmLargura = new BuscaEmLargura(grafo);
        buscaEmLargura.buscaEmLargura();
        assert buscaEmLargura.d(3) == 2;
        assert buscaEmLargura.d(4) == 2;
        assert buscaEmLargura.antecessor(3) == 1;
        assert buscaEmLargura.antecessor(4) == 2;
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 1);
        grafo.insereAresta(1, 3, 1);
        grafo.insereAresta(2, 4, 1);
        Grafo grafoT = grafo.grafoTransposto();
        assert grafoT.existeAresta(1, 0);
        assert grafoT.existeAresta(2, 0);
        assert grafoT.existeAresta(3, 1);
        assert grafoT.existeAresta(4, 2);
    }

    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 1);
        grafo.insereAresta(1, 3, 1);
        grafo.insereAresta(2, 4, 1);
        assert grafo.existeAresta(0, 1);
        assert grafo.existeAresta(0, 2);
        assert grafo.existeAresta(1, 3);
        assert grafo.existeAresta(2, 4);
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 1);
        grafo.insereAresta(1, 3, 1);
        grafo.insereAresta(2, 4, 1);
        grafo.retiraAresta(0, 1);
        grafo.retiraAresta(0, 2);
        grafo.retiraAresta(1, 3);
        grafo.retiraAresta(2, 4);
        assert !grafo.existeAresta(0, 1);
        assert !grafo.existeAresta(0, 2);
        assert !grafo.existeAresta(1, 3);
        assert !grafo.existeAresta(2, 4);
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(5);
        assert grafo.listaAdjVazia(0);
        assert grafo.listaAdjVazia(1);
        assert grafo.listaAdjVazia(2);
        assert grafo.listaAdjVazia(3);
        assert grafo.listaAdjVazia(4);
    }

    @Test
    public void testImprime() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 1);
        grafo.insereAresta(1, 3, 1);
        grafo.insereAresta(2, 4, 1);
        grafo.imprime();
    }

    @Test
    public void testPesquisa() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 1);
        grafo.insereAresta(1, 3, 1);
        grafo.insereAresta(2, 4, 1);
        assert grafo.pesquisa(0) != null;
        assert grafo.pesquisa(1) != null;
        assert grafo.pesquisa(2) != null;
        assert grafo.pesquisa(3) != null;
        assert grafo.pesquisa(4) != null;
        assert grafo.pesquisa(5) == null;
    }

    @Test
    public void testRetira() throws Exception {
        Grafo grafo