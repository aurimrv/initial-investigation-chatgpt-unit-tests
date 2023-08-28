package ds;import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MaxTest15{

  
  @Test
  public void testMaxWithPositiveNumbers() {
    Item[] items = { new MeuItem(5), new MeuItem(10), new MeuItem(3), new MeuItem(8) };
    Item maxItem = Max.max(items, items.length);
    assertEquals(10, ((MeuItem)maxItem).chave);
  }
  
  @Test
  public void testMaxWithNegativeNumbers() {
    Item[] items = { new MeuItem(-5), new MeuItem(-10), new MeuItem(-3), new MeuItem(-8) };
    Item maxItem = Max.max(items, items.length);
    assertEquals(-3, ((MeuItem)maxItem).chave);
  }
  
  @Test
  public void testMaxWithEqualNumbers() {
    Item[] items = { new MeuItem(5), new MeuItem(5), new MeuItem(5), new MeuItem(5) };
    Item maxItem = Max.max(items, items.length);
    assertEquals(5, ((MeuItem)maxItem).chave);
  }
  
  @Test
  public void testMaxWithEmptyArray() {
    Item[] items = {};
    Item maxItem = Max.max(items, items.length);
    assertEquals(null, maxItem);
  }
  
  @Test
  public void testMaxWithNullArray() {
    Item[] items = null;
    Item maxItem = Max.max(items, 0);
    assertEquals(null, maxItem);
  }
}