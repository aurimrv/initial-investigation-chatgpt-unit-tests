
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest11 {

    @Test
    public void testPilhaVazia() {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
    }

    @Test
    public void testEmpilhaDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        
        pilha.empilha("A");
        assertFalse(pilha.vazia());
        assertEquals(1, pilha.tamanho());
        assertEquals("A", pilha.desempilha());
        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
        
        pilha.empilha("B");
        pilha.empilha("C");
        pilha.empilha("D");
        assertFalse(pilha.vazia());
        assertEquals(3, pilha.tamanho());
        assertEquals("D", pilha.desempilha());
        assertEquals("C", pilha.desempilha());
        assertEquals("B", pilha.desempilha());
        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
    }
    
    @Test(expected = Exception.class)
    public void testDesempilhaPilhaVazia() throws Exception {
        Pilha pilha = new Pilha();
        pilha.desempilha();
    }

}