
package ds;import ds.TabelaHash;
import ds.Item;
import ds.MeuItem;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;
import static org.junit.Assert.*;

public class TabelaHashTest9 {
    
    @Test
    public void testPesquisaIndice() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", new MeuItem(1));
        tabela.insere("chave2", new MeuItem(2));
        tabela.insere("chave3", new MeuItem(3));
        
        int expected1 = 1;
        int expected2 = 2;
        int expected3 = 3;
        int expected4 = tabela.getM();
        
        int result1 = tabela.pesquisaIndice("chave1");
        int result2 = tabela.pesquisaIndice("chave2");
        int result3 = tabela.pesquisaIndice("chave3");
        int result4 = tabela.pesquisaIndice("chave4");
        
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
        assertEquals(expected4, result4);
    }
    
    @Test
    public void testPesquisa() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", new MeuItem(1));
        tabela.insere("chave2", new MeuItem(2));
        tabela.insere("chave3", new MeuItem(3));
        
        MeuItem expected1 = new MeuItem(1);
        MeuItem expected2 = new MeuItem(2);
        MeuItem expected3 = new MeuItem(3);
        MeuItem expected4 = null;
        
        MeuItem result1 = (MeuItem) tabela.pesquisa("chave1");
        MeuItem result2 = (MeuItem) tabela.pesquisa("chave2");
        MeuItem result3 = (MeuItem) tabela.pesquisa("chave3");
        MeuItem result4 = (MeuItem) tabela.pesquisa("chave4");
        
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
        assertEquals(expected4, result4);
    }
    
    @Test
    public void testInsere() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", new MeuItem(1));
        tabela.insere("chave2", new MeuItem(2));
        
        MeuItem expected1 = new MeuItem(1);
        MeuItem expected2 = new MeuItem(2);
        
        MeuItem result1 = (MeuItem) tabela.pesquisa("chave1");
        MeuItem result2 = (MeuItem) tabela.pesquisa("chave2");
        
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
    }
    
    @Test
    public void testInsereAlreadyPresent() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", new MeuItem(1));
        
        tabela.insere("chave1", new MeuItem(2));
        
        MeuItem expected = new MeuItem(1);
        
        MeuItem result = (MeuItem) tabela.pesquisa("chave1");
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", new MeuItem(1));
        tabela.insere("chave2", new MeuItem(2));
        
        tabela.retira("chave1");
        
        MeuItem expected = null;
        
        MeuItem result = (MeuItem) tabela.pesquisa("chave1");
        
        assertEquals(expected, result);
    }
    
    @Test(expected = Exception.class)
    public void testRetiraNonExisting() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", new MeuItem(1));
        tabela.insere("chave2", new MeuItem(2));
        
        tabela.retira("chave3");
    }
    
    @Test
    public void testRecuperaItens() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", new MeuItem(1));
        tabela.insere("chave2", new MeuItem(2));
        tabela.insere("chave3", new MeuItem(3));
        
        Object[] expected = new Object[]{new MeuItem(1), new MeuItem(2), new MeuItem(3)};
        
        Object[] result = tabela.recuperaItens();
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testImprime() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", new MeuItem(1));
        tabela.insere("chave2", new MeuItem(2));
        tabela.insere("chave3", new MeuItem(3));
        
        String expected = "  1\n" +
                          "  2\n" +
                          "  3\n";
                          
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        tabela.imprime();
        
        String result = outContent.toString();
        
        assertEquals(expected, result);
    }
}