package ds;import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.*;

public class TabelaHashTest18{

    
    @Test
    public void testPesquisa() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "item1");
        tabela.insere("key2", "item2");
        tabela.insere("key3", "item3");
        
        assertEquals("item1", tabela.pesquisa("key1"));
        assertEquals("item2", tabela.pesquisa("key2"));
        assertEquals("item3", tabela.pesquisa("key3"));
        assertNull(tabela.pesquisa("key4"));
    }
    
    @Test
    public void testInsere() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "item1");
        tabela.insere("key2", "item2");
        tabela.insere("key3", "item3");
        
        assertEquals("item1", tabela.pesquisa("key1"));
        assertEquals("item2", tabela.pesquisa("key2"));
        assertEquals("item3", tabela.pesquisa("key3"));
    }
    
    @Test
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "item1");
        tabela.insere("key2", "item2");
        tabela.insere("key3", "item3");
        
        tabela.retira("key2");
        
        assertEquals("item1", tabela.pesquisa("key1"));
        assertNull(tabela.pesquisa("key2"));
        assertEquals("item3", tabela.pesquisa("key3"));
    }
    
    @Test
    public void testRecuperaItens() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "item1");
        tabela.insere("key2", "item2");
        tabela.insere("key3", "item3");
        
        Object[] itens = tabela.recuperaItens();
        
        assertEquals(3, itens.length);
        assertArrayEquals(new Object[]{"item1", "item2", "item3"}, itens);
    }
    
    @Test
    public void testImprime() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "item1");
        tabela.insere("key2", "item2");
        tabela.insere("key3", "item3");
        
        tabela.imprime();
    }
}