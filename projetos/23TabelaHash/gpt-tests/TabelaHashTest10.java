
package ds;import ds.MeuItem;
import ds.TabelaHash;
import org.junit.Test;

import static org.junit.Assert.*;

public class TabelaHashTest10 {

    @Test
    public void testPesquisa() {
        TabelaHash tabelaHash = new TabelaHash();
        MeuItem item1 = new MeuItem(1);
        MeuItem item2 = new MeuItem(2);
        MeuItem item3 = new MeuItem(3);

        tabelaHash.insere("chave1", item1);
        tabelaHash.insere("chave2", item2);
        tabelaHash.insere("chave3", item3);

        assertSame(item1, tabelaHash.pesquisa("chave1"));
        assertSame(item2, tabelaHash.pesquisa("chave2"));
        assertSame(item3, tabelaHash.pesquisa("chave3"));
        assertNull(tabelaHash.pesquisa("chave4"));
    }

    @Test
    public void testInsere() {
        TabelaHash tabelaHash = new TabelaHash();
        MeuItem item1 = new MeuItem(1);
        MeuItem item2 = new MeuItem(2);
        MeuItem item3 = new MeuItem(3);

        tabelaHash.insere("chave1", item1);
        tabelaHash.insere("chave2", item2);
        tabelaHash.insere("chave3", item3);

        assertSame(item1, tabelaHash.pesquisa("chave1"));
        assertSame(item2, tabelaHash.pesquisa("chave2"));
        assertSame(item3, tabelaHash.pesquisa("chave3"));
    }

    @Test
    public void testInsereDuplicatedKey() {
        TabelaHash tabelaHash = new TabelaHash();
        MeuItem item1 = new MeuItem(1);
        MeuItem item2 = new MeuItem(2);

        tabelaHash.insere("chave1", item1);
        tabelaHash.insere("chave2", item2);
        tabelaHash.insere("chave1", item2);

        assertSame(item1, tabelaHash.pesquisa("chave1"));
        assertSame(item2, tabelaHash.pesquisa("chave2"));
    }

    @Test
    public void testRetira() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        MeuItem item1 = new MeuItem(1);
        MeuItem item2 = new MeuItem(2);

        tabelaHash.insere("chave1", item1);
        tabelaHash.insere("chave2", item2);

        tabelaHash.retira("chave1");
        assertNull(tabelaHash.pesquisa("chave1"));
        assertSame(item2, tabelaHash.pesquisa("chave2"));
    }

    @Test(expected = Exception.class)
    public void testRetiraNonExistingKey() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.retira("chave1");
    }

    @Test
    public void testRecuperaItens() {
        TabelaHash tabelaHash = new TabelaHash();
        MeuItem item1 = new MeuItem(1);
        MeuItem item2 = new MeuItem(2);
        MeuItem item3 = new MeuItem(3);

        tabelaHash.insere("chave1", item1);
        tabelaHash.insere("chave2", item2);
        tabelaHash.insere("chave3", item3);

        Object[] result = tabelaHash.recuperaItens();
        assertEquals(3, result.length);
        assertSame(item1, result[0]);
        assertSame(item2, result[1]);
        assertSame(item3, result[2]);
    }

    @Test
    public void testRecuperaItensWithRemovedItems() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        MeuItem item1 = new MeuItem(1);
        MeuItem item2 = new MeuItem(2);
        MeuItem item3 = new MeuItem(3);

        tabelaHash.insere("chave1", item1);
        tabelaHash.insere("chave2", item2);
        tabelaHash.insere("chave3", item3);
        tabelaHash.retira("chave2");

        Object[] result = tabelaHash.recuperaItens();
        assertEquals(2, result.length);
        assertSame(item1, result[0]);
        assertSame(item3, result[1]);
    }
}
