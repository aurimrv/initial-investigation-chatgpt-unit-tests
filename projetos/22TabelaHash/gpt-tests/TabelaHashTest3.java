
package ds;import static org.junit.Assert.*;
import ds.*;

import org.junit.Before;
import org.junit.Test;

public class TabelaHashTest3 {
    
    private TabelaHash tabela;
    
    @Before
    public void setUp() {
        tabela = new TabelaHash();
    }
    
    @Test
    public void testPesquisa() {
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");
        
        assertEquals("item1", tabela.pesquisa("chave1"));
        assertEquals("item2", tabela.pesquisa("chave2"));
        assertEquals("item3", tabela.pesquisa("chave3"));
    }
    
    @Test
    public void testInsere() {
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");
        
        assertEquals("item1", tabela.pesquisa("chave1"));
        assertEquals("item2", tabela.pesquisa("chave2"));
        assertEquals("item3", tabela.pesquisa("chave3"));
    }
    
    @Test
    public void testRetira() throws Exception {
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");
        
        tabela.retira("chave1");
        tabela.retira("chave2");
        
        assertNull(tabela.pesquisa("chave1"));
        assertNull(tabela.pesquisa("chave2"));
        assertEquals("item3", tabela.pesquisa("chave3"));
    }
    
    @Test(expected = Exception.class)
    public void testRetiraException() throws Exception {
        tabela.insere("chave1", "item1");
        tabela.retira("chave2");
    }
    
    @Test
    public void testImprime() {
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");
        
        tabela.imprime();
    }
}