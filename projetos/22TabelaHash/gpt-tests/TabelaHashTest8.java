
package ds;import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class TabelaHashTest8 {

    @Test
    public void testPesquisa() {
        TabelaHash tabelaHash = new TabelaHash();
        
        tabelaHash.insere("chave1", 10);
        tabelaHash.insere("chave2", 20);
        tabelaHash.insere("chave3", 30);

        Assert.assertEquals(10, tabelaHash.pesquisa("chave1"));
        Assert.assertEquals(20, tabelaHash.pesquisa("chave2"));
        Assert.assertEquals(30, tabelaHash.pesquisa("chave3"));
        Assert.assertNull(tabelaHash.pesquisa("chave4"));
    }

    @Test
    public void testInsere() {
        TabelaHash tabelaHash = new TabelaHash();
        
        tabelaHash.insere("chave1", 10);
        tabelaHash.insere("chave2", 20);
        tabelaHash.insere("chave3", 30);
        
        Assert.assertEquals(10, tabelaHash.pesquisa("chave1"));
        Assert.assertEquals(20, tabelaHash.pesquisa("chave2"));
        Assert.assertEquals(30, tabelaHash.pesquisa("chave3"));
    }

    @Test
    public void testRetira() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        
        tabelaHash.insere("chave1", 10);
        tabelaHash.insere("chave2", 20);
        tabelaHash.insere("chave3", 30);

        tabelaHash.retira("chave1");
        tabelaHash.retira("chave3");

        Assert.assertNull(tabelaHash.pesquisa("chave1"));
        Assert.assertEquals(20, tabelaHash.pesquisa("chave2"));
        Assert.assertNull(tabelaHash.pesquisa("chave3"));
    }

    @Test
    public void testImprime() {
        TabelaHash tabelaHash = new TabelaHash();
        
        tabelaHash.insere("chave1", 10);
        tabelaHash.insere("chave2", 20);
        tabelaHash.insere("chave3", 30);
        
        tabelaHash.imprime();
    }
}