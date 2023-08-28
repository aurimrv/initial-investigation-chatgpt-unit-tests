package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest25{


    @Test
    public void testEmpilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        assertEquals(3, pilha.tamanho());
    }

    @Test
    public void testDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        assertEquals(3, pilha.desempilha());
        assertEquals(2, pilha.desempilha());
        assertEquals(1, pilha.desempilha());
        assertTrue(pilha.vazia());
    }

    @Test
    public void testVazia() {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
        pilha.empilha(1);
        assertFalse(pilha.vazia());
    }

    @Test
    public void testTamanho() throws Exception {
        Pilha pilha = new Pilha();
        assertEquals(0, pilha.tamanho());
        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        assertEquals(3, pilha.tamanho());
        pilha.desempilha();
        assertEquals(2, pilha.tamanho());
    }
}