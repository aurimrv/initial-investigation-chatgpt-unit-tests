package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class TabelaHashTest19{


    @Test
    public void testPesquisaIndice() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        tabelaHash.insere("chave3", "item3");
        assertEquals(0, tabelaHash.pesquisaIndice("chave1"));
        assertEquals(1, tabelaHash.pesquisaIndice("chave2"));
        assertEquals(2, tabelaHash.pesquisaIndice("chave3"));
    }

    @Test
    public void testPesquisa() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        tabelaHash.insere("chave3", "item3");
        assertEquals("item1", tabelaHash.pesquisa("chave1"));
        assertEquals("item2", tabelaHash.pesquisa("chave2"));
        assertEquals("item3", tabelaHash.pesquisa("chave3"));
    }

    @Test
    public void testInsere() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        tabelaHash.insere("chave3", "item3");
        assertEquals("item1", tabelaHash.pesquisa("chave1"));
        assertEquals("item2", tabelaHash.pesquisa("chave2"));
        assertEquals("item3", tabelaHash.pesquisa("chave3"));
    }

    @Test
    public void testRetira() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        tabelaHash.insere("chave3", "item3");
        tabelaHash.retira("chave2");
        assertNull(tabelaHash.pesquisa("chave2"));
    }

    @Test
    public void testRecuperaItens() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        tabelaHash.insere("chave3", "item3");
        Object[] itens = tabelaHash.recuperaItens();
        assertEquals(3, itens.length);
        assertEquals("item1", itens[0]);
        assertEquals("item2", itens[1]);
        assertEquals("item3", itens[2]);
    }
}