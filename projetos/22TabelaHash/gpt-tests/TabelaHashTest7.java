
package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

public class TabelaHashTest7 {

    @Test
    public void testPesquisa() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("abc", "Item 1");
        tabela.insere("def", "Item 2");
        tabela.insere("ghi", "Item 3");
        
        assertEquals("Item 1", tabela.pesquisa("abc"));
        assertEquals("Item 2", tabela.pesquisa("def"));
        assertEquals("Item 3", tabela.pesquisa("ghi"));
        assertNull(tabela.pesquisa("jkl"));
    }

    @Test
    public void testInsere() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("abc", "Item 1");
        tabela.insere("def", "Item 2");
        
        assertEquals("Item 1", tabela.pesquisa("abc"));
        assertEquals("Item 2", tabela.pesquisa("def"));
        assertNull(tabela.pesquisa("ghi"));
    }

    @Test
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("abc", "Item 1");
        tabela.insere("def", "Item 2");
        
        tabela.retira("abc");
        assertNull(tabela.pesquisa("abc"));
        assertEquals("Item 2", tabela.pesquisa("def"));
        
        tabela.retira("def");
        assertNull(tabela.pesquisa("def"));
    }

    @Test(expected = Exception.class)
    public void testRetiraException() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.retira("abc");
    }

    @Test
    public void testImprime() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("abc", "Item 1");
        tabela.insere("def", "Item 2");
        tabela.insere("ghi", "Item 3");
        
        tabela.imprime();
    }

    @Test
    public void testGerapesos() {
        TabelaHash tabela = new TabelaHash();
        int[] pesos = tabela.geraPesos(5);
        
        assertNotNull(pesos);
        assertEquals(5, pesos.length);
    }

    @Test
    public void testH() {
        TabelaHash tabela = new TabelaHash();
        int[] pesos = {2, 3, 4};
        
        String chave1 = "abc";
        String chave2 = "def";
        String chave3 = "ghi";
        
        assertEquals(9, tabela.h(chave1, pesos));
        assertEquals(22, tabela.h(chave2, pesos));
        assertEquals(37, tabela.h(chave3, pesos));
    }
}