package ds;import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ds.Item;
import ds.Max;
import ds.MeuItem;

public class MaxTest20{

  
  @Test
  public void testMaxWithEmptyArray() {
    Item[] v = new Item[0];
    Item result = Max.max(v, 0);
    assertEquals(null, result);
  }
  
  @Test
  public void testMaxWithSingleItem() {
    Item[] v = new Item[1];
    v[0] = new MeuItem(10);
    Item result = Max.max(v, 1);
    assertEquals(10, ((MeuItem)result).chave);
  }
  
  @Test
  public void testMaxWithMultipleItems() {
    Item[] v = new Item[5];
    v[0] = new MeuItem(5);
    v[1] = new MeuItem(2);
    v[2] = new MeuItem(8);
    v[3] = new MeuItem(1);
    v[4] = new MeuItem(7);
    Item result = Max.max(v, 5);
    assertEquals(8, ((MeuItem)result).chave);
  }
}