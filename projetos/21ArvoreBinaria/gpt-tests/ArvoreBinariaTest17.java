package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Random;

public class ArvoreBinariaTest17{


    @Test
    public void testPesquisa() {
        ArvoreBinaria arvore = new ArvoreBinaria();

        // Criação dos itens
        MeuItem item1 = new MeuItem(1);
        MeuItem item2 = new MeuItem(2);
        MeuItem item3 = new MeuItem(3);

        // Inserção dos itens na árvore
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);

        // Pesquisa por itens existentes
        assertEquals(item1, arvore.pesquisa(item1));
        assertEquals(item2, arvore.pesquisa(item2));
        assertEquals(item3, arvore.pesquisa(item3));

        // Pesquisa por item não existente
        assertNull(arvore.pesquisa(new MeuItem(4)));
    }

    @Test
    public void testInsere() {
        ArvoreBinaria arvore = new ArvoreBinaria();

        // Criação dos itens
        MeuItem item1 = new MeuItem(1);
        MeuItem item2 = new MeuItem(2);
        MeuItem item3 = new MeuItem(3);

        // Inserção dos itens na árvore
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);

        // Verifica se os itens foram inseridos corretamente
        assertEquals(item1, arvore.pesquisa(item1));
        assertEquals(item2, arvore.pesquisa(item2));
        assertEquals(item3, arvore.pesquisa(item3));
    }

    @Test
    public void testRetira() {
        ArvoreBinaria arvore = new ArvoreBinaria();

        // Criação dos itens
        MeuItem item1 = new MeuItem(1);
        MeuItem item2 = new MeuItem(2);
        MeuItem item3 = new MeuItem(3);

        // Inserção dos itens na árvore
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);

        // Retira um item da árvore
        arvore.retira(item2);

        // Verifica se o item foi removido corretamente
        assertNull(arvore.pesquisa(item2));
    }

    @Test
    public void testTesta() {
        ArvoreBinaria arvore = new ArvoreBinaria();

        // Criação dos itens
        MeuItem item1 = new MeuItem(1);
        MeuItem item2 = new MeuItem(2);
        MeuItem item3 = new MeuItem(3);

        // Inserção dos itens na árvore
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);

        // Verifica a integridade da árvore
        arvore.testa();
    }
}