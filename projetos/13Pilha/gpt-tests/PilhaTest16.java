package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest16{


    @Test
    public void testEmpilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha("Item 1");
        pilha.empilha("Item 2");
        pilha.empilha("Item 3");

        assertEquals("Item 3", pilha.item[pilha.topo - 1]);
    }

    @Test(expected = Exception.class)
    public void testEmpilhaPilhaCheia() throws Exception {
        Pilha pilha = new Pilha();
        for (int i = 0; i < 1000; i++) {
            pilha.empilha("Item " + (i + 1));
        }
        pilha.empilha("Item 1001");
    }

    @Test
    public void testDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha("Item 1");
        pilha.empilha("Item 2");
        pilha.empilha("Item 3");

        Object desempilhado = pilha.desempilha();

        assertEquals("Item 3", desempilhado);
        assertEquals(2, pilha.topo);
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

        pilha.empilha("Item 1");
        assertFalse(pilha.vazia());
    }

    @Test
    public void testTamanho() throws Exception {
        Pilha pilha = new Pilha();
        assertEquals(0, pilha.tamanho());

        pilha.empilha("Item 1");
        assertEquals(1, pilha.tamanho());

        pilha.empilha("Item 2");
        assertEquals(2, pilha.tamanho());

        pilha.desempilha();
        assertEquals(1, pilha.tamanho());
    }
}