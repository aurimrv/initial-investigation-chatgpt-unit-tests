
package ds;

import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.*;

public class TabelaHashTest11 {

    @Test
    public void testPesquisa() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        assertEquals("item1", tabela.pesquisa("chave1"));
        
        assertNull(tabela.pesquisa("chave2"));
    }
    
    @Test
    public void testInsere() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        
        assertEquals("item1", tabela.pesquisa("chave1"));
        assertEquals("item2", tabela.pesquisa("chave2"));
    }
    
    @Test
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.retira("chave1");
        
        assertNull(tabela.pesquisa("chave1"));
        assertEquals("item2", tabela.pesquisa("chave2"));
    }
    
    @Test
    public void testImprime() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        
        tabela.imprime();
        // Assuming that the output is printed in the correct format,
        // there is no easy way to validate the output using only Junit assertions.
        // You can manually check the output to see if it matches your expectations.
    }
}
