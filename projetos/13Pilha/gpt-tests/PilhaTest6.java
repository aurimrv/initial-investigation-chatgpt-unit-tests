
package ds;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest6 {
    
    private Pilha pilha;
    
    @Before
    public void setUp() {
        pilha = new Pilha();
    }
    
    @Test
    public void testEmpilha() throws Exception {
        pilha.empilha("A");
        pilha.empilha("B");
        pilha.empilha("C");
        
        assertEquals(3, pilha.tamanho());
    }
    
    @Test
    public void testDesempilha() throws Exception {
        pilha.empilha("A");
        pilha.empilha("B");
        pilha.empilha("C");
        
        Object desempilhado = pilha.desempilha();
        
        assertEquals("C", desempilhado);
        assertEquals(2, pilha.tamanho());
    }
    
    @Test
    public void testVazia() {
        assertTrue(pilha.vazia());
        
        pilha.empilha("A");
        
        assertFalse(pilha.vazia());
    }
    
    @Test
    public void testTamanho() throws Exception {
        pilha.empilha("A");
        pilha.empilha("B");
        pilha.empilha("C");
        
        assertEquals(3, pilha.tamanho());
        
        pilha.desempilha();
        
        assertEquals(2, pilha.tamanho());
    }
}