package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest17{

    
    @Test
    public void testEmpilha() {
        Pilha pilha = new Pilha();
        pilha.empilha("item1");
        pilha.empilha("item2");
        
        assertEquals(2, pilha.tamanho());
    }
    
    @Test
    public void testDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha("item1");
        pilha.empilha("item2");
        
        Object desempilhado = pilha.desempilha();
        
        assertEquals("item2", desempilhado);
        assertEquals(1, pilha.tamanho());
    }
    
    @Test(expected = Exception.class)
    public void testDesempilhaVazia() throws Exception {
        Pilha pilha = new Pilha();
        pilha.desempilha();
    }
    
    @Test
    public void testVazia() {
        Pilha pilha = new Pilha();
        
        assertTrue(pilha.vazia());
        
        pilha.empilha("item1");
        
        assertFalse(pilha.vazia());
    }
    
    @Test
    public void testTamanho() {
        Pilha pilha = new Pilha();
        
        assertEquals(0, pilha.tamanho());
        
        pilha.empilha("item1");
        pilha.empilha("item2");
        
        assertEquals(2, pilha.tamanho());
    }
}