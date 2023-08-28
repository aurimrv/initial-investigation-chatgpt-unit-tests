
package ds;import static org.junit.Assert.assertEquals;
import org.junit.Test;

import ds.Item;
import ds.Max;
import ds.MeuItem;

public class MaxTest1 {
  @Test
  public void testMax() {
    Item[] items = new Item[5];
    items[0] = new MeuItem(3);
    items[1] = new MeuItem(7);
    items[2] = new MeuItem(2);
    items[3] = new MeuItem(9);
    items[4] = new MeuItem(5);

    Item max = Max.max(items, items.length);
    assertEquals(9, ((MeuItem) max).chave);
  }

  @Test
  public void testMaxWithNegativeValues() {
    Item[] items = new Item[4];
    items[0] = new MeuItem(10);
    items[1] = new MeuItem(-5);
    items[2] = new MeuItem(15);
    items[3] = new MeuItem(-20);

    Item max = Max.max(items, items.length);
    assertEquals(15, ((MeuItem) max).chave);
  }

  @Test
  public void testMaxWithEqualValues() {
    Item[] items = new Item[3];
    items[0] = new MeuItem(5);
    items[1] = new MeuItem(5);
    items[2] = new MeuItem(5);

    Item max = Max.max(items, items.length);
    assertEquals(5, ((MeuItem) max).chave);
  }
}