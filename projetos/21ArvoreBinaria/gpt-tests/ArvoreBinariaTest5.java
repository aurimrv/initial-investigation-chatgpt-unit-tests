
package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Random;

import ds.ArvoreBinaria;
import ds.Item;
import ds.PermutacaoRandomica;

public class ArvoreBinariaTest5 {

    @Test
    public void testInserir() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        arvore.insere(item1);
        assertEquals(item1, arvore.pesquisa(item1));
    }

    @Test
    public void testRemover() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.retira(item1);
        assertNull(arvore.pesquisa(item1));
    }

    @Test
    public void testPesquisar() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        arvore.insere(item1);
        arvore.insere(item2);
        assertEquals(item1, arvore.pesquisa(item1));
        assertEquals(item2, arvore.pesquisa(item2));
    }

    @Test
    public void testPermutar() {
        int max = 10;
        Item vetor[] = new Item[max];
        for (int i = 0; i < max; i++) {
            vetor[i] = new MeuItem(i);
        }
        PermutacaoRandomica.permut(vetor, max);
        for (int i = 0; i < max; i++) {
            assertNotNull(vetor[i]);
        }
    }

    @Test
    public void testIntegridade() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        int max = 10;
        Item vetor[] = new Item[max];
        for (int i = 0; i < max; i++) {
            vetor[i] = new MeuItem(i);
        }
        PermutacaoRandomica.permut(vetor, max);
        for (int i = 0; i < max; i++) {
            arvore.insere(vetor[i]);
            arvore.testa();
        }
    }
}