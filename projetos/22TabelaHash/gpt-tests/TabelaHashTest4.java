
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaHashTest4 {

    @Test
    public void testPesquisa() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        tabelaHash.insere("chave3", "item3");

        assertEquals("item1", tabelaHash.pesquisa("chave1"));
        assertEquals("item2", tabelaHash.pesquisa("chave2"));
        assertEquals("item3", tabelaHash.pesquisa("chave3"));
        assertNull(tabelaHash.pesquisa("chave4"));
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

        assertEquals("item1", tabelaHash.pesquisa("chave1"));
        assertNull(tabelaHash.pesquisa("chave2"));
        assertEquals("item3", tabelaHash.pesquisa("chave3"));
    }

    @Test
    public void testImprime() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        tabelaHash.insere("chave3", "item3");

        tabelaHash.imprime();
    }
}