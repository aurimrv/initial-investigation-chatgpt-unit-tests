
package ds;
import ds.Pilha;
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
    public void testEmpilhaUmElemento() throws Exception {
        pilha.empilha("Elemento 1");
        assertFalse(pilha.vazia());
        assertEquals(1, pilha.tamanho());
    }

    @Test
    public void testEmpilhaEDesempilhaElemento() throws Exception {
        pilha.empilha("Elemento 1");
        pilha.empilha("Elemento 2");

        assertEquals("Elemento 2", pilha.desempilha());
        assertEquals("Elemento 1", pilha.desempilha());
        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
    }

    @Test(expected = Exception.class)
    public void testDesempilhaElementoDaPilhaVazia() throws Exception {
        pilha.desempilha();
    }

    @Test(expected = Exception.class)
    public void testEmpilhaElementoNaPilhaCheia() throws Exception {
        // Fill the stack
        for (int i = 0; i < 1000; i++) {
            pilha.empilha("Elemento " + (i + 1));
        }

        // Try to push an element into a full stack
        pilha.empilha("Elemento Extra");
    }
}