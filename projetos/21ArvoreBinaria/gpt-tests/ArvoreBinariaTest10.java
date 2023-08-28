
package ds;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArvoreBinariaTest10 {

    @Test
    public void testInsercao() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(3);

        arvore.insere(item2);
        arvore.insere(item1);
        arvore.insere(item3);

        assertEquals(item1, arvore.pesquisa(item1));
        assertEquals(item2, arvore.pesquisa(item2));
        assertEquals(item3, arvore.pesquisa(item3));
    }

    @Test
    public void testRemocao() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(3);

        arvore.insere(item2);
        arvore.insere(item1);
        arvore.insere(item3);

        arvore.retira(item2);

        assertNull(arvore.pesquisa(item2));
        assertEquals(item1, arvore.pesquisa(item1));
        assertEquals(item3, arvore.pesquisa(item3));
    }

    @Test
    public void testArvoreVazia() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(1);

        assertNull(arvore.pesquisa(item));
    }

    @Test
    public void testArvoreBalanceada() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(3);
        Item item4 = new MeuItem(4);
        Item item5 = new MeuItem(5);
        Item item6 = new MeuItem(6);

        arvore.insere(item3);
        arvore.insere(item2);
        arvore.insere(item1);
        arvore.insere(item5);
        arvore.insere(item4);
        arvore.insere(item6);

        assertEquals(item1, arvore.pesquisa(item1));
        assertEquals(item2, arvore.pesquisa(item2));
        assertEquals(item3, arvore.pesquisa(item3));
        assertEquals(item4, arvore.pesquisa(item4));
        assertEquals(item5, arvore.pesquisa(item5));
        assertEquals(item6, arvore.pesquisa(item6));
    }
}
