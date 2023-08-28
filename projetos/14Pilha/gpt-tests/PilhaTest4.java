
package ds;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilhaTest4 {
    private Pilha pilha;

    @Before
    public void setUp() {
        pilha = new Pilha();
    }

    @Test
    public void testPilhaVazia() {
        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
    }

    @Test
    public void testEmpilhaDesempilha() throws Exception {
        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);

        assertFalse(pilha.vazia());
        assertEquals(3, pilha.tamanho());

        assertEquals(3, pilha.desempilha());
        assertEquals(2, pilha.desempilha());
        assertEquals(1, pilha.desempilha());

        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
    }

    @Test(expected = Exception.class)
    public void testDesempilhaPilhaVazia() throws Exception {
        pilha.desempilha();
    }
}