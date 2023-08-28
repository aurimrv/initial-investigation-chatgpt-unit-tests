package ds;import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ArvoreBinariaTest12{


    @Test
    public void testInsere() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(5);
        arvore.insere(item);
        assertEquals(item, arvore.pesquisa(item));
    }

    @Test
    public void testRetira() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(10);
        arvore.insere(item);
        arvore.retira(item);
        assertNull(arvore.pesquisa(item));
    }

    @Test
    public void testPesquisa() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(15);
        arvore.insere(item);
        assertEquals(item, arvore.pesquisa(item));
    }

    @Test
    public void testPesquisaNotFound() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(20);
        assertNull(arvore.pesquisa(item));
    }

    @Test
    public void testEmptyTree() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        assertNull(arvore.pesquisa(new MeuItem(1)));
    }

    @Test
    public void testArvoreIntegrity() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.insere(new MeuItem(5));
        arvore.insere(new MeuItem(3));
        arvore.insere(new MeuItem(7));
        arvore.insere(new MeuItem(2));
        arvore.insere(new MeuItem(4));
        arvore.insere(new MeuItem(6));
        arvore.insere(new MeuItem(8));
        arvore.testa();
    }
}