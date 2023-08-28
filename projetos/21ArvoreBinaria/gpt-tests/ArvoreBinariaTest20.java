package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

public class ArvoreBinariaTest20{


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

        assertEquals(item1, arvore.pesquisa(item1));
        assertEquals(item2, arvore.pesquisa(item2));
        assertEquals(item3, arvore.pesquisa(item3));
    }

    @Test
    public void testIntegridade() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(3);

        arvore.insere(item2);
        arvore.insere(item1);
        arvore.insere(item3);

        arvore.testa();
    }

    @Test
    public void testPermutacao() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        int max = 10;
        MeuItem x;
        int vetor[] = new int[max];

        for (int i = 0; i < max; i++)
            vetor[i] = i;

        PermutacaoRandomica.permut(vetor, max);

        for (int i = 0; i < max; i++) {
            x = new MeuItem(vetor[i]);
            arvore.insere(x);
            arvore.testa();
        }

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
                    x = (MeuItem) arvore.pesquisa(x);
                }
            }
            x = new MeuItem(n);
            arvore.insere(x);
            arvore.testa();
        }

        for (int i = 0; i < max; i++) {
            x = new MeuItem(vetor[i]);
            arvore.retira(x);
            arvore.testa();
        }
    }
}