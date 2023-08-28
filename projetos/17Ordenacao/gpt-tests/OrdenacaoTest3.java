
package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;
import ds.Item;
import ds.Ordenacao;
import ds.PermutacaoRandomica;

public class OrdenacaoTest3 {

  @Test
  public void testSelecao() {
    int[] v = {5, 2, 8, 3, 1};
    int[] expected = {1, 2, 3, 5, 8};
    Ordenacao.selecao(v, v.length);
    assertArrayEquals(expected, v);
  }

  @Test
  public void testInsercao() {
    int[] v = {5, 2, 8, 3, 1};
    int[] expected = {1, 2, 3, 5, 8};
    Ordenacao.insercao(v, v.length);
    assertArrayEquals(expected, v);
  }

  @Test
  public void testShellsort() {
    int[] v = {5, 2, 8, 3, 1};
    int[] expected = {1, 2, 3, 5, 8};
    Ordenacao.shellsort(v, v.length);
    assertArrayEquals(expected, v);
  }

  @Test
  public void testQuicksort() {
    int[] v = {5, 2, 8, 3, 1};
    int[] expected = {1, 2, 3, 5, 8};
    Ordenacao.quicksort(v, v.length);
    assertArrayEquals(expected, v);
  }

  @Test
  public void testHeapsort() {
    int[] v = {5, 2, 8, 3, 1};
    int[] expected = {1, 2, 3, 5, 8};
    Ordenacao.heapsort(v, v.length);
    assertArrayEquals(expected, v);
  }

  @Test
  public void testPermut() {
    int[] v = {1, 2, 3, 4, 5};
    int[] original = {1, 2, 3, 4, 5};
    PermutacaoRandomica.permut(v, v.length);
    assertNotEquals(original, v);
  }

}