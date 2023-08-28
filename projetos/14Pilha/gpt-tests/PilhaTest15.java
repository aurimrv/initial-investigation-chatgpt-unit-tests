package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest15{


    @Test
    public void testPilhaVazia() {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
    }

    @Test
    public void testEmpilha() {
        Pilha pilha = new Pilha();
        pilha.empilha(1);
        assertFalse(pilha.vazia());
        assertEquals(1, pilha.tamanho());
    }

    @Test
    public void testDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        assertEquals(3, pilha.desempilha());
        assertEquals(2, pilha.tamanho());
    }

    @Test(expected = Exception.class)
    public void testDesempilhaPilhaVazia() throws Exception {
        Pilha pilha = new Pilha();
        pilha.desempilha();
    }
}