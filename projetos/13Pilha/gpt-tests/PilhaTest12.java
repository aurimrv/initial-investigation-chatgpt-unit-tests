package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest12{


    @Test
    public void testEmpilha() {
        Pilha pilha = new Pilha();
        try {
            pilha.empilha(1);
            pilha.empilha(2);
            pilha.empilha(3);
        } catch (Exception e) {
            fail("Exception thrown");
        }
        assertEquals(3, pilha.tamanho());
    }

    @Test
    public void testDesempilha() {
        Pilha pilha = new Pilha();
        try {
            pilha.empilha(1);
            pilha.empilha(2);
            pilha.empilha(3);
            Object result = pilha.desempilha();
            assertEquals(3, result);
        } catch (Exception e) {
            fail("Exception thrown");
        }
        assertEquals(2, pilha.tamanho());
    }

    @Test
    public void testVazia() {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
        try {
            pilha.empilha(1);
            assertFalse(pilha.vazia());
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test
    public void testTamanho() {
        Pilha pilha = new Pilha();
        assertEquals(0, pilha.tamanho());
        try {
            pilha.empilha(1);
            assertEquals(1, pilha.tamanho());
            pilha.empilha(2);
            assertEquals(2, pilha.tamanho());
            pilha.desempilha();
            assertEquals(1, pilha.tamanho());
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }
}