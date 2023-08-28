package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import ds.BuscaEmLargura;

public class GrafoTest16{


    @Test
    public void testBuscaEmLargura() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 1);
        grafo.insereAresta(1, 3, 1);
        grafo.insereAresta(2, 4, 1);
        
        BuscaEmLargura bfs = new BuscaEmLargura(grafo);
        bfs.buscaEmLargura();
        
        assertEquals(0, bfs.d(0));
        assertEquals(1, bfs.d(1));
        assertEquals(1, bfs.d(2));
        assertEquals(2, bfs.d(3));
        assertEquals(2, bfs.d(4));
        
        assertEquals(-1, bfs.antecessor(0));
        assertEquals(0, bfs.antecessor(1));
        assertEquals(0, bfs.antecessor(2));
        assertEquals(1, bfs.antecessor(3));
        assertEquals(2, bfs.antecessor(4));
    }
    
    @Test
    public void testImprimeCaminho() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 1);
        grafo.insereAresta(1, 3, 1);
        grafo.insereAresta(2, 4, 1);
        
        BuscaEmLargura bfs = new BuscaEmLargura(grafo);
        bfs.buscaEmLargura();
        
        assertEquals("0", bfs.imprimeCaminho(0, 0));
        assertEquals("0 1", bfs.imprimeCaminho(0, 1));
        assertEquals("0 2", bfs.imprimeCaminho(0, 2));
        assertEquals("0 1 3", bfs.imprimeCaminho(0, 3));
        assertEquals("0 2 4", bfs.imprimeCaminho(0, 4));
        
        assertEquals("Nao existe caminho de 1 ate 0", bfs.imprimeCaminho(1, 0));
        assertEquals("1", bfs.imprimeCaminho(1, 1));
        assertEquals("Nao existe caminho de 1 ate 2", bfs.imprimeCaminho(1, 2));
        assertEquals("1 3", bfs.imprimeCaminho(1, 3));
        assertEquals("Nao existe caminho de 1 ate 4", bfs.imprimeCaminho(1, 4));
        
        assertEquals("Nao existe caminho de 2 ate 0", bfs.imprimeCaminho(2, 0));
        assertEquals("Nao existe caminho de 2 ate 1", bfs.imprimeCaminho(2, 1));
        assertEquals("2", bfs.imprimeCaminho(2, 2));
        assertEquals("Nao existe caminho de 2 ate 3", bfs.imprimeCaminho(2, 3));
        assertEquals("2 4", bfs.imprimeCaminho(2, 4));
        
        assertEquals("Nao existe caminho de 3 ate 0", bfs.imprimeCaminho(3, 0));
        assertEquals("Nao existe caminho de 3 ate 1", bfs.imprimeCaminho(3, 1));
        assertEquals("Nao existe caminho de 3 ate 2", bfs.imprimeCaminho(3, 2));
        assertEquals("3", bfs.imprimeCaminho(3, 3));
        assertEquals("Nao existe caminho de 3 ate 4", bfs.imprimeCaminho(3, 4));
        
        assertEquals("Nao existe caminho de 4 ate 0", bfs.imprimeCaminho(4, 0));
        assertEquals("Nao existe caminho de 4 ate 1", bfs.imprimeCaminho(4, 1));
        assertEquals("Nao existe caminho de 4 ate 2", bfs.imprimeCaminho(4, 2));
        assertEquals("Nao existe caminho de 4 ate 3", bfs.imprimeCaminho(4, 3));
        assertEquals("4", bfs.imprimeCaminho(4, 4));
    }
}