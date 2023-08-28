package ds;import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilhaTest14{


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
    public void testEmpilhaEDesempilhaElementos() throws Exception {
        pilha.empilha("Elemento 1");
        pilha.empilha("Elemento 2");
        pilha.empilha("Elemento 3");

        assertFalse(pilha.vazia());
        assertEquals(3, pilha.tamanho());

        assertEquals("Elemento 3", pilha.desempilha());
        assertEquals("Elemento 2", pilha.desempilha());
        assertEquals("Elemento 1", pilha.desempilha());

        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
    }

    @Test(expected = Exception.class)
    public void testDesempilhaElementoDePilhaVazia() throws Exception {
        pilha.desempilha();
    }

    @Test(expected = Exception.class)
    public void testEmpilhaElementoEmPilhaCheia() throws Exception {
        for (int i = 0; i < 1000; i++) {
            pilha.empilha("Elemento " + i);
        }
        pilha.empilha("Elemento Extra");
    }
}