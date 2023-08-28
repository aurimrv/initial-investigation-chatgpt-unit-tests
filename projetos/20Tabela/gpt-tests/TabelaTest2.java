
package ds;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

public class TabelaTest2 {
  
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
    
    Item reg4 = new MeuItem(4);
    assertEquals(0, tabela.pesquisa(reg4));
  }
  
  @Test
  public void testInsere() throws Exception {
    Tabela tabela = new Tabela();
    Item reg1 = new MeuItem(1);
    Item reg2 = new MeuItem(2);
    Item reg3 = new MeuItem(3);
    
    tabela.insere(reg1);
    tabela.insere(reg2);
    tabela.insere(reg3);
    
    assertEquals(1, tabela.registros[1].recuperaChave());
    assertEquals(2, tabela.registros[2].recuperaChave());
    assertEquals(3, tabela.registros[3].recuperaChave());
    assertEquals(3, tabela.n);
    
    Item reg4 = new MeuItem(4);
    tabela.insere(reg4);
    
    assertEquals(4, tabela.registros[4].recuperaChave());
    assertEquals(4, tabela.n);
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
    
    Item reg4 = new MeuItem(4);
    assertEquals(0, tabela.binaria(reg4));
  }
  
}
