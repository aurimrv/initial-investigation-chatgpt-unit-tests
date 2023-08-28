package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FPHeapMinTest21{

    
    @Test
    public void testRefaz() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(7);
        
        FPHeapMin heap = new FPHeapMin(v);
        heap.refaz(1, 5);
        
        assertEquals(2, ((MeuItem)heap.min()).chave);
    }
    
    @Test
    public void testConstroi() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(7);
        
        FPHeapMin heap = new FPHeapMin(v);
        heap.constroi();
        
        assertEquals(2, ((MeuItem)heap.min()).chave);
    }
    
    @Test
    public void testRetiraMin() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(7);
        
        FPHeapMin heap = new FPHeapMin(v);
        heap.constroi();
        
        Item min = heap.retiraMin();
        
        assertEquals(2, ((MeuItem)min).chave);
    }
    
    @Test
    public void testDiminuiChave() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(7);
        
        FPHeapMin heap = new FPHeapMin(v);
        heap.constroi();
        
        heap.diminuiChave(3, 1);
        
        assertEquals(1, ((MeuItem)heap.min()).chave);
    }
    
    @Test
    public void testInsere() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(7);
        
        FPHeapMin heap = new FPHeapMin(v);
        heap.constroi();
        
        heap.insere(new MeuItem(1));
        
        assertEquals(1, ((MeuItem)heap.min()).chave);
    }
    
    @Test
    public void testImprime() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(7);
        
        FPHeapMin heap = new FPHeapMin(v);
        heap.constroi();
        
        heap.imprime();
    }
    
    @Test
    public void testCopia() {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(7);
        
        FPHeapMin heap = new FPHeapMin(v);
        heap.constroi();
        
        Item[] copy = new Item[6];
        heap.copia(copy);
        
        assertEquals(5, ((MeuItem)copy[1]).chave);
        assertEquals(3, ((MeuItem)copy[2]).chave);
        assertEquals(8, ((MeuItem)copy[3]).chave);
        assertEquals(2, ((MeuItem)copy[4]).chave);
        assertEquals(7, ((MeuItem)copy[5]).chave);
    }
}