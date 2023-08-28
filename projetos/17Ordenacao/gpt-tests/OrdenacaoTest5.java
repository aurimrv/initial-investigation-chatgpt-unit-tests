
package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest5 {

   @Test
   public void testSelecao() {
      MeuItem[] v = {new MeuItem(5), new MeuItem(2), new MeuItem(10), new MeuItem(7)};
      Ordenacao.selecao(v, 4);
      assertEquals(2, v[0].recuperaChave());
      assertEquals(5, v[1].recuperaChave());
      assertEquals(7, v[2].recuperaChave());
      assertEquals(10, v[3].recuperaChave());
   }
   
   @Test
   public void testInsercao() {
      MeuItem[] v = {new MeuItem(5), new MeuItem(2), new MeuItem(10), new MeuItem(7)};
      Ordenacao.insercao(v, 4);
      assertEquals(2, v[0].recuperaChave());
      assertEquals(5, v[1].recuperaChave());
      assertEquals(7, v[2].recuperaChave());
      assertEquals(10, v[3].recuperaChave());
   }
   
   @Test
   public void testShellsort() {
      MeuItem[] v = {new MeuItem(5), new MeuItem(2), new MeuItem(10), new MeuItem(7)};
      Ordenacao.shellsort(v, 4);
      assertEquals(2, v[0].recuperaChave());
      assertEquals(5, v[1].recuperaChave());
      assertEquals(7, v[2].recuperaChave());
      assertEquals(10, v[3].recuperaChave());
   }
   
   @Test
   public void testQuicksort() {
      MeuItem[] v = {new MeuItem(5), new MeuItem(2), new MeuItem(10), new MeuItem(7)};
      Ordenacao.quicksort(v, 4);
      assertEquals(2, v[0].recuperaChave());
      assertEquals(5, v[1].recuperaChave());
      assertEquals(7, v[2].recuperaChave());
      assertEquals(10, v[3].recuperaChave());
   }
   
   @Test
   public void testHeapsort() {
      MeuItem[] v = {new MeuItem(5), new MeuItem(2), new MeuItem(10), new MeuItem(7)};
      Ordenacao.heapsort(v, 4);
      assertEquals(2, v[0].recuperaChave());
      assertEquals(5, v[1].recuperaChave());
      assertEquals(7, v[2].recuperaChave());
      assertEquals(10, v[3].recuperaChave());
   }
}