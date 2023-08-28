package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Random;

public class TabelaHashTest17{


    @Test
    public void testPesquisa() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "valor1");
        tabela.insere("chave2", "valor2");
        tabela.insere("chave3", "valor3");

        assertEquals("valor1", tabela.pesquisa("chave1"));
        assertEquals("valor2", tabela.pesquisa("chave2"));
        assertEquals("valor3", tabela.pesquisa("chave3"));
        assertNull(tabela.pesquisa("chave4"));
    }

    @Test
    public void testInsere() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "valor1");
        tabela.insere("chave2", "valor2");
        tabela.insere("chave3", "valor3");

        assertEquals("valor1", tabela.pesquisa("chave1"));
        assertEquals("valor2", tabela.pesquisa("chave2"));
        assertEquals("valor3", tabela.pesquisa("chave3"));
    }

    @Test
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "valor1");
        tabela.insere("chave2", "valor2");
        tabela.insere("chave3", "valor3");

        tabela.retira("chave2");
        assertNull(tabela.pesquisa("chave2"));
        assertNotNull(tabela.pesquisa("chave1"));
        assertNotNull(tabela.pesquisa("chave3"));
    }

    @Test(expected = Exception.class)
    public void testRetiraInvalidKey() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "valor1");
        tabela.insere("chave2", "valor2");
        tabela.insere("chave3", "valor3");

        tabela.retira("chave4");
    }

    @Test
    public void testImprime() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "valor1");
        tabela.insere("chave2", "valor2");
        tabela.insere("chave3", "valor3");

        tabela.imprime();
    }
}