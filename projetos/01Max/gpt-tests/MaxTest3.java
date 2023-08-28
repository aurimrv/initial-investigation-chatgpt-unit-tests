
package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.*;

public class MaxTest3 {

  @Test
  public void testMax() {
    Item[] items = new Item[5];
    items[0] = new MeuItem(10);
    items[1] = new MeuItem(5);
    items[2] = new MeuItem(15);
    items[3] = new MeuItem(3);
    items[4] = new MeuItem(8);

    Item maxItem = Max.max(items, items.length);

    assertEquals(15, ((MeuItem) maxItem).chave);
  }
  
  @Test
  public void testMaxSameValues() {
    Item[] items = new Item[6];
    items[0] = new MeuItem(10);
    items[1] = new MeuItem(10);
    items[2] = new MeuItem(10);
    items[3] = new MeuItem(10);
    items[4] = new MeuItem(10);
    items[5] = new MeuItem(10);

    Item maxItem = Max.max(items, items.length);

    assertEquals(10, ((MeuItem) maxItem).chave);
  }
  
  @Test
  public void testMaxNegativeValues() {
    Item[] items = new Item[4];
    items[0] = new MeuItem(-5);
    items[1] = new MeuItem(-10);
    items[2] = new MeuItem(-2);
    items[3] = new MeuItem(-1);

    Item maxItem = Max.max(items, items.length);

    assertEquals(-1, ((MeuItem) maxItem).chave);
  }
  
}