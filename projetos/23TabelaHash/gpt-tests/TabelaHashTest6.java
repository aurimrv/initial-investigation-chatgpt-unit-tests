
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaHashTest6 {

    @Test
    public void testInsere() {
        TabelaHash tabela = new TabelaHash();

        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        tabela.insere("key3", "value3");

        assertEquals("value1", tabela.pesquisa("key1"));
        assertEquals("value2", tabela.pesquisa("key2"));
        assertEquals("value3", tabela.pesquisa("key3"));

        tabela.insere("key2", "updatedValue2");

        assertEquals("updatedValue2", tabela.pesquisa("key2"));
    }

    @Test
    public void testRetira() {
        TabelaHash tabela = new TabelaHash();

        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        tabela.insere("key3", "value3");

        tabela.retira("key2");

        assertNull(tabela.pesquisa("key2"));

        tabela.retira("key4");

        assertNull(tabela.pesquisa("key4"));
    }

    @Test
    public void testRecuperaItens() {
        TabelaHash tabela = new TabelaHash();

        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        tabela.insere("key3", "value3");

        Object[] items = tabela.recuperaItens();

        assertEquals(3, items.length);
        assertEquals("value1", items[0]);
        assertEquals("value2", items[1]);
        assertEquals("value3", items[2]);
    }
}