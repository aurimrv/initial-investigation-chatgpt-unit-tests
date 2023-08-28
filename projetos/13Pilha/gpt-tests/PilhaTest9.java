
package ds;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PilhaTest9 {

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
    public void testEmpilha() {
        pilha.empilha(1);
        pilha.empilha(2);

        assertFalse(pilha.vazia());
        assertEquals(2, pilha.tamanho());
    }

    @Test
    public void testDesempilha() throws Exception {
        pilha.empilha(1);
        pilha.empilha(2);

        assertEquals(2, pilha.desempilha());
        assertEquals(1, pilha.desempilha());
    }

    @Test(expected = Exception.class)
    public void testDesempilhaException() throws Exception {
        pilha.desempilha();
    }

    @Test(expected = Exception.class)
    public void testEmpilhaException() throws Exception {
        for (int i = 0; i < 1000; i++) {
            pilha.empilha(i);
        }

        pilha.empilha(1001);
    }
}
