
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest7 {

    @Test
    public void testPilhaVazia() {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
    }

    @Test
    public void testEmpilhaDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        Object item = new Object();
        
        pilha.empilha(item);
        assertFalse(pilha.vazia());
        assertEquals(1, pilha.tamanho());
        assertSame(item, pilha.desempilha());
        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
    }

    @Test(expected = Exception.class)
    public void testDesempilhaPilhaVazia() throws Exception {
        Pilha pilha = new Pilha();
        pilha.desempilha();
    }

    @Test(expected = Exception.class)
    public void testEmpilhaPilhaCheia() throws Exception {
        Pilha pilha = new Pilha();
        
        for (int i = 0; i < 1000; i++) {
            pilha.empilha(new Object());
        }
        
        pilha.empilha(new Object());
    }

    @Test
    public void testTamanho() throws Exception {
        Pilha pilha = new Pilha();
        assertEquals(0, pilha.tamanho());
        
        pilha.empilha(new Object());
        assertEquals(1, pilha.tamanho());
        
        pilha.desempilha();
        assertEquals(0, pilha.tamanho());
    }
}