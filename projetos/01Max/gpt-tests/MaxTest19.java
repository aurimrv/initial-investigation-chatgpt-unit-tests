package ds;import static org.junit.Assert.assertEquals;
import org.junit.Test;

import ds.Item;
import ds.Max;
import ds.MeuItem;

public class MaxTest19{


  @Test
  public void testMaxWithEmptyArray() {
    Item[] v = new Item[0];
    Item result = Max.max(v, 0);
    assertEquals(null, result);
  }

  @Test
  public void testMaxWithSingleItem() {
    Item[] v = new Item[1];
    v[0] = new MeuItem(5);
    Item result = Max.max(v, 1);
    assertEquals(5, ((MeuItem)result).chave);
  }

  @Test
  public void testMaxWithMultipleItems() {
    Item[] v = new Item[5];
    v[0] = new MeuItem(3);
    v[1] = new MeuItem(7);
    v[2] = new MeuItem(2);
    v[3] = new MeuItem(9);
    v[4] = new MeuItem(1);
    Item result = Max.max(v, 5);
    assertEquals(9, ((MeuItem)result).chave);
  }
}