
package ds;import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.assertEquals;

public class TabelaHashTest5 {
    
    @Test
    public void testPesquisa() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");
        
        assertEquals("item1", tabela.pesquisa("chave1"));
        assertEquals("item2", tabela.pesquisa("chave2"));
        assertEquals("item3", tabela.pesquisa("chave3"));
        assertEquals(null, tabela.pesquisa("chave4"));
    }
    
    @Test
    public void testInsere() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");
        
        assertEquals("item1", tabela.pesquisa("chave1"));
        assertEquals("item2", tabela.pesquisa("chave2"));
        assertEquals("item3", tabela.pesquisa("chave3"));
    }
    
    @Test
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");
        
        tabela.retira("chave2");
        
        assertEquals("item1", tabela.pesquisa("chave1"));
        assertEquals(null, tabela.pesquisa("chave2"));
        assertEquals("item3", tabela.pesquisa("chave3"));
    }
    
    @Test
    public void testImprime() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");
        
        tabela.imprime();
    }
}