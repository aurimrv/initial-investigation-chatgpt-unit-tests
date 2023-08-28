
package ds;
import ds.Pilha;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilhaTest1 {

    private Pilha pilha;

    @Before
    public void setup() {
        pilha = new Pilha();
    }

    @Test
    public void testEmpilha() throws Exception {
        pilha.empilha("item1");
        pilha.empilha("item2");
        pilha.empilha("item3");

        assertEquals(3, pilha.tamanho());
    }

    @Test
    public void testDesempilha() throws Exception {
        pilha.empilha("item1");
        pilha.empilha("item2");
        pilha.empilha("item3");

        assertEquals("item3", pilha.desempilha());
        assertEquals(2, pilha.tamanho());
    }

    @Test(expected = Exception.class)
    public void testDesempilhaEmptyPilha() throws Exception {
        pilha.desempilha();
    }

    @Test
    public void testVazia() throws Exception {
        assertTrue(pilha.vazia());

        pilha.empilha("item1");

        assertFalse(pilha.vazia());
    }

    @Test
    public void testTamanho() throws Exception {
        assertEquals(0, pilha.tamanho());

        pilha.empilha("item1");

        assertEquals(1, pilha.tamanho());
    }
}
