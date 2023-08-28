
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest0 {
  
  @Test
  public void testMaxWithEmptyArray() {
    Item[] items = new Item[0];
    assertNull(Max.max(items, 0));
  }
  
  @Test
  public void testMaxWithSingleItemArray() {
    Item[] items = new Item[] { new MeuItem(5) };
    assertEquals(5, Max.max(items, 1).chave);
  }
  
  @Test
  public void testMaxWithMultipleItemsArray() {
    Item[] items = new Item[] { new MeuItem(5), new MeuItem(3), new MeuItem(7), new MeuItem(2) };
    assertEquals(7, Max.max(items, 4).chave);
  }
  
  @Test
  public void testMaxWithNegativeValues() {
    Item[] items = new Item[] { new MeuItem(-5), new MeuItem(-3), new MeuItem(-7), new MeuItem(-2) };
    assertEquals(-2, Max.max(items, 4).chave);
  }
  
  @Test
  public void testMaxWithEqualValues() {
    Item[] items = new Item[] { new MeuItem(5), new MeuItem(5), new MeuItem(5), new MeuItem(5) };
    assertEquals(5, Max.max(items, 4).chave);
  }
}
