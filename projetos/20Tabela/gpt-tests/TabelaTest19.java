package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaTest19{

  
  @Test
  public void testPesquisa() {
    Tabela tabela = new Tabela();
    Item reg1 = new MeuItem(1);
    Item reg2 = new MeuItem(2);
    Item reg3 = new MeuItem(3);
    tabela.registros[1] = reg1;
    tabela.registros[2] = reg2;
    tabela.registros[3] = reg3;
    tabela.n = 3;
    
    assertEquals(1, tabela.pesquisa(reg1));
    assertEquals(2, tabela.pesquisa(reg2));
    assertEquals(3, tabela.pesquisa(reg3));
  }
  
  @Test
  public void testInsere() throws Exception {
    Tabela tabela = new Tabela();
    Item reg1 = new MeuItem(1);
    Item reg2 = new MeuItem(2);
    tabela.insere(reg1);
    tabela.insere(reg2);
    
    assertEquals(1, tabela.registros[1].recuperaChave());
    assertEquals(2, tabela.registros[2].recuperaChave());
    assertEquals(2, tabela.n);
  }
  
  @Test
  public void testBinaria() {
    Tabela tabela = new Tabela();
    Item reg1 = new MeuItem(1);
    Item reg2 = new MeuItem(2);
    Item reg3 = new MeuItem(3);
    tabela.registros[1] = reg1;
    tabela.registros[2] = reg2;
    tabela.registros[3] = reg3;
    tabela.n = 3;
    
    assertEquals(1, tabela.binaria(reg1));
    assertEquals(2, tabela.binaria(reg2));
    assertEquals(3, tabela.binaria(reg3));
  }
  
}