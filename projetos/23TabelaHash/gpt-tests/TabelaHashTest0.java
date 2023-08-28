
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaHashTest0 {

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
        assertNull(tabela.pesquisa("key2"));
    }

    @Test
    public void testRecuperaItens() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        tabela.insere("key3", "value3");
        
        Object[] itens = tabela.recuperaItens();
        assertEquals(3, itens.length);
        assertEquals("value1", itens[0]);
        assertEquals("value2", itens[1]);
        assertEquals("value3", itens[2]);
    }
}
