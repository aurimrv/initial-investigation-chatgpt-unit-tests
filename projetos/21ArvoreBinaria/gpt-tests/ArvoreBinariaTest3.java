
package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Random;

import ds.ArvoreBinaria;
import ds.Item;
import ds.MeuItem;
import ds.PermutacaoRandomica;

public class ArvoreBinariaTest3 {

    @Test
    public void testPesquisa() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(3);

        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);

        assertEquals(item2, arvore.pesquisa(item2));
        assertNull(arvore.pesquisa(new MeuItem(4)));
    }

    @Test
    public void testInsere() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(3);

        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);

        assertNotNull(arvore.pesquisa(item1));
        assertNotNull(arvore.pesquisa(item2));
        assertNotNull(arvore.pesquisa(item3));
    }

    @Test
    public void testRetira() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(3);

        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);

        arvore.retira(item2);

        assertNotNull(arvore.pesquisa(item1));
        assertNull(arvore.pesquisa(item2));
        assertNotNull(arvore.pesquisa(item3));
    }

    @Test
    public void testRetiraWithMultipleItems() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(3);

        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);

        arvore.retira(item2);
        arvore.retira(item1);
        arvore.retira(item3);

        assertNull(arvore.pesquisa(item1));
        assertNull(arvore.pesquisa(item2));
        assertNull(arvore.pesquisa(item3));
    }

    @Test
    public void testPermut() {
        Item[] items = new Item[5];
        items[0] = new MeuItem(1);
        items[1] = new MeuItem(2);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(4);
        items[4] = new MeuItem(5);

        PermutacaoRandomica.permut(items, 5);

        assertEquals(5, items.length);
    }
}