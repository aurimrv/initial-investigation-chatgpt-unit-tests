
package ds;import ds.ArvoreBinaria;
import ds.Item;
import ds.MeuItem;
import ds.PermutacaoRandomica;
import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ArvoreBinariaTest11 {

    @Test
    public void testInserirItem() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        arvore.insere(item1);
        assertEquals(item1, arvore.pesquisa(item1));
    }

    @Test
    public void testPesquisarItemInexistente() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        assertNull(arvore.pesquisa(item1));
    }

    @Test
    public void testRemoverItem() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        arvore.insere(item1);
        arvore.retira(item1);
        assertNull(arvore.pesquisa(item1));
    }

    @Test
    public void testRemoverItemInexistente() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        arvore.retira(item1);
        assertNull(arvore.pesquisa(item1));
    }

    @Test
    public void testIntegridadeArvore() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        int max = 10;
        MeuItem x;
        int vetor[] = new int[max];

        for (int i = 0; i < max; i++)
            vetor[i] = i;

        // Gera uma permutacao aleatoria de chaves entre 0 e max-1
        PermutacaoRandomica.permut(vetor, max);

        // Insere cada chave na arvore e testa sua integridade apos cada insercao
        for (int i = 0; i < max; i++) {
            x = new MeuItem(vetor[i]);
            arvore.insere(x);
            arvore.testa();
        }

        // Retira uma chave aleatoriamente e realiza varias pesquisas
        for (int i = 0; i < max; i++) {
            Random rand = new Random();
            int k = rand.nextInt(10);
            int n = vetor[k];
            x = new MeuItem(n);
            arvore.retira(x);
            arvore.testa();
            for (int j = 0; j < max; j++) {
                x = new MeuItem(rand.nextInt(10));
                if (x.compara(new MeuItem(n)) != 0) {
                    arvore.pesquisa(x);
                }
            }
            x = new MeuItem(n);
            arvore.insere(x);
            arvore.testa();
        }

        // Retira a raiz da arvore ate que ela fique vazia
        for (int i = 0; i < max; i++) {
            x = new MeuItem(vetor[i]);
            arvore.retira(x);
            arvore.testa();
        }
    }
}