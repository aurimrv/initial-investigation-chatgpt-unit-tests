package ds;import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest13{


    private Pilha pilha;

    @Before
    public void setUp() {
        pilha = new Pilha();
    }

    @Test
    public void testEmpilha() throws Exception {
        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        assertEquals(3, pilha.tamanho());
    }

    @Test(expected = Exception.class)
    public void testEmpilhaWhenPilhaIsFull() throws Exception {
        for (int i = 0; i < 1000; i++) {
            pilha.empilha(i);
        }
        pilha.empilha(1001);
    }

    @Test
    public void testDesempilha() throws Exception {
        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        assertEquals(3, pilha.desempilha());
        assertEquals(2, pilha.desempilha());
        assertEquals(1, pilha.desempilha());
        assertTrue(pilha.vazia());
    }

    @Test(expected = Exception.class)
    public void testDesempilhaWhenPilhaIsEmpty() throws Exception {
        pilha.desempilha();
    }

    @Test
    public void testVazia() throws Exception {
        assertTrue(pilha.vazia());
        pilha.empilha(1);
        assertFalse(pilha.vazia());
        pilha.desempilha();
        assertTrue(pilha.vazia());
    }

    @Test
    public void testTamanho() throws Exception {
        assertEquals(0, pilha.tamanho());
        pilha.empilha(1);
        assertEquals(1, pilha.tamanho());
        pilha.empilha(2);
        assertEquals(2, pilha.tamanho());
        pilha.desempilha();
        assertEquals(1, pilha.tamanho());
    }
}