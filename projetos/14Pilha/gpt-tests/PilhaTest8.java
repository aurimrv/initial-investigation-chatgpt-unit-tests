
package ds;import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PilhaTest8 {

    private Pilha pilha;

    @Before
    public void setUp() {
        pilha = new Pilha();
    }

    @Test
    public void testEmpilhaDesempilha() throws Exception {
        pilha.empilha("item1");
        pilha.empilha("item2");
        pilha.empilha("item3");

        assertEquals("item3", pilha.desempilha());
        assertEquals("item2", pilha.desempilha());
        assertEquals("item1", pilha.desempilha());
    }

    @Test
    public void testVazia() {
        assertTrue(pilha.vazia());

        pilha.empilha("item1");
        assertFalse(pilha.vazia());

        pilha.desempilha();
        assertTrue(pilha.vazia());
    }

    @Test
    public void testTamanho() {
        assertEquals(0, pilha.tamanho());

        pilha.empilha("item1");
        assertEquals(1, pilha.tamanho());

        pilha.empilha("item2");
        assertEquals(2, pilha.tamanho());

        pilha.desempilha();
        assertEquals(1, pilha.tamanho());

        pilha.desempilha();
        assertEquals(0, pilha.tamanho());
    }

    @Test(expected = Exception.class)
    public void testDesempilhaException() throws Exception {
        pilha.desempilha();
    }
}