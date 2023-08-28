
package ds;import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class PilhaTest6 {

    private Pilha pilha;

    @Before
    public void setup() {
        pilha = new Pilha();
    }

    @Test
    public void testPilhaVazia() {
        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
    }

    @Test
    public void testEmpilhaUmElemento() {
        pilha.empilha("elemento");
        assertFalse(pilha.vazia());
        assertEquals(1, pilha.tamanho());
    }

    @Test
    public void testDesempilhaUmElemento() {
        pilha.empilha("elemento");
        try {
            Object desempilhado = pilha.desempilha();
            assertEquals("elemento", desempilhado);
            assertTrue(pilha.vazia());
            assertEquals(0, pilha.tamanho());
        } catch (Exception e) {
            fail("Não deveria lançar exceção");
        }
    }

    @Test
    public void testDesempilhaEmPilhaVazia() {
        try {
            pilha.desempilha();
            fail("Deveria lançar exceção");
        } catch (Exception e) {
            assertEquals("Erro: A pilha esta vazia", e.getMessage());
        }
    }
}