
package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Random;
import ds.TabelaHash;
import ds.MeuItem;
import ds.Lista;
import ds.Item;

public class TabelaHashTest2 {

  @Test
  public void testPesquisa() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("abc", new MeuItem(1));
    tabela.insere("def", new MeuItem(2));
    tabela.insere("ghi", new MeuItem(3));
    
    assertEquals(1, ((MeuItem)tabela.pesquisa("abc")).recuperaChave());
    assertEquals(2, ((MeuItem)tabela.pesquisa("def")).recuperaChave());
    assertEquals(3, ((MeuItem)tabela.pesquisa("ghi")).recuperaChave());
    assertNull(tabela.pesquisa("jkl"));
  }

  @Test
  public void testInsere() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("abc", new MeuItem(1));
    tabela.insere("def", new MeuItem(2));
    tabela.insere("ghi", new MeuItem(3));

    assertEquals(1, ((MeuItem)tabela.pesquisa("abc")).recuperaChave());
    assertEquals(2, ((MeuItem)tabela.pesquisa("def")).recuperaChave());
    assertEquals(3, ((MeuItem)tabela.pesquisa("ghi")).recuperaChave());
  }

  @Test
  public void testRetira() throws Exception {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("abc", new MeuItem(1));
    tabela.insere("def", new MeuItem(2));
    tabela.insere("ghi", new MeuItem(3));

    tabela.retira("def");
    assertNull(tabela.pesquisa("def"));
    assertEquals(1, ((MeuItem)tabela.pesquisa("abc")).recuperaChave());
    assertEquals(3, ((MeuItem)tabela.pesquisa("ghi")).recuperaChave());
  }
  
  @Test
  public void testImprime() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("abc", new MeuItem(1));
    tabela.insere("def", new MeuItem(2));
    tabela.insere("ghi", new MeuItem(3));

    tabela.imprime();
  }
}