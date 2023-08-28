
package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.TabelaHash;

public class TabelaHashTest8 {
  
  @Test
  public void testInserir() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave1", "item1");
    tabela.insere("chave2", "item2");
    tabela.insere("chave3", "item3");
    assertEquals("item1", tabela.pesquisa("chave1"));
    assertEquals("item2", tabela.pesquisa("chave2"));
    assertEquals("item3", tabela.pesquisa("chave3"));
  }
  
  @Test
  public void testPesquisaInexistente() {
    TabelaHash tabela = new TabelaHash();
    assertEquals(null, tabela.pesquisa("chave1"));
    assertEquals(null, tabela.pesquisa("chave2"));
    assertEquals(null, tabela.pesquisa("chave3"));
  }
  
  @Test
  public void testRetirar() throws Exception {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave1", "item1");
    tabela.insere("chave2", "item2");
    tabela.insere("chave3", "item3");
    tabela.retira("chave2");
    assertEquals("item1", tabela.pesquisa("chave1"));
    assertEquals(null, tabela.pesquisa("chave2"));
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
  public void testTabelaCheia() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave1", "item1");
    tabela.insere("chave2", "item2");
    tabela.insere("chave3", "item3");
    tabela.insere("chave4", "item4");
    tabela.insere("chave5", "item5");
    tabela.insere("chave6", "item6");
    tabela.insere("chave7", "item7");
    assertEquals("item1", tabela.pesquisa("chave1"));
    assertEquals("item2", tabela.pesquisa("chave2"));
    assertEquals("item3", tabela.pesquisa("chave3"));
    assertEquals("item4", tabela.pesquisa("chave4"));
    assertEquals("item5", tabela.pesquisa("chave5"));
    assertEquals("item6", tabela.pesquisa("chave6"));
    assertEquals("item7", tabela.pesquisa("chave7"));
  }
  
  @Test
  public void testPesquisaRegistroJaPresente() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave1", "item1");
    tabela.insere("chave2", "item2");
    tabela.insere("chave3", "item3");
    tabela.insere("chave4", "item4");
    tabela.insere("chave5", "item5");
    tabela.insere("chave6", "item6");
    tabela.insere("chave7", "item7");
    tabela.insere("chave8", "item8");
    assertEquals("item1", tabela.pesquisa("chave1"));
    assertEquals("item2", tabela.pesquisa("chave2"));
    assertEquals("item3", tabela.pesquisa("chave3"));
    assertEquals("item4", tabela.pesquisa("chave4"));
    assertEquals("item5", tabela.pesquisa("chave5"));
    assertEquals("item6", tabela.pesquisa("chave6"));
    assertEquals("item7", tabela.pesquisa("chave7"));
    assertEquals(null, tabela.pesquisa("chave8"));
  }
  
  @Test
  public void testImprime() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave1", "item1");
    tabela.insere("chave2", "item2");
    tabela.insere("chave3", "item3");
    tabela.insere("chave4", "item4");
    tabela.insere("chave5", "item5");
    tabela.insere("chave6", "item6");
    tabela.insere("chave7", "item7");
    tabela.imprime();
  }
  
}