package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Random;

public class TabelaHashTest21{


    @Test
    public void testPesquisaIndice() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");

        int indice = tabela.pesquisaIndice("chave2");

        assertEquals(1, indice);
    }

    @Test
    public void testPesquisa() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");

        Object item = tabela.pesquisa("chave2");

        assertEquals("item2", item);
    }

    @Test
    public void testInsere() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");

        Object item = tabela.pesquisa("chave3");

        assertEquals("item3", item);
    }

    @Test
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");

        tabela.retira("chave2");

        Object item = tabela.pesquisa("chave2");

        assertNull(item);
    }

    @Test
    public void testRecuperaItens() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");

        Object[] itens = tabela.recuperaItens();

        assertEquals(3, itens.length);
        assertEquals("item1", itens[0]);
        assertEquals("item2", itens[1]);
        assertEquals("item3", itens[2]);
    }

}