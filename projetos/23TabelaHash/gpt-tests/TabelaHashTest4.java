package ds;

import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaHashTest4 {
  
  @Test
  public void testInsere() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave1", "item1");
    tabela.insere("chave2", "item2");
    tabela.insere("chave3", "item3");
    tabela.insere("chave4", "item4");
    assertEquals("item1", tabela.pesquisa("chave1"));
    assertEquals("item2", tabela.pesquisa("chave2"));
    assertEquals("item3", tabela.pesquisa("chave3"));
    assertEquals("item4", tabela.pesquisa("chave4"));
  }
  
  @Test
  public void testRetira() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave1", "item1");
    tabela.insere("chave2", "item2");
    tabela.retira("chave1");
    assertNull(tabela.pesquisa("chave1"));
    assertEquals("item2", tabela.pesquisa("chave2"));
  }
  
  @Test
  public void testRecuperaItens() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave1", "item1");
    tabela.insere("chave2", "item2");
    tabela.insere("chave3", "item3");
    Object[] itens = tabela.recuperaItens();
    assertEquals(3, itens.length);
    assertTrue(containsItem(itens, "item1"));
    assertTrue(containsItem(itens, "item2"));
    assertTrue(containsItem(itens, "item3"));
  }
  
  private boolean containsItem(Object[] itens, Object item) {
    for (Object i : itens) {
      if (i.equals(item)) {
        return true;
      }
    }
    return false;
  }
  
}