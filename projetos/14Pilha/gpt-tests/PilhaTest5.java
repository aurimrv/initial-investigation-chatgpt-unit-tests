
package ds;import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest5 {

    private Pilha pilha;

    @Before
    public void setUp() {
        pilha = new Pilha();
    }

    @Test
    public void testPilhaVazia() {
        assertTrue(pilha.vazia());
    }

    @Test
    public void testEmpilhaUmElemento() {
        pilha.empilha(5);
        assertFalse(pilha.vazia());
        assertEquals(1, pilha.tamanho());
    }

    @Test
    public void testEmpilhaEDesempilhaElementos() throws Exception {
        pilha.empilha(5);
        pilha.empilha(10);
        pilha.empilha(15);

        assertEquals(15, pilha.desempilha());
        assertEquals(10, pilha.desempilha());
        assertEquals(5, pilha.desempilha());

        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
    }

    @Test(expected = Exception.class)
    public void testDesempilhaElementoDePilhaVazia() throws Exception {
        pilha.desempilha();
    }
}