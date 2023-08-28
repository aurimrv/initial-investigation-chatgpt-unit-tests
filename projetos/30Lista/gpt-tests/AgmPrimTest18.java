package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.*;

public class AgmPrimTest18{


    @Test
    public void testObterAgm() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(1, 2, 1);
        grafo.insereAresta(1, 3, 4);
        grafo.insereAresta(2, 3, 2);
        grafo.insereAresta(2, 4, 3);
        grafo.insereAresta(3, 4, 1);
        
        AgmPrim agm = new AgmPrim(grafo);
        agm.obterAgm(0);
        
        assertEquals(0, agm.antecessor(0));
        assertEquals(1, agm.antecessor(1));
        assertEquals(0, agm.antecessor(2));
        assertEquals(2, agm.antecessor(3));
        assertEquals(3, agm.antecessor(4));
        
        assertEquals(0.0, agm.peso(0), 0.001);
        assertEquals(2.0, agm.peso(1), 0.001);
        assertEquals(3.0, agm.peso(2), 0.001);
        assertEquals(5.0, agm.peso(3), 0.001);
        assertEquals(6.0, agm.peso(4), 0.001);
    }
}