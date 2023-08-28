
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest5 {
    
    @Test
    public void testPilhaConstructor() {
        Pilha pilha = new Pilha();
        assertEquals(0, pilha.tamanho());
        assertTrue(pilha.vazia());
    }

    @Test
    public void testEmpilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(10);
        assertEquals(1, pilha.tamanho());
        assertFalse(pilha.vazia());
    }

    @Test
    public void testDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(10);
        pilha.empilha(20);
        Object desempilhado = pilha.desempilha();
        assertEquals(20, desempilhado);
        assertEquals(1, pilha.tamanho());
    }

    @Test
    public void testDesempilhaEmptyPilha() {
        Pilha pilha = new Pilha();
        try {
            pilha.desempilha();
            fail("Should have thrown an Exception");
        } catch (Exception e) {
            assertEquals("Erro: A pilha esta vazia", e.getMessage());
        }
    }
    
    @Test
    public void testEmpilhaFullPilha() {
        Pilha pilha = new Pilha();
        try {
            for (int i = 0; i < 1000; i++) {
                pilha.empilha(i);
            }
            fail("Should have thrown an Exception");
        } catch (Exception e) {
            assertEquals("Erro: A pilha esta cheia", e.getMessage());
        }
    }
}