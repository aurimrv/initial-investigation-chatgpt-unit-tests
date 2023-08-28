
package ds;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

public class TabelaTest6 {
   @Test
   public void testPesquisaExistingItem() {
     Tabela tabela = new Tabela();
     Item item = new MeuItem(1);
     tabela.insere(item);
     
     int result = tabela.pesquisa(item);
     
     assertEquals(1, result);
   }
   

   @Test
   public void testPesquisaNonExistingItem() {
     Tabela tabela = new Tabela();
     Item item = new MeuItem(1);
     
     int result = tabela.pesquisa(item);
     
     assertEquals(-1, result);
   }
   
   
   @Test
   public void testInsere() {
     Tabela tabela = new Tabela();
     Item item = new MeuItem(1);
     
     tabela.insere(item);
     
     assertEquals(1, tabela.n);
     assertEquals(item, tabela.registros[1]);
   }
   

   @Test
   public void testBinariaExistingItem() {
     Tabela tabela = new Tabela();
     Item item = new MeuItem(1);
     tabela.insere(item);
     
     int result = tabela.binaria(item);
     
     assertEquals(1, result);
   }
   

   @Test
   public void testBinariaNonExistingItem() {
     Tabela tabela = new Tabela();
     Item item = new MeuItem(1);
     
     int result = tabela.binaria(item);
     
     assertEquals(0, result);
   }
  }