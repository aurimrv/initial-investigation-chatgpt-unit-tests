
package ds;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class TabelaHashTest5 {
  
  private TabelaHash tabela;
  
  @Before
  public void setUp() {
    tabela = new TabelaHash();
  }
  
  @Test
  public void testInsercao() {
    tabela.insere("chave1", 10);
    tabela.insere("chave2", "valor2");
    
    assertEquals(10, tabela.pesquisa("chave1"));
    assertEquals("valor2", tabela.pesquisa("chave2"));
  }
  
  @Test
  public void testPesquisaSemSucesso() {
    assertNull(tabela.pesquisa("chave1"));
  }
  
  @Test
  public void testRemocao() throws Exception {
    tabela.insere("chave1", 10);
    
    tabela.retira("chave1");
    
    assertNull(tabela.pesquisa("chave1"));
  }
  
  @Test
  public void testRecuperaItens() {
    tabela.insere("chave1", 10);
    tabela.insere("chave2", "valor2");
    
    Object[] itens = tabela.recuperaItens();
    
    assertEquals(2, itens.length);
    assertTrue(Arrays.asList(itens).contains(10));
    assertTrue(Arrays.asList(itens).contains("valor2"));
  }
  
  @Test
  public void testImprime() {
    tabela.insere("chave1", 10);
    tabela.insere("chave2", "valor2");
    
    tabela.imprime();
    
    // Verify output in console manually
  }
}