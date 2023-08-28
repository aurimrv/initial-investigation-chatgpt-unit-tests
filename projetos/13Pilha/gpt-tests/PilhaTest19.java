package ds;import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest19{


    private Pilha pilha;

    @Before
    public void setup() {
        pilha = new Pilha();
    }

    @Test
    public void testEmpilha() throws Exception {
        pilha.empilha("Item 1");
        pilha.empilha("Item 2");
        pilha.empilha("Item 3");

        assertEquals(3, pilha.tamanho());
    }

    @Test
    public void testDesempilha() throws Exception {
        pilha.empilha("Item 1");
        pilha.empilha("Item 2");
        pilha.empilha("Item 3");

        Object desempilhado = pilha.desempilha();

        assertEquals("Item 3", desempilhado);
        assertEquals(2, pilha.tamanho());
    }

    @Test(expected = Exception.class)
    public void testDesempilhaFromEmptyPilha() throws Exception {
        pilha.desempilha();
    }

    @Test
    public void testVazia() throws Exception {
        assertTrue(pilha.vazia());

        pilha.empilha("Item 1");

        assertFalse(pilha.vazia());
    }

    @Test
    public void testTamanho() throws Exception {
        assertEquals(0, pilha.tamanho());

        pilha.empilha("Item 1");
        pilha.empilha("Item 2");

        assertEquals(2, pilha.tamanho());
    }
}