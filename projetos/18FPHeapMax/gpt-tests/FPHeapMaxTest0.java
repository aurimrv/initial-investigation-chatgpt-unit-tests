
package ds;import static org.junit.Assert.*;

import ds.FPHeapMax;
import ds.Item;
import ds.MeuItem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

import org.junit.Test;

public class FPHeapMaxTest0 {

  @Test
  public void testHeapMax() {
    FPHeapMax A = new FPHeapMax(20);
    MeuItem V[] = new MeuItem[7];
    V[1] = new MeuItem(20);
    V[2] = new MeuItem(15);
    V[3] = new MeuItem(18);
    V[4] = new MeuItem(10);
    V[5] = new MeuItem(12);
    V[6] = new MeuItem(9);

    A.copia(V);

    Item expectedMax = new MeuItem(20);
    Item expectedRemovedMax = new MeuItem(20);

    try {
      // Test max()
      Item actualMax = A.max();
      assertEquals(expectedMax, actualMax);

      // Test retiraMax()
      Item actualRemovedMax = A.retiraMax();
      assertEquals(expectedRemovedMax, actualRemovedMax);

    } catch (Exception e) {
      fail("Exception thrown: " + e.getMessage());
    }
  }
}