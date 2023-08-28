
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest9 {

    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 2);
        grafo.insereAresta(3, 4, 1);
        
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 3));
        assertTrue(grafo.existeAresta(3, 4));
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 2);
        grafo.insereAresta(3, 4, 1);
        
        assertNotNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(1, 3));
        assertNotNull(grafo.retiraAresta(3, 4));
    }

    @Test
    public void testBuscaEmLargura() throws Exception {
        Grafo grafo = new Grafo(6);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 1);
        grafo.insereAresta(1, 3, 1);
        grafo.insereAresta(2, 4, 1);
        grafo.insereAresta(3, 5, 1);
        
        BuscaEmLargura busca = new BuscaEmLargura(grafo);
        busca.buscaEmLargura();
        
        assertEquals(0, busca.antecessor(0));
        assertEquals(0, busca.antecessor(1));
        assertEquals(0, busca.antecessor(2));
        assertEquals(1, busca.antecessor(3));
        assertEquals(2, busca.antecessor(4));
        assertEquals(3, busca.antecessor(5));
    }

    @Test
    public void testImprimeCaminho() {
        Grafo grafo = new Grafo(6);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 1);
        grafo.insereAresta(1, 3, 1);
        grafo.insereAresta(2, 4, 1);
        grafo.insereAresta(3, 5, 1);
        
        BuscaEmLargura busca = new BuscaEmLargura(grafo);
        busca.buscaEmLargura();
        
        assertEquals("0\n1\n", busca.imprimeCaminho(0, 1));
        assertEquals("0\n2\n", busca.imprimeCaminho(0, 2));
        assertEquals("0\n1\n3\n", busca.imprimeCaminho(0, 3));
        assertEquals("0\n2\n4\n", busca.imprimeCaminho(0, 4));
        assertEquals("0\n1\n3\n5\n", busca.imprimeCaminho(0, 5));
        assertEquals("Nao existe caminho de 1 ate 4", busca.imprimeCaminho(1, 4));
    }
}