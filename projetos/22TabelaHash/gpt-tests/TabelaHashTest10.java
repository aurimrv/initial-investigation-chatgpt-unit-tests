
package ds;import ds.TabelaHash;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class TabelaHashTest10 {

    @Test
    public void testPesquisa() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        tabelaHash.insere("chave3", "item3");

        Object result = tabelaHash.pesquisa("chave2");
        Assert.assertEquals("item2", result);

        Object result2 = tabelaHash.pesquisa("chave4");
        Assert.assertNull(result2);
    }

    @Test
    public void testInsere() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");

        Object result = tabelaHash.pesquisa("chave1");
        Assert.assertEquals("item1", result);

        Object result2 = tabelaHash.pesquisa("chave2");
        Assert.assertNull(result2);
    }

    @Test
    public void testRetira() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");

        tabelaHash.retira("chave1");

        Object result = tabelaHash.pesquisa("chave1");
        Assert.assertNull(result);

        Object result2 = tabelaHash.pesquisa("chave2");
        Assert.assertEquals("item2", result2);
    }
}