
package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;
import ds.TabelaHash;
import ds.Item;
import ds.MeuItem;

public class TabelaHashTest0 {

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
    public void testRetira() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        tabela.insere("key3", "value3");
        
        tabela.retira("key2");
        
        assertEquals("value1", tabela.pesquisa("key1"));
        assertNull(tabela.pesquisa("key2"));
        assertEquals("value3", tabela.pesquisa("key3"));
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