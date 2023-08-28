package ds;import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PilhaTest15{


    private Pilha pilha;

    @Before
    public void setUp() {
        pilha = new Pilha();
    }

    @Test
    public void testEmpilha() throws Exception {
        pilha.empilha(5);
        Assert.assertEquals(1, pilha.tamanho());
    }

    @Test
    public void testDesempilha() throws Exception {
        pilha.empilha(5);
        Object result = pilha.desempilha();
        Assert.assertEquals(0, pilha.tamanho());
        Assert.assertEquals(5, result);
    }

    @Test(expected = Exception.class)
    public void testDesempilhaVazia() throws Exception {
        pilha.desempilha();
    }

    @Test
    public void testVazia() {
        Assert.assertTrue(pilha.vazia());
        pilha.empilha(5);
        Assert.assertFalse(pilha.vazia());
    }

    @Test
    public void testTamanho() {
        Assert.assertEquals(0, pilha.tamanho());
        pilha.empilha(5);
        Assert.assertEquals(1, pilha.tamanho());
        pilha.empilha(10);
        Assert.assertEquals(2, pilha.tamanho());
    }
}