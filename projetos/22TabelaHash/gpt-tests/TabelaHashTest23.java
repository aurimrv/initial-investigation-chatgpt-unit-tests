package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class TabelaHashTest23{


    @Test
    public void testPesquisa() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        tabela.insere("key3", "value3");

        assertEquals("value1", tabela.pesquisa("key1"));
        assertEquals("value2", tabela.pesquisa("key2"));
        assertEquals("value3", tabela.pesquisa("key3"));
        assertNull(tabela.pesquisa("key4"));
    }

    @Test
    public void testInsere() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        tabela.insere("key3", "value3");

        assertEquals("value1", tabela.pesquisa("key1"));
        assertEquals("value2", tabela.pesquisa("key2"));
        assertEquals("value3", tabela.pesquisa("key3"));
    }

    @Test
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        tabela.insere("key3", "value3");

        tabela.retira("key2");
        assertNull(tabela.pesquisa("key2"));
        assertEquals("value1", tabela.pesquisa("key1"));
        assertEquals("value3", tabela.pesquisa("key3"));

        tabela.retira("key1");
        assertNull(tabela.pesquisa("key1"));
        assertEquals("value3", tabela.pesquisa("key3"));

        tabela.retira("key3");
        assertNull(tabela.pesquisa("key3"));
    }

    @Test
    public void testImprime() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        tabela.insere("key3", "value3");

        tabela.imprime();
    }
}