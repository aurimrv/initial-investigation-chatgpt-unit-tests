
package ds;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TabelaTest1 {
  
  @Test
  public void testPesquisa() {
    Tabela tabela = new Tabela();
    Item reg1 = new MeuItem(1);
    tabela.registros[1] = reg1;
    tabela.n = 1;
    
    int result = tabela.pesquisa(reg1);
    
    assertEquals(1, result);
  }
}