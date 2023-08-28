
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest10 {

    @Test
    public void testEmpilha() {
        Pilha p = new Pilha();
        p.empilha("item1");
        p.empilha("item2");
        p.empilha("item3");

        assertEquals(3, p.tamanho());
    }

    @Test
    public void testDesempilha() throws Exception {
        Pilha p = new Pilha();
        p.empilha("item1");
        p.empilha("item2");
        p.empilha("item3");

        assertEquals("item3", p.desempilha());
        assertEquals("item2", p.desempilha());
        assertEquals("item1", p.desempilha());

        assertTrue(p.vazia());
    }

    @Test(expected = Exception.class)
    public void testDesempilhaException() throws Exception {
        Pilha p = new Pilha();
        p.desempilha();
    }

    @Test
    public void testVazia() {
        Pilha p = new Pilha();
        assertTrue(p.vazia());

        p.empilha("item1");
        assertFalse(p.vazia());

        p.desempilha();
        assertTrue(p.vazia());
    }

    @Test
    public void testTamanho() {
        Pilha p = new Pilha();
        assertEquals(0, p.tamanho());

        p.empilha("item1");
        assertEquals(1, p.tamanho());

        p.empilha("item2");
        assertEquals(2, p.tamanho());

        p.desempilha();
        assertEquals(1, p.tamanho());

        p.desempilha();
        assertEquals(0, p.tamanho());
    }
}