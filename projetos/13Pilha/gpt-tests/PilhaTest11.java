
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest11 {

    @Test
    public void testPilhaVazia() {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
    }

    @Test
    public void testEmpilhaDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha("A");
        assertFalse(pilha.vazia());
        assertEquals(1, pilha.tamanho());
        assertEquals("A", pilha.desempilha());
        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
    }
  
    @Test(expected = Exception.class)
    public void testDesempilhaPilhaVazia() throws Exception {
        Pilha pilha = new Pilha();
        pilha.desempilha();
    }
  
    @Test(expected = Exception.class)
    public void testEmpilhaPilhaCheia() throws Exception {
        Pilha pilha = new Pilha();
        for (int i = 0; i < 1000; i++) {
            pilha.empilha(i);
        }
        pilha.empilha(1000);
    }

}