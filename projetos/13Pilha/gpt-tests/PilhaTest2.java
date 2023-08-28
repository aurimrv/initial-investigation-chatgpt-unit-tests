
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest2 {
    
    @Test
    public void testPilhaVazia() {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
    }
    
    @Test
    public void testEmpilhaDesempilha() {
        Pilha pilha = new Pilha();
        Object obj = new Object();
        try {
            pilha.empilha(obj);
            assertFalse(pilha.vazia());
            assertEquals(obj, pilha.desempilha());
            assertTrue(pilha.vazia());
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }
    
    @Test
    public void testPilhaCheia() {
        Pilha pilha = new Pilha();
        try {
            for (int i = 0; i < 1000; i++) {
                pilha.empilha(new Object());
            }
            assertEquals(1000, pilha.tamanho());
            pilha.empilha(new Object());
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A pilha esta cheia", e.getMessage());
        }
    }
    
    @Test
    public void testDesempilhaPilhaVazia() {
        Pilha pilha = new Pilha();
        try {
            pilha.desempilha();
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A pilha esta vazia", e.getMessage());
        }
    }
}
