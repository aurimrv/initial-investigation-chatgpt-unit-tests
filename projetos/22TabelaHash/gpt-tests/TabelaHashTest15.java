package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaHashTest15{


    @Test
    public void testPesquisaExistingKey() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        tabela.insere("key3", "value3");
        
        Object result = tabela.pesquisa("key2");
        
        assertEquals("value2", result);
    }
    
    @Test
    public void testPesquisaNonExistingKey() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        tabela.insere("key3", "value3");
        
        Object result = tabela.pesquisa("key4");
        
        assertNull(result);
    }
    
    @Test
    public void testInsereNewKey() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        
        Object result = tabela.pesquisa("key2");
        
        assertEquals("value2", result);
    }
    
    @Test
    public void testInsereExistingKey() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        
        tabela.insere("key1", "value2");
        
        Object result = tabela.pesquisa("key1");
        
        assertEquals("value1", result);
    }
    
    @Test
    public void testRetiraExistingKey() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        tabela.insere("key3", "value3");
        
        tabela.retira("key2");
        
        Object result = tabela.pesquisa("key2");
        
        assertNull(result);
    }
    
    @Test
    public void testRetiraNonExistingKey() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        tabela.insere("key3", "value3");
        
        tabela.retira("key4");
        
        Object result = tabela.pesquisa("key4");
        
        assertNull(result);
    }
    
    @Test
    public void testImprimeEmptyTable() {
        TabelaHash tabela = new TabelaHash();
        
        tabela.imprime();
        
        // No assertion needed, just checking if it runs without errors
    }
    
    @Test
    public void testImprimeNonEmptyTable() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        tabela.insere("key3", "value3");
        
        tabela.imprime();
        
        // No assertion needed, just checking if it runs without errors
    }
}