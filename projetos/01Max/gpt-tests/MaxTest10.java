
package ds;import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ds.Item;
import ds.Max;
import ds.MeuItem;

public class MaxTest10 {
  
  @Test
  public void testMaxWithIntegers() {
    Item[] items = { new MeuItem(1), new MeuItem(3), new MeuItem(2)};
    int expected = 3;
    Item result = Max.max(items, 3);
    assertEquals(expected, ((MeuItem)result).chave);
  }
  
  @Test
  public void testMaxWithNegativeValues() {
    Item[] items = { new MeuItem(-5), new MeuItem(-2), new MeuItem(-10)};
    int expected = -2;
    Item result = Max.max(items, 3);
    assertEquals(expected, ((MeuItem)result).chave);
  }
  
  @Test
  public void testMaxWithRepeatedValues() {
    Item[] items = { new MeuItem(5), new MeuItem(5), new MeuItem(5)};
    int expected = 5;
    Item result = Max.max(items, 3);
    assertEquals(expected, ((MeuItem)result).chave);
  }
  
  @Test
  public void testMaxWithEmptyArray() {
    Item[] items = {};
    Item result = Max.max(items, 0);
    assertEquals(null, result);
  }
}