package ds;import ds.ArvoreBinaria;
import ds.Item;
import ds.MeuItem;
import ds.PermutacaoRandomica;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ArvoreBinariaTest23{


    @Test
    public void testInsercao() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(3);

        arvore.insere(item2);
        arvore.insere(item1);
        arvore.insere(item3);

        Assert.assertEquals(item1, arvore.pesquisa(item1));
        Assert.assertEquals(item2, arvore.pesquisa(item2));
        Assert.assertEquals(item3, arvore.pesquisa(item3));
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

        Assert.assertNull(arvore.pesquisa(item2));
        Assert.assertEquals(item1, arvore.pesquisa(item1));
        Assert.assertEquals(item3, arvore.pesquisa(item3));
    }

    @Test
    public void testPesquisa() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(3);

        arvore.insere(item2);
        arvore.insere(item1);
        arvore.insere(item3);

        Assert.assertEquals(item1, arvore.pesquisa(item1));
        Assert.assertEquals(item2, arvore.pesquisa(item2));
        Assert.assertEquals(item3, arvore.pesquisa(item3));
    }
}