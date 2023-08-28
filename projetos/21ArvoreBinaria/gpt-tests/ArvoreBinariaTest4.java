
package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;
import ds.ArvoreBinaria;
import ds.Item;
import ds.MeuItem;
import ds.PermutacaoRandomica;

public class ArvoreBinariaTest4 {

    @Test
    public void testPesquisa() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        MeuItem item1 = new MeuItem(3);
        MeuItem item2 = new MeuItem(5);
        MeuItem item3 = new MeuItem(2);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        Item result = arvore.pesquisa(item2);
        assertEquals(item2, result);
    }

    @Test
    public void testInsere() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        MeuItem item1 = new MeuItem(3);
        MeuItem item2 = new MeuItem(5);
        arvore.insere(item1);
        arvore.insere(item2);
        Item result = arvore.pesquisa(item2);
        assertEquals(item2, result);
    }

    @Test
    public void testRetira() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        MeuItem item1 = new MeuItem(3);
        MeuItem item2 = new MeuItem(5);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.retira(item2);
        Item result = arvore.pesquisa(item2);
        assertNull(result);
    }

    @Test
    public void testTesta() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        MeuItem item1 = new MeuItem(3);
        MeuItem item2 = new MeuItem(5);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.testa();
    }
}