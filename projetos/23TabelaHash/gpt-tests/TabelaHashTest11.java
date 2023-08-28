
package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaHashTest11 {
  
  @Test
  public void testPesquisa() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave1", "item1");
    tabela.insere("chave2", "item2");
    tabela.insere("chave3", "item3");
    
    assertEquals("item1", tabela.pesquisa("chave1"));
    assertEquals("item2", tabela.pesquisa("chave2"));
    assertEquals("item3", tabela.pesquisa("chave3"));
    assertNull(tabela.pesquisa("chave4"));
  }
  
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
  public void testRetira() throws Exception {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave1", "item1");
    tabela.insere("chave2", "item2");
    tabela.insere("chave3", "item3");
    
    tabela.retira("chave2");
    
    assertEquals("item1", tabela.pesquisa("chave1"));
    assertNull(tabela.pesquisa("chave2"));
    assertEquals("item3", tabela.pesquisa("chave3"));
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
  public void testImprime() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave1", "item1");
    tabela.insere("chave2", "item2");
    tabela.insere("chave3", "item3");
    
    tabela.imprime();
  }
}