package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Random;

public class TabelaHashTest13{


    @Test
    public void testPesquisa() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("abc", 1);
        tabela.insere("def", 2);
        tabela.insere("ghi", 3);

        assertEquals(1, tabela.pesquisa("abc"));
        assertEquals(2, tabela.pesquisa("def"));
        assertEquals(3, tabela.pesquisa("ghi"));
        assertNull(tabela.pesquisa("jkl"));
    }

    @Test
    public void testInsere() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("abc", 1);
        tabela.insere("def", 2);
        tabela.insere("ghi", 3);

        assertEquals(1, tabela.pesquisa("abc"));
        assertEquals(2, tabela.pesquisa("def"));
        assertEquals(3, tabela.pesquisa("ghi"));
    }

    @Test
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("abc", 1);
        tabela.insere("def", 2);
        tabela.insere("ghi", 3);

        tabela.retira("def");

        assertEquals(1, tabela.pesquisa("abc"));
        assertNull(tabela.pesquisa("def"));
        assertEquals(3, tabela.pesquisa("ghi"));
    }

    @Test(expected = Exception.class)
    public void testRetiraException() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("abc", 1);
        tabela.insere("def", 2);
        tabela.insere("ghi", 3);

        tabela.retira("jkl");
    }

    @Test
    public void testImprime() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("abc", 1);
        tabela.insere("def", 2);
        tabela.insere("ghi", 3);

        tabela.imprime();
    }
}