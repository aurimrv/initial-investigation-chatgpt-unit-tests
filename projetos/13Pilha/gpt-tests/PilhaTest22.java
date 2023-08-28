package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest22{


    @Test
    public void testEmpilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha("item1");
        pilha.empilha("item2");
        pilha.empilha("item3");

        assertEquals(3, pilha.tamanho());
    }

    @Test(expected = Exception.class)
    public void testEmpilhaPilhaCheia() throws Exception {
        Pilha pilha = new Pilha();
        for (int i = 0; i < 1000; i++) {
            pilha.empilha("item" + i);
        }
        pilha.empilha("item1001");
    }

    @Test
    public void testDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha("item1");
        pilha.empilha("item2");
        pilha.empilha("item3");

        Object desempilhado = pilha.desempilha();

        assertEquals("item3", desempilhado);
        assertEquals(2, pilha.tamanho());
    }

    @Test(expected = Exception.class)
    public void testDesempilhaPilhaVazia() throws Exception {
        Pilha pilha = new Pilha();
        pilha.desempilha();
    }

    @Test
    public void testVazia() {
        Pilha pilha = new Pilha();

        assertTrue(pilha.vazia());

        pilha.empilha("item1");

        assertFalse(pilha.vazia());
    }

    @Test
    public void testTamanho() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha("item1");
        pilha.empilha("item2");
        pilha.empilha("item3");

        assertEquals(3, pilha.tamanho());

        pilha.desempilha();

        assertEquals(2, pilha.tamanho());
    }
}