package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaHashTest15{


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
    public void testRetira() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        
        tabela.retira("chave1");
        assertNull(tabela.pesquisa("chave1"));
        assertNotNull(tabela.pesquisa("chave2"));
    }

    @Test
    public void testRecuperaItens() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");
        
        Object[] itens = tabela.recuperaItens();
        assertEquals(3, itens.length);
        assertEquals("item1", itens[0]);
        assertEquals("item2", itens[1]);
        assertEquals("item3", itens[2]);
    }

    @Test
    public void testPesquisa() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        
        assertEquals("item1", tabela.pesquisa("chave1"));
        assertEquals("item2", tabela.pesquisa("chave2"));
        assertNull(tabela.pesquisa("chave3"));
    }
}