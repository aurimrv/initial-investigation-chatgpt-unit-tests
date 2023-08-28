
package ds;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import ds.Pilha;

public class PilhaTest3 {

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
    public void testEmpilha() {
        pilha.empilha(1);
        assertFalse(pilha.vazia());
        assertEquals(1, pilha.tamanho());
    }

    @Test
    public void testDesempilha() throws Exception {
        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);

        assertEquals(3, pilha.desempilha());
        assertEquals(2, pilha.tamanho());
    }

    @Test(expected = Exception.class)
    public void testDesempilhaPilhaVazia() throws Exception {
        pilha.desempilha();
    }
}