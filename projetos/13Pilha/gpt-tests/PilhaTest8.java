
package ds;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest8 {
    private Pilha pilha;

    @Before
    public void setUp() {
        pilha = new Pilha();
    }

    @Test
    public void testEmpilha() throws Exception {
        pilha.empilha("Item 1");
        pilha.empilha("Item 2");
        assertEquals(2, pilha.tamanho());
    }

    @Test(expected = Exception.class)
    public void testEmpilhaException() throws Exception {
        for (int i = 0; i < 1000; i++) {
            pilha.empilha("Item " + (i+1));
        }
        pilha.empilha("Overflow Item"); // Should throw exception
    }

    @Test
    public void testDesempilha() throws Exception {
        pilha.empilha("Item 1");
        pilha.empilha("Item 2");
        Object item = pilha.desempilha();
        assertEquals("Item 2", item);
        assertEquals(1, pilha.tamanho());
    }

    @Test(expected = Exception.class)
    public void testDesempilhaException() throws Exception {
        pilha.desempilha(); // Should throw exception
    }

    @Test
    public void testVazia() {
        assertTrue(pilha.vazia());
        pilha.empilha("Item");
        assertFalse(pilha.vazia());
    }

    @Test
    public void testTamanho() {
        assertEquals(0, pilha.tamanho());
        pilha.empilha("Item 1");
        pilha.empilha("Item 2");
        assertEquals(2, pilha.tamanho());
    }
}