
package ds;import static org.junit.Assert.*;
import org.junit.Test;

import ds.Item;
import ds.Max;
import ds.MeuItem;

public class MaxTest6 {
  
  @Test
  public void testMax() {
    Item[] items = new Item[5];
    items[0] = new MeuItem(10);
    items[1] = new MeuItem(8);
    items[2] = new MeuItem(12);
    items[3] = new MeuItem(5);
    items[4] = new MeuItem(15);
    
    Item result = Max.max(items, 5);
    
    assertEquals(15, ((MeuItem) result).chave); // Maximum should be 15
  }
  
  @Test
  public void testMaxWithNegativeNumbers() {
    Item[] items = new Item[4];
    items[0] = new MeuItem(-2);
    items[1] = new MeuItem(-5);
    items[2] = new MeuItem(-1);
    items[3] = new MeuItem(-3);
    
    Item result = Max.max(items, 4);
    
    assertEquals(-1, ((MeuItem) result).chave); // Maximum should be -1
  }
  
  @Test
  public void testMaxWithEqualKeys() {
    Item[] items = new Item[3];
    items[0] = new MeuItem(5);
    items[1] = new MeuItem(5);
    items[2] = new MeuItem(5);
    
    Item result = Max.max(items, 3);
    
    assertEquals(5, ((MeuItem) result).chave); // Maximum should be 5
  }
}