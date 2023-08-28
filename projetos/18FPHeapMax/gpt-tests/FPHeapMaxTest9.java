
package ds;import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.junit.Test;
import ds.FPHeapMax;
import ds.MeuItem;

public class TestaFPHeapMax {

  @Test
  public void testFPHeapMax() {
    FPHeapMax A = new FPHeapMax (20);
    assertNotNull(A);
  }

  @Test
  public void testRefaz() {
    FPHeapMax A = new FPHeapMax (20);
    MeuItem[] V = new MeuItem[8];
    V[1] = new MeuItem(10);
    V[2] = new MeuItem(9);
    V[3] = new MeuItem(8);
    V[4] = new MeuItem(7);
    V[5] = new MeuItem(6);
    V[6] = new MeuItem(5);
    V[7] = new MeuItem(4);
    A.copia(V);
    A.refaz(1, 7);
    assertEquals(10, ((MeuItem) A.max()).chave);
  }

  @Test
  public void testConstroi() {
    FPHeapMax A = new FPHeapMax (20);
    MeuItem[] V = new MeuItem[8];
    V[1] = new MeuItem(10);
    V[2] = new MeuItem(