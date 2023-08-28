package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.FPHeapMax;
import ds.MeuItem;

public class FPHeapMaxTest13{

  
  @Test
  public void testConstroi() {
    FPHeapMax A = new FPHeapMax(20);
    MeuItem[] V = new MeuItem[7];
    V[1] = new MeuItem(20);
    V[2] = new MeuItem(15);
    V[3] = new MeuItem(18);
    V[4] = new MeuItem(10);
    V[5] = new MeuItem(12);
    V[6] = new MeuItem(9);
    try {
      A.copia(V);
      A.constroi();
      assertEquals(20, A.max().recuperaChave());
    } catch (Exception e) {
      fail(e.getMessage());
    }
  }
  
  @Test
  public void testInsere() {
    FPHeapMax A = new FPHeapMax(20);
    MeuItem[] V = new MeuItem[7];
    V[1] = new MeuItem(20);
    V[2] = new MeuItem(15);
    V[3] = new MeuItem(18);
    V[4] = new MeuItem(10);
    V[5] = new MeuItem(12);
