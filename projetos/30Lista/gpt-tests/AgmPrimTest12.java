package ds;import ds.FPHeapMinIndireto;
import ds.AgmPrim;
import ds.Grafo;
import ds.Lista;
import org.junit.Test;
import static org.junit.Assert.*;

public class AgmPrimTest12{


    @Test
    public void testObterAgm() throws Exception {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 6);
        grafo.insereAresta(0, 3, 5);
        grafo.insereAresta(1, 3, 15);
        grafo.insereAresta(2, 3, 4);
        
        AgmPrim agm = new AgmPrim(grafo);
        agm.obterAgm(0);
        
        int[] expectedAntecessor = {-1, 0, 0, 0};
        double[] expectedPeso = {0.0, 10.0, 6.0, 5.0};
        
        assertArrayEquals(expectedAntecessor, agm.getAntecessor());
        assertArrayEquals(expectedPeso, agm.getPeso(), 0.001);
    }
    
    @Test
    public void testObterAgmEmptyGraph() throws Exception {
        Grafo grafo = new Grafo(0);
        AgmPrim agm = new AgmPrim(grafo);
        agm.obterAgm(0);
        
        int[] expectedAntecessor = {};
        double[] expectedPeso = {};
        
        assertArrayEquals(expectedAntecessor, agm.getAntecessor());
        assertArrayEquals(expectedPeso, agm.getPeso(), 0.001);
    }
    
    @Test
    public void testObterAgmSingleNodeGraph() throws Exception {
        Grafo grafo = new Grafo(1);
        AgmPrim agm = new AgmPrim(grafo);
        agm.obterAgm(0);
        
        int[] expectedAntecessor = {-1};
        double[] expectedPeso = {0.0};
        
        assertArrayEquals(expectedAntecessor, agm.getAntecessor());
        assertArrayEquals(expectedPeso, agm.getPeso(), 0.001);
    }
    
    @Test(expected = Exception.class)
    public void testObterAgmInvalidRoot() throws Exception {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 6);
        grafo.insereAresta(0, 3, 5);
        grafo.insereAresta(1, 3, 15);
        grafo.insereAresta(2, 3, 4);
        
        AgmPrim agm = new AgmPrim(grafo);
        agm.obterAgm(5);
    }
    
    @Test
    public void testAntecessor() throws Exception {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 6);
        grafo.insereAresta(0, 3, 5);
        grafo.insereAresta(1, 3, 15);
        grafo.insereAresta(2, 3, 4);
        
        AgmPrim agm = new AgmPrim(grafo);
        agm.obterAgm(0);
        
        assertEquals(0, agm.antecessor(1));
        assertEquals(0, agm.antecessor(2));
        assertEquals(0, agm.antecessor(3));
    }
    
    @Test
    public void testPeso() throws Exception {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 6);
        grafo.insereAresta(0, 3, 5);
        grafo.insereAresta(1, 3, 15);
        grafo.insereAresta(2, 3, 4);
        
        AgmPrim agm = new AgmPrim(grafo);
        agm.obterAgm(0);
        
        assertEquals(0.0, agm.peso(0), 0.001);
        assertEquals(10.0, agm.peso(1), 0.001);
