
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaHashTest9 {

  @Test
  public void testPesquisa() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("key1", "value1");
    tabela.insere("key2", "value2");
    
    assertEquals("value1", tabela.pesquisa("key1"));
    assertEquals("value2", tabela.pesquisa("key2"));
    assertNull(tabela.pesquisa("key3"));
  }
  
  @Test
  public void testInsere() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("key1", "value1");
    tabela.insere("key2", "value2");
    
    assertEquals("value1", tabela.pesquisa("key1"));
    assertEquals("value2", tabela.pesquisa("key2"));
  }
  
  @Test
  public void testInsereDuplicate() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("key1", "value1");
    tabela.insere("key1", "value2");
    
    assertEquals("value1", tabela.pesquisa("key1"));
  }
  
  @Test
  public void testRetira() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("key1", "value1");
    tabela.insere("key2", "value2");
    
    tabela.retira("key1");
    assertNull(tabela.pesquisa("key1"));
    assertEquals("value2", tabela.pesquisa("key2"));
  }
}
