package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class OrdenacaoTest14{

  
  @Test
  public void testSelecao() {
    // Test case 1
    MeuItem[] v1 = {new MeuItem(4), new MeuItem(2), new MeuItem(1), new MeuItem(3)};
    Ordenacao.selecao(v1, 4);
    assertEquals(1, v1[0].recuperaChave());
    assertEquals(2, v1[1].recuperaChave());
    assertEquals(3, v1[2].recuperaChave());
    assertEquals(4, v1[3].recuperaChave());
    
    // Test case 2
    MeuItem[] v2 = {new MeuItem(9), new MeuItem(5), new MeuItem(7), new MeuItem(1), new MeuItem(3)};
    Ordenacao.selecao(v2, 5);
    assertEquals(1, v2[0].recuperaChave());
    assertEquals(3, v2[1].recuperaChave());
    assertEquals(5, v2[2].recuperaChave());
    assertEquals(7, v2[3].recuperaChave());
    assertEquals(9, v2[4].recuperaChave());
  }
  
  @Test
  public void testInsercao() {
    // Test case 1
    MeuItem[] v1 = {new MeuItem(4), new MeuItem(2), new MeuItem(1), new MeuItem(3)};
    Ordenacao.insercao(v1, 4);
    assertEquals(1, v1[0].recuperaChave());
    assertEquals(2, v1[1].recuperaChave());
    assertEquals(3, v1[2].recuperaChave());
    assertEquals(4, v1[3].recuperaChave());
    
    // Test case 2
    MeuItem[] v2 = {new MeuItem(9), new MeuItem(5), new MeuItem(7), new MeuItem(1), new MeuItem(3)};
    Ordenacao.insercao(v2, 5);
    assertEquals(1, v2[0].recuperaChave());
    assertEquals(3, v2[1].recuperaChave());
    assertEquals(5, v2[2].recuperaChave());
    assertEquals(7, v2[3].recuperaChave());
    assertEquals(9, v2[4].recuperaChave());
  }
  
  @Test
  public void testShellsort() {
    // Test case 1
    MeuItem[] v1 = {new MeuItem(4), new MeuItem(2), new MeuItem(1), new MeuItem(3)};
    Ordenacao.shellsort(v1, 4);
    assertEquals(1, v1[0].recuperaChave());
    assertEquals(2, v1[1].recuperaChave());
    assertEquals(3, v1[2].recuperaChave());
    assertEquals(4, v1[3].recuperaChave());
    
    // Test case 2
    MeuItem[] v2 = {new MeuItem(9), new MeuItem(5), new MeuItem(7), new MeuItem(1), new MeuItem(3)};
    Ordenacao.shellsort(v2, 5);
    assertEquals(1, v2[0].recuperaChave());
    assertEquals(3, v2[1].recuperaChave());
    assertEquals(5, v2[2].recuperaChave());
    assertEquals(7, v2[3].recuperaChave());
    assertEquals(9, v2[4].recuperaChave());
  }
  
  @Test
  public void testQuicksort() {
    // Test case 1
    MeuItem[] v1 = {new MeuItem(4), new MeuItem(2), new MeuItem(1), new MeuItem(3)};
    Ordenacao.quicksort(v1, 4);
    assertEquals(1, v1[0].recuperaChave());
    assertEquals(2, v1[1].recuperaChave());
    assertEquals(3, v1[2].recuperaChave());
    assertEquals(4, v1[3].recuperaChave());
    
    // Test case 2
    MeuItem[] v2 = {new MeuItem(9), new MeuItem(5), new MeuItem(7), new MeuItem(1), new MeuItem(3)};
    Ordenacao.quicksort(v2, 5);
    assertEquals(1, v2[0].recuperaChave());
    assertEquals(3, v2[1].recuperaChave());
    assertEquals(5, v2[2].recuperaChave());
    assertEquals(7, v2[3].recuperaChave());
    assertEquals(9, v2[4].recuperaChave());
  }
  
  @Test
  public void testHeapsort() {
    // Test case 1
    MeuItem[] v1 = {new MeuItem(4), new MeuItem(2), new MeuItem(1), new MeuItem(3)};
    Ordenacao.heapsort(v1, 4);
    assertEquals(1, v1[0].recuperaChave());
    assertEquals(2, v1[1].recuperaChave());
    assertEquals(3, v1[2].recuperaChave());
    assertEquals(4, v1[3].recuperaChave());
    
    // Test case 2
    MeuItem[] v2 = {new MeuItem(9), new MeuItem(5), new MeuItem(7), new MeuItem(1), new MeuItem(3)};
    Ordenacao.heapsort(v2, 5);
    assertEquals(1, v2[0].recuperaChave());
    assertEquals(3, v2[1].recuperaChave());
    assertEquals(5, v2[2].recuperaChave());
    assertEquals(7, v2[3].recuperaChave());
    assertEquals(9, v2[4].recuperaChave());
  }
}