
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest2 {
  
  @Test
  public void testMaxWithPositiveNumbers() {
    Item[] items = { new MeuItem(5), new MeuItem(10), new MeuItem(3), new MeuItem(8) };
    Item max = Max.max(items, items.length);
    assertEquals(10, ((MeuItem) max).chave);
  }
  
  @Test
  public void testMaxWithNegativeNumbers() {
    Item[] items = { new MeuItem(-5), new MeuItem(-10), new MeuItem(-3), new MeuItem(-8) };
    Item max = Max.max(items, items.length);
    assertEquals(-3, ((MeuItem) max).chave);
  }
  
  @Test
  public void testMaxWithMixedNumbers() {
    Item[] items = { new MeuItem(5), new MeuItem(-10), new MeuItem(3), new MeuItem(-8) };
    Item max = Max.max(items, items.length);
    assertEquals(5, ((MeuItem) max).chave);
  }
  
  @Test
  public void testMaxWithEmptyArray() {
    Item[] items = {};
    Item max = Max.max(items, items.length);
    assertNull(max);
  }
  
  @Test(expected = NullPointerException.class)
  public void testMaxWithNullArray() {
    Item[] items = null;
    Max.max(items, 5);
  }
}